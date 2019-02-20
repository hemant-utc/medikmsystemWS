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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "reproductive_history")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ReproductiveHistory.findAll", query = "SELECT r FROM ReproductiveHistory r") })
public class ReproductiveHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ReproductiveHistoryPK reproductiveHistoryPK;
	@Column(name = "Age_Menarche")
	private Short ageMenarche;
	@Column(name = "Age_Menopause")
	private Short ageMenopause;
	@Column(name = "Last_Menstrual_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastMenstrualDt;
	@Column(name = "No_Pregnancies")
	private Short noPregnancies;
	@Column(name = "No_Deliveries")
	private Short noDeliveries;
	@Column(name = "Age_First_Live_Birth")
	private Short ageFirstLiveBirth;
	@Column(name = "Breast_Feeding_For_6_Months")
	private Short breastFeedingFor6Months;
	@Column(name = "Age_First_Birth")
	private Integer ageFirstBirth;
	@Column(name = "Progesterone_Therapy")
	private Short progesteroneTherapy;
	@Lob
	@Column(name = "Progesterone_Therapy_Comm")
	private String progesteroneTherapyComm;
	@Column(name = "Oral_Contracceptives")
	private Short oralContracceptives;
	@Lob
	@Column(name = "Oral_Contracceptives_Comm")
	private String oralContracceptivesComm;
	@Column(name = "Fertility_Drugs")
	private Short fertilityDrugs;
	@Lob
	@Column(name = "Fertility_Drugs_Comm")
	private String fertilityDrugsComm;
	@Column(name = "birth_control_pills_used")
	private Boolean birthControlPillsUsed;
	@JoinColumn(name = "Patient_Id", referencedColumnName = "Patient_Id", insertable = false, updatable = false)
	@OneToOne(optional = false)
	private Patient patient;

	public ReproductiveHistory() {
	}

	public ReproductiveHistory(ReproductiveHistoryPK reproductiveHistoryPK) {
		this.reproductiveHistoryPK = reproductiveHistoryPK;
	}

	public ReproductiveHistory(int patientId, Date rHDt) {
		this.reproductiveHistoryPK = new ReproductiveHistoryPK(patientId, rHDt);
	}

	public ReproductiveHistoryPK getReproductiveHistoryPK() {
		return reproductiveHistoryPK;
	}

	public void setReproductiveHistoryPK(ReproductiveHistoryPK reproductiveHistoryPK) {
		this.reproductiveHistoryPK = reproductiveHistoryPK;
	}

	public Short getAgeMenarche() {
		return ageMenarche;
	}

	public void setAgeMenarche(Short ageMenarche) {
		this.ageMenarche = ageMenarche;
	}

	public Short getAgeMenopause() {
		return ageMenopause;
	}

	public void setAgeMenopause(Short ageMenopause) {
		this.ageMenopause = ageMenopause;
	}

	public Date getLastMenstrualDt() {
		return lastMenstrualDt;
	}

	public void setLastMenstrualDt(Date lastMenstrualDt) {
		this.lastMenstrualDt = lastMenstrualDt;
	}

	public Short getNoPregnancies() {
		return noPregnancies;
	}

	public void setNoPregnancies(Short noPregnancies) {
		this.noPregnancies = noPregnancies;
	}

	public Short getNoDeliveries() {
		return noDeliveries;
	}

	public void setNoDeliveries(Short noDeliveries) {
		this.noDeliveries = noDeliveries;
	}

	public Short getAgeFirstLiveBirth() {
		return ageFirstLiveBirth;
	}

	public void setAgeFirstLiveBirth(Short ageFirstLiveBirth) {
		this.ageFirstLiveBirth = ageFirstLiveBirth;
	}

	public Short getBreastFeedingFor6Months() {
		return breastFeedingFor6Months;
	}

	public void setBreastFeedingFor6Months(Short breastFeedingFor6Months) {
		this.breastFeedingFor6Months = breastFeedingFor6Months;
	}

	public Integer getAgeFirstBirth() {
		return ageFirstBirth;
	}

	public void setAgeFirstBirth(Integer ageFirstBirth) {
		this.ageFirstBirth = ageFirstBirth;
	}

	public Short getProgesteroneTherapy() {
		return progesteroneTherapy;
	}

	public void setProgesteroneTherapy(Short progesteroneTherapy) {
		this.progesteroneTherapy = progesteroneTherapy;
	}

	public String getProgesteroneTherapyComm() {
		return progesteroneTherapyComm;
	}

	public void setProgesteroneTherapyComm(String progesteroneTherapyComm) {
		this.progesteroneTherapyComm = progesteroneTherapyComm;
	}

	public Short getOralContracceptives() {
		return oralContracceptives;
	}

	public void setOralContracceptives(Short oralContracceptives) {
		this.oralContracceptives = oralContracceptives;
	}

	public String getOralContracceptivesComm() {
		return oralContracceptivesComm;
	}

	public void setOralContracceptivesComm(String oralContracceptivesComm) {
		this.oralContracceptivesComm = oralContracceptivesComm;
	}

	public Short getFertilityDrugs() {
		return fertilityDrugs;
	}

	public void setFertilityDrugs(Short fertilityDrugs) {
		this.fertilityDrugs = fertilityDrugs;
	}

	public String getFertilityDrugsComm() {
		return fertilityDrugsComm;
	}

	public void setFertilityDrugsComm(String fertilityDrugsComm) {
		this.fertilityDrugsComm = fertilityDrugsComm;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * @return the birthControlPillsUsed
	 */
	public Boolean getBirthControlPillsUsed() {
		return birthControlPillsUsed;
	}

	/**
	 * @param birthControlPillsUsed
	 *            the birthControlPillsUsed to set
	 */
	public void setBirthControlPillsUsed(Boolean birthControlPillsUsed) {
		this.birthControlPillsUsed = birthControlPillsUsed;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (reproductiveHistoryPK != null ? reproductiveHistoryPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ReproductiveHistory)) {
			return false;
		}
		ReproductiveHistory other = (ReproductiveHistory) object;
		if ((this.reproductiveHistoryPK == null && other.reproductiveHistoryPK != null)
				|| (this.reproductiveHistoryPK != null
						&& !this.reproductiveHistoryPK.equals(other.reproductiveHistoryPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ReproductiveHistory[ reproductiveHistoryPK=" + reproductiveHistoryPK + " ]";
	}

}
