package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Patient entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class Patient implements java.io.Serializable {

	// Fields

	private Integer patientId;
	private Functionalstatus functionalstatus;
	private Race race;
	private String fname;
	private String mname;
	private String lname;
	private String phoneNumber;
	private String emergencyContactName;
	private String emergencyContactPhoneNumber;
	private String zipcode;
	private Timestamp birthDate;
	private Short increaseRisk;
	private String gender;
	private String patientConcerns;
	private String cellPhoneNumber;
	private String workPhoneNumber;
	private String address;
	private String city;
	private String employementType;
	private String insuranceName;
	private String mammographicBreastDensity;
	private String status;
	private Short active;
	private Integer medRecNo;
	private Integer ethnicity;
	private Set relativeDetailses = new HashSet(0);
	private Set case1s = new HashSet(0);
	private Set reproductiveHistories = new HashSet(0);
	private Set personalMedicalHistories = new HashSet(0);
	private Set familyHistories = new HashSet(0);

	// Constructors

	/** default constructor */
	public Patient() {
	}

	/** full constructor */
	public Patient(Functionalstatus functionalstatus, Race race, String fname, String mname, String lname,
			String phoneNumber, String emergencyContactName, String emergencyContactPhoneNumber, String zipcode,
			Timestamp birthDate, Short increaseRisk, String gender, String patientConcerns, String cellPhoneNumber,
			String workPhoneNumber, String address, String city, String employementType, String insuranceName,
			String mammographicBreastDensity, String status, Short active, Integer medRecNo, Integer ethnicity,
			Set relativeDetailses, Set case1s, Set reproductiveHistories, Set personalMedicalHistories,
			Set familyHistories) {
		this.functionalstatus = functionalstatus;
		this.race = race;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.phoneNumber = phoneNumber;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
		this.zipcode = zipcode;
		this.birthDate = birthDate;
		this.increaseRisk = increaseRisk;
		this.gender = gender;
		this.patientConcerns = patientConcerns;
		this.cellPhoneNumber = cellPhoneNumber;
		this.workPhoneNumber = workPhoneNumber;
		this.address = address;
		this.city = city;
		this.employementType = employementType;
		this.insuranceName = insuranceName;
		this.mammographicBreastDensity = mammographicBreastDensity;
		this.status = status;
		this.active = active;
		this.medRecNo = medRecNo;
		this.ethnicity = ethnicity;
		this.relativeDetailses = relativeDetailses;
		this.case1s = case1s;
		this.reproductiveHistories = reproductiveHistories;
		this.personalMedicalHistories = personalMedicalHistories;
		this.familyHistories = familyHistories;
	}

	// Property accessors

	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Functionalstatus getFunctionalstatus() {
		return this.functionalstatus;
	}

	public void setFunctionalstatus(Functionalstatus functionalstatus) {
		this.functionalstatus = functionalstatus;
	}

	public Race getRace() {
		return this.race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return this.mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmergencyContactName() {
		return this.emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactPhoneNumber() {
		return this.emergencyContactPhoneNumber;
	}

	public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) {
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Timestamp getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public Short getIncreaseRisk() {
		return this.increaseRisk;
	}

	public void setIncreaseRisk(Short increaseRisk) {
		this.increaseRisk = increaseRisk;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPatientConcerns() {
		return this.patientConcerns;
	}

	public void setPatientConcerns(String patientConcerns) {
		this.patientConcerns = patientConcerns;
	}

	public String getCellPhoneNumber() {
		return this.cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public String getWorkPhoneNumber() {
		return this.workPhoneNumber;
	}

	public void setWorkPhoneNumber(String workPhoneNumber) {
		this.workPhoneNumber = workPhoneNumber;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmployementType() {
		return this.employementType;
	}

	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}

	public String getInsuranceName() {
		return this.insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getMammographicBreastDensity() {
		return this.mammographicBreastDensity;
	}

	public void setMammographicBreastDensity(String mammographicBreastDensity) {
		this.mammographicBreastDensity = mammographicBreastDensity;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	public Integer getMedRecNo() {
		return this.medRecNo;
	}

	public void setMedRecNo(Integer medRecNo) {
		this.medRecNo = medRecNo;
	}

	public Integer getEthnicity() {
		return this.ethnicity;
	}

	public void setEthnicity(Integer ethnicity) {
		this.ethnicity = ethnicity;
	}

	public Set getRelativeDetailses() {
		return this.relativeDetailses;
	}

	public void setRelativeDetailses(Set relativeDetailses) {
		this.relativeDetailses = relativeDetailses;
	}

	public Set getCase1s() {
		return this.case1s;
	}

	public void setCase1s(Set case1s) {
		this.case1s = case1s;
	}

	public Set getReproductiveHistories() {
		return this.reproductiveHistories;
	}

	public void setReproductiveHistories(Set reproductiveHistories) {
		this.reproductiveHistories = reproductiveHistories;
	}

	public Set getPersonalMedicalHistories() {
		return this.personalMedicalHistories;
	}

	public void setPersonalMedicalHistories(Set personalMedicalHistories) {
		this.personalMedicalHistories = personalMedicalHistories;
	}

	public Set getFamilyHistories() {
		return this.familyHistories;
	}

	public void setFamilyHistories(Set familyHistories) {
		this.familyHistories = familyHistories;
	}

}