package com.medikm.jcolibri;

import com.medikm.jcolibri.connector.DataBaseConnector;
import com.medikm.jcolibri.exception.InitializingException;
import com.medikm.jcolibri.cbrcore.CBRCaseBase;
import com.medikm.jcolibri.cbrcore.Connector;
import com.medikm.jcolibri.method.retrieve.NNretrieval.NNConfig;

@SuppressWarnings({ "unused" })
public class JcolibriTest {
	private static final long serialVersionUID = 1L;
	private static Connector _connector;
	private CBRCaseBase _caseBase;
	private NNConfig simConfig;
	private String age = null;
	private String gender = null;
	private String er, pR, genetics, genomics, cancerSuperType, tumorSize, numOfNodes, menopauseStatus, cancerSubType,
			finalTNM, histologicalGrade, distantMetssite, hER2newstatus, hER2newSISH, percent, workingTNM, margin,
			residualDisease, nyso1, wt1, edi, recurrence, stage, clinicalStage;
	private Double ageWt, genderWt, erWt, pRWt, geneticsWt, genomicsWt, cancerSuperTypeWt, tumorSizeWt, numOfNodesWt,
			menopauseStatusWt, cancerSubTypeWt, finalTNMWt, histologicalGradeWt, distantMetssiteWt, hER2newstatusWt,
			hER2newSISHWt, percentWT, workingTNMWt, marginWT, residualDiseaseWT, nyso1WT, wt1WT, ediWT, recurrenceWT,
			stageWT, clinicalStageWT;
	// variable declaration
	private String noOfCasesTxt = null;
	private int numOfCases = 0, diseaseTypeId = 0;

	public static void main(String[] args) {

		_connector = new DataBaseConnector();
		try {
			_connector.initFromXMLfile(com.medikm.jcolibri.util.FileIO.findFile("/databaseconfig.xml"));
		} catch (InitializingException e) {

		}

	}
}
