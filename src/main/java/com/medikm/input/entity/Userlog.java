/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "userlog")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Userlog.findAll", query = "SELECT u FROM Userlog u") })
public class Userlog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Logid")
	private Long logid;
	@Column(name = "LogIn")
	@Temporal(TemporalType.TIMESTAMP)
	private Date logIn;
	@Column(name = "LogOut")
	@Temporal(TemporalType.TIMESTAMP)
	private Date logOut;
	@JoinColumn(name = "PhysicianId", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician physicianId;
	@Column(name = "ip_address")
	private String ipAddress;

	public Userlog() {
	}

	public Userlog(Long logid) {
		this.logid = logid;
	}

	public Long getLogid() {
		return logid;
	}

	public void setLogid(Long logid) {
		this.logid = logid;
	}

	public Date getLogIn() {
		return logIn;
	}

	public void setLogIn(Date logIn) {
		this.logIn = logIn;
	}

	public Date getLogOut() {
		return logOut;
	}

	public void setLogOut(Date logOut) {
		this.logOut = logOut;
	}

	public Physician getPhysicianId() {
		return physicianId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setPhysicianId(Physician physicianId) {
		this.physicianId = physicianId;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (logid != null ? logid.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Userlog)) {
			return false;
		}
		Userlog other = (Userlog) object;
		if ((this.logid == null && other.logid != null) || (this.logid != null && !this.logid.equals(other.logid))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Userlog[ logid=" + logid + " ]";
	}

}
