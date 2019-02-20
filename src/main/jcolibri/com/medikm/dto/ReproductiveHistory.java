package com.medikm.dto;

import java.sql.Timestamp;

/**
 * ReproductiveHistory entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class ReproductiveHistory implements java.io.Serializable {

	// Fields

	private ReproductiveHistoryId id;
	private Short ageMenarche;
	private Short ageMenopause;
	private Timestamp lastMenstrualDt;
	private Short noPregnancies;
	private Short noDeliveries;
	private Short ageFirstLiveBirth;
	private Short breastFeedingFor6Months;
	private Integer ageFirstBirth;
	private Short progesteroneTherapy;
	private String progesteroneTherapyComm;
	private Short oralContracceptives;
	private String oralContracceptivesComm;
	private Short fertilityDrugs;
	private String fertilityDrugsComm;
	private Short birthControlPillsUsed;

	// Constructors

	/** default constructor */
	public ReproductiveHistory() {
	}

	/** minimal constructor */
	public ReproductiveHistory(ReproductiveHistoryId id) {
		this.id = id;
	}

	/** full constructor */
	public ReproductiveHistory(ReproductiveHistoryId id, Short ageMenarche, Short ageMenopause,
			Timestamp lastMenstrualDt, Short noPregnancies, Short noDeliveries, Short ageFirstLiveBirth,
			Short breastFeedingFor6Months, Integer ageFirstBirth, Short progesteroneTherapy,
			String progesteroneTherapyComm, Short oralContracceptives, String oralContracceptivesComm,
			Short fertilityDrugs, String fertilityDrugsComm, Short birthControlPillsUsed) {
		this.id = id;
		this.ageMenarche = ageMenarche;
		this.ageMenopause = ageMenopause;
		this.lastMenstrualDt = lastMenstrualDt;
		this.noPregnancies = noPregnancies;
		this.noDeliveries = noDeliveries;
		this.ageFirstLiveBirth = ageFirstLiveBirth;
		this.breastFeedingFor6Months = breastFeedingFor6Months;
		this.ageFirstBirth = ageFirstBirth;
		this.progesteroneTherapy = progesteroneTherapy;
		this.progesteroneTherapyComm = progesteroneTherapyComm;
		this.oralContracceptives = oralContracceptives;
		this.oralContracceptivesComm = oralContracceptivesComm;
		this.fertilityDrugs = fertilityDrugs;
		this.fertilityDrugsComm = fertilityDrugsComm;
		this.birthControlPillsUsed = birthControlPillsUsed;
	}

	// Property accessors

	public ReproductiveHistoryId getId() {
		return this.id;
	}

	public void setId(ReproductiveHistoryId id) {
		this.id = id;
	}

	public Short getAgeMenarche() {
		return this.ageMenarche;
	}

	public void setAgeMenarche(Short ageMenarche) {
		this.ageMenarche = ageMenarche;
	}

	public Short getAgeMenopause() {
		return this.ageMenopause;
	}

	public void setAgeMenopause(Short ageMenopause) {
		this.ageMenopause = ageMenopause;
	}

	public Timestamp getLastMenstrualDt() {
		return this.lastMenstrualDt;
	}

	public void setLastMenstrualDt(Timestamp lastMenstrualDt) {
		this.lastMenstrualDt = lastMenstrualDt;
	}

	public Short getNoPregnancies() {
		return this.noPregnancies;
	}

	public void setNoPregnancies(Short noPregnancies) {
		this.noPregnancies = noPregnancies;
	}

	public Short getNoDeliveries() {
		return this.noDeliveries;
	}

	public void setNoDeliveries(Short noDeliveries) {
		this.noDeliveries = noDeliveries;
	}

	public Short getAgeFirstLiveBirth() {
		return this.ageFirstLiveBirth;
	}

	public void setAgeFirstLiveBirth(Short ageFirstLiveBirth) {
		this.ageFirstLiveBirth = ageFirstLiveBirth;
	}

	public Short getBreastFeedingFor6Months() {
		return this.breastFeedingFor6Months;
	}

	public void setBreastFeedingFor6Months(Short breastFeedingFor6Months) {
		this.breastFeedingFor6Months = breastFeedingFor6Months;
	}

	public Integer getAgeFirstBirth() {
		return this.ageFirstBirth;
	}

	public void setAgeFirstBirth(Integer ageFirstBirth) {
		this.ageFirstBirth = ageFirstBirth;
	}

	public Short getProgesteroneTherapy() {
		return this.progesteroneTherapy;
	}

	public void setProgesteroneTherapy(Short progesteroneTherapy) {
		this.progesteroneTherapy = progesteroneTherapy;
	}

	public String getProgesteroneTherapyComm() {
		return this.progesteroneTherapyComm;
	}

	public void setProgesteroneTherapyComm(String progesteroneTherapyComm) {
		this.progesteroneTherapyComm = progesteroneTherapyComm;
	}

	public Short getOralContracceptives() {
		return this.oralContracceptives;
	}

	public void setOralContracceptives(Short oralContracceptives) {
		this.oralContracceptives = oralContracceptives;
	}

	public String getOralContracceptivesComm() {
		return this.oralContracceptivesComm;
	}

	public void setOralContracceptivesComm(String oralContracceptivesComm) {
		this.oralContracceptivesComm = oralContracceptivesComm;
	}

	public Short getFertilityDrugs() {
		return this.fertilityDrugs;
	}

	public void setFertilityDrugs(Short fertilityDrugs) {
		this.fertilityDrugs = fertilityDrugs;
	}

	public String getFertilityDrugsComm() {
		return this.fertilityDrugsComm;
	}

	public void setFertilityDrugsComm(String fertilityDrugsComm) {
		this.fertilityDrugsComm = fertilityDrugsComm;
	}

	public Short getBirthControlPillsUsed() {
		return this.birthControlPillsUsed;
	}

	public void setBirthControlPillsUsed(Short birthControlPillsUsed) {
		this.birthControlPillsUsed = birthControlPillsUsed;
	}

}