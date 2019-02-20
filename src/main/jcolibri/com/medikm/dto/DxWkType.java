package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * DxWkType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class DxWkType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String dxName;
	private Set workupKindTypes = new HashSet(0);

	// Constructors

	/** default constructor */
	public DxWkType() {
	}

	/** minimal constructor */
	public DxWkType(Integer typeId, String dxName) {
		this.typeId = typeId;
		this.dxName = dxName;
	}

	/** full constructor */
	public DxWkType(Integer typeId, String dxName, Set workupKindTypes) {
		this.typeId = typeId;
		this.dxName = dxName;
		this.workupKindTypes = workupKindTypes;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getDxName() {
		return this.dxName;
	}

	public void setDxName(String dxName) {
		this.dxName = dxName;
	}

	public Set getWorkupKindTypes() {
		return this.workupKindTypes;
	}

	public void setWorkupKindTypes(Set workupKindTypes) {
		this.workupKindTypes = workupKindTypes;
	}

}