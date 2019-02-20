/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ROHITPATEL
 */
@Entity
@Table(name = "user_machine_info")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "UserMachineInfo.findAll", query = "SELECT u FROM UserMachineInfo u"),
		@NamedQuery(name = "UserMachineInfo.findByUserId", query = "SELECT u FROM UserMachineInfo u WHERE u.userMachineInfoPK.userId = :userId"),
		@NamedQuery(name = "UserMachineInfo.findByIpAddress", query = "SELECT u FROM UserMachineInfo u WHERE u.userMachineInfoPK.ipAddress = :ipAddress"),
		@NamedQuery(name = "UserMachineInfo.findByModificationTime", query = "SELECT u FROM UserMachineInfo u WHERE u.modificationTime = :modificationTime"),
		@NamedQuery(name = "UserMachineInfo.findByCreationTime", query = "SELECT u FROM UserMachineInfo u WHERE u.creationTime = :creationTime") })
public class UserMachineInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected UserMachineInfoPK userMachineInfoPK;
	@Column(name = "modification_time")
	private Date modificationTime;
	@Column(name = "creation_time")
	private Date creationTime;
	@JoinColumn(name = "user_id", referencedColumnName = "LoginId", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private User user;

	public UserMachineInfo() {
	}

	public UserMachineInfo(UserMachineInfoPK userMachineInfoPK) {
		this.userMachineInfoPK = userMachineInfoPK;
	}

	public UserMachineInfo(int userId, String ipAddress) {
		this.userMachineInfoPK = new UserMachineInfoPK(userId, ipAddress);
	}

	public UserMachineInfoPK getUserMachineInfoPK() {
		return userMachineInfoPK;
	}

	public void setUserMachineInfoPK(UserMachineInfoPK userMachineInfoPK) {
		this.userMachineInfoPK = userMachineInfoPK;
	}

	public Date getModificationTime() {
		return modificationTime;
	}

	public void setModificationTime(Date modificationTime) {
		this.modificationTime = modificationTime;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (userMachineInfoPK != null ? userMachineInfoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof UserMachineInfo)) {
			return false;
		}
		UserMachineInfo other = (UserMachineInfo) object;
		if ((this.userMachineInfoPK == null && other.userMachineInfoPK != null)
				|| (this.userMachineInfoPK != null && !this.userMachineInfoPK.equals(other.userMachineInfoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.UserMachineInfo[ userMachineInfoPK=" + userMachineInfoPK + " ]";
	}

}
