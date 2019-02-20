package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * PropertiesType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class PropertiesType implements java.io.Serializable {

	// Fields

	private Integer propertiesTypeId;
	private String propType;
	private Set userPropertiesInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public PropertiesType() {
	}

	/** full constructor */
	public PropertiesType(String propType, Set userPropertiesInfos) {
		this.propType = propType;
		this.userPropertiesInfos = userPropertiesInfos;
	}

	// Property accessors

	public Integer getPropertiesTypeId() {
		return this.propertiesTypeId;
	}

	public void setPropertiesTypeId(Integer propertiesTypeId) {
		this.propertiesTypeId = propertiesTypeId;
	}

	public String getPropType() {
		return this.propType;
	}

	public void setPropType(String propType) {
		this.propType = propType;
	}

	public Set getUserPropertiesInfos() {
		return this.userPropertiesInfos;
	}

	public void setUserPropertiesInfos(Set userPropertiesInfos) {
		this.userPropertiesInfos = userPropertiesInfos;
	}

}