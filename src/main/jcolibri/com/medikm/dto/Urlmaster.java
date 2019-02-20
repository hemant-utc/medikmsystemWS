package com.medikm.dto;

/**
 * Urlmaster entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class Urlmaster implements java.io.Serializable {

	// Fields

	private Long urlId;
	private String pageUrl;
	private String pageName;

	// Constructors

	/** default constructor */
	public Urlmaster() {
	}

	/** minimal constructor */
	public Urlmaster(Long urlId) {
		this.urlId = urlId;
	}

	/** full constructor */
	public Urlmaster(Long urlId, String pageUrl, String pageName) {
		this.urlId = urlId;
		this.pageUrl = pageUrl;
		this.pageName = pageName;
	}

	// Property accessors

	public Long getUrlId() {
		return this.urlId;
	}

	public void setUrlId(Long urlId) {
		this.urlId = urlId;
	}

	public String getPageUrl() {
		return this.pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public String getPageName() {
		return this.pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

}