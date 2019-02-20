package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * WorkupKindType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class WorkupKindType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private DxWkType dxWkType;
	private DiseaseType diseaseType;
	private String name;
	private Set diagnosticWorkups = new HashSet(0);

	// Constructors

	/** default constructor */
	public WorkupKindType() {
	}

	/** minimal constructor */
	public WorkupKindType(DxWkType dxWkType, String name) {
		this.dxWkType = dxWkType;
		this.name = name;
	}

	/** full constructor */
	public WorkupKindType(DxWkType dxWkType, DiseaseType diseaseType, String name, Set diagnosticWorkups) {
		this.dxWkType = dxWkType;
		this.diseaseType = diseaseType;
		this.name = name;
		this.diagnosticWorkups = diagnosticWorkups;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public DxWkType getDxWkType() {
		return this.dxWkType;
	}

	public void setDxWkType(DxWkType dxWkType) {
		this.dxWkType = dxWkType;
	}

	public DiseaseType getDiseaseType() {
		return this.diseaseType;
	}

	public void setDiseaseType(DiseaseType diseaseType) {
		this.diseaseType = diseaseType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getDiagnosticWorkups() {
		return this.diagnosticWorkups;
	}

	public void setDiagnosticWorkups(Set diagnosticWorkups) {
		this.diagnosticWorkups = diagnosticWorkups;
	}

}