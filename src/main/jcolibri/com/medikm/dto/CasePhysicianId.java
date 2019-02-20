package com.medikm.dto;

/**
 * CasePhysicianId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class CasePhysicianId implements java.io.Serializable {

	// Fields

	private Case1 case1;
	private Physician physician;

	// Constructors

	/** default constructor */
	public CasePhysicianId() {
	}

	/** full constructor */
	public CasePhysicianId(Case1 case1, Physician physician) {
		this.case1 = case1;
		this.physician = physician;
	}

	// Property accessors

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CasePhysicianId))
			return false;
		CasePhysicianId castOther = (CasePhysicianId) other;

		return ((this.getCase1() == castOther.getCase1()) || (this.getCase1() != null && castOther.getCase1() != null
				&& this.getCase1().equals(castOther.getCase1())))
				&& ((this.getPhysician() == castOther.getPhysician()) || (this.getPhysician() != null
						&& castOther.getPhysician() != null && this.getPhysician().equals(castOther.getPhysician())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCase1() == null ? 0 : this.getCase1().hashCode());
		result = 37 * result + (getPhysician() == null ? 0 : this.getPhysician().hashCode());
		return result;
	}

}