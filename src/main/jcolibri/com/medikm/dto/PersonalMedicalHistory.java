package com.medikm.dto;

import java.sql.Timestamp;

/**
 * PersonalMedicalHistory entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class PersonalMedicalHistory implements java.io.Serializable {

	// Fields

	private PersonalMedicalHistoryId id;
	private CancerType cancerType;
	private CancerSubType cancerSubType;
	private TnmStage tnmStageByPrCaTnm;
	private TnmStage tnmStageByPrCaWorkingTnm;
	private Symptoms symptoms;
	private Short previousCancer;
	private Timestamp prCaDiagnosisDt;
	private Short prCaClearSurgicalMargins;
	private Integer pcHistologicalGrade;
	private String pcErStatus;
	private String pcPrStatus;
	private String pcHer2neuStatus;
	private String pcHer2neuSish;
	private Short pcSurgery;
	private String pcSurgeryComm;
	private Short pcChemo;
	private String pcChemoComm;
	private Short pcRt;
	private String pcRtComm;
	private Short pcEndocrineTherapy;
	private String pcEndocrineTherapyComm;
	private Short pcTargetedTherapy;
	private String pcTargetedTherapyComm;
	private Short pcBiopsy;
	private String pcBiopsyComm;
	private Integer noPcBiopsies;
	private Short atypicalHyperplasiaBreastBiopsy;
	private Short hormoneReplacementTherapyUse;
	private String hormoneReplacementTherapyUseComm;
	private Short histerectomy;
	private Short ovariectomy;
	private String ovariectomyComm;
	private Short chestWallRadiation;
	private String chestWallRadiationComm;
	private Short radiationTherapyDuringPregnancy;
	private String radiationTherapyDuringPregnancyComm;
	private Short hormoneManipulationTherapy;
	private String majorComorbidities;
	private Short activeConnectiveTissueDiseaseInvolvingSkin;
	private Short ovarianCancer;
	private String previousOtherCancer;
	private Short thryroidDisease;
	private String thryroidDiseaseComm;
	private Short uterineFibroids;
	private Short perezJagerDisease;
	private Short hamartomas;
	private Short autuimmuneDisease;
	private String autuimmuneDiseaseComm;
	private Short prostateDisease;
	private String prostateDiseaseComm;
	private Short synchronousPrimaryBreastCancer;
	private Short bilateralBc;
	private Short alcoholIntake;
	private Short smokingHistory;
	private Short antracyclineAdministered;
	private String antracyclineAdministeredComm;
	private Short treatmentRelatedToxicity;
	private String treatmentRelatedToxicityComm;
	private Boolean benignBreastDisease;
	private Boolean priorThoracicRt;
	private Boolean mutations;
	private Integer hxRenalFail;
	private Integer hxVhl;
	private Integer hxPrevCancer;
	private Integer currentSmoker;
	private Integer noYrSmoked;
	private Integer noPackSmokePday;
	private Integer pastSurgHx;
	private Integer noPriorAbdominalSur;
	private String cigPackYear;
	private Integer hypertention;
	private Integer pulmHypertn;
	private Integer diabetes;
	private Integer diabCtrl;
	private Integer dialysis;
	private String hemoglobinLst;
	private Integer copd;
	private Integer histGenSynBone;
	private Integer histSarcoma;
	private Integer histMass;
	private Integer histPain;
	private Integer histPathFracture;
	private Integer priorChemoCurativeNo;
	private Integer priorChemoPalliativeNo;
	private Integer priorRadioCuraNo;
	private Integer priorRadioPalliativeNo;
	private Integer priorSurgeryNo;
	private Integer priorCongInherSyndrone;
	private Integer radioTherapyExp;
	private Integer noYrQuitSmoke;
	private String personalMedicalHistoryComments;
	private String otherHistory;
	private Short traumaHx;
	private Short rtHx;
	private Short toxicChemicals;
	private Short adequatePreviousSurgery;
	private Short clinicalPresentation;
	private Short incidentalFinding;
	private String bmi;
	private Integer calciumLevel;
	private Integer cadmiumLevel;
	private Short prostatitis;

	// Constructors

	/** default constructor */
	public PersonalMedicalHistory() {
	}

	/** minimal constructor */
	public PersonalMedicalHistory(PersonalMedicalHistoryId id) {
		this.id = id;
	}

	/** full constructor */
	public PersonalMedicalHistory(PersonalMedicalHistoryId id, CancerType cancerType, CancerSubType cancerSubType,
			TnmStage tnmStageByPrCaTnm, TnmStage tnmStageByPrCaWorkingTnm, Symptoms symptoms, Short previousCancer,
			Timestamp prCaDiagnosisDt, Short prCaClearSurgicalMargins, Integer pcHistologicalGrade, String pcErStatus,
			String pcPrStatus, String pcHer2neuStatus, String pcHer2neuSish, Short pcSurgery, String pcSurgeryComm,
			Short pcChemo, String pcChemoComm, Short pcRt, String pcRtComm, Short pcEndocrineTherapy,
			String pcEndocrineTherapyComm, Short pcTargetedTherapy, String pcTargetedTherapyComm, Short pcBiopsy,
			String pcBiopsyComm, Integer noPcBiopsies, Short atypicalHyperplasiaBreastBiopsy,
			Short hormoneReplacementTherapyUse, String hormoneReplacementTherapyUseComm, Short histerectomy,
			Short ovariectomy, String ovariectomyComm, Short chestWallRadiation, String chestWallRadiationComm,
			Short radiationTherapyDuringPregnancy, String radiationTherapyDuringPregnancyComm,
			Short hormoneManipulationTherapy, String majorComorbidities,
			Short activeConnectiveTissueDiseaseInvolvingSkin, Short ovarianCancer, String previousOtherCancer,
			Short thryroidDisease, String thryroidDiseaseComm, Short uterineFibroids, Short perezJagerDisease,
			Short hamartomas, Short autuimmuneDisease, String autuimmuneDiseaseComm, Short prostateDisease,
			String prostateDiseaseComm, Short synchronousPrimaryBreastCancer, Short bilateralBc, Short alcoholIntake,
			Short smokingHistory, Short antracyclineAdministered, String antracyclineAdministeredComm,
			Short treatmentRelatedToxicity, String treatmentRelatedToxicityComm, Boolean benignBreastDisease,
			Boolean priorThoracicRt, Boolean mutations, Integer hxRenalFail, Integer hxVhl, Integer hxPrevCancer,
			Integer currentSmoker, Integer noYrSmoked, Integer noPackSmokePday, Integer pastSurgHx,
			Integer noPriorAbdominalSur, String cigPackYear, Integer hypertention, Integer pulmHypertn,
			Integer diabetes, Integer diabCtrl, Integer dialysis, String hemoglobinLst, Integer copd,
			Integer histGenSynBone, Integer histSarcoma, Integer histMass, Integer histPain, Integer histPathFracture,
			Integer priorChemoCurativeNo, Integer priorChemoPalliativeNo, Integer priorRadioCuraNo,
			Integer priorRadioPalliativeNo, Integer priorSurgeryNo, Integer priorCongInherSyndrone,
			Integer radioTherapyExp, Integer noYrQuitSmoke, String personalMedicalHistoryComments, String otherHistory,
			Short traumaHx, Short rtHx, Short toxicChemicals, Short adequatePreviousSurgery, Short clinicalPresentation,
			Short incidentalFinding, String bmi, Integer calciumLevel, Integer cadmiumLevel, Short prostatitis) {
		this.id = id;
		this.cancerType = cancerType;
		this.cancerSubType = cancerSubType;
		this.tnmStageByPrCaTnm = tnmStageByPrCaTnm;
		this.tnmStageByPrCaWorkingTnm = tnmStageByPrCaWorkingTnm;
		this.symptoms = symptoms;
		this.previousCancer = previousCancer;
		this.prCaDiagnosisDt = prCaDiagnosisDt;
		this.prCaClearSurgicalMargins = prCaClearSurgicalMargins;
		this.pcHistologicalGrade = pcHistologicalGrade;
		this.pcErStatus = pcErStatus;
		this.pcPrStatus = pcPrStatus;
		this.pcHer2neuStatus = pcHer2neuStatus;
		this.pcHer2neuSish = pcHer2neuSish;
		this.pcSurgery = pcSurgery;
		this.pcSurgeryComm = pcSurgeryComm;
		this.pcChemo = pcChemo;
		this.pcChemoComm = pcChemoComm;
		this.pcRt = pcRt;
		this.pcRtComm = pcRtComm;
		this.pcEndocrineTherapy = pcEndocrineTherapy;
		this.pcEndocrineTherapyComm = pcEndocrineTherapyComm;
		this.pcTargetedTherapy = pcTargetedTherapy;
		this.pcTargetedTherapyComm = pcTargetedTherapyComm;
		this.pcBiopsy = pcBiopsy;
		this.pcBiopsyComm = pcBiopsyComm;
		this.noPcBiopsies = noPcBiopsies;
		this.atypicalHyperplasiaBreastBiopsy = atypicalHyperplasiaBreastBiopsy;
		this.hormoneReplacementTherapyUse = hormoneReplacementTherapyUse;
		this.hormoneReplacementTherapyUseComm = hormoneReplacementTherapyUseComm;
		this.histerectomy = histerectomy;
		this.ovariectomy = ovariectomy;
		this.ovariectomyComm = ovariectomyComm;
		this.chestWallRadiation = chestWallRadiation;
		this.chestWallRadiationComm = chestWallRadiationComm;
		this.radiationTherapyDuringPregnancy = radiationTherapyDuringPregnancy;
		this.radiationTherapyDuringPregnancyComm = radiationTherapyDuringPregnancyComm;
		this.hormoneManipulationTherapy = hormoneManipulationTherapy;
		this.majorComorbidities = majorComorbidities;
		this.activeConnectiveTissueDiseaseInvolvingSkin = activeConnectiveTissueDiseaseInvolvingSkin;
		this.ovarianCancer = ovarianCancer;
		this.previousOtherCancer = previousOtherCancer;
		this.thryroidDisease = thryroidDisease;
		this.thryroidDiseaseComm = thryroidDiseaseComm;
		this.uterineFibroids = uterineFibroids;
		this.perezJagerDisease = perezJagerDisease;
		this.hamartomas = hamartomas;
		this.autuimmuneDisease = autuimmuneDisease;
		this.autuimmuneDiseaseComm = autuimmuneDiseaseComm;
		this.prostateDisease = prostateDisease;
		this.prostateDiseaseComm = prostateDiseaseComm;
		this.synchronousPrimaryBreastCancer = synchronousPrimaryBreastCancer;
		this.bilateralBc = bilateralBc;
		this.alcoholIntake = alcoholIntake;
		this.smokingHistory = smokingHistory;
		this.antracyclineAdministered = antracyclineAdministered;
		this.antracyclineAdministeredComm = antracyclineAdministeredComm;
		this.treatmentRelatedToxicity = treatmentRelatedToxicity;
		this.treatmentRelatedToxicityComm = treatmentRelatedToxicityComm;
		this.benignBreastDisease = benignBreastDisease;
		this.priorThoracicRt = priorThoracicRt;
		this.mutations = mutations;
		this.hxRenalFail = hxRenalFail;
		this.hxVhl = hxVhl;
		this.hxPrevCancer = hxPrevCancer;
		this.currentSmoker = currentSmoker;
		this.noYrSmoked = noYrSmoked;
		this.noPackSmokePday = noPackSmokePday;
		this.pastSurgHx = pastSurgHx;
		this.noPriorAbdominalSur = noPriorAbdominalSur;
		this.cigPackYear = cigPackYear;
		this.hypertention = hypertention;
		this.pulmHypertn = pulmHypertn;
		this.diabetes = diabetes;
		this.diabCtrl = diabCtrl;
		this.dialysis = dialysis;
		this.hemoglobinLst = hemoglobinLst;
		this.copd = copd;
		this.histGenSynBone = histGenSynBone;
		this.histSarcoma = histSarcoma;
		this.histMass = histMass;
		this.histPain = histPain;
		this.histPathFracture = histPathFracture;
		this.priorChemoCurativeNo = priorChemoCurativeNo;
		this.priorChemoPalliativeNo = priorChemoPalliativeNo;
		this.priorRadioCuraNo = priorRadioCuraNo;
		this.priorRadioPalliativeNo = priorRadioPalliativeNo;
		this.priorSurgeryNo = priorSurgeryNo;
		this.priorCongInherSyndrone = priorCongInherSyndrone;
		this.radioTherapyExp = radioTherapyExp;
		this.noYrQuitSmoke = noYrQuitSmoke;
		this.personalMedicalHistoryComments = personalMedicalHistoryComments;
		this.otherHistory = otherHistory;
		this.traumaHx = traumaHx;
		this.rtHx = rtHx;
		this.toxicChemicals = toxicChemicals;
		this.adequatePreviousSurgery = adequatePreviousSurgery;
		this.clinicalPresentation = clinicalPresentation;
		this.incidentalFinding = incidentalFinding;
		this.bmi = bmi;
		this.calciumLevel = calciumLevel;
		this.cadmiumLevel = cadmiumLevel;
		this.prostatitis = prostatitis;
	}

	// Property accessors

	public PersonalMedicalHistoryId getId() {
		return this.id;
	}

	public void setId(PersonalMedicalHistoryId id) {
		this.id = id;
	}

	public CancerType getCancerType() {
		return this.cancerType;
	}

	public void setCancerType(CancerType cancerType) {
		this.cancerType = cancerType;
	}

	public CancerSubType getCancerSubType() {
		return this.cancerSubType;
	}

	public void setCancerSubType(CancerSubType cancerSubType) {
		this.cancerSubType = cancerSubType;
	}

	public TnmStage getTnmStageByPrCaTnm() {
		return this.tnmStageByPrCaTnm;
	}

	public void setTnmStageByPrCaTnm(TnmStage tnmStageByPrCaTnm) {
		this.tnmStageByPrCaTnm = tnmStageByPrCaTnm;
	}

	public TnmStage getTnmStageByPrCaWorkingTnm() {
		return this.tnmStageByPrCaWorkingTnm;
	}

	public void setTnmStageByPrCaWorkingTnm(TnmStage tnmStageByPrCaWorkingTnm) {
		this.tnmStageByPrCaWorkingTnm = tnmStageByPrCaWorkingTnm;
	}

	public Symptoms getSymptoms() {
		return this.symptoms;
	}

	public void setSymptoms(Symptoms symptoms) {
		this.symptoms = symptoms;
	}

	public Short getPreviousCancer() {
		return this.previousCancer;
	}

	public void setPreviousCancer(Short previousCancer) {
		this.previousCancer = previousCancer;
	}

	public Timestamp getPrCaDiagnosisDt() {
		return this.prCaDiagnosisDt;
	}

	public void setPrCaDiagnosisDt(Timestamp prCaDiagnosisDt) {
		this.prCaDiagnosisDt = prCaDiagnosisDt;
	}

	public Short getPrCaClearSurgicalMargins() {
		return this.prCaClearSurgicalMargins;
	}

	public void setPrCaClearSurgicalMargins(Short prCaClearSurgicalMargins) {
		this.prCaClearSurgicalMargins = prCaClearSurgicalMargins;
	}

	public Integer getPcHistologicalGrade() {
		return this.pcHistologicalGrade;
	}

	public void setPcHistologicalGrade(Integer pcHistologicalGrade) {
		this.pcHistologicalGrade = pcHistologicalGrade;
	}

	public String getPcErStatus() {
		return this.pcErStatus;
	}

	public void setPcErStatus(String pcErStatus) {
		this.pcErStatus = pcErStatus;
	}

	public String getPcPrStatus() {
		return this.pcPrStatus;
	}

	public void setPcPrStatus(String pcPrStatus) {
		this.pcPrStatus = pcPrStatus;
	}

	public String getPcHer2neuStatus() {
		return this.pcHer2neuStatus;
	}

	public void setPcHer2neuStatus(String pcHer2neuStatus) {
		this.pcHer2neuStatus = pcHer2neuStatus;
	}

	public String getPcHer2neuSish() {
		return this.pcHer2neuSish;
	}

	public void setPcHer2neuSish(String pcHer2neuSish) {
		this.pcHer2neuSish = pcHer2neuSish;
	}

	public Short getPcSurgery() {
		return this.pcSurgery;
	}

	public void setPcSurgery(Short pcSurgery) {
		this.pcSurgery = pcSurgery;
	}

	public String getPcSurgeryComm() {
		return this.pcSurgeryComm;
	}

	public void setPcSurgeryComm(String pcSurgeryComm) {
		this.pcSurgeryComm = pcSurgeryComm;
	}

	public Short getPcChemo() {
		return this.pcChemo;
	}

	public void setPcChemo(Short pcChemo) {
		this.pcChemo = pcChemo;
	}

	public String getPcChemoComm() {
		return this.pcChemoComm;
	}

	public void setPcChemoComm(String pcChemoComm) {
		this.pcChemoComm = pcChemoComm;
	}

	public Short getPcRt() {
		return this.pcRt;
	}

	public void setPcRt(Short pcRt) {
		this.pcRt = pcRt;
	}

	public String getPcRtComm() {
		return this.pcRtComm;
	}

	public void setPcRtComm(String pcRtComm) {
		this.pcRtComm = pcRtComm;
	}

	public Short getPcEndocrineTherapy() {
		return this.pcEndocrineTherapy;
	}

	public void setPcEndocrineTherapy(Short pcEndocrineTherapy) {
		this.pcEndocrineTherapy = pcEndocrineTherapy;
	}

	public String getPcEndocrineTherapyComm() {
		return this.pcEndocrineTherapyComm;
	}

	public void setPcEndocrineTherapyComm(String pcEndocrineTherapyComm) {
		this.pcEndocrineTherapyComm = pcEndocrineTherapyComm;
	}

	public Short getPcTargetedTherapy() {
		return this.pcTargetedTherapy;
	}

	public void setPcTargetedTherapy(Short pcTargetedTherapy) {
		this.pcTargetedTherapy = pcTargetedTherapy;
	}

	public String getPcTargetedTherapyComm() {
		return this.pcTargetedTherapyComm;
	}

	public void setPcTargetedTherapyComm(String pcTargetedTherapyComm) {
		this.pcTargetedTherapyComm = pcTargetedTherapyComm;
	}

	public Short getPcBiopsy() {
		return this.pcBiopsy;
	}

	public void setPcBiopsy(Short pcBiopsy) {
		this.pcBiopsy = pcBiopsy;
	}

	public String getPcBiopsyComm() {
		return this.pcBiopsyComm;
	}

	public void setPcBiopsyComm(String pcBiopsyComm) {
		this.pcBiopsyComm = pcBiopsyComm;
	}

	public Integer getNoPcBiopsies() {
		return this.noPcBiopsies;
	}

	public void setNoPcBiopsies(Integer noPcBiopsies) {
		this.noPcBiopsies = noPcBiopsies;
	}

	public Short getAtypicalHyperplasiaBreastBiopsy() {
		return this.atypicalHyperplasiaBreastBiopsy;
	}

	public void setAtypicalHyperplasiaBreastBiopsy(Short atypicalHyperplasiaBreastBiopsy) {
		this.atypicalHyperplasiaBreastBiopsy = atypicalHyperplasiaBreastBiopsy;
	}

	public Short getHormoneReplacementTherapyUse() {
		return this.hormoneReplacementTherapyUse;
	}

	public void setHormoneReplacementTherapyUse(Short hormoneReplacementTherapyUse) {
		this.hormoneReplacementTherapyUse = hormoneReplacementTherapyUse;
	}

	public String getHormoneReplacementTherapyUseComm() {
		return this.hormoneReplacementTherapyUseComm;
	}

	public void setHormoneReplacementTherapyUseComm(String hormoneReplacementTherapyUseComm) {
		this.hormoneReplacementTherapyUseComm = hormoneReplacementTherapyUseComm;
	}

	public Short getHisterectomy() {
		return this.histerectomy;
	}

	public void setHisterectomy(Short histerectomy) {
		this.histerectomy = histerectomy;
	}

	public Short getOvariectomy() {
		return this.ovariectomy;
	}

	public void setOvariectomy(Short ovariectomy) {
		this.ovariectomy = ovariectomy;
	}

	public String getOvariectomyComm() {
		return this.ovariectomyComm;
	}

	public void setOvariectomyComm(String ovariectomyComm) {
		this.ovariectomyComm = ovariectomyComm;
	}

	public Short getChestWallRadiation() {
		return this.chestWallRadiation;
	}

	public void setChestWallRadiation(Short chestWallRadiation) {
		this.chestWallRadiation = chestWallRadiation;
	}

	public String getChestWallRadiationComm() {
		return this.chestWallRadiationComm;
	}

	public void setChestWallRadiationComm(String chestWallRadiationComm) {
		this.chestWallRadiationComm = chestWallRadiationComm;
	}

	public Short getRadiationTherapyDuringPregnancy() {
		return this.radiationTherapyDuringPregnancy;
	}

	public void setRadiationTherapyDuringPregnancy(Short radiationTherapyDuringPregnancy) {
		this.radiationTherapyDuringPregnancy = radiationTherapyDuringPregnancy;
	}

	public String getRadiationTherapyDuringPregnancyComm() {
		return this.radiationTherapyDuringPregnancyComm;
	}

	public void setRadiationTherapyDuringPregnancyComm(String radiationTherapyDuringPregnancyComm) {
		this.radiationTherapyDuringPregnancyComm = radiationTherapyDuringPregnancyComm;
	}

	public Short getHormoneManipulationTherapy() {
		return this.hormoneManipulationTherapy;
	}

	public void setHormoneManipulationTherapy(Short hormoneManipulationTherapy) {
		this.hormoneManipulationTherapy = hormoneManipulationTherapy;
	}

	public String getMajorComorbidities() {
		return this.majorComorbidities;
	}

	public void setMajorComorbidities(String majorComorbidities) {
		this.majorComorbidities = majorComorbidities;
	}

	public Short getActiveConnectiveTissueDiseaseInvolvingSkin() {
		return this.activeConnectiveTissueDiseaseInvolvingSkin;
	}

	public void setActiveConnectiveTissueDiseaseInvolvingSkin(Short activeConnectiveTissueDiseaseInvolvingSkin) {
		this.activeConnectiveTissueDiseaseInvolvingSkin = activeConnectiveTissueDiseaseInvolvingSkin;
	}

	public Short getOvarianCancer() {
		return this.ovarianCancer;
	}

	public void setOvarianCancer(Short ovarianCancer) {
		this.ovarianCancer = ovarianCancer;
	}

	public String getPreviousOtherCancer() {
		return this.previousOtherCancer;
	}

	public void setPreviousOtherCancer(String previousOtherCancer) {
		this.previousOtherCancer = previousOtherCancer;
	}

	public Short getThryroidDisease() {
		return this.thryroidDisease;
	}

	public void setThryroidDisease(Short thryroidDisease) {
		this.thryroidDisease = thryroidDisease;
	}

	public String getThryroidDiseaseComm() {
		return this.thryroidDiseaseComm;
	}

	public void setThryroidDiseaseComm(String thryroidDiseaseComm) {
		this.thryroidDiseaseComm = thryroidDiseaseComm;
	}

	public Short getUterineFibroids() {
		return this.uterineFibroids;
	}

	public void setUterineFibroids(Short uterineFibroids) {
		this.uterineFibroids = uterineFibroids;
	}

	public Short getPerezJagerDisease() {
		return this.perezJagerDisease;
	}

	public void setPerezJagerDisease(Short perezJagerDisease) {
		this.perezJagerDisease = perezJagerDisease;
	}

	public Short getHamartomas() {
		return this.hamartomas;
	}

	public void setHamartomas(Short hamartomas) {
		this.hamartomas = hamartomas;
	}

	public Short getAutuimmuneDisease() {
		return this.autuimmuneDisease;
	}

	public void setAutuimmuneDisease(Short autuimmuneDisease) {
		this.autuimmuneDisease = autuimmuneDisease;
	}

	public String getAutuimmuneDiseaseComm() {
		return this.autuimmuneDiseaseComm;
	}

	public void setAutuimmuneDiseaseComm(String autuimmuneDiseaseComm) {
		this.autuimmuneDiseaseComm = autuimmuneDiseaseComm;
	}

	public Short getProstateDisease() {
		return this.prostateDisease;
	}

	public void setProstateDisease(Short prostateDisease) {
		this.prostateDisease = prostateDisease;
	}

	public String getProstateDiseaseComm() {
		return this.prostateDiseaseComm;
	}

	public void setProstateDiseaseComm(String prostateDiseaseComm) {
		this.prostateDiseaseComm = prostateDiseaseComm;
	}

	public Short getSynchronousPrimaryBreastCancer() {
		return this.synchronousPrimaryBreastCancer;
	}

	public void setSynchronousPrimaryBreastCancer(Short synchronousPrimaryBreastCancer) {
		this.synchronousPrimaryBreastCancer = synchronousPrimaryBreastCancer;
	}

	public Short getBilateralBc() {
		return this.bilateralBc;
	}

	public void setBilateralBc(Short bilateralBc) {
		this.bilateralBc = bilateralBc;
	}

	public Short getAlcoholIntake() {
		return this.alcoholIntake;
	}

	public void setAlcoholIntake(Short alcoholIntake) {
		this.alcoholIntake = alcoholIntake;
	}

	public Short getSmokingHistory() {
		return this.smokingHistory;
	}

	public void setSmokingHistory(Short smokingHistory) {
		this.smokingHistory = smokingHistory;
	}

	public Short getAntracyclineAdministered() {
		return this.antracyclineAdministered;
	}

	public void setAntracyclineAdministered(Short antracyclineAdministered) {
		this.antracyclineAdministered = antracyclineAdministered;
	}

	public String getAntracyclineAdministeredComm() {
		return this.antracyclineAdministeredComm;
	}

	public void setAntracyclineAdministeredComm(String antracyclineAdministeredComm) {
		this.antracyclineAdministeredComm = antracyclineAdministeredComm;
	}

	public Short getTreatmentRelatedToxicity() {
		return this.treatmentRelatedToxicity;
	}

	public void setTreatmentRelatedToxicity(Short treatmentRelatedToxicity) {
		this.treatmentRelatedToxicity = treatmentRelatedToxicity;
	}

	public String getTreatmentRelatedToxicityComm() {
		return this.treatmentRelatedToxicityComm;
	}

	public void setTreatmentRelatedToxicityComm(String treatmentRelatedToxicityComm) {
		this.treatmentRelatedToxicityComm = treatmentRelatedToxicityComm;
	}

	public Boolean getBenignBreastDisease() {
		return this.benignBreastDisease;
	}

	public void setBenignBreastDisease(Boolean benignBreastDisease) {
		this.benignBreastDisease = benignBreastDisease;
	}

	public Boolean getPriorThoracicRt() {
		return this.priorThoracicRt;
	}

	public void setPriorThoracicRt(Boolean priorThoracicRt) {
		this.priorThoracicRt = priorThoracicRt;
	}

	public Boolean getMutations() {
		return this.mutations;
	}

	public void setMutations(Boolean mutations) {
		this.mutations = mutations;
	}

	public Integer getHxRenalFail() {
		return this.hxRenalFail;
	}

	public void setHxRenalFail(Integer hxRenalFail) {
		this.hxRenalFail = hxRenalFail;
	}

	public Integer getHxVhl() {
		return this.hxVhl;
	}

	public void setHxVhl(Integer hxVhl) {
		this.hxVhl = hxVhl;
	}

	public Integer getHxPrevCancer() {
		return this.hxPrevCancer;
	}

	public void setHxPrevCancer(Integer hxPrevCancer) {
		this.hxPrevCancer = hxPrevCancer;
	}

	public Integer getCurrentSmoker() {
		return this.currentSmoker;
	}

	public void setCurrentSmoker(Integer currentSmoker) {
		this.currentSmoker = currentSmoker;
	}

	public Integer getNoYrSmoked() {
		return this.noYrSmoked;
	}

	public void setNoYrSmoked(Integer noYrSmoked) {
		this.noYrSmoked = noYrSmoked;
	}

	public Integer getNoPackSmokePday() {
		return this.noPackSmokePday;
	}

	public void setNoPackSmokePday(Integer noPackSmokePday) {
		this.noPackSmokePday = noPackSmokePday;
	}

	public Integer getPastSurgHx() {
		return this.pastSurgHx;
	}

	public void setPastSurgHx(Integer pastSurgHx) {
		this.pastSurgHx = pastSurgHx;
	}

	public Integer getNoPriorAbdominalSur() {
		return this.noPriorAbdominalSur;
	}

	public void setNoPriorAbdominalSur(Integer noPriorAbdominalSur) {
		this.noPriorAbdominalSur = noPriorAbdominalSur;
	}

	public String getCigPackYear() {
		return this.cigPackYear;
	}

	public void setCigPackYear(String cigPackYear) {
		this.cigPackYear = cigPackYear;
	}

	public Integer getHypertention() {
		return this.hypertention;
	}

	public void setHypertention(Integer hypertention) {
		this.hypertention = hypertention;
	}

	public Integer getPulmHypertn() {
		return this.pulmHypertn;
	}

	public void setPulmHypertn(Integer pulmHypertn) {
		this.pulmHypertn = pulmHypertn;
	}

	public Integer getDiabetes() {
		return this.diabetes;
	}

	public void setDiabetes(Integer diabetes) {
		this.diabetes = diabetes;
	}

	public Integer getDiabCtrl() {
		return this.diabCtrl;
	}

	public void setDiabCtrl(Integer diabCtrl) {
		this.diabCtrl = diabCtrl;
	}

	public Integer getDialysis() {
		return this.dialysis;
	}

	public void setDialysis(Integer dialysis) {
		this.dialysis = dialysis;
	}

	public String getHemoglobinLst() {
		return this.hemoglobinLst;
	}

	public void setHemoglobinLst(String hemoglobinLst) {
		this.hemoglobinLst = hemoglobinLst;
	}

	public Integer getCopd() {
		return this.copd;
	}

	public void setCopd(Integer copd) {
		this.copd = copd;
	}

	public Integer getHistGenSynBone() {
		return this.histGenSynBone;
	}

	public void setHistGenSynBone(Integer histGenSynBone) {
		this.histGenSynBone = histGenSynBone;
	}

	public Integer getHistSarcoma() {
		return this.histSarcoma;
	}

	public void setHistSarcoma(Integer histSarcoma) {
		this.histSarcoma = histSarcoma;
	}

	public Integer getHistMass() {
		return this.histMass;
	}

	public void setHistMass(Integer histMass) {
		this.histMass = histMass;
	}

	public Integer getHistPain() {
		return this.histPain;
	}

	public void setHistPain(Integer histPain) {
		this.histPain = histPain;
	}

	public Integer getHistPathFracture() {
		return this.histPathFracture;
	}

	public void setHistPathFracture(Integer histPathFracture) {
		this.histPathFracture = histPathFracture;
	}

	public Integer getPriorChemoCurativeNo() {
		return this.priorChemoCurativeNo;
	}

	public void setPriorChemoCurativeNo(Integer priorChemoCurativeNo) {
		this.priorChemoCurativeNo = priorChemoCurativeNo;
	}

	public Integer getPriorChemoPalliativeNo() {
		return this.priorChemoPalliativeNo;
	}

	public void setPriorChemoPalliativeNo(Integer priorChemoPalliativeNo) {
		this.priorChemoPalliativeNo = priorChemoPalliativeNo;
	}

	public Integer getPriorRadioCuraNo() {
		return this.priorRadioCuraNo;
	}

	public void setPriorRadioCuraNo(Integer priorRadioCuraNo) {
		this.priorRadioCuraNo = priorRadioCuraNo;
	}

	public Integer getPriorRadioPalliativeNo() {
		return this.priorRadioPalliativeNo;
	}

	public void setPriorRadioPalliativeNo(Integer priorRadioPalliativeNo) {
		this.priorRadioPalliativeNo = priorRadioPalliativeNo;
	}

	public Integer getPriorSurgeryNo() {
		return this.priorSurgeryNo;
	}

	public void setPriorSurgeryNo(Integer priorSurgeryNo) {
		this.priorSurgeryNo = priorSurgeryNo;
	}

	public Integer getPriorCongInherSyndrone() {
		return this.priorCongInherSyndrone;
	}

	public void setPriorCongInherSyndrone(Integer priorCongInherSyndrone) {
		this.priorCongInherSyndrone = priorCongInherSyndrone;
	}

	public Integer getRadioTherapyExp() {
		return this.radioTherapyExp;
	}

	public void setRadioTherapyExp(Integer radioTherapyExp) {
		this.radioTherapyExp = radioTherapyExp;
	}

	public Integer getNoYrQuitSmoke() {
		return this.noYrQuitSmoke;
	}

	public void setNoYrQuitSmoke(Integer noYrQuitSmoke) {
		this.noYrQuitSmoke = noYrQuitSmoke;
	}

	public String getPersonalMedicalHistoryComments() {
		return this.personalMedicalHistoryComments;
	}

	public void setPersonalMedicalHistoryComments(String personalMedicalHistoryComments) {
		this.personalMedicalHistoryComments = personalMedicalHistoryComments;
	}

	public String getOtherHistory() {
		return this.otherHistory;
	}

	public void setOtherHistory(String otherHistory) {
		this.otherHistory = otherHistory;
	}

	public Short getTraumaHx() {
		return this.traumaHx;
	}

	public void setTraumaHx(Short traumaHx) {
		this.traumaHx = traumaHx;
	}

	public Short getRtHx() {
		return this.rtHx;
	}

	public void setRtHx(Short rtHx) {
		this.rtHx = rtHx;
	}

	public Short getToxicChemicals() {
		return this.toxicChemicals;
	}

	public void setToxicChemicals(Short toxicChemicals) {
		this.toxicChemicals = toxicChemicals;
	}

	public Short getAdequatePreviousSurgery() {
		return this.adequatePreviousSurgery;
	}

	public void setAdequatePreviousSurgery(Short adequatePreviousSurgery) {
		this.adequatePreviousSurgery = adequatePreviousSurgery;
	}

	public Short getClinicalPresentation() {
		return this.clinicalPresentation;
	}

	public void setClinicalPresentation(Short clinicalPresentation) {
		this.clinicalPresentation = clinicalPresentation;
	}

	public Short getIncidentalFinding() {
		return this.incidentalFinding;
	}

	public void setIncidentalFinding(Short incidentalFinding) {
		this.incidentalFinding = incidentalFinding;
	}

	public String getBmi() {
		return this.bmi;
	}

	public void setBmi(String bmi) {
		this.bmi = bmi;
	}

	public Integer getCalciumLevel() {
		return this.calciumLevel;
	}

	public void setCalciumLevel(Integer calciumLevel) {
		this.calciumLevel = calciumLevel;
	}

	public Integer getCadmiumLevel() {
		return this.cadmiumLevel;
	}

	public void setCadmiumLevel(Integer cadmiumLevel) {
		this.cadmiumLevel = cadmiumLevel;
	}

	public Short getProstatitis() {
		return this.prostatitis;
	}

	public void setProstatitis(Short prostatitis) {
		this.prostatitis = prostatitis;
	}

}