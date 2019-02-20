package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * TnmStage entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class TnmStage implements java.io.Serializable {

	// Fields

	private Integer stageId;
	private String value;
	private Set cancerStagesForEpisodeTnmStage = new HashSet(0);
	private Set cancerStagesForWorkingTnmStage = new HashSet(0);
	private Set personalMedicalHistoriesForPrCaTnm = new HashSet(0);
	private Set case1sForWorkingTnmStageId = new HashSet(0);
	private Set case1sForFinalTnmStageId = new HashSet(0);
	private Set personalMedicalHistoriesForPrCaWorkingTnm = new HashSet(0);

	// Constructors

	/** default constructor */
	public TnmStage() {
	}

	/** minimal constructor */
	public TnmStage(Integer stageId, String value) {
		this.stageId = stageId;
		this.value = value;
	}

	/** full constructor */
	public TnmStage(Integer stageId, String value, Set cancerStagesForEpisodeTnmStage,
			Set cancerStagesForWorkingTnmStage, Set personalMedicalHistoriesForPrCaTnm, Set case1sForWorkingTnmStageId,
			Set case1sForFinalTnmStageId, Set personalMedicalHistoriesForPrCaWorkingTnm) {
		this.stageId = stageId;
		this.value = value;
		this.cancerStagesForEpisodeTnmStage = cancerStagesForEpisodeTnmStage;
		this.cancerStagesForWorkingTnmStage = cancerStagesForWorkingTnmStage;
		this.personalMedicalHistoriesForPrCaTnm = personalMedicalHistoriesForPrCaTnm;
		this.case1sForWorkingTnmStageId = case1sForWorkingTnmStageId;
		this.case1sForFinalTnmStageId = case1sForFinalTnmStageId;
		this.personalMedicalHistoriesForPrCaWorkingTnm = personalMedicalHistoriesForPrCaWorkingTnm;
	}

	// Property accessors

	public Integer getStageId() {
		return this.stageId;
	}

	public void setStageId(Integer stageId) {
		this.stageId = stageId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Set getCancerStagesForEpisodeTnmStage() {
		return this.cancerStagesForEpisodeTnmStage;
	}

	public void setCancerStagesForEpisodeTnmStage(Set cancerStagesForEpisodeTnmStage) {
		this.cancerStagesForEpisodeTnmStage = cancerStagesForEpisodeTnmStage;
	}

	public Set getCancerStagesForWorkingTnmStage() {
		return this.cancerStagesForWorkingTnmStage;
	}

	public void setCancerStagesForWorkingTnmStage(Set cancerStagesForWorkingTnmStage) {
		this.cancerStagesForWorkingTnmStage = cancerStagesForWorkingTnmStage;
	}

	public Set getPersonalMedicalHistoriesForPrCaTnm() {
		return this.personalMedicalHistoriesForPrCaTnm;
	}

	public void setPersonalMedicalHistoriesForPrCaTnm(Set personalMedicalHistoriesForPrCaTnm) {
		this.personalMedicalHistoriesForPrCaTnm = personalMedicalHistoriesForPrCaTnm;
	}

	public Set getCase1sForWorkingTnmStageId() {
		return this.case1sForWorkingTnmStageId;
	}

	public void setCase1sForWorkingTnmStageId(Set case1sForWorkingTnmStageId) {
		this.case1sForWorkingTnmStageId = case1sForWorkingTnmStageId;
	}

	public Set getCase1sForFinalTnmStageId() {
		return this.case1sForFinalTnmStageId;
	}

	public void setCase1sForFinalTnmStageId(Set case1sForFinalTnmStageId) {
		this.case1sForFinalTnmStageId = case1sForFinalTnmStageId;
	}

	public Set getPersonalMedicalHistoriesForPrCaWorkingTnm() {
		return this.personalMedicalHistoriesForPrCaWorkingTnm;
	}

	public void setPersonalMedicalHistoriesForPrCaWorkingTnm(Set personalMedicalHistoriesForPrCaWorkingTnm) {
		this.personalMedicalHistoriesForPrCaWorkingTnm = personalMedicalHistoriesForPrCaWorkingTnm;
	}

}