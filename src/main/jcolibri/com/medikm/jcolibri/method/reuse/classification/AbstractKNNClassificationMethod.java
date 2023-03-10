package com.medikm.jcolibri.method.reuse.classification;

import static com.medikm.jcolibri.util.CopyUtils.copyCaseComponent;

import java.util.Collection;

import com.medikm.jcolibri.cbrcore.CBRCase;
import com.medikm.jcolibri.cbrcore.CBRQuery;
import com.medikm.jcolibri.extensions.classification.ClassificationSolution;
import com.medikm.jcolibri.method.retrieve.RetrievalResult;

import org.apache.commons.logging.LogFactory;

/**
 * Provides the ability to classify a query by predicting its solution from
 * supplied cases.
 * 
 * @author Derek Bridge
 * @author Lisa Cummins 16/05/07
 */
public abstract class AbstractKNNClassificationMethod implements KNNClassificationMethod {

	/**
	 * Gets the predicted solution of the given cases according to the
	 * classification type.
	 * 
	 * @param cases
	 *            a list of cases along with similarity scores.
	 * @return Returns the predicted solution.
	 */
	public abstract ClassificationSolution getPredictedSolution(Collection<RetrievalResult> cases);

	/**
	 * Gets the predicted solution of the given cases according to the
	 * classification type and returns a case that has the query description and
	 * the predicted solution.
	 * 
	 * @param query
	 *            the query.
	 * @param cases
	 *            a list of cases along with similarity scores.
	 * @return Returns a case with the query description as its description and
	 *         the predicted solution as its solution.
	 */
	public CBRCase getPredictedCase(CBRQuery query, Collection<RetrievalResult> cases) {
		CBRCase queryWithPredSoln = null;

		if (cases.size() > 0) { // Make a copy of any case. This will be used as
								// the query with its predicted solution.
			CBRCase c = cases.iterator().next().get_case();

			try {
				queryWithPredSoln = c.getClass().newInstance();
			} catch (Exception e) {
				LogFactory.getLog(this.getClass()).error(e);
			}

			queryWithPredSoln.setDescription(copyCaseComponent(query.getDescription()));

			ClassificationSolution predSolution = getPredictedSolution(cases);
			queryWithPredSoln.setSolution(predSolution);

			queryWithPredSoln.setJustificationOfSolution(null);

			queryWithPredSoln.setResult(null);
		}
		return queryWithPredSoln;
	}
}
