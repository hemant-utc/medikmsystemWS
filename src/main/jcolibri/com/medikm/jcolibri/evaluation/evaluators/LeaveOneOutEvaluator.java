/**
 * LeaveOneOutEvaluator.java
 * jCOLIBRI2 framework. 
 * @author Juan A. Recio-Garc�a.
 * GAIA - Group for Artificial Intelligence Applications
 * http://gaia.fdi.ucm.es
 * 07/05/2007
 */
package com.medikm.jcolibri.evaluation.evaluators;

import java.util.ArrayList;
import java.util.Date;

import com.medikm.jcolibri.cbraplications.StandardCBRApplication;
import com.medikm.jcolibri.cbrcore.CBRCase;
import com.medikm.jcolibri.cbrcore.CBRCaseBase;
import com.medikm.jcolibri.evaluation.EvaluationReport;
import com.medikm.jcolibri.evaluation.Evaluator;
import com.medikm.jcolibri.exception.ExecutionException;

import org.apache.commons.logging.LogFactory;

/**
 * This methods uses all the cases as queries. It executes so cycles as cases in
 * the case base. In each cycle one case is used as query.
 * 
 * @author Juan A. Recio Garc�a - GAIA http://gaia.fdi.ucm.es
 * @version 2.0
 */
public class LeaveOneOutEvaluator extends Evaluator {

	protected StandardCBRApplication app;

	public void init(StandardCBRApplication cbrApp) {

		report = new EvaluationReport();
		app = cbrApp;
		try {
			app.configure();
		} catch (ExecutionException e) {
			LogFactory.getLog(this.getClass()).error(e);
		}
	}

	/**
	 * Performs the Leave-One-Out evaluation. For each case in the case base,
	 * remove that case from the case base and use it as query for that cycle.
	 */
	public void LeaveOneOut() {
		try {
			java.util.ArrayList<CBRCase> aux = new java.util.ArrayList<CBRCase>();

			long t = (new Date()).getTime();
			int numberOfCycles = 0;

			// Run the precycle to load the case base
			LogFactory.getLog(this.getClass()).info("Running precycle()");
			CBRCaseBase caseBase = app.preCycle();

			if (!(caseBase instanceof com.medikm.jcolibri.casebase.CachedLinealCaseBase))
				LogFactory.getLog(this.getClass()).warn("Evaluation should be executed using a cached case base");

			ArrayList<CBRCase> cases = new ArrayList<CBRCase>(caseBase.getCases());

			com.medikm.jcolibri.util.ProgressController.init(getClass(), "LeaveOneOut Evaluation", cases.size());

			// For each case in the case base
			for (CBRCase _case : cases) {

				// Delete the case in the case base
				aux.clear();
				aux.add(_case);
				caseBase.forgetCases(aux);

				// Run the cycle
				LogFactory.getLog(this.getClass()).info("Running cycle() " + numberOfCycles);
				app.cycle(_case);

				// Recover case base
				caseBase.learnCases(aux);

				numberOfCycles++;
				com.medikm.jcolibri.util.ProgressController.step(getClass());
			}

			// Run PostCycle
			LogFactory.getLog(this.getClass()).info("Running postcycle()");
			app.postCycle();

			com.medikm.jcolibri.util.ProgressController.finish(getClass());

			t = (new Date()).getTime() - t;

			// complete evaluation report
			report.setTotalTime(t);
			report.setNumberOfCycles(numberOfCycles);

		} catch (ExecutionException e) {
			LogFactory.getLog(this.getClass()).error(e);
			e.printStackTrace();
		}
	}

	// ----------------------------------------------------------------------------//

}