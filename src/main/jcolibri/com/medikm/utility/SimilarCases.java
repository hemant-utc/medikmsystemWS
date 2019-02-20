package com.medikm.utility;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.medikm.dao.Case1DAO;
import com.medikm.dto.Case1;
import com.medikm.input.request.SimilarCaseRequest;
import com.medikm.jcolibri.casebase.LinealCaseBase;
import com.medikm.jcolibri.cbraplications.StandardCBRApplication;
import com.medikm.jcolibri.cbrcore.Attribute;
import com.medikm.jcolibri.cbrcore.CBRCase;
import com.medikm.jcolibri.cbrcore.CBRCaseBase;
import com.medikm.jcolibri.cbrcore.CBRQuery;
import com.medikm.jcolibri.cbrcore.Connector;
import com.medikm.jcolibri.connector.DataBaseConnector;
import com.medikm.jcolibri.exception.InitializingException;
import com.medikm.jcolibri.method.retrieve.RetrievalResult;
import com.medikm.jcolibri.method.retrieve.NNretrieval.NNConfig;
import com.medikm.jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import com.medikm.jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import com.medikm.jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import com.medikm.jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
import com.medikm.jcolibri.method.retrieve.selection.SelectCases;

@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
public class SimilarCases {

	private static final long serialVersionUID = 1L;
	private Connector _connector;
	private CBRCaseBase _caseBase;
	private NNConfig simConfig;
	private Integer age = null;
	private String gender = null;
	private String er, pR, genetics, genomics, menopauseStatus, distantMetssite, hER2newstatus, hER2newSISH, percent,
			workingTNM, margin, residualDisease, wt1, edi, stage, clinicalStage;
	Short nyso1;
	Integer recurrence;
	Integer histologicalGrade;
	Integer finalTNM;
	Integer cancerSubType;
	Integer numOfNodes;
	Double tumorSize;
	Integer cancerSuperType;
	private Double ageWt, genderWt, erWt, pRWt, geneticsWt, genomicsWt, cancerSuperTypeWt, tumorSizeWt, numOfNodesWt,
			menopauseStatusWt, cancerSubTypeWt, finalTNMWt, histologicalGradeWt, distantMetssiteWt, hER2newstatusWt,
			hER2newSISHWt, percentWT, workingTNMWt, marginWT, residualDiseaseWT, nyso1WT, wt1WT, ediWT, recurrenceWT,
			stageWT, clinicalStageWT;
	// variable declaration
	private Case1 case2 = null;
	private String noOfCasesTxt = null;
	private int numOfCases = 0, diseaseTypeId = 0;

