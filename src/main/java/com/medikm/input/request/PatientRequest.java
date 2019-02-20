package com.medikm.input.request;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.medikm.input.util.CustomJsonDateDeserializer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Saikat
 *
 */
@ApiModel(value = "Patient Request", description = "Patient Request")
@XmlRootElement(name = "patientRequest")
public class PatientRequest {

	private Integer patientId;
	private String firstName;
	private String mName;
	private String lastName;
	private String phoneNumber;
	private String emergencyContactName;
	private String emergencyContactPhoneNumber;
	private String zipcode;
	private Date birthDate;
	private Short increaseRisk;
	private String gender;
	private String patientConcerns;
	private String cellPhoneNumber;
	private String workPhoneNumber;
	private String address;
	private String city;
	private String country;
	private String employementType;
	private String insuranceName;
	private String mammographicBreastDensity;
	private String status;
	private Short active;
	private Integer medRecNo;
	private Integer ethnicity;
	private Integer raceId;
	private Integer functionalStatusId;
	private Integer customerId;
	private String authToken;

	/**
	 * @return the patientId
	 */
	@ApiModelProperty(value = "Patient Id", notes = "Patient Id", dataType = "Integer")
	public Integer getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId
	 *            the patientId to set
	 */
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the fName
	 */
	@ApiModelProperty(value = "First Name", notes = "First Name", dataType = "String")
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param fName
	 *            the fName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the mName
	 */
	@ApiModelProperty(value = "Middle Name", notes = "Middle Name", dataType = "String")
	public String getMName() {
		return mName;
	}

	/**
	 * @param mName
	 *            the mName to set
	 */
	public void setMName(String mName) {
		this.mName = mName;
	}

	/**
	 * @return the lName
	 */
	@ApiModelProperty(value = "Last Name", notes = "Last Name", dataType = "String")
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lName
	 *            the lName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the phoneNumber
	 */
	@ApiModelProperty(value = "Phone Number", notes = "Phone Number", dataType = "String")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the emergencyContactName
	 */
	@ApiModelProperty(value = "Emergency Contact Name", notes = "Emergency Contact Name", dataType = "String")
	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	/**
	 * @param emergencyContactName
	 *            the emergencyContactName to set
	 */
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	/**
	 * @return the emergencyContactPhoneNumber
	 */
	@ApiModelProperty(value = "Emergency Contact Phone Number", notes = "Emergency Contact Phone Number", dataType = "String")
	public String getEmergencyContactPhoneNumber() {
		return emergencyContactPhoneNumber;
	}

