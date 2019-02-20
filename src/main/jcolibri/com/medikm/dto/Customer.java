package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerId;
	private String custName;
	private Integer custStatus;
	private Integer acceptedAggrement;
	private String custAddress1;
	private String custAddress2;
	private Integer custZip;
	private Timestamp creationTime;
	private Timestamp modificationTime;
	private Integer numberNodesLicenses;
	private Short sharingCaseData;
	private String custPhoneNo;
	private String custEmail;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Integer customerId) {
		this.customerId = customerId;
	}

	/** full constructor */
	public Customer(Integer customerId, String custName, Integer custStatus, Integer acceptedAggrement,
			String custAddress1, String custAddress2, Integer custZip, Timestamp creationTime,
			Timestamp modificationTime, Integer numberNodesLicenses, Short sharingCaseData, String custPhoneNo,
			String custEmail, Set users) {
		this.customerId = customerId;
		this.custName = custName;
		this.custStatus = custStatus;
		this.acceptedAggrement = acceptedAggrement;
		this.custAddress1 = custAddress1;
		this.custAddress2 = custAddress2;
		this.custZip = custZip;
		this.creationTime = creationTime;
		this.modificationTime = modificationTime;
		this.numberNodesLicenses = numberNodesLicenses;
		this.sharingCaseData = sharingCaseData;
		this.custPhoneNo = custPhoneNo;
		this.custEmail = custEmail;
		this.users = users;
	}

	// Property accessors

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Integer getCustStatus() {
		return this.custStatus;
	}

	public void setCustStatus(Integer custStatus) {
		this.custStatus = custStatus;
	}

	public Integer getAcceptedAggrement() {
		return this.acceptedAggrement;
	}

	public void setAcceptedAggrement(Integer acceptedAggrement) {
		this.acceptedAggrement = acceptedAggrement;
	}

	public String getCustAddress1() {
		return this.custAddress1;
	}

	public void setCustAddress1(String custAddress1) {
		this.custAddress1 = custAddress1;
	}

	public String getCustAddress2() {
		return this.custAddress2;
	}

	public void setCustAddress2(String custAddress2) {
		this.custAddress2 = custAddress2;
	}

	public Integer getCustZip() {
		return this.custZip;
	}

	public void setCustZip(Integer custZip) {
		this.custZip = custZip;
	}

	public Timestamp getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

	public Timestamp getModificationTime() {
		return this.modificationTime;
	}

	public void setModificationTime(Timestamp modificationTime) {
		this.modificationTime = modificationTime;
	}

	public Integer getNumberNodesLicenses() {
		return this.numberNodesLicenses;
	}

	public void setNumberNodesLicenses(Integer numberNodesLicenses) {
		this.numberNodesLicenses = numberNodesLicenses;
	}

	public Short getSharingCaseData() {
		return this.sharingCaseData;
	}

	public void setSharingCaseData(Short sharingCaseData) {
		this.sharingCaseData = sharingCaseData;
	}

	public String getCustPhoneNo() {
		return this.custPhoneNo;
	}

	public void setCustPhoneNo(String custPhoneNo) {
		this.custPhoneNo = custPhoneNo;
	}

	public String getCustEmail() {
		return this.custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}