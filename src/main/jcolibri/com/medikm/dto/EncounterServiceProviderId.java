package com.medikm.dto;

/**
 * EncounterServiceProviderId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class EncounterServiceProviderId implements java.io.Serializable {

	// Fields

	private Encounter encounter;
	private ServiceProvider serviceProvider;

	// Constructors

	/** default constructor */
	public EncounterServiceProviderId() {
	}

	/** full constructor */
	public EncounterServiceProviderId(Encounter encounter, ServiceProvider serviceProvider) {
		this.encounter = encounter;
		this.serviceProvider = serviceProvider;
	}

	// Property accessors

	public Encounter getEncounter() {
		return this.encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public ServiceProvider getServiceProvider() {
		return this.serviceProvider;
	}

	public void setServiceProvider(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EncounterServiceProviderId))
			return false;
		EncounterServiceProviderId castOther = (EncounterServiceProviderId) other;

		return ((this.getEncounter() == castOther.getEncounter()) || (this.getEncounter() != null
				&& castOther.getEncounter() != null && this.getEncounter().equals(castOther.getEncounter())))
				&& ((this.getServiceProvider() == castOther.getServiceProvider())
						|| (this.getServiceProvider() != null && castOther.getServiceProvider() != null
								&& this.getServiceProvider().equals(castOther.getServiceProvider())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEncounter() == null ? 0 : this.getEncounter().hashCode());
		result = 37 * result + (getServiceProvider() == null ? 0 : this.getServiceProvider().hashCode());
		return result;
	}

}