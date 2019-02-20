/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "encounter_service_provider")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "EncounterServiceProvider.findAll", query = "SELECT e FROM EncounterServiceProvider e") })
public class EncounterServiceProvider implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected EncounterServiceProviderPK encounterServiceProviderPK;
	@Lob
	@Column(name = "Service_Provider_Note")
	private String serviceProviderNote;
	@JoinColumn(name = "Service_Provider_Id", referencedColumnName = "Service_provider_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private ServiceProvider serviceProvider;

	public EncounterServiceProvider() {
	}

	public EncounterServiceProvider(EncounterServiceProviderPK encounterServiceProviderPK) {
		this.encounterServiceProviderPK = encounterServiceProviderPK;
	}

	public EncounterServiceProvider(int encounterId, int serviceProviderId) {
		this.encounterServiceProviderPK = new EncounterServiceProviderPK(encounterId, serviceProviderId);
	}

	public EncounterServiceProviderPK getEncounterServiceProviderPK() {
		return encounterServiceProviderPK;
	}

	public void setEncounterServiceProviderPK(EncounterServiceProviderPK encounterServiceProviderPK) {
		this.encounterServiceProviderPK = encounterServiceProviderPK;
	}

	public String getServiceProviderNote() {
		return serviceProviderNote;
	}

	public void setServiceProviderNote(String serviceProviderNote) {
		this.serviceProviderNote = serviceProviderNote;
	}

	public ServiceProvider getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (encounterServiceProviderPK != null ? encounterServiceProviderPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EncounterServiceProvider)) {
			return false;
		}
		EncounterServiceProvider other = (EncounterServiceProvider) object;
		if ((this.encounterServiceProviderPK == null && other.encounterServiceProviderPK != null)
				|| (this.encounterServiceProviderPK != null
						&& !this.encounterServiceProviderPK.equals(other.encounterServiceProviderPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EncounterServiceProvider[ encounterServiceProviderPK="
				+ encounterServiceProviderPK + " ]";
	}

}
