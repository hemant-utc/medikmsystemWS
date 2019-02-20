/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "customer")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c") })
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Customer_Id")
	private Integer customerId;
	@Column(name = "Cust_Name")
	private String custName;
	@Column(name = "Cust_Status")
	private Integer custStatus;
	@Column(name = "Accepted_Aggrement")
	private Integer acceptedAggrement;
	@Column(name = "Cust_Address1")
	private String custAddress1;
	@Column(name = "Cust_Address2")
	private String custAddress2;
	@Column(name = "Cust_Zip")
	private Integer custZip;
	@Column(name = "Creation_Time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationTime;
	@Column(name = "Modification_Time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificationTime;
	@Column(name = "Number_Nodes_Licenses")
	private Integer numberNodesLicenses;
	@Column(name = "Sharing_Case_Data")
	private Short sharingCaseData;
	@Column(name = "Cust_Phone_No")
	private String custPhoneNo;
	@Column(name = "Cust_Email")
	private String custEmail;
	@OneToMany(mappedBy = "customerId")
	private Collection<User> userCollection;

	public Customer() {
	}

	public Customer(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Integer getCustStatus() {
		return custStatus;
	}

	public void setCustStatus(Integer custStatus) {
		this.custStatus = custStatus;
	}

	public Integer getAcceptedAggrement() {
		return acceptedAggrement;
	}

	public void setAcceptedAggrement(Integer acceptedAggrement) {
		this.acceptedAggrement = acceptedAggrement;
	}

	public String getCustAddress1() {
		return custAddress1;
	}

	public void setCustAddress1(String custAddress1) {
		this.custAddress1 = custAddress1;
	}

	public String getCustAddress2() {
		return custAddress2;
	}

	public void setCustAddress2(String custAddress2) {
		this.custAddress2 = custAddress2;
	}

	public Integer getCustZip() {
		return custZip;
	}

	public void setCustZip(Integer custZip) {
		this.custZip = custZip;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getModificationTime() {
		return modificationTime;
	}

	public void setModificationTime(Date modificationTime) {
		this.modificationTime = modificationTime;
	}

	public Integer getNumberNodesLicenses() {
		return numberNodesLicenses;
	}

	public void setNumberNodesLicenses(Integer numberNodesLicenses) {
		this.numberNodesLicenses = numberNodesLicenses;
	}

	public Short getSharingCaseData() {
		return sharingCaseData;
	}

	public void setSharingCaseData(Short sharingCaseData) {
		this.sharingCaseData = sharingCaseData;
	}

	public String getCustPhoneNo() {
		return custPhoneNo;
	}

	public void setCustPhoneNo(String custPhoneNo) {
		this.custPhoneNo = custPhoneNo;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	@XmlTransient
	public Collection<User> getUserCollection() {
		return userCollection;
	}

	public void setUserCollection(Collection<User> userCollection) {
		this.userCollection = userCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (customerId != null ? customerId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) object;
		if ((this.customerId == null && other.customerId != null)
				|| (this.customerId != null && !this.customerId.equals(other.customerId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Customer[ customerId=" + customerId + " ]";
	}

}
