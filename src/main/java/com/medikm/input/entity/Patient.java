/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "patient")
@XmlRootElement
public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Patient_Id")
	private Integer patientId;
	@Column(name = "FName")
	private String fName;
	@Column(name = "MName")
	private String mName;
	@Column(name = "LName")
	private String lName;
	@Column(name = "Phone_Number")
	private String phoneNumber;
	@Column(name = "Emergency_Contact_Name")
	private String emergencyContactName;
	@Column(name = "Emergency_Contact_Phone_Number")
	private String emergencyContactPhoneNumber;
	@Column(name = "zipcode")
	private String zipcode;
	@Column(name = "Birth_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthDate;
	@Column(name = "Increase_Risk")
	private Short increaseRisk;
	@Column(name = "Gender")
	private String gender;
	@Lob
	@Column(name = "Patient_Concerns")
	private String patientConcerns;
	@Column(name = "Cell_Phone_Number")
	private String cellPhoneNumber;
	@Column(name = "Work_Phone_Number")
	private String workPhoneNumber;
	@Column(name = "Address")
	private String address;
	@Column(name = "City")
	private String city;
	@Column(name = "country")
	private String country;
	@Column(name = "Employement_Type")
	private String employementType;
	@Column(name = "Insurance_Name")
	private String insuranceName;
	@Column(name = "Mammographic_Breast_Density")
	private String mammographicBreastDensity;
	@Column(name = "Status")
	private String status;
	@Column(name = "Active")
	private Short active;
	@Column(name = "MedRecNo")
	private Integer medRecNo;
	@Column(name = "Ethnicity")
	private Integer ethnicity;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
	private Collection<Case1> case1Collection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
	private Collection<ReproductiveHistory> reproductiveHistoryCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
	private Collection<PersonalMedicalHistory> personalMedicalHistoryCollection;
	@JoinColumn(name = "Functional_Status", referencedColumnName = "Id")
	@ManyToOne
	private Functionalstatus functionalStatus;
	@JoinColumn(name = "Race", referencedColumnName = "Type_Id")
	@ManyToOne
	private Race race;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
	private Collection<RelativeDetails> relativeDetailsCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
	private Collection<FamilyHistory> familyHistoryCollection;

	public Patient() {
	}

	public Patient(Integer patientId) {
		this.patientId = patientId;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getFName() {
		return fName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public String getMName() {
		return mName;
	}

	public void setMName(String mName) {
		this.mName = mName;
	}

	public String getLName() {
		return lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactPhoneNumber() {
		return emergencyContactPhoneNumber;
	}

	public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) {
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Short getIncreaseRisk() {
		return increaseRisk;
	}

	public void setIncreaseRisk(Short increaseRisk) {
		this.increaseRisk = increaseRisk;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPatientConcerns() {
		return patientConcerns;
	}

	public void setPatientConcerns(String patientConcerns) {
		this.patientConcerns = patientConcerns;
	}

	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public String getWorkPhoneNumber() {
		return workPhoneNumber;
	}

	public void setWorkPhoneNumber(String workPhoneNumber) {
		this.workPhoneNumber = workPhoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmployementType() {
		return employementType;
	}

	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getMammographicBreastDensity() {
		return mammographicBreastDensity;
	}

	public void setMammographicBreastDensity(String mammographicBreastDensity) {
		this.mammographicBreastDensity = mammographicBreastDensity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Short getActive() {
		return active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	public Integer getMedRecNo() {
		return medRecNo;
	}

	public void setMedRecNo(Integer medRecNo) {
		this.medRecNo = medRecNo;
	}

	public Integer getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(Integer ethnicity) {
		this.ethnicity = ethnicity;
	}

	@XmlTransient
	public Collection<Case1> getCase1Collection() {
		return case1Collection;
	}

	public void setCase1Collection(Collection<Case1> case1Collection) {
		this.case1Collection = case1Collection;
	}

	public Functionalstatus getFunctionalStatus() {
		return functionalStatus;
	}

	public Collection<ReproductiveHistory> getReproductiveHistoryCollection() {
		return reproductiveHistoryCollection;
	}

	public void setReproductiveHistoryCollection(Collection<ReproductiveHistory> reproductiveHistoryCollection) {
		this.reproductiveHistoryCollection = reproductiveHistoryCollection;
	}

	public Collection<PersonalMedicalHistory> getPersonalMedicalHistoryCollection() {
		return personalMedicalHistoryCollection;
	}

	public void setPersonalMedicalHistoryCollection(
			Collection<PersonalMedicalHistory> personalMedicalHistoryCollection) {
		this.personalMedicalHistoryCollection = personalMedicalHistoryCollection;
	}

	public void setFunctionalStatus(Functionalstatus functionalStatus) {
		this.functionalStatus = functionalStatus;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	@XmlTransient
	public Collection<RelativeDetails> getRelativeDetailsCollection() {
		return relativeDetailsCollection;
	}

	public void setRelativeDetailsCollection(Collection<RelativeDetails> relativeDetailsCollection) {
		this.relativeDetailsCollection = relativeDetailsCollection;
	}

	public Collection<FamilyHistory> getFamilyHistoryCollection() {
		return familyHistoryCollection;
	}

	public void setFamilyHistoryCollection(Collection<FamilyHistory> familyHistoryCollection) {
		this.familyHistoryCollection = familyHistoryCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (patientId != null ? patientId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Patient)) {
			return false;
		}
		Patient other = (Patient) object;
		if ((this.patientId == null && other.patientId != null)
				|| (this.patientId != null && !this.patientId.equals(other.patientId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Patient[ patientId=" + patientId + " ]";
	}

}
