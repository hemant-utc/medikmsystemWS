package com.medikm.dto;

/**
 * DiagnosticWorkup entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class DiagnosticWorkup implements java.io.Serializable {

	// Fields

	private Integer encounterId;
	private Case1 case1;
	private Encounter encounter;
	private WorkupKindType workupKindType;
	private String dxWkupResult;
	private String dxWkupResultDesc;
	private Integer dxWkupResultReportId;

	// Constructors

	/** default constructor */
	public DiagnosticWorkup() {
	}

	/** minimal constructor */
	public DiagnosticWorkup(Integer encounterId, Encounter encounter) {
		this.encounterId = encounterId;
		this.encounter = encounter;
	}

	/** full constructor */
	public DiagnosticWorkup(Integer encounterId, Case1 case1, Encounter encounter, WorkupKindType workupKindType,
			String dxWkupResult, String dxWkupResultDesc, Integer dxWkupResultReportId) {
		this.encounterId = encounterId;
		this.case1 = case1;
		this.encounter = encounter;
		this.workupKindType = workupKindType;
		this.dxWkupResult = dxWkupResult;
		this.dxWkupResultDesc = dxWkupResultDesc;
		this.dxWkupResultReportId = dxWkupResultReportId;
	}

	// Property accessors

	public Integer getEncounterId() {
		return this.encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public Encounter getEncounter() {
		return this.encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public WorkupKindType getWorkupKindType() {
		return this.workupKindType;
	}

	public void setWorkupKindType(WorkupKindType workupKindType) {
		this.workupKindType = workupKindType;
	}

	public String getDxWkupResult() {
		return this.dxWkupResult;
	}

	public void setDxWkupResult(String dxWkupResult) {
		this.dxWkupResult = dxWkupResult;
	}

	public String getDxWkupResultDesc() {
		return this.dxWkupResultDesc;
	}

	public void setDxWkupResultDesc(String dxWkupResultDesc) {
		this.dxWkupResultDesc = dxWkupResultDesc;
	}

	public Integer getDxWkupResultReportId() {
		return this.dxWkupResultReportId;
	}

	public void setDxWkupResultReportId(Integer dxWkupResultReportId) {
		this.dxWkupResultReportId = dxWkupResultReportId;
	}

}