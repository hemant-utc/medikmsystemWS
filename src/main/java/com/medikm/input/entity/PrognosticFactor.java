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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "prognostic_factor")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "PrognosticFactor.findAll", query = "SELECT p FROM PrognosticFactor p") })
public class PrognosticFactor implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected PrognosticFactorPK prognosticFactorPK;
	@Column(name = "Prog_Fact_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date progFactDt;
	@Column(name = "Risk_Joint_Symtoms")
	private Short riskJointSymtoms;
	@Lob
	@Column(name = "Risk_Joint_Symtoms_Comm")
	private String riskJointSymtomsComm;
	@Lob
	@Column(name = "Senti_Lymph_N_M_Nomo")
	private String sentiLymphNMNomo;
	@Lob
	@Column(name = "Additional_Nodal_Metstasis")
	private String additionalNodalMetstasis;
	@Lob
	@Column(name = "Nottingham_Nomogram")
	private String nottinghamNomogram;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne(optional = false)
	private Case1 caseId;
	@JoinColumn(name = "Prog_Fact_Id", referencedColumnName = "Type_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private ProgFactType progFactType;

	public PrognosticFactor() {
	}

	public PrognosticFactor(PrognosticFactorPK prognosticFactorPK) {
		this.prognosticFactorPK = prognosticFactorPK;
	}

	public PrognosticFactor(int episodeId, int progFactId) {
		this.prognosticFactorPK = new PrognosticFactorPK(episodeId, progFactId);
	}

	public PrognosticFactorPK getPrognosticFactorPK() {
		return prognosticFactorPK;
	}

	public void setPrognosticFactorPK(PrognosticFactorPK prognosticFactorPK) {
		this.prognosticFactorPK = prognosticFactorPK;
	}

	public Date getProgFactDt() {
		return progFactDt;
	}

	public void setProgFactDt(Date progFactDt) {
		this.progFactDt = progFactDt;
	}

	public Short getRiskJointSymtoms() {
		return riskJointSymtoms;
	}

	public void setRiskJointSymtoms(Short riskJointSymtoms) {
		this.riskJointSymtoms = riskJointSymtoms;
	}

	public String getRiskJointSymtomsComm() {
		return riskJointSymtomsComm;
	}

	public void setRiskJointSymtomsComm(String riskJointSymtomsComm) {
		this.riskJointSymtomsComm = riskJointSymtomsComm;
	}

	public String getSentiLymphNMNomo() {
		return sentiLymphNMNomo;
	}

	public void setSentiLymphNMNomo(String sentiLymphNMNomo) {
		this.sentiLymphNMNomo = sentiLymphNMNomo;
	}

	public String getAdditionalNodalMetstasis() {
		return additionalNodalMetstasis;
	}

	public void setAdditionalNodalMetstasis(String additionalNodalMetstasis) {
		this.additionalNodalMetstasis = additionalNodalMetstasis;
	}

	public String getNottinghamNomogram() {
		return nottinghamNomogram;
	}

	public void setNottinghamNomogram(String nottinghamNomogram) {
		this.nottinghamNomogram = nottinghamNomogram;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	public ProgFactType getProgFactType() {
		return progFactType;
	}

	public void setProgFactType(ProgFactType progFactType) {
		this.progFactType = progFactType;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (prognosticFactorPK != null ? prognosticFactorPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrognosticFactor)) {
			return false;
		}
		PrognosticFactor other = (PrognosticFactor) object;
		if ((this.prognosticFactorPK == null && other.prognosticFactorPK != null)
				|| (this.prognosticFactorPK != null && !this.prognosticFactorPK.equals(other.prognosticFactorPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.PrognosticFactor[ prognosticFactorPK=" + prognosticFactorPK + " ]";
	}

}
