/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Saikat
 */
@SuppressWarnings("serial")
@Embeddable
public class EncounterServiceProviderPK implements Serializable {
	@Basic(optional = false)
	@Column(name = "Encounter_Id")
	private int encounterId;
	@Basic(optional = false)
	@Column(name = "Service_Provider_Id")
	private int serviceProviderId;

	public EncounterServiceProviderPK() {
	}

	public EncounterServiceProviderPK(int encounterId, int serviceProviderId) {
		this.encounterId = encounterId;
		this.serviceProviderId = serviceProviderId;
	}

	public int getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(int encounterId) {
		this.encounterId = encounterId;
	}

	public int getServiceProviderId() {
		return serviceProviderId;
	}

	public void setServiceProviderId(int serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) encounterId;
		hash += (int) serviceProviderId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EncounterServiceProviderPK)) {
			return false;
		}
		EncounterServiceProviderPK other = (EncounterServiceProviderPK) object;
		if (this.encounterId != other.encounterId) {
			return false;
		}
		if (this.serviceProviderId != other.serviceProviderId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EncounterServiceProviderPK[ encounterId=" + encounterId + ", serviceProviderId="
				+ serviceProviderId + " ]";
	}

}