	/**
	 * @param emergencyContactPhoneNumber
	 *            the emergencyContactPhoneNumber to set
	 */
	public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) {
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	}

	/**
	 * @return the zipcode
	 */
	@ApiModelProperty(value = "Zip Code", notes = "Zip Code", dataType = "String")
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode
	 *            the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the birthDate
	 */
	@ApiModelProperty(value = "Birth Date", notes = "Birth Date", dataType = "Date")
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate
	 *            the birthDate to set
	 */
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the increaseRisk
	 */
	@ApiModelProperty(value = "Increase Risk", notes = "Increase Risk")
	public Short getIncreaseRisk() {
		return increaseRisk;
	}

	/**
	 * @param increaseRisk
	 *            the increaseRisk to set
	 */
	public void setIncreaseRisk(Short increaseRisk) {
		this.increaseRisk = increaseRisk;
	}

	/**
	 * @return the gender
	 */
	@ApiModelProperty(value = "Gender", notes = "Gender", dataType = "String")
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the patientConcerns
	 */
	@ApiModelProperty(value = "Patient Concerns", notes = "Patient Concerns", dataType = "String")
	public String getPatientConcerns() {
		return patientConcerns;
	}

	/**
	 * @param patientConcerns
	 *            the patientConcerns to set
	 */
	public void setPatientConcerns(String patientConcerns) {
		this.patientConcerns = patientConcerns;
	}

	/**
	 * @return the cellPhoneNumber
	 */
	@ApiModelProperty(value = "Cell Phone Number", notes = "Cell Phone Number", dataType = "String")
	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	/**
	 * @param cellPhoneNumber
	 *            the cellPhoneNumber to set
	 */
	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

	/**
	 * @return the workPhoneNumber
	 */
	@ApiModelProperty(value = "Work Phone Number", notes = "Work Phone Number", dataType = "String")
	public String getWorkPhoneNumber() {
		return workPhoneNumber;
	}

	/**
	 * @param workPhoneNumber
	 *            the workPhoneNumber to set
	 */
	public void setWorkPhoneNumber(String workPhoneNumber) {
		this.workPhoneNumber = workPhoneNumber;
	}

	/**
	 * @return the address
	 */
	@ApiModelProperty(value = "Address", notes = "Address", dataType = "String")
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	@ApiModelProperty(value = "City", notes = "City", dataType = "String")
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	@ApiModelProperty(value = "Country", notes = "Country", dataType = "String")
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

	/**
	 * @return the employementType
	 */
	@ApiModelProperty(value = "Employement Type", notes = "Employement Type", dataType = "String")
	public String getEmployementType() {
		return employementType;
	}

	/**
	 * @param employementType
	 *            the employementType to set
	 */
	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}

	/**
	 * @return the insuranceName
	 */
	@ApiModelProperty(value = "Insurance Name", notes = "Insurance Name", dataType = "String")
	public String getInsuranceName() {
		return insuranceName;
	}

	/**
	 * @param insuranceName
	 *            the insuranceName to set
	 */
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	/**
	 * @return the mammographicBreastDensity
	 */
	@ApiModelProperty(value = "Mammographic Breast Density", notes = "Mammographic Breast Density", dataType = "String")
	public String getMammographicBreastDensity() {
		return mammographicBreastDensity;
	}

	/**
	 * @param mammographicBreastDensity
	 *            the mammographicBreastDensity to set
	 */
	public void setMammographicBreastDensity(String mammographicBreastDensity) {
		this.mammographicBreastDensity = mammographicBreastDensity;
	}

	/**
	 * @return the status
	 */
	@ApiModelProperty(value = "Status", notes = "Status", dataType = "String")
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the active
	 */
	@ApiModelProperty(value = "Active", notes = "Active")
	public Short getActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(Short active) {
		this.active = active;
	}

	/**
	 * @return the medRecNo
	 */
	@ApiModelProperty(value = "Med Rec No", notes = "Med Rec No", dataType = "Integer")
	public Integer getMedRecNo() {
		return medRecNo;
	}

	/**
	 * @param medRecNo
	 *            the medRecNo to set
	 */
	public void setMedRecNo(Integer medRecNo) {
		this.medRecNo = medRecNo;
	}

	/**
	 * @return the ethnicity
	 */
	@ApiModelProperty(value = "Ethnicity", notes = "Ethnicity", dataType = "Integer")
	public Integer getEthnicity() {
		return ethnicity;
	}

	/**
	 * @param ethnicity
	 *            the ethnicity to set
	 */
	public void setEthnicity(Integer ethnicity) {
		this.ethnicity = ethnicity;
	}

	/**
	 * @return the raceId
	 */
	@ApiModelProperty(value = "Race Id", notes = "Race Id", dataType = "Integer")
	public Integer getRaceId() {
		return raceId;
	}

	/**
	 * @param raceId
	 *            the raceId to set
	 */
	public void setRaceId(Integer raceId) {
		this.raceId = raceId;
	}

	/**
	 * @return the functionalStatusId
	 */
	@ApiModelProperty(value = "Functiona Status Id", notes = "Functional Status Id", dataType = "Integer")
	public Integer getFunctionalStatusId() {
		return functionalStatusId;
	}

	/**
	 * @param functionalStatusId
	 *            the functionalStatusId to set
	 */
	public void setFunctionalStatusId(Integer functionalStatusId) {
		this.functionalStatusId = functionalStatusId;
	}

	/**
	 * @return the customenrId
	 */
	@ApiModelProperty(value = "Customer Id", notes = "Customer Id", dataType = "Integer")
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customenrId
	 *            the customenrId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the authToken
	 */
	@ApiModelProperty(value = "Auth Token", notes = "Auth Token", dataType = "String")
	public String getAuthToken() {
		return authToken;
	}

	/**
	 * @param authToken
	 *            the authToken to set
	 */
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

}
