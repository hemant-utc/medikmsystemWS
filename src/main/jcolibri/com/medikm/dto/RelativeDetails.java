package com.medikm.dto;

/**
 * RelativeDetails entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class RelativeDetails implements java.io.Serializable {

	// Fields

	private RelativeDetailsId id;
	private CancerType cancerType;
	private Gemonics gemonics;
	private CancerSubType cancerSubType;
	private Genetics genetics;
	private Relationship relationship;
	private Integer ageAtDiagnosis;
	private Integer ageAtDeath;

	// Constructors

	/** default constructor */
	public RelativeDetails() {
	}

	/** minimal constructor */
	public RelativeDetails(RelativeDetailsId id) {
		this.id = id;
	}

	/** full constructor */
	public RelativeDetails(RelativeDetailsId id, CancerType cancerType, Gemonics gemonics, CancerSubType cancerSubType,
			Genetics genetics, Relationship relationship, Integer ageAtDiagnosis, Integer ageAtDeath) {
		this.id = id;
		this.cancerType = cancerType;
		this.gemonics = gemonics;
		this.cancerSubType = cancerSubType;
		this.genetics = genetics;
		this.relationship = relationship;
		this.ageAtDiagnosis = ageAtDiagnosis;
		this.ageAtDeath = ageAtDeath;
	}

	// Property accessors

	public RelativeDetailsId getId() {
		return this.id;
	}

	public void setId(RelativeDetailsId id) {
		this.id = id;
	}

	public CancerType getCancerType() {
		return this.cancerType;
	}

	public void setCancerType(CancerType cancerType) {
		this.cancerType = cancerType;
	}

	public Gemonics getGemonics() {
		return this.gemonics;
	}

	public void setGemonics(Gemonics gemonics) {
		this.gemonics = gemonics;
	}

	public CancerSubType getCancerSubType() {
		return this.cancerSubType;
	}

	public void setCancerSubType(CancerSubType cancerSubType) {
		this.cancerSubType = cancerSubType;
	}

	public Genetics getGenetics() {
		return this.genetics;
	}

	public void setGenetics(Genetics genetics) {
		this.genetics = genetics;
	}

	public Relationship getRelationship() {
		return this.relationship;
	}

	public void setRelationship(Relationship relationship) {
		this.relationship = relationship;
	}

	public Integer getAgeAtDiagnosis() {
		return this.ageAtDiagnosis;
	}

	public void setAgeAtDiagnosis(Integer ageAtDiagnosis) {
		this.ageAtDiagnosis = ageAtDiagnosis;
	}

	public Integer getAgeAtDeath() {
		return this.ageAtDeath;
	}

	public void setAgeAtDeath(Integer ageAtDeath) {
		this.ageAtDeath = ageAtDeath;
	}

}