package com.medikm.utility;

import com.medikm.jcolibri.casebase.LinealCaseBase;
import com.medikm.jcolibri.cbraplications.StandardCBRApplication;
import com.medikm.jcolibri.cbrcore.Attribute;
import com.medikm.jcolibri.cbrcore.CBRCaseBase;
import com.medikm.jcolibri.cbrcore.CBRQuery;
import com.medikm.jcolibri.cbrcore.CaseComponent;
import com.medikm.jcolibri.cbrcore.Connector;
import com.medikm.jcolibri.connector.DataBaseConnector;
import com.medikm.jcolibri.exception.ExecutionException;
import com.medikm.jcolibri.method.retrieve.NNretrieval.NNConfig;
import com.medikm.jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import com.medikm.jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import com.medikm.dto.Case1;
import com.medikm.dto.Patient;

public class CBR implements StandardCBRApplication {

	public static void main(String[] args) {

		StandardCBRApplication exe = new CBR();
		try {
			exe.configure();
			exe.preCycle();
			CBRQuery query = new CBRQuery();
			Patient pB = new Patient();
			pB.setCellPhoneNumber("12345678");
			query.setDescription((CaseComponent) pB);
			exe.cycle(query);
			exe.postCycle();
		} catch (Exception e) {
			org.apache.commons.logging.LogFactory.getLog(Patient.class).error(e);
		}

	}

	Connector _connector;
	CBRCaseBase _caseBase;

	public NNConfig simConfig;

	public void configure() throws ExecutionException

	{
		_connector = new DataBaseConnector();
		_connector.initFromXMLfile(com.medikm.jcolibri.util.FileIO.findFile("/databaseconfig.xml"));
		_caseBase = new LinealCaseBase();
		simConfig = new NNConfig();
		// Set the average() global similarity function for the description of
		// the case
		simConfig.setDescriptionSimFunction(new Average());
		simConfig.addMapping(new Attribute("noNodes", Case1.class), new Equal());

	}

	public void cycle(CBRQuery query) throws ExecutionException {
		/*
		 * jcolibri.method.retrieve.FilterBasedRetrieval.
		 * FilterBasedRetrievalMethod.filterCases(null, query, null);
		 * //jcolibri.method.gui.formFilling.ObtainQueryWithFormMethod.
		 * obtainQueryWithInitialValues(query, null, null);
		 * Collection<RetrievalResult> eval =
		 * NNScoringMethod.evaluateSimilarity( _caseBase.getCases(), query,
		 * simConfig); Collection<CBRCase> retrievedCases =
		 * SelectCases.selectTopK(eval,1); UserChoice choice =
		 * DisplayCasesTableMethod .displayCasesInTableBasic(retrievedCases);
		 */

	}

	public void postCycle() throws ExecutionException {
		// _connector.close();

	}

	public CBRCaseBase preCycle() throws ExecutionException {
		_caseBase.init(_connector);
		return _caseBase;

	}
}
