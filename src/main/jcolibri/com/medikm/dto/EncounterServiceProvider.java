package com.medikm.dto;

/**
 * EncounterServiceProvider entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class EncounterServiceProvider implements java.io.Serializable {

	// Fields

	private EncounterServiceProviderId id;
	private String serviceProviderNote;

	// Constructors

	/** default constructor */
	public EncounterServiceProvider() {
	}

	/** minimal constructor */
	public EncounterServiceProvider(EncounterServiceProviderId id) {
		this.id = id;
	}

	/** full constructor */
	public EncounterServiceProvider(EncounterServiceProviderId id, String serviceProviderNote) {
		this.id = id;
		this.serviceProviderNote = serviceProviderNote;
	}

	// Property accessors

	public EncounterServiceProviderId getId() {
		return this.id;
	}

	public void setId(EncounterServiceProviderId id) {
		this.id = id;
	}

	public String getServiceProviderNote() {
		return this.serviceProviderNote;
	}

	public void setServiceProviderNote(String serviceProviderNote) {
		this.serviceProviderNote = serviceProviderNote;
	}

}