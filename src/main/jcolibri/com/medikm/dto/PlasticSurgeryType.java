package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * PlasticSurgeryType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class PlasticSurgeryType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String psname;
	private Set surgeries = new HashSet(0);

	// Constructors

	/** default constructor */
	public PlasticSurgeryType() {
	}

	/** minimal constructor */
	public PlasticSurgeryType(Integer typeId, String psname) {
		this.typeId = typeId;
		this.psname = psname;
	}

	/** full constructor */
	public PlasticSurgeryType(Integer typeId, String psname, Set surgeries) {
		this.typeId = typeId;
		this.psname = psname;
		this.surgeries = surgeries;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getPsname() {
		return this.psname;
	}

	public void setPsname(String psname) {
		this.psname = psname;
	}

	public Set getSurgeries() {
		return this.surgeries;
	}

	public void setSurgeries(Set surgeries) {
		this.surgeries = surgeries;
	}

}