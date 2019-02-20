package com.medikm.dto;

/**
 * Preop entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class Preop implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer weightLossThreeMon;
	private String hematuria;
	private String mass;
	private String pain;
	private String anorexia;
	private String fevers;
	private String chills;
	private String nightSweats;
	private String malaise;
	private String bonePain;
	private String neurologicSymptoms;
	private String ecogStatus;
	private String preopCrCl;
	private String perRenalscanFnLeft;
	private String perRenalscanFnRight;
	private String steroidsIn24hr;
	private String conHeartFail;
	private String corArtDis;
	private String perVasDis;
	private String priCardSurg;
	private String preOpChemo;
	private String preOpChemoWhen;
	private String preOpXrt;
	private String preOpXrtwhen;
	private String cerebroHx;
	private String interstitalFib;
	private String pulFunTestPerf;
	private String pftnotPerReas;
	private String fevtestPer;
	private String fevValue;
	private String dlcotesPer;
	private String dlcoValue;
	private String zubrodScore;
	private String lungCancer;

	// Constructors

	/** default constructor */
	public Preop() {
	}

	/** minimal constructor */
	public Preop(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Preop(Integer id, Integer weightLossThreeMon, String hematuria, String mass, String pain, String anorexia,
			String fevers, String chills, String nightSweats, String malaise, String bonePain,
			String neurologicSymptoms, String ecogStatus, String preopCrCl, String perRenalscanFnLeft,
			String perRenalscanFnRight, String steroidsIn24hr, String conHeartFail, String corArtDis, String perVasDis,
			String priCardSurg, String preOpChemo, String preOpChemoWhen, String preOpXrt, String preOpXrtwhen,
			String cerebroHx, String interstitalFib, String pulFunTestPerf, String pftnotPerReas, String fevtestPer,
			String fevValue, String dlcotesPer, String dlcoValue, String zubrodScore, String lungCancer) {
		this.id = id;
		this.weightLossThreeMon = weightLossThreeMon;
		this.hematuria = hematuria;
		this.mass = mass;
		this.pain = pain;
		this.anorexia = anorexia;
		this.fevers = fevers;
		this.chills = chills;
		this.nightSweats = nightSweats;
		this.malaise = malaise;
		this.bonePain = bonePain;
		this.neurologicSymptoms = neurologicSymptoms;
		this.ecogStatus = ecogStatus;
		this.preopCrCl = preopCrCl;
		this.perRenalscanFnLeft = perRenalscanFnLeft;
		this.perRenalscanFnRight = perRenalscanFnRight;
		this.steroidsIn24hr = steroidsIn24hr;
		this.conHeartFail = conHeartFail;
		this.corArtDis = corArtDis;
		this.perVasDis = perVasDis;
		this.priCardSurg = priCardSurg;
		this.preOpChemo = preOpChemo;
		this.preOpChemoWhen = preOpChemoWhen;
		this.preOpXrt = preOpXrt;
		this.preOpXrtwhen = preOpXrtwhen;
		this.cerebroHx = cerebroHx;
		this.interstitalFib = interstitalFib;
		this.pulFunTestPerf = pulFunTestPerf;
		this.pftnotPerReas = pftnotPerReas;
		this.fevtestPer = fevtestPer;
		this.fevValue = fevValue;
		this.dlcotesPer = dlcotesPer;
		this.dlcoValue = dlcoValue;
		this.zubrodScore = zubrodScore;
		this.lungCancer = lungCancer;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getWeightLossThreeMon() {
		return this.weightLossThreeMon;
	}

	public void setWeightLossThreeMon(Integer weightLossThreeMon) {
		this.weightLossThreeMon = weightLossThreeMon;
	}

	public String getHematuria() {
		return this.hematuria;
	}

	public void setHematuria(String hematuria) {
		this.hematuria = hematuria;
	}

	public String getMass() {
		return this.mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getPain() {
		return this.pain;
	}

	public void setPain(String pain) {
		this.pain = pain;
	}

	public String getAnorexia() {
		return this.anorexia;
	}

	public void setAnorexia(String anorexia) {
		this.anorexia = anorexia;
	}

	public String getFevers() {
		return this.fevers;
	}

	public void setFevers(String fevers) {
		this.fevers = fevers;
	}

	public String getChills() {
		return this.chills;
	}

	public void setChills(String chills) {
		this.chills = chills;
	}

	public String getNightSweats() {
		return this.nightSweats;
	}

	public void setNightSweats(String nightSweats) {
		this.nightSweats = nightSweats;
	}

	public String getMalaise() {
		return this.malaise;
	}

	public void setMalaise(String malaise) {
		this.malaise = malaise;
	}

	public String getBonePain() {
		return this.bonePain;
	}

	public void setBonePain(String bonePain) {
		this.bonePain = bonePain;
	}

	public String getNeurologicSymptoms() {
		return this.neurologicSymptoms;
	}

	public void setNeurologicSymptoms(String neurologicSymptoms) {
		this.neurologicSymptoms = neurologicSymptoms;
	}

	public String getEcogStatus() {
		return this.ecogStatus;
	}

	public void setEcogStatus(String ecogStatus) {
		this.ecogStatus = ecogStatus;
	}

	public String getPreopCrCl() {
		return this.preopCrCl;
	}

	public void setPreopCrCl(String preopCrCl) {
		this.preopCrCl = preopCrCl;
	}

	public String getPerRenalscanFnLeft() {
		return this.perRenalscanFnLeft;
	}

	public void setPerRenalscanFnLeft(String perRenalscanFnLeft) {
		this.perRenalscanFnLeft = perRenalscanFnLeft;
	}

	public String getPerRenalscanFnRight() {
		return this.perRenalscanFnRight;
	}

	public void setPerRenalscanFnRight(String perRenalscanFnRight) {
		this.perRenalscanFnRight = perRenalscanFnRight;
	}

	public String getSteroidsIn24hr() {
		return this.steroidsIn24hr;
	}

	public void setSteroidsIn24hr(String steroidsIn24hr) {
		this.steroidsIn24hr = steroidsIn24hr;
	}

	public String getConHeartFail() {
		return this.conHeartFail;
	}

	public void setConHeartFail(String conHeartFail) {
		this.conHeartFail = conHeartFail;
	}

	public String getCorArtDis() {
		return this.corArtDis;
	}

	public void setCorArtDis(String corArtDis) {
		this.corArtDis = corArtDis;
	}

	public String getPerVasDis() {
		return this.perVasDis;
	}

	public void setPerVasDis(String perVasDis) {
		this.perVasDis = perVasDis;
	}

	public String getPriCardSurg() {
		return this.priCardSurg;
	}

	public void setPriCardSurg(String priCardSurg) {
		this.priCardSurg = priCardSurg;
	}

	public String getPreOpChemo() {
		return this.preOpChemo;
	}

	public void setPreOpChemo(String preOpChemo) {
		this.preOpChemo = preOpChemo;
	}

	public String getPreOpChemoWhen() {
		return this.preOpChemoWhen;
	}

	public void setPreOpChemoWhen(String preOpChemoWhen) {
		this.preOpChemoWhen = preOpChemoWhen;
	}

	public String getPreOpXrt() {
		return this.preOpXrt;
	}

	public void setPreOpXrt(String preOpXrt) {
		this.preOpXrt = preOpXrt;
	}

	public String getPreOpXrtwhen() {
		return this.preOpXrtwhen;
	}

	public void setPreOpXrtwhen(String preOpXrtwhen) {
		this.preOpXrtwhen = preOpXrtwhen;
	}

	public String getCerebroHx() {
		return this.cerebroHx;
	}

	public void setCerebroHx(String cerebroHx) {
		this.cerebroHx = cerebroHx;
	}

	public String getInterstitalFib() {
		return this.interstitalFib;
	}

	public void setInterstitalFib(String interstitalFib) {
		this.interstitalFib = interstitalFib;
	}

	public String getPulFunTestPerf() {
		return this.pulFunTestPerf;
	}

	public void setPulFunTestPerf(String pulFunTestPerf) {
		this.pulFunTestPerf = pulFunTestPerf;
	}

	public String getPftnotPerReas() {
		return this.pftnotPerReas;
	}

	public void setPftnotPerReas(String pftnotPerReas) {
		this.pftnotPerReas = pftnotPerReas;
	}

	public String getFevtestPer() {
		return this.fevtestPer;
	}

	public void setFevtestPer(String fevtestPer) {
		this.fevtestPer = fevtestPer;
	}

	public String getFevValue() {
		return this.fevValue;
	}

	public void setFevValue(String fevValue) {
		this.fevValue = fevValue;
	}

	public String getDlcotesPer() {
		return this.dlcotesPer;
	}

	public void setDlcotesPer(String dlcotesPer) {
		this.dlcotesPer = dlcotesPer;
	}

	public String getDlcoValue() {
		return this.dlcoValue;
	}

	public void setDlcoValue(String dlcoValue) {
		this.dlcoValue = dlcoValue;
	}

	public String getZubrodScore() {
		return this.zubrodScore;
	}

	public void setZubrodScore(String zubrodScore) {
		this.zubrodScore = zubrodScore;
	}

	public String getLungCancer() {
		return this.lungCancer;
	}

	public void setLungCancer(String lungCancer) {
		this.lungCancer = lungCancer;
	}

}