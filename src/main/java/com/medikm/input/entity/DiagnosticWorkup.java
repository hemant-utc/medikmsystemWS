/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "diagnostic_workup")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "DiagnosticWorkup.findAll", query = "SELECT d FROM DiagnosticWorkup d") })
public class DiagnosticWorkup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "foreign")
	@GenericGenerator(name = "foreign", strategy = "foreign", parameters = {
			@Parameter(name = "property", value = "encounter") })
	@Basic(optional = false)
	@Column(name = "Encounter_Id")
	private Integer encounterId;
	@Lob
	@Column(name = "DX_Wkup_Result")
	private String dXWkupResult;
	@Lob
	@Column(name = "DX_Wkup_Result_Desc")
	private String dXWkupResultDesc;
	@Column(name = "DX_Wkup_Result_Report_Id")
	private Integer dXWkupResultReportId;
	@JoinColumn(name = "Dx_Wkup_Type_Id", referencedColumnName = "Type_Id")
	@ManyToOne
	private WorkupKindType dxWkupTypeId;
	@PrimaryKeyJoinColumn(name = "Encounter_Id", referencedColumnName = "Encounter_Id")
	@OneToOne(optional = false)
	private Encounter encounter;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne
	private Case1 caseId;

	public DiagnosticWorkup() {
	}

	public DiagnosticWorkup(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Integer getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public String getDXWkupResult() {
		return dXWkupResult;
	}

	public void setDXWkupResult(String dXWkupResult) {
		this.dXWkupResult = dXWkupResult;
	}

	public String getDXWkupResultDesc() {
		return dXWkupResultDesc;
	}

	public void setDXWkupResultDesc(String dXWkupResultDesc) {
		this.dXWkupResultDesc = dXWkupResultDesc;
	}

	public Integer getDXWkupResultReportId() {
		return dXWkupResultReportId;
	}

	public void setDXWkupResultReportId(Integer dXWkupResultReportId) {
		this.dXWkupResultReportId = dXWkupResultReportId;
	}

	public WorkupKindType getDxWkupTypeId() {
		return dxWkupTypeId;
	}

	public void setDxWkupTypeId(WorkupKindType dxWkupTypeId) {
		this.dxWkupTypeId = dxWkupTypeId;
	}

	public Encounter getEncounter() {
		return encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (encounterId != null ? encounterId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof DiagnosticWorkup)) {
			return false;
		}
		DiagnosticWorkup other = (DiagnosticWorkup) object;
		if ((this.encounterId == null && other.encounterId != null)
				|| (this.encounterId != null && !this.encounterId.equals(other.encounterId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.DiagnosticWorkup[ encounterId=" + encounterId + " ]";
	}

}
