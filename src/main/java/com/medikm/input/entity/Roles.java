/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "roles")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Roles.findAll", query = "SELECT r FROM Roles r") })
public class Roles implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "roleId")
	private Long roleId;
	@Column(name = "roleCode")
	private String roleCode;
	@Column(name = "comment")
	private String comment;

	public Roles() {
	}

	public Roles(Long roleId) {
		this.roleId = roleId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (roleId != null ? roleId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Roles)) {
			return false;
		}
		Roles other = (Roles) object;
		if ((this.roleId == null && other.roleId != null)
				|| (this.roleId != null && !this.roleId.equals(other.roleId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Roles[ roleId=" + roleId + " ]";
	}

}
