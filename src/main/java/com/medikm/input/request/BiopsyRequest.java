/**
 * 
 */
package com.medikm.input.request;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.medikm.input.util.CustomJsonDateDeserializer;

/**
 * @author Saikat
 *
 */
public class BiopsyRequest {

	private Integer biopsyType;
	private Date biopsyDate;
	private Integer encounterId;

	/**
	 * @return the biopsyType
	 */
	public Integer getBiopsyType() {
		return biopsyType;
	}

	/**
	 * @param biopsyType
	 *            the biopsyType to set
	 */
	public void setBiopsyType(Integer biopsyType) {
		this.biopsyType = biopsyType;
	}

	/**
	 * @return the biopsyDate
	 */
	public Date getBiopsyDate() {
		return biopsyDate;
	}

	/**
	 * @param biopsyDate
	 *            the biopsyDate to set
	 */
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setBiopsyDate(Date biopsyDate) {
		this.biopsyDate = biopsyDate;
	}

	/**
	 * @return the encounterId
	 */
	public Integer getEncounterId() {
		return encounterId;
	}

	/**
	 * @param encounterId
	 *            the encounterId to set
	 */
	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

}
