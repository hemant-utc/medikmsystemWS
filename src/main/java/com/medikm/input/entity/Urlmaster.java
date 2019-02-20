/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

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
@Table(name = "urlmaster")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Urlmaster.findAll", query = "SELECT u FROM Urlmaster u") })
public class Urlmaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "urlId")
	private Long urlId;
	@Column(name = "pageURL")
	private String pageURL;
	@Column(name = "pageName")
	private String pageName;

	public Urlmaster() {
	}

	public Urlmaster(Long urlId) {
		this.urlId = urlId;
	}

	public Long getUrlId() {
		return urlId;
	}

	public void setUrlId(Long urlId) {
		this.urlId = urlId;
	}

	public String getPageURL() {
		return pageURL;
	}

	public void setPageURL(String pageURL) {
		this.pageURL = pageURL;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (urlId != null ? urlId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Urlmaster)) {
			return false;
		}
		Urlmaster other = (Urlmaster) object;
		if ((this.urlId == null && other.urlId != null) || (this.urlId != null && !this.urlId.equals(other.urlId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Urlmaster[ urlId=" + urlId + " ]";
	}

}
