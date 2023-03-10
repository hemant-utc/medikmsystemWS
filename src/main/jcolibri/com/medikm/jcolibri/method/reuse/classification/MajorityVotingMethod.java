package com.medikm.jcolibri.method.reuse.classification;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.medikm.jcolibri.extensions.classification.ClassificationSolution;
import com.medikm.jcolibri.method.retrieve.RetrievalResult;

/**
 * Provides the ability to classify a query by predicting its solution from
 * supplied cases. Classification is done by majority voting, so the predicted
 * class is the one that has the highest number of votes.
 * 
 * @author Derek Bridge
 * @author Lisa Cummins 16/05/07
 */
public class MajorityVotingMethod extends AbstractKNNClassificationMethod {

	/**
	 * Predicts the class that has the highest number of votes among the k most
	 * similar cases. If several classes receive the same highest vote, the
	 * class that has the lowest hash code is taken as the prediction.
	 * 
	 * @param cases
	 *            an ordered list of cases along with similarity scores.
	 * @return Returns the predicted solution.
	 */
	public ClassificationSolution getPredictedSolution(Collection<RetrievalResult> cases) {
		Map<Object, Integer> votes = new HashMap<Object, Integer>();
		Map<Object, ClassificationSolution> values = new HashMap<Object, ClassificationSolution>();

		for (RetrievalResult result : cases) {
			ClassificationSolution solution = (ClassificationSolution) result.get_case().getSolution();

			Object classif = solution.getClassification();

			if (votes.containsKey(classif)) {
				votes.put(classif, votes.get(classif) + 1);
			} else {
				votes.put(classif, 1);
			}
			values.put(classif, solution);
		}

		int highestVoteSoFar = 0;
		Object predictedClass = null;
		for (Map.Entry<Object, Integer> e : votes.entrySet()) {
			if (e.getValue() >= highestVoteSoFar) {
				highestVoteSoFar = e.getValue();
				predictedClass = e.getKey();
			}
		}

		return values.get(predictedClass);
	}
}
