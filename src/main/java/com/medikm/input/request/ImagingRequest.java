package com.medikm.input.request;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.medikm.input.util.CustomJsonDateDeserializer;

/**
 * 
 * @author Saikat
 *
 */
public class ImagingRequest {

	private Integer imagingType;
	private Date imagingDate;
	private Integer encounterId;

	/**
	 * @return the imagingType
	 */
	public Integer getImagingType() {
		return imagingType;
	}

	/**
	 * @param imagingType
	 *            the imagingType to set
	 */
	public void setImagingType(Integer imagingType) {
		this.imagingType = imagingType;
	}

	/**
	 * @return the imagingDate
	 */
	public Date getImagingDate() {
		return imagingDate;
	}

	/**
	 * @param imagingDate
	 *            the imagingDate to set
	 */
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setImagingDate(Date imagingDate) {
		this.imagingDate = imagingDate;
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
