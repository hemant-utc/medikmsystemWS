/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "patient_excel_data")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "PatientExcelData.findAll", query = "SELECT p FROM PatientExcelData p") })
public class PatientExcelData implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected PatientExcelDataPK patientExcelDataPK;
	@Column(name = "bd")
	private String bd;
	@Column(name = "mrn")
	private String mrn;
	@Column(name = "lname")
	private String lname;
	@Column(name = "fname")
	private String fname;
	@Column(name = "race")
	private String race;
	@Column(name = "addr1")
	private String addr1;
	@Column(name = "addr2")
	private String addr2;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zip")
	private String zip;
	@Column(name = "phone")
	private String phone;
	@Column(name = "pcp")
	private String pcp;
	@Column(name = "emergency_contact")
	private String emergencyContact;
	@Column(name = "relationship")
	private String relationship;
	@Column(name = "contact_phone")
	private String contactPhone;

	public PatientExcelData() {
	}

	public PatientExcelData(PatientExcelDataPK patientExcelDataPK) {
		this.patientExcelDataPK = patientExcelDataPK;
	}

	public PatientExcelData(String patientName, String dob) {
		this.patientExcelDataPK = new PatientExcelDataPK(patientName, dob);
	}

	public PatientExcelDataPK getPatientExcelDataPK() {
		return patientExcelDataPK;
	}

	public void setPatientExcelDataPK(PatientExcelDataPK patientExcelDataPK) {
		this.patientExcelDataPK = patientExcelDataPK;
	}

	public String getBd() {
		return bd;
	}

	public void setBd(String bd) {
		this.bd = bd;
	}

	public String getMrn() {
		return mrn;
	}

	public void setMrn(String mrn) {
		this.mrn = mrn;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPcp() {
		return pcp;
	}

	public void setPcp(String pcp) {
		this.pcp = pcp;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (patientExcelDataPK != null ? patientExcelDataPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PatientExcelData)) {
			return false;
		}
		PatientExcelData other = (PatientExcelData) object;
		if ((this.patientExcelDataPK == null && other.patientExcelDataPK != null)
				|| (this.patientExcelDataPK != null && !this.patientExcelDataPK.equals(other.patientExcelDataPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.PatientExcelData[ patientExcelDataPK=" + patientExcelDataPK + " ]";
	}

}
