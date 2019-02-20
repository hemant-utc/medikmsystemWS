package com.medikm.dto;

/**
 * FamilyHistory entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class FamilyHistory implements java.io.Serializable {

	// Fields

	private FamilyHistoryId id;
	private Short noFirstDegreeRelativesWithBc;
	private Short youngestAgeDiagnosisFirstDegreeRelatives;
	private Short anyRelativeBcBefore50;
	private Short ovarianCancer;
	private Short ovarianAndBc;
	private Short maleRelativeWithBc;
	private Short bilateralBc;
	private Short geneticAbnormalities;
	private String geneticAbnormalitiesComm;
	private Short noFirstDegreeRelativesBc;
	private Short brca12;
	private String otherCancer;
	private Short thyroidDisease;
	private String familyHistoryComments;

	// Constructors

	/** default constructor */
	public FamilyHistory() {
	}

	/** minimal constructor */
	public FamilyHistory(FamilyHistoryId id) {
		this.id = id;
	}

	/** full constructor */
	public FamilyHistory(FamilyHistoryId id, Short noFirstDegreeRelativesWithBc,
			Short youngestAgeDiagnosisFirstDegreeRelatives, Short anyRelativeBcBefore50, Short ovarianCancer,
			Short ovarianAndBc, Short maleRelativeWithBc, Short bilateralBc, Short geneticAbnormalities,
			String geneticAbnormalitiesComm, Short noFirstDegreeRelativesBc, Short brca12, String otherCancer,
			Short thyroidDisease, String familyHistoryComments) {
		this.id = id;
		this.noFirstDegreeRelativesWithBc = noFirstDegreeRelativesWithBc;
		this.youngestAgeDiagnosisFirstDegreeRelatives = youngestAgeDiagnosisFirstDegreeRelatives;
		this.anyRelativeBcBefore50 = anyRelativeBcBefore50;
		this.ovarianCancer = ovarianCancer;
		this.ovarianAndBc = ovarianAndBc;
		this.maleRelativeWithBc = maleRelativeWithBc;
		this.bilateralBc = bilateralBc;
		this.geneticAbnormalities = geneticAbnormalities;
		this.geneticAbnormalitiesComm = geneticAbnormalitiesComm;
		this.noFirstDegreeRelativesBc = noFirstDegreeRelativesBc;
		this.brca12 = brca12;
		this.otherCancer = otherCancer;
		this.thyroidDisease = thyroidDisease;
		this.familyHistoryComments = familyHistoryComments;
	}

	// Property accessors

	public FamilyHistoryId getId() {
		return this.id;
	}

	public void setId(FamilyHistoryId id) {
		this.id = id;
	}

	public Short getNoFirstDegreeRelativesWithBc() {
		return this.noFirstDegreeRelativesWithBc;
	}

	public void setNoFirstDegreeRelativesWithBc(Short noFirstDegreeRelativesWithBc) {
		this.noFirstDegreeRelativesWithBc = noFirstDegreeRelativesWithBc;
	}

	public Short getYoungestAgeDiagnosisFirstDegreeRelatives() {
		return this.youngestAgeDiagnosisFirstDegreeRelatives;
	}

	public void setYoungestAgeDiagnosisFirstDegreeRelatives(Short youngestAgeDiagnosisFirstDegreeRelatives) {
		this.youngestAgeDiagnosisFirstDegreeRelatives = youngestAgeDiagnosisFirstDegreeRelatives;
	}

	public Short getAnyRelativeBcBefore50() {
		return this.anyRelativeBcBefore50;
	}

	public void setAnyRelativeBcBefore50(Short anyRelativeBcBefore50) {
		this.anyRelativeBcBefore50 = anyRelativeBcBefore50;
	}

	public Short getOvarianCancer() {
		return this.ovarianCancer;
	}

	public void setOvarianCancer(Short ovarianCancer) {
		this.ovarianCancer = ovarianCancer;
	}

	public Short getOvarianAndBc() {
		return this.ovarianAndBc;
	}

	public void setOvarianAndBc(Short ovarianAndBc) {
		this.ovarianAndBc = ovarianAndBc;
	}

	public Short getMaleRelativeWithBc() {
		return this.maleRelativeWithBc;
	}

	public void setMaleRelativeWithBc(Short maleRelativeWithBc) {
		this.maleRelativeWithBc = maleRelativeWithBc;
	}

	public Short getBilateralBc() {
		return this.bilateralBc;
	}

	public void setBilateralBc(Short bilateralBc) {
		this.bilateralBc = bilateralBc;
	}

	public Short getGeneticAbnormalities() {
		return this.geneticAbnormalities;
	}

	public void setGeneticAbnormalities(Short geneticAbnormalities) {
		this.geneticAbnormalities = geneticAbnormalities;
	}

	public String getGeneticAbnormalitiesComm() {
		return this.geneticAbnormalitiesComm;
	}

	public void setGeneticAbnormalitiesComm(String geneticAbnormalitiesComm) {
		this.geneticAbnormalitiesComm = geneticAbnormalitiesComm;
	}

	public Short getNoFirstDegreeRelativesBc() {
		return this.noFirstDegreeRelativesBc;
	}

	public void setNoFirstDegreeRelativesBc(Short noFirstDegreeRelativesBc) {
		this.noFirstDegreeRelativesBc = noFirstDegreeRelativesBc;
	}

	public Short getBrca12() {
		return this.brca12;
	}

	public void setBrca12(Short brca12) {
		this.brca12 = brca12;
	}

	public String getOtherCancer() {
		return this.otherCancer;
	}

	public void setOtherCancer(String otherCancer) {
		this.otherCancer = otherCancer;
	}

	public Short getThyroidDisease() {
		return this.thyroidDisease;
	}

	public void setThyroidDisease(Short thyroidDisease) {
		this.thyroidDisease = thyroidDisease;
	}

	public String getFamilyHistoryComments() {
		return this.familyHistoryComments;
	}

	public void setFamilyHistoryComments(String familyHistoryComments) {
		this.familyHistoryComments = familyHistoryComments;
	}

}