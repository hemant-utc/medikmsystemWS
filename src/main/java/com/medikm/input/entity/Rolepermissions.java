/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "rolepermissions")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Rolepermissions.findAll", query = "SELECT r FROM Rolepermissions r") })
public class Rolepermissions implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "rolePermissionId")
	private Long rolePermissionId;
	@Column(name = "urlId")
	private BigInteger urlId;
	@Column(name = "roleCode")
	private String roleCode;

	public Rolepermissions() {
	}

	public Rolepermissions(Long rolePermissionId) {
		this.rolePermissionId = rolePermissionId;
	}

	public Long getRolePermissionId() {
		return rolePermissionId;
	}

	public void setRolePermissionId(Long rolePermissionId) {
		this.rolePermissionId = rolePermissionId;
	}

	public BigInteger getUrlId() {
		return urlId;
	}

	public void setUrlId(BigInteger urlId) {
		this.urlId = urlId;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (rolePermissionId != null ? rolePermissionId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Rolepermissions)) {
			return false;
		}
		Rolepermissions other = (Rolepermissions) object;
		if ((this.rolePermissionId == null && other.rolePermissionId != null)
				|| (this.rolePermissionId != null && !this.rolePermissionId.equals(other.rolePermissionId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Rolepermissions[ rolePermissionId=" + rolePermissionId + " ]";
	}

}
