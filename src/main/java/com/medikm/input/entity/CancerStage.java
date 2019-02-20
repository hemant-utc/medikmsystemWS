/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "cancer_stage")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "CancerStage.findAll", query = "SELECT c FROM CancerStage c") })
public class CancerStage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected CancerStagePK cancerStagePK;
	@Column(name = "Restage")
	private Short restage;
	@Lob
	@Column(name = "Restage_Comm")
	private String restageComm;
	@Column(name = "Restage_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date restageDt;
	@Column(name = "Working_Tumor")
	private String workingTumor;
	@Column(name = "Working_Node")
	private String workingNode;
	@Column(name = "Working_Metastasis")
	private String workingMetastasis;
	@Column(name = "Episode_Tumor")
	private String episodeTumor;
	@Column(name = "Episode_Node")
	private String episodeNode;
	@Column(name = "Episode_Metastasis")
	private String episodeMetastasis;
	@Column(name = "Work_Cancer_Stage")
	private String workCancerStage;
	@Column(name = "Clinical_Cancer_Stage")
	private String clinicalCancerStage;

	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne(optional = false)
	private Case1 caseId;
	@JoinColumn(name = "Episode_TNM_Stage", referencedColumnName = "Stage_Id")
	@ManyToOne
	private TnmStage episodeTNMStage;
	@JoinColumn(name = "Working_TNM_Stage", referencedColumnName = "Stage_Id")
	@ManyToOne
	private TnmStage workingTNMStage;

	public CancerStage() {
	}

	public CancerStage(CancerStagePK cancerStagePK) {
		this.cancerStagePK = cancerStagePK;
	}

	public CancerStage(int episodeId, Date stageDt) {
		this.cancerStagePK = new CancerStagePK(episodeId, stageDt);
	}

	public CancerStagePK getCancerStagePK() {
		return cancerStagePK;
	}

	public void setCancerStagePK(CancerStagePK cancerStagePK) {
		this.cancerStagePK = cancerStagePK;
	}

	public Short getRestage() {
		return restage;
	}

	public void setRestage(Short restage) {
		this.restage = restage;
	}

	public String getRestageComm() {
		return restageComm;
	}

	public void setRestageComm(String restageComm) {
		this.restageComm = restageComm;
	}

	public Date getRestageDt() {
		return restageDt;
	}

	public void setRestageDt(Date restageDt) {
		this.restageDt = restageDt;
	}

	public String getWorkingTumor() {
		return workingTumor;
	}

	public void setWorkingTumor(String workingTumor) {
		this.workingTumor = workingTumor;
	}

	public String getWorkingNode() {
		return workingNode;
	}

	public void setWorkingNode(String workingNode) {
		this.workingNode = workingNode;
	}

	public String getWorkingMetastasis() {
		return workingMetastasis;
	}

	public void setWorkingMetastasis(String workingMetastasis) {
		this.workingMetastasis = workingMetastasis;
	}

	public String getEpisodeTumor() {
		return episodeTumor;
	}

	public void setEpisodeTumor(String episodeTumor) {
		this.episodeTumor = episodeTumor;
	}

	public String getEpisodeNode() {
		return episodeNode;
	}

	public void setEpisodeNode(String episodeNode) {
		this.episodeNode = episodeNode;
	}

	public String getEpisodeMetastasis() {
		return episodeMetastasis;
	}

	public void setEpisodeMetastasis(String episodeMetastasis) {
		this.episodeMetastasis = episodeMetastasis;
	}

	public String getWorkCancerStage() {
		return workCancerStage;
	}

	public void setWorkCancerStage(String workCancerStage) {
		this.workCancerStage = workCancerStage;
	}

	public String getClinicalCancerStage() {
		return clinicalCancerStage;
	}

	public void setClinicalCancerStage(String clinicalCancerStage) {
		this.clinicalCancerStage = clinicalCancerStage;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	public TnmStage getEpisodeTNMStage() {
		return episodeTNMStage;
	}

	public void setEpisodeTNMStage(TnmStage episodeTNMStage) {
		this.episodeTNMStage = episodeTNMStage;
	}

	public TnmStage getWorkingTNMStage() {
		return workingTNMStage;
	}

	public void setWorkingTNMStage(TnmStage workingTNMStage) {
		this.workingTNMStage = workingTNMStage;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cancerStagePK != null ? cancerStagePK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CancerStage)) {
			return false;
		}
		CancerStage other = (CancerStage) object;
		if ((this.cancerStagePK == null && other.cancerStagePK != null)
				|| (this.cancerStagePK != null && !this.cancerStagePK.equals(other.cancerStagePK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.CancerStage[ cancerStagePK=" + cancerStagePK + " ]";
	}

}
