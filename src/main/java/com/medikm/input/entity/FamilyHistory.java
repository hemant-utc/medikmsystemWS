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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "family_history")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "FamilyHistory.findAll", query = "SELECT f FROM FamilyHistory f") })
public class FamilyHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected FamilyHistoryPK familyHistoryPK;
	@Column(name = "No_First_Degree_Relatives_with_Bc")
	private Short noFirstDegreeRelativeswithBc;
	@Column(name = "Youngest_Age_Diagnosis_First_Degree_Relatives")
	private Short youngestAgeDiagnosisFirstDegreeRelatives;
	@Column(name = "Any_Relative_Bc_Before_50")
	private Short anyRelativeBcBefore50;
	@Column(name = "Ovarian_Cancer")
	private Short ovarianCancer;
	@Column(name = "Ovarian_and_Bc")
	private Short ovarianandBc;
	@Column(name = "Male_Relative_with_Bc")
	private Short maleRelativewithBc;
	@Column(name = "Bilateral_Bc")
	private Short bilateralBc;
	@Column(name = "Genetic_Abnormalities")
	private Short geneticAbnormalities;
	@Lob
	@Column(name = "Genetic_Abnormalities_Comm")
	private String geneticAbnormalitiesComm;
	@Column(name = "No_First_Degree_Relatives_BC")
	private Short noFirstDegreeRelativesBC;
	@Column(name = "BRCA_12")
	private Short brca12;
	@Column(name = "Other_Cancer")
	private String otherCancer;
	@Column(name = "Thyroid_Disease")
	private Short thyroidDisease;
	@Column(name = "family_history_comments")
	private String familyHistoryComments;
	@JoinColumn(name = "Patient_Id", referencedColumnName = "Patient_Id", insertable = false, updatable = false)
	@OneToOne(optional = false)
	private Patient patient;

	public FamilyHistory() {
	}

	public FamilyHistory(FamilyHistoryPK familyHistoryPK) {
		this.familyHistoryPK = familyHistoryPK;
	}

	public FamilyHistory(int patientId, Date fHDate) {
		this.familyHistoryPK = new FamilyHistoryPK(patientId, fHDate);
	}

	public FamilyHistoryPK getFamilyHistoryPK() {
		return familyHistoryPK;
	}

	public void setFamilyHistoryPK(FamilyHistoryPK familyHistoryPK) {
		this.familyHistoryPK = familyHistoryPK;
	}

	public Short getNoFirstDegreeRelativeswithBc() {
		return noFirstDegreeRelativeswithBc;
	}

	public void setNoFirstDegreeRelativeswithBc(Short noFirstDegreeRelativeswithBc) {
		this.noFirstDegreeRelativeswithBc = noFirstDegreeRelativeswithBc;
	}

	public Short getYoungestAgeDiagnosisFirstDegreeRelatives() {
		return youngestAgeDiagnosisFirstDegreeRelatives;
	}

	public void setYoungestAgeDiagnosisFirstDegreeRelatives(Short youngestAgeDiagnosisFirstDegreeRelatives) {
		this.youngestAgeDiagnosisFirstDegreeRelatives = youngestAgeDiagnosisFirstDegreeRelatives;
	}

	public Short getAnyRelativeBcBefore50() {
		return anyRelativeBcBefore50;
	}

	public void setAnyRelativeBcBefore50(Short anyRelativeBcBefore50) {
		this.anyRelativeBcBefore50 = anyRelativeBcBefore50;
	}

	public Short getOvarianCancer() {
		return ovarianCancer;
	}

	public void setOvarianCancer(Short ovarianCancer) {
		this.ovarianCancer = ovarianCancer;
	}

	public Short getOvarianandBc() {
		return ovarianandBc;
	}

	public void setOvarianandBc(Short ovarianandBc) {
		this.ovarianandBc = ovarianandBc;
	}

	public Short getMaleRelativewithBc() {
		return maleRelativewithBc;
	}

	public void setMaleRelativewithBc(Short maleRelativewithBc) {
		this.maleRelativewithBc = maleRelativewithBc;
	}

	public Short getBilateralBc() {
		return bilateralBc;
	}

	public void setBilateralBc(Short bilateralBc) {
		this.bilateralBc = bilateralBc;
	}

	public Short getGeneticAbnormalities() {
		return geneticAbnormalities;
	}

	public void setGeneticAbnormalities(Short geneticAbnormalities) {
		this.geneticAbnormalities = geneticAbnormalities;
	}

	public String getGeneticAbnormalitiesComm() {
		return geneticAbnormalitiesComm;
	}

	public void setGeneticAbnormalitiesComm(String geneticAbnormalitiesComm) {
		this.geneticAbnormalitiesComm = geneticAbnormalitiesComm;
	}

	public Short getNoFirstDegreeRelativesBC() {
		return noFirstDegreeRelativesBC;
	}

	public void setNoFirstDegreeRelativesBC(Short noFirstDegreeRelativesBC) {
		this.noFirstDegreeRelativesBC = noFirstDegreeRelativesBC;
	}

	public Short getBrca12() {
		return brca12;
	}

	public void setBrca12(Short brca12) {
		this.brca12 = brca12;
	}

	public String getOtherCancer() {
		return otherCancer;
	}

	public void setOtherCancer(String otherCancer) {
		this.otherCancer = otherCancer;
	}

	public Short getThyroidDisease() {
		return thyroidDisease;
	}

	public void setThyroidDisease(Short thyroidDisease) {
		this.thyroidDisease = thyroidDisease;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getFamilyHistoryComments() {
		return familyHistoryComments;
	}

	public void setFamilyHistoryComments(String familyHistoryComments) {
		this.familyHistoryComments = familyHistoryComments;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (familyHistoryPK != null ? familyHistoryPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof FamilyHistory)) {
			return false;
		}
		FamilyHistory other = (FamilyHistory) object;
		if ((this.familyHistoryPK == null && other.familyHistoryPK != null)
				|| (this.familyHistoryPK != null && !this.familyHistoryPK.equals(other.familyHistoryPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.FamilyHistory[ familyHistoryPK=" + familyHistoryPK + " ]";
	}

}
