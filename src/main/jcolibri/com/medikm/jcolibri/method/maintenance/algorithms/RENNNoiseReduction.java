package com.medikm.jcolibri.method.maintenance.algorithms;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.medikm.jcolibri.cbrcore.CBRCase;
import com.medikm.jcolibri.extensions.classification.ClassificationSolution;
import com.medikm.jcolibri.method.maintenance.AbstractCaseBaseEditMethod;
import com.medikm.jcolibri.method.retrieve.RetrievalResult;
import com.medikm.jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import com.medikm.jcolibri.method.retrieve.selection.SelectCases;
import com.medikm.jcolibri.method.reuse.classification.KNNClassificationConfig;
import com.medikm.jcolibri.method.reuse.classification.KNNClassificationMethod;
import com.medikm.jcolibri.method.revise.classification.BasicClassificationOracle;
import com.medikm.jcolibri.method.revise.classification.ClassificationOracle;

/**
 * Provides the ability to run the RENN case base editing algorithm 
 * on a case base to eliminate noise.
 * 
 * @author Lisa Cummins
 * @author Derek Bridge
 * 18/05/07
 */
public class RENNNoiseReduction extends AbstractCaseBaseEditMethod {

	/**
	 * Simulates the RENN case base editing algorithm, returning the cases
	 * that would be deleted by the algorithm.
	 * @param cases The group of cases on which to perform editing.
	 * @param simConfig The similarity configuration for these cases.
	 * @return the list of cases that would be deleted by the 
	 * RENN algorithm.
	 */
	public Collection<CBRCase> retrieveCasesToDelete(Collection<CBRCase> cases, KNNClassificationConfig simConfig) 
	{	/* RENN Algorithm:
		 *
		 * T: Training Set
		 * 
		 * Repeat
		 *		changes = false
		 *		For all x E T do
		 *			If x does not agree with the majority of its NN
		 *				T = T - {x}
		 *				changes = true
		 *			End-If
		 *		End-For
		 * Until not changes
		 *
		 * Return T	
	 	 */
		com.medikm.jcolibri.util.ProgressController.init(this.getClass(),"RENN Noise Reduction",com.medikm.jcolibri.util.ProgressController.UNKNOWN_STEPS);
		List<CBRCase> localCases = new LinkedList<CBRCase>();
		
		for(CBRCase c: cases)
		{	localCases.add(c);
		}
		
		List<CBRCase> allCasesToBeRemoved = new LinkedList<CBRCase>();

		boolean changes = true;
		while(changes && localCases.size() > 1)
		{	changes = false;
			ListIterator<CBRCase> iter = localCases.listIterator();	
			while (iter.hasNext())
			{	CBRCase q = iter.next();
				iter.remove();
				Collection<RetrievalResult> knn = NNScoringMethod.evaluateSimilarity(localCases, q, simConfig);
				knn = SelectCases.selectTopKRR(knn, simConfig.getK());
				try
				{	KNNClassificationMethod classifier = ((KNNClassificationConfig)simConfig).getClassificationMethod();
					ClassificationSolution predictedSolution = classifier.getPredictedSolution(knn);
					ClassificationOracle oracle = new BasicClassificationOracle();
					if(!oracle.isCorrectPrediction(predictedSolution, q))
					{	allCasesToBeRemoved.add(q);
						changes = true;
					}
					else
					{	iter.add(q);
					}
				} catch(ClassCastException cce)
				{	org.apache.commons.logging.LogFactory.getLog(RENNNoiseReduction.class).error(cce);
					System.exit(0);
				}
			}
			com.medikm.jcolibri.util.ProgressController.step(this.getClass());
		}
		com.medikm.jcolibri.util.ProgressController.finish(this.getClass());
		return allCasesToBeRemoved;
	}
}