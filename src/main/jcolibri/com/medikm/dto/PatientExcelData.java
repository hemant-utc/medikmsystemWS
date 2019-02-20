package com.medikm.dto;

/**
 * PatientExcelData entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class PatientExcelData implements java.io.Serializable {

	// Fields

	private PatientExcelDataId id;
	private String bd;
	private String mrn;
	private String lname;
	private String fname;
	private String race;
	private String addr1;
	private String addr2;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String pcp;
	private String emergencyContact;
	private String relationship;
	private String contactPhone;

	// Constructors

	/** default constructor */
	public PatientExcelData() {
	}

	/** minimal constructor */
	public PatientExcelData(PatientExcelDataId id) {
		this.id = id;
	}

	/** full constructor */
	public PatientExcelData(PatientExcelDataId id, String bd, String mrn, String lname, String fname, String race,
			String addr1, String addr2, String city, String state, String zip, String phone, String pcp,
			String emergencyContact, String relationship, String contactPhone) {
		this.id = id;
		this.bd = bd;
		this.mrn = mrn;
		this.lname = lname;
		this.fname = fname;
		this.race = race;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.pcp = pcp;
		this.emergencyContact = emergencyContact;
		this.relationship = relationship;
		this.contactPhone = contactPhone;
	}

	// Property accessors

	public PatientExcelDataId getId() {
		return this.id;
	}

	public void setId(PatientExcelDataId id) {
		this.id = id;
	}

	public String getBd() {
		return this.bd;
	}

	public void setBd(String bd) {
		this.bd = bd;
	}

	public String getMrn() {
		return this.mrn;
	}

	public void setMrn(String mrn) {
		this.mrn = mrn;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getRace() {
		return this.race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getAddr1() {
		return this.addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return this.addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPcp() {
		return this.pcp;
	}

	public void setPcp(String pcp) {
		this.pcp = pcp;
	}

	public String getEmergencyContact() {
		return this.emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getRelationship() {
		return this.relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

}