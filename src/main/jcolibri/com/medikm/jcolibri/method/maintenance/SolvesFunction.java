package com.medikm.jcolibri.method.maintenance;

import java.util.Collection;

import com.medikm.jcolibri.cbrcore.CBRCase;
import com.medikm.jcolibri.method.reuse.classification.KNNClassificationConfig;

/**
 * Abstract class for a solves function that will decide which cases solve a
 * query.
 * 
 * @author Lisa Cummins
 * @author Derek Bridge 22/05/07
 */
public abstract class SolvesFunction {

	protected Collection<CBRCase> solveQ;

	protected Collection<CBRCase> misclassifyQ;

	/**
	 * Sets the classes that both solve q or contribute to its misclassification
	 * 
	 * @param q
	 *            the query
	 * @param cases
	 *            from which to find the cases which solve and classify the
	 *            query. These include the query itself.
	 * @param knnConfig
	 *            the similarity configuration
	 */
	public abstract void setCasesThatSolveAndMisclassifyQ(CBRCase q, Collection<CBRCase> cases,
			KNNClassificationConfig knnConfig);

	/**
	 * Returns the cases that solved the last query for which cases were
	 * divided.
	 * 
	 * @return the cases that solved the last query for which cases were
	 *         divided.
	 */
	public Collection<CBRCase> getCasesThatSolvedQuery() {
		return solveQ;
	}

	/**
	 * Returns the cases that contributed to the misclassification of the last
	 * query for which cases were divided. were divided.
	 * 
	 * @return the cases that contributed to the misclassification of the last
	 *         query for which cases were divided. were divided.
	 */
	public Collection<CBRCase> getCasesThatMisclassifiedQuery() {
		return misclassifyQ;
	}
}