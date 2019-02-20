/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "preop")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Preop.findAll", query = "SELECT p FROM Preop p") })
public class Preop implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "Weight_Loss_Three_Mon")
	private Integer weightLossThreeMon;
	@Column(name = "Hematuria")
	private String hematuria;
	@Column(name = "Mass")
	private String mass;
	@Column(name = "Pain")
	private String pain;
	@Column(name = "Anorexia")
	private String anorexia;
	@Column(name = "Fevers")
	private String fevers;
	@Column(name = "Chills")
	private String chills;
	@Column(name = "Night_Sweats")
	private String nightSweats;
	@Column(name = "Malaise")
	private String malaise;
	@Column(name = "Bone_Pain")
	private String bonePain;
	@Column(name = "Neurologic_Symptoms")
	private String neurologicSymptoms;
	@Column(name = "ECOG_Status")
	private String eCOGStatus;
	@Column(name = "Preop_CrCL")
	private String preopCrCL;
	@Column(name = "Per_Renalscan_FN_Left")
	private String perRenalscanFNLeft;
	@Column(name = "Per_Renalscan_FN-Right")
	private String perRenalscanFNRight;
	@Column(name = "Steroids_In_24hr")
	private String steroidsIn24hr;
	@Column(name = "ConHeartFail")
	private String conHeartFail;
	@Column(name = "CorArtDis")
	private String corArtDis;
	@Column(name = "PerVasDis")
	private String perVasDis;
	@Column(name = "PriCardSurg")
	private String priCardSurg;
	@Column(name = "PreOpChemo")
	private String preOpChemo;
	@Column(name = "PreOpChemoWhen")
	private String preOpChemoWhen;
	@Column(name = "PreOpXRT")
	private String preOpXRT;
	@Column(name = "PreOpXRTWhen")
	private String preOpXRTWhen;
	@Column(name = "CerebroHx")
	private String cerebroHx;
	@Column(name = "InterstitalFib")
	private String interstitalFib;
	@Column(name = "PulFunTestPerf")
	private String pulFunTestPerf;
	@Column(name = "PFTNotPerReas")
	private String pFTNotPerReas;
	@Column(name = "FEVTest_Per")
	private String fEVTestPer;
	@Column(name = "FEV_Value")
	private String fEVValue;
	@Column(name = "DLCOTesPer")
	private String dLCOTesPer;
	@Column(name = "DLCO_Value")
	private String dLCOValue;
	@Column(name = "Zubrod_Score")
	private String zubrodScore;
	@Column(name = "Lung_Cancer")
	private String lungCancer;
	@Id
	@Basic(optional = false)
	@Column(name = "ID")
	private Integer id;

	public Preop() {
	}

	public Preop(Integer id) {
		this.id = id;
	}

	public Integer getWeightLossThreeMon() {
		return weightLossThreeMon;
	}

	public void setWeightLossThreeMon(Integer weightLossThreeMon) {
		this.weightLossThreeMon = weightLossThreeMon;
	}

	public String getHematuria() {
		return hematuria;
	}

	public void setHematuria(String hematuria) {
		this.hematuria = hematuria;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getPain() {
		return pain;
	}

	public void setPain(String pain) {
		this.pain = pain;
	}

	public String getAnorexia() {
		return anorexia;
	}

	public void setAnorexia(String anorexia) {
		this.anorexia = anorexia;
	}

	public String getFevers() {
		return fevers;
	}

	public void setFevers(String fevers) {
		this.fevers = fevers;
	}

	public String getChills() {
		return chills;
	}

	public void setChills(String chills) {
		this.chills = chills;
	}

	public String getNightSweats() {
		return nightSweats;
	}

	public void setNightSweats(String nightSweats) {
		this.nightSweats = nightSweats;
	}

	public String getMalaise() {
		return malaise;
	}

	public void setMalaise(String malaise) {
		this.malaise = malaise;
	}

	public String getBonePain() {
		return bonePain;
	}

	public void setBonePain(String bonePain) {
		this.bonePain = bonePain;
	}

	public String getNeurologicSymptoms() {
		return neurologicSymptoms;
	}

	public void setNeurologicSymptoms(String neurologicSymptoms) {
		this.neurologicSymptoms = neurologicSymptoms;
	}

	public String getECOGStatus() {
		return eCOGStatus;
	}

	public void setECOGStatus(String eCOGStatus) {
		this.eCOGStatus = eCOGStatus;
	}

	public String getPreopCrCL() {
		return preopCrCL;
	}

	public void setPreopCrCL(String preopCrCL) {
		this.preopCrCL = preopCrCL;
	}

	public String getPerRenalscanFNLeft() {
		return perRenalscanFNLeft;
	}

	public void setPerRenalscanFNLeft(String perRenalscanFNLeft) {
		this.perRenalscanFNLeft = perRenalscanFNLeft;
	}

	public String getPerRenalscanFNRight() {
		return perRenalscanFNRight;
	}

	public void setPerRenalscanFNRight(String perRenalscanFNRight) {
		this.perRenalscanFNRight = perRenalscanFNRight;
	}

	public String getSteroidsIn24hr() {
		return steroidsIn24hr;
	}

	public void setSteroidsIn24hr(String steroidsIn24hr) {
		this.steroidsIn24hr = steroidsIn24hr;
	}

	public String getConHeartFail() {
		return conHeartFail;
	}

	public void setConHeartFail(String conHeartFail) {
		this.conHeartFail = conHeartFail;
	}

	public String getCorArtDis() {
		return corArtDis;
	}

	public void setCorArtDis(String corArtDis) {
		this.corArtDis = corArtDis;
	}

	public String getPerVasDis() {
		return perVasDis;
	}

	public void setPerVasDis(String perVasDis) {
		this.perVasDis = perVasDis;
	}

	public String getPriCardSurg() {
		return priCardSurg;
	}

	public void setPriCardSurg(String priCardSurg) {
		this.priCardSurg = priCardSurg;
	}

	public String getPreOpChemo() {
		return preOpChemo;
	}

	public void setPreOpChemo(String preOpChemo) {
		this.preOpChemo = preOpChemo;
	}

	public String getPreOpChemoWhen() {
		return preOpChemoWhen;
	}

	public void setPreOpChemoWhen(String preOpChemoWhen) {
		this.preOpChemoWhen = preOpChemoWhen;
	}

	public String getPreOpXRT() {
		return preOpXRT;
	}

	public void setPreOpXRT(String preOpXRT) {
		this.preOpXRT = preOpXRT;
	}

	public String getPreOpXRTWhen() {
		return preOpXRTWhen;
	}

	public void setPreOpXRTWhen(String preOpXRTWhen) {
		this.preOpXRTWhen = preOpXRTWhen;
	}

	public String getCerebroHx() {
		return cerebroHx;
	}

	public void setCerebroHx(String cerebroHx) {
		this.cerebroHx = cerebroHx;
	}

	public String getInterstitalFib() {
		return interstitalFib;
	}

	public void setInterstitalFib(String interstitalFib) {
		this.interstitalFib = interstitalFib;
	}

	public String getPulFunTestPerf() {
		return pulFunTestPerf;
	}

	public void setPulFunTestPerf(String pulFunTestPerf) {
		this.pulFunTestPerf = pulFunTestPerf;
	}

	public String getPFTNotPerReas() {
		return pFTNotPerReas;
	}

	public void setPFTNotPerReas(String pFTNotPerReas) {
		this.pFTNotPerReas = pFTNotPerReas;
	}

	public String getFEVTestPer() {
		return fEVTestPer;
	}

	public void setFEVTestPer(String fEVTestPer) {
		this.fEVTestPer = fEVTestPer;
	}

	public String getFEVValue() {
		return fEVValue;
	}

	public void setFEVValue(String fEVValue) {
		this.fEVValue = fEVValue;
	}

	public String getDLCOTesPer() {
		return dLCOTesPer;
	}

	public void setDLCOTesPer(String dLCOTesPer) {
		this.dLCOTesPer = dLCOTesPer;
	}

	public String getDLCOValue() {
		return dLCOValue;
	}

	public void setDLCOValue(String dLCOValue) {
		this.dLCOValue = dLCOValue;
	}

	public String getZubrodScore() {
		return zubrodScore;
	}

	public void setZubrodScore(String zubrodScore) {
		this.zubrodScore = zubrodScore;
	}

	public String getLungCancer() {
		return lungCancer;
	}

	public void setLungCancer(String lungCancer) {
		this.lungCancer = lungCancer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Preop)) {
			return false;
		}
		Preop other = (Preop) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Preop[ id=" + id + " ]";
	}

}