	public String getSimilarCase(SimilarCaseRequest caseRequest) {
		JSONArray similardetails = new JSONArray();
		_connector = new DataBaseConnector();
		try {
			_connector.initFromXMLfile(com.medikm.jcolibri.util.FileIO.findFile("/databaseconfig.xml"));
		} catch (InitializingException e) {
		}
		Integer caseId = caseRequest.getCaseId();
		case2 = new Case1DAO().findById(caseId);

		StandardCBRApplication exe = new CBR();

		numOfCases = Integer.parseInt(caseRequest.getNumOfCases());
		diseaseTypeId = caseRequest.getDiseaseTypeId();

		try {
			// exe.configure();
			_caseBase = new LinealCaseBase();
			simConfig = new NNConfig();
			// Set the average() global similarity function for the description
			// of the case
			simConfig.setDescriptionSimFunction(new Average());

			Case1 case1 = new Case1();

			if (diseaseTypeId == 1) {

				age = caseRequest.getAge();
				gender = caseRequest.getGender();
				er = caseRequest.getErStatus();
				pR = caseRequest.getPrStatus();
				cancerSuperType = caseRequest.getCancerType();
				tumorSize = caseRequest.getTumorSize();
				numOfNodes = caseRequest.getNoNodes();
				menopauseStatus = caseRequest.getMenopauseStatus();// getMenopauseStatus
				cancerSubType = caseRequest.getCancerSubType();
				finalTNM = caseRequest.getFinalTNMStage();
				histologicalGrade = caseRequest.getHistologicalGrade();
				hER2newstatus = caseRequest.gethER2newstatus();
				percent = caseRequest.getPercent();// doubt
				if (age != null && case2.getAge() != null) {
					if (age != 0) {
						ageWt = new Double(age);
						ageWt = ageWt / 10;
					}
					Attribute at1 = new Attribute("age", Case1.class);
					simConfig.setWeight(at1, ageWt);
					simConfig.addMapping(at1, new Interval(5));
				}

				if (numOfNodes != null && case2.getNoNodes() != null) {
					if (numOfNodes != 0) {
						numOfNodesWt = new Double(numOfNodes);
						numOfNodesWt = numOfNodesWt / 10;
					}
					Attribute at = new Attribute("noNodes", Case1.class);
					simConfig.setWeight(at, numOfNodesWt);
					if (case2.getNoNodes() <= 1)
						simConfig.addMapping(at, new Interval(1));
					else if (case2.getNoNodes() < 1 && case2.getNoNodes() <= 3)
						simConfig.addMapping(at, new Interval(2));
					else if (case2.getNoNodes() < 3 && case2.getNoNodes() <= 9)
						simConfig.addMapping(at, new Interval(5));
					else
						simConfig.addMapping(at, new Interval(10));
				}

				if (er != null && case2.getErStatus() != null) {
					if (er.trim() != "") {
						erWt = new Double(er);
						erWt = erWt / 10;
					}
					Attribute at = new Attribute("erStatus", Case1.class);
					simConfig.setWeight(at, erWt);
					simConfig.addMapping(at, new Equal());
				}

				if (pR != null && case2.getPrStatus() != null) {
					if (pR.trim() != "") {
						pRWt = new Double(pR);
						pRWt = pRWt / 10;
					}
					Attribute at = new Attribute("prStatus", Case1.class);
					simConfig.setWeight(at, pRWt);
					simConfig.addMapping(at, new Equal());
				}

				if (er != null && percent != null && case2.getErStatus() != null && case2.getErPercent() != null) {
					if (percent.trim() != "") {
						percentWT = new Double(percent);
					}
					Attribute at = new Attribute("erPercent", Case1.class);
					simConfig.setWeight(at, percentWT);
					simConfig.addMapping(at, new Interval(10));
				}

				if (pR != null && percent != null && case2.getPrStatus() != null && case2.getPrPercent() != null) {
					if (percent.trim() != "") {
						percentWT = new Double(percent);
					}
					Attribute at = new Attribute("prPercent", Case1.class);
					simConfig.setWeight(at, percentWT);
					simConfig.addMapping(at, new Interval(10));
				}

				if (cancerSuperType != null && cancerSuperType != 0 && case2.getCancerType() != null) {
					if (cancerSuperType != 0) {
						cancerSuperTypeWt = new Double(cancerSuperType);
						cancerSuperTypeWt = cancerSuperTypeWt / 10;
					}
					Attribute at = new Attribute("cancerType", Case1.class);
					simConfig.setWeight(at, cancerSuperTypeWt);
					simConfig.addMapping(at, new Equal());
				}

				if (tumorSize != null && case2.getTumorSize() != null) {
					if (tumorSize != 0) {
						tumorSizeWt = new Double(tumorSize);
						tumorSizeWt = tumorSizeWt / 10;
					}
					Attribute at = new Attribute("tumorSize", Case1.class);
					simConfig.setWeight(at, tumorSizeWt);
					if (case2.getTumorSize() < 1.0)
						simConfig.addMapping(at, new Interval(1.0));
					else if (case2.getTumorSize() > 1.0 && case2.getTumorSize() <= 10.0)
						simConfig.addMapping(at, new Interval(5.0));
					else if (case2.getTumorSize() > 10.0 && case2.getTumorSize() <= 20.0)
						simConfig.addMapping(at, new Interval(10.0));
					else if (case2.getTumorSize() > 20.0 && case2.getTumorSize() <= 50.0)
						simConfig.addMapping(at, new Interval(30.0));
					else {
						simConfig.addMapping(at, new Interval(50.0));
					}
				}

				if (menopauseStatus != null && case2.getMenopauseStatus() != null) {
					if (menopauseStatus.trim() != "") {
						menopauseStatusWt = new Double(menopauseStatus);
						menopauseStatusWt = menopauseStatusWt / 10;
					}
					Attribute at = new Attribute("menopauseStatus", Case1.class);
					simConfig.setWeight(at, menopauseStatusWt);
					simConfig.addMapping(at, new Equal());
				}

				if (cancerSubType != null && cancerSubType != 0 && case2.getCancerSubType() != null) {
					if (cancerSubType != 0) {
						cancerSubTypeWt = new Double(cancerSubType);
						cancerSubTypeWt = cancerSubTypeWt / 10;
					}
					Attribute at = new Attribute("cancerSubType", Case1.class);
					simConfig.setWeight(at, cancerSubTypeWt);
					simConfig.addMapping(at, new Equal());
				}

				if (finalTNM != null && case2.getTnmStageByFinalTnmStageId() != null) {
					if (finalTNM != 0) {
						finalTNMWt = new Double(finalTNM);
						finalTNMWt = finalTNMWt / 10;
					}
					Attribute at = new Attribute("tnmStageByFinalTnmStageId", Case1.class);
					simConfig.setWeight(at, finalTNMWt);
					simConfig.addMapping(at, new Equal());
				}

				if (histologicalGrade != null && case2.getHistologicalGrade() != null) {
					if (histologicalGrade != 0) {
						histologicalGradeWt = new Double(histologicalGrade);
						histologicalGradeWt = histologicalGradeWt / 10;
					}
					Attribute at = new Attribute("histologicalGrade", Case1.class);
					simConfig.setWeight(at, histologicalGradeWt);
					simConfig.addMapping(at, new Equal());
				}

				if (hER2newstatus != null && case2.getHer2Status() != null) {
					if (hER2newstatus.trim() != "") {
						hER2newstatusWt = new Double(hER2newstatus);
						hER2newstatusWt = hER2newstatusWt / 10;
					}
					Attribute at = new Attribute("her2Status", Case1.class);
					simConfig.setWeight(at, hER2newstatusWt);
					simConfig.addMapping(at, new Equal());
				}

				if (case2.getPrimaryDiagnosisDt() != null) {
					Attribute at = new Attribute("primaryDiagnosisDt", Case1.class);
					simConfig.setWeight(at, new Double(1));
					simConfig.addMapping(at, new Equal());
				}

			} else if (diseaseTypeId == 2) {

				age = caseRequest.getAge();
				cancerSuperType = caseRequest.getCancerType();// not avail
				cancerSubType = caseRequest.getCancerSubType();
				numOfNodes = caseRequest.getNoNodes();
				histologicalGrade = caseRequest.getHistologicalGrade();
				tumorSize = caseRequest.getTumorSize();
				margin = caseRequest.getMargins();
				residualDisease = caseRequest.getResidualDisease();
				nyso1 = caseRequest.getNyso();
				wt1 = caseRequest.getWt();
				edi = caseRequest.getEdi(); // not avail
				recurrence = caseRequest.getRecurrence();
				stage = caseRequest.getStage(); // not avail
				clinicalStage = caseRequest.getClinicalStage();
				if (age != null && case2.getAge() != null) {
					if (age != 0) {
						ageWt = new Double(age);
						ageWt = ageWt / 10;
					}
					Attribute at1 = new Attribute("age", Case1.class);
					simConfig.setWeight(at1, ageWt);
					simConfig.addMapping(at1, new Interval(5));
				}

				if (numOfNodes != null && case2.getNoNodes() != null) {
					if (numOfNodes != 0) {
						numOfNodesWt = new Double(numOfNodes);
						numOfNodesWt = numOfNodesWt / 10;
					}
					Attribute at = new Attribute("noNodes", Case1.class);
					simConfig.setWeight(at, numOfNodesWt);
					if (case2.getNoNodes() <= 1)
						simConfig.addMapping(at, new Interval(1));
					else if (case2.getNoNodes() < 1 && case2.getNoNodes() <= 3)
						simConfig.addMapping(at, new Interval(2));
					else if (case2.getNoNodes() < 3 && case2.getNoNodes() <= 9)
						simConfig.addMapping(at, new Interval(5));
					else
						simConfig.addMapping(at, new Interval(10));

				}

				if (cancerSuperType != null && cancerSuperType != 0 && case2.getCancerType() != null) {
					if (cancerSuperType != 0) {
						cancerSuperTypeWt = new Double(cancerSuperType);
						cancerSuperTypeWt = cancerSuperTypeWt / 10;
					}
					Attribute at = new Attribute("cancerType", Case1.class);
					simConfig.setWeight(at, cancerSuperTypeWt);
					simConfig.addMapping(at, new Equal());
				}

				if (tumorSize != null && case2.getTumorSize() != null) {
					if (tumorSize != 0) {
						tumorSizeWt = new Double(tumorSize);
						tumorSizeWt = tumorSizeWt / 10;
					}
					Attribute at = new Attribute("tumorSize", Case1.class);
					simConfig.setWeight(at, tumorSizeWt);
					if (case2.getTumorSize() < 1.0)
						simConfig.addMapping(at, new Interval(1.0));
					else if (case2.getTumorSize() > 1.0 && case2.getTumorSize() <= 10.0)
						simConfig.addMapping(at, new Interval(5.0));
					else if (case2.getTumorSize() > 10.0 && case2.getTumorSize() <= 20.0)
						simConfig.addMapping(at, new Interval(10.0));
					else if (case2.getTumorSize() > 20.0 && case2.getTumorSize() <= 50.0)
						simConfig.addMapping(at, new Interval(30.0));
					else {
						simConfig.addMapping(at, new Interval(50.0));
					}
				}

				if (cancerSubType != null && cancerSubType != 0 && case2.getCancerSubType() != null) {
					if (cancerSubType != 0) {
						cancerSubTypeWt = new Double(cancerSubType);
						cancerSubTypeWt = cancerSubTypeWt / 10;
					}
					Attribute at = new Attribute("cancerSubType", Case1.class);
					simConfig.setWeight(at, cancerSubTypeWt);
					simConfig.addMapping(at, new Equal());
				}

				if (histologicalGrade != null && case2.getHistologicalGrade() != null) {
					if (histologicalGrade != 0) {
						histologicalGradeWt = new Double(histologicalGrade);
						histologicalGradeWt = histologicalGradeWt / 10;
					}
					Attribute at = new Attribute("histologicalGrade", Case1.class);
					simConfig.setWeight(at, histologicalGradeWt);
					simConfig.addMapping(at, new Equal());
				}

				if (margin != null && case2.getMargins() != null) {
					if (margin.trim() != "") {
						marginWT = new Double(margin);
						marginWT = marginWT / 10;
					}
					Attribute at1 = new Attribute("margins", Case1.class);
					simConfig.setWeight(at1, marginWT);
					simConfig.addMapping(at1, new Equal());
				}

				if (residualDisease != null && case2.getResidualTumor() != null) {// getResidualDisease
					if (residualDisease.trim() != "") {
						residualDiseaseWT = new Double(residualDisease);
						residualDiseaseWT = residualDiseaseWT / 10;
					}
					Attribute at1 = new Attribute("residualDisease", Case1.class);
					simConfig.setWeight(at1, residualDiseaseWT);
					simConfig.addMapping(at1, new Equal());
				}

				if (nyso1 != null && case2.getNyso() != null) {
					if (nyso1 != 0) {
						nyso1WT = new Double(nyso1);
						nyso1WT = nyso1WT / 10;
					}
					Attribute at1 = new Attribute("nyso", Case1.class);
					simConfig.setWeight(at1, nyso1WT);
					simConfig.addMapping(at1, new Equal());
				}

				if (wt1 != null && case2.getWt() != null) {
					if (wt1.trim() != "") {
						wt1WT = new Double(wt1);
						wt1WT = wt1WT / 10;
					}
					Attribute at1 = new Attribute("wt", Case1.class);
					simConfig.setWeight(at1, wt1WT);
					simConfig.addMapping(at1, new Equal());
				}

				if (edi != null && case2.getIdo() != null) {
					if (edi.trim() != "") {
						ediWT = new Double(edi);
						ediWT = ediWT / 10;
					}
					Attribute at1 = new Attribute("ido", Case1.class);
					simConfig.setWeight(at1, ediWT);
					simConfig.addMapping(at1, new Equal());
				}

				if (recurrence != null && case2.getRecurrence() != null) {
					if (recurrence != 0) {
						recurrenceWT = new Double(recurrence);
						recurrenceWT = recurrenceWT / 10;
					}
					Attribute at1 = new Attribute("recurrence", Case1.class);
					simConfig.setWeight(at1, recurrenceWT);
					simConfig.addMapping(at1, new Equal());
				}

				if (stage != null && case2.getTnmStageByFinalTnmStageId() != null) {
					if (stage.trim() != "") {
						stageWT = new Double(stage);
						stageWT = stageWT / 10;
					}
					Attribute at1 = new Attribute("tnmStageByFinalTnmStageId", Case1.class);
					simConfig.setWeight(at1, stageWT);
					simConfig.addMapping(at1, new Equal());
				}

				if (clinicalStage != null && case2.getClinicalStage() != null) {
					if (clinicalStage.trim() != "") {
						clinicalStageWT = new Double(clinicalStage);
						clinicalStageWT = clinicalStageWT / 10;
					}
					Attribute at1 = new Attribute("clinicalStage", Case1.class);
					simConfig.setWeight(at1, clinicalStageWT);
					simConfig.addMapping(at1, new Equal());
				}

				if (case2.getPrimaryDiagnosisDt() != null) {
					Attribute at = new Attribute("primaryDiagnosisDt", Case1.class);
					simConfig.setWeight(at, new Double(1));
					simConfig.addMapping(at, new Equal());
				}

			}

			_caseBase.init(_connector, " case1  WHERE case1.diseaseType = " + caseRequest.getDiseaseTypeId()
					+ " order by case1.primaryDiagnosisDt desc");
			CBRQuery query = new CBRQuery();

			if (diseaseTypeId == 1) {

				if (case2.getAge() != null) {
					case1.setAge(case2.getAge());
				}

				if (case2.getNoNodes() != null) {
					case1.setNoNodes(case2.getNoNodes());
				}

				if (case2.getTnmStageByFinalTnmStageId() != null) {
					case1.setTnmStageByFinalTnmStageId(case2.getTnmStageByFinalTnmStageId());
				}
				if (case2.getCancerSubType() != null) {
					case1.setCancerSubType(case2.getCancerSubType());
				}
				if (case2.getCancerType() != null) {
					case1.setCancerType(case2.getCancerType());
				}
				if (case2.getHistologicalGrade() != null) {
					case1.setHistologicalGrade(case2.getHistologicalGrade());
				}
				if (case2.getHer2Status() != null) {
					case1.setHer2Status(case2.getHer2Status());
				}
				if (case2.getErStatus() != null) {
					case1.setErStatus(case2.getErStatus());
					if (case2.getErPercent() != null) {
						case1.setErPercent(case2.getErPercent());
					}
				}
				if (case2.getPrStatus() != null) {
					case1.setPrStatus(case2.getPrStatus());
					if (case2.getPrPercent() != null) {
						case1.setPrPercent(case2.getPrPercent());
					}
				}
				if (case2.getTumorSize() != null) {
					case1.setTumorSize(case2.getTumorSize());
				}
				if (case2.getMenopauseStatus() != null) {
					case1.setMenopauseStatus(case2.getMenopauseStatus());
				}
				if (case2.getPrimaryDiagnosisDt() != null) {
					case1.setPrimaryDiagnosisDt(case2.getPrimaryDiagnosisDt());
				}

			} else if (diseaseTypeId == 2) {

				if (case2.getAge() != null) {
					case1.setAge(case2.getAge());
				}

				if (case2.getNoNodes() != null) {
					case1.setNoNodes(case2.getNoNodes());
				}

				if (case2.getTnmStageByFinalTnmStageId() != null) {
					case1.setTnmStageByFinalTnmStageId(case2.getTnmStageByFinalTnmStageId());
				}

				if (case2.getCancerSubType() != null) {
					case1.setCancerSubType(case2.getCancerSubType());
				}
				if (case2.getCancerType() != null) {
					case1.setCancerType(case2.getCancerType());
				}

				if (case2.getHistologicalGrade() != null) {
					case1.setHistologicalGrade(case2.getHistologicalGrade());
				}

				if (case2.getTumorSize() != null) {
					case1.setTumorSize(case2.getTumorSize());
				}
				if (case2.getMargins() != null) {
					case1.setMargins(case2.getMargins());
				}
				if (case2.getResidualTumor() != null) { // getResidualDisease
					case1.setResidualTumor(case2.getResidualTumor());// setResidualDisease
				}
				if (case2.getNyso() != null) {
					case1.setNyso(case2.getNyso());
				}
				if (case2.getWt() != null) {
					case1.setWt(case2.getWt());
				}
				if (case2.getIdo() != null) {
					case1.setWt(case2.getIdo());
				}
				if (case2.getClinicalStage() != null) {
					case1.setClinicalStage(case2.getClinicalStage());
				}

				if (case2.getIdo() != null) {
					case1.setWt(case2.getIdo());
				}
				if (case2.getPrimaryDiagnosisDt() != null) {
					case1.setPrimaryDiagnosisDt(case2.getPrimaryDiagnosisDt());
				}

			}
			query.setDescription(case1);
			exe.cycle(query);
			Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query,
					simConfig);
			Collection<CBRCase> retrievedCases = SelectCases.selectTopK(eval, numOfCases);

			if (diseaseTypeId == 1) {

				for (CBRCase nse : retrievedCases) {
					Case1 caseid = (Case1) nse.getDescription();
					Case1 casedata = new Case1DAO().findById(caseid.getCaseId());
					Map map = new LinkedHashMap();
					map.put("caseId", casedata.getCaseId());
					if (casedata.getPatient() != null) {
						map.put("patientName", casedata.getPatient().getFname().toString() + " "
								+ casedata.getPatient().getLname().toString());
					}
					map.put("age", casedata.getAge());
					String menopauseStatus = "";
					if (casedata.getMenopauseStatus() != null) {
						// menopauseStatus=(casedata.getMenopauseStatus()=="1")?"Post":"Pre";
						menopauseStatus = casedata.getMenopauseStatus();
					} else {
						menopauseStatus = "";
					}
					map.put("menopauseStatus", menopauseStatus);
					if (casedata.getTumorSize() != null) {
						map.put("tumorSize", casedata.getTumorSize().toString());
					} else {
						map.put("tumorSize", "");
					}
					if (casedata.getNoNodes() != null) {
						map.put("postiveNodes", casedata.getNoNodes().toString());
					} else {
						map.put("postiveNodes", "");
					}
					if (casedata.getHistologicalGrade() != null) {
						map.put("grade", casedata.getHistologicalGrade().toString());
					} else {
						map.put("grade", "NA");
					}
					if (casedata.getErStatus() != null) {
						map.put("erStatus", casedata.getErStatus().toString());
					} else {
						map.put("erStatus", "NA");
					}
					if (casedata.getPrStatus() != null) {
						map.put("prStatus", casedata.getPrStatus().toString());
					} else {
						map.put("prStatus", "NA");
					}
					if (casedata.getHer2Status() != null) {
						map.put("her2Status", casedata.getHer2Status().toString());
					} else {
						map.put("her2Status", "NA");
					}
					if (casedata.getCancerType() != null) {
						map.put("cancerType", casedata.getCancerType().getCname().toString());
					} else {
						map.put("cancerType", "NA");
					}
					if (casedata.getCancerSubType() != null) {
						map.put("cancerSubType", casedata.getCancerSubType().getName().toString());
					} else {
						map.put("cancerSubType", "NA");
					}
					if (casedata.getTnmStageByFinalTnmStageId() != null) {
						map.put("finalStatus", casedata.getTnmStageByFinalTnmStageId().getValue());
					} else {
						map.put("finalStatus", "NA");
					}
					JSONObject similarCase = new JSONObject(map);
					similardetails.put(similarCase);
				}

			} else if (diseaseTypeId == 2) {

				for (CBRCase nse : retrievedCases) {
					Case1 caseid = (Case1) nse.getDescription();
					Case1 casedata = new Case1DAO().findById(caseid.getCaseId());
					Map map = new LinkedHashMap();
					map.put("caseId", casedata.getCaseId());
					if (casedata.getPatient() != null) {
						map.put("patientName", casedata.getPatient().getFname().toString() + " "
								+ casedata.getPatient().getLname().toString());
					}
					map.put("age", casedata.getAge());
					if (casedata.getTumorSize() != null) {
						map.put("tumorSize", casedata.getTumorSize().toString());
					} else {
						map.put("tumorSize", "");
					}
					if (casedata.getNoNodes() != null) {
						map.put("postiveNodes", casedata.getNoNodes().toString());
					} else {
						map.put("postiveNodes", "");
					}
					if (casedata.getHistologicalGrade() != null) {
						map.put("grade", casedata.getHistologicalGrade().toString());
					} else {
						map.put("grade", "NA");
					}
					if (casedata.getMargins() != null) {
						map.put("margin", casedata.getMargins().toString());
					} else {
						map.put("margin", "NA");
					}
					if (casedata.getResidualTumor() != null && casedata.getResidualTumor() != 0) {// getResidualDisease
						map.put("residualDisease", "YES");
					} else {
						map.put("residualDisease", "NA");
					}
					if (casedata.getNyso() != null && casedata.getNyso() != 0) {
						map.put("nyso1", "YES");
					} else {
						map.put("nyso1", "NA");
					}
					if (casedata.getWt() != null && casedata.getWt() != 0) {
						map.put("wt1", "YES");
					} else {
						map.put("wt1", "NA");
					}
					if (casedata.getIdo() != null && casedata.getRecurrence() != 0) {
						map.put("edi", "YES");
					} else {
						map.put("edi", "NA");
					}
					if (casedata.getRecurrence() != null && casedata.getRecurrence() != 0) {
						map.put("recurrence", "YES");
					} else {
						map.put("recurrence", "NA");
					}
					if (casedata.getCancerType() != null) {
						map.put("cancerType", casedata.getCancerType().getCname().toString());
					} else {
						map.put("cancerType", "NA");
					}
					if (casedata.getCancerSubType() != null) {
						map.put("cancerSubType", casedata.getCancerSubType().getName().toString());
					} else {
						map.put("cancerSubType", "NA");
					}
					if (casedata.getTnmStageByFinalTnmStageId() != null) {
						map.put("finalStatus", casedata.getTnmStageByFinalTnmStageId().getValue());
					} else {
						map.put("finalStatus", "NA");
					}
					if (casedata.getClinicalStage() != null) {
						map.put("clinicalStage", casedata.getClinicalStage());
					} else {
						map.put("clinicalStage", "NA");
					}
					JSONObject similarCase = new JSONObject(map);
					similardetails.put(similarCase);
				}

			}
			exe.postCycle();
			eval.clear();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			_caseBase.close();
			_connector.close();
			;
		}
		return similardetails.toString();

	}

}
