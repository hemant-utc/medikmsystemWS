/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ROHITPATEL
 */
@SuppressWarnings("serial")
@Embeddable
public class UserMachineInfoPK implements Serializable {
	@Basic(optional = false)
	@Column(name = "user_id")
	private int userId;
	@Basic(optional = false)
	@Column(name = "ip_address")
	private String ipAddress;

	public UserMachineInfoPK() {
	}

	public UserMachineInfoPK(int userId, String ipAddress) {
		this.userId = userId;
		this.ipAddress = ipAddress;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) userId;
		hash += (ipAddress != null ? ipAddress.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof UserMachineInfoPK)) {
			return false;
		}
		UserMachineInfoPK other = (UserMachineInfoPK) object;
		if (this.userId != other.userId) {
			return false;
		}
		if ((this.ipAddress == null && other.ipAddress != null)
				|| (this.ipAddress != null && !this.ipAddress.equals(other.ipAddress))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.UserMachineInfoPK[ userId=" + userId + ", ipAddress=" + ipAddress + " ]";
	}

}
