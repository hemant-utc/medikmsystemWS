package com.medikm.dto;

import java.sql.Timestamp;

/**
 * CancerStage entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class CancerStage implements java.io.Serializable {

	// Fields

	private CancerStageId id;
	private Case1 case1;
	private TnmStage tnmStageByEpisodeTnmStage;
	private TnmStage tnmStageByWorkingTnmStage;
	private Short restage;
	private String restageComm;
	private Timestamp restageDt;
	private String workingTumor;
	private String workingNode;
	private String workingMetastasis;
	private String episodeTumor;
	private String episodeNode;
	private String episodeMetastasis;
	private String workCancerStage;
	private String clinicalCancerStage;

	// Constructors

	/** default constructor */
	public CancerStage() {
	}

	/** minimal constructor */
	public CancerStage(CancerStageId id, Case1 case1) {
		this.id = id;
		this.case1 = case1;
	}

	/** full constructor */
	public CancerStage(CancerStageId id, Case1 case1, TnmStage tnmStageByEpisodeTnmStage,
			TnmStage tnmStageByWorkingTnmStage, Short restage, String restageComm, Timestamp restageDt,
			String workingTumor, String workingNode, String workingMetastasis, String episodeTumor, String episodeNode,
			String episodeMetastasis, String workCancerStage, String clinicalCancerStage) {
		this.id = id;
		this.case1 = case1;
		this.tnmStageByEpisodeTnmStage = tnmStageByEpisodeTnmStage;
		this.tnmStageByWorkingTnmStage = tnmStageByWorkingTnmStage;
		this.restage = restage;
		this.restageComm = restageComm;
		this.restageDt = restageDt;
		this.workingTumor = workingTumor;
		this.workingNode = workingNode;
		this.workingMetastasis = workingMetastasis;
		this.episodeTumor = episodeTumor;
		this.episodeNode = episodeNode;
		this.episodeMetastasis = episodeMetastasis;
		this.workCancerStage = workCancerStage;
		this.clinicalCancerStage = clinicalCancerStage;
	}

	// Property accessors

	public CancerStageId getId() {
		return this.id;
	}

	public void setId(CancerStageId id) {
		this.id = id;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public TnmStage getTnmStageByEpisodeTnmStage() {
		return this.tnmStageByEpisodeTnmStage;
	}

	public void setTnmStageByEpisodeTnmStage(TnmStage tnmStageByEpisodeTnmStage) {
		this.tnmStageByEpisodeTnmStage = tnmStageByEpisodeTnmStage;
	}

	public TnmStage getTnmStageByWorkingTnmStage() {
		return this.tnmStageByWorkingTnmStage;
	}

	public void setTnmStageByWorkingTnmStage(TnmStage tnmStageByWorkingTnmStage) {
		this.tnmStageByWorkingTnmStage = tnmStageByWorkingTnmStage;
	}

	public Short getRestage() {
		return this.restage;
	}

	public void setRestage(Short restage) {
		this.restage = restage;
	}

	public String getRestageComm() {
		return this.restageComm;
	}

	public void setRestageComm(String restageComm) {
		this.restageComm = restageComm;
	}

	public Timestamp getRestageDt() {
		return this.restageDt;
	}

	public void setRestageDt(Timestamp restageDt) {
		this.restageDt = restageDt;
	}

	public String getWorkingTumor() {
		return this.workingTumor;
	}

	public void setWorkingTumor(String workingTumor) {
		this.workingTumor = workingTumor;
	}

	public String getWorkingNode() {
		return this.workingNode;
	}

	public void setWorkingNode(String workingNode) {
		this.workingNode = workingNode;
	}

	public String getWorkingMetastasis() {
		return this.workingMetastasis;
	}

	public void setWorkingMetastasis(String workingMetastasis) {
		this.workingMetastasis = workingMetastasis;
	}

	public String getEpisodeTumor() {
		return this.episodeTumor;
	}

	public void setEpisodeTumor(String episodeTumor) {
		this.episodeTumor = episodeTumor;
	}

	public String getEpisodeNode() {
		return this.episodeNode;
	}

	public void setEpisodeNode(String episodeNode) {
		this.episodeNode = episodeNode;
	}

	public String getEpisodeMetastasis() {
		return this.episodeMetastasis;
	}

	public void setEpisodeMetastasis(String episodeMetastasis) {
		this.episodeMetastasis = episodeMetastasis;
	}

	public String getWorkCancerStage() {
		return this.workCancerStage;
	}

	public void setWorkCancerStage(String workCancerStage) {
		this.workCancerStage = workCancerStage;
	}

	public String getClinicalCancerStage() {
		return this.clinicalCancerStage;
	}

	public void setClinicalCancerStage(String clinicalCancerStage) {
		this.clinicalCancerStage = clinicalCancerStage;
	}

}