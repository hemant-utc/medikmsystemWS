package com.medikm.input.request;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.medikm.input.util.CustomJsonDateDeserializer;

/**
 * 
 * @author Saikat
 *
 */
public class PhysicalExamRequest {

	private String physicalExamReport;
	private Date physicalExamDate;
	private Integer encounterId;

	/**
	 * @return the physicalExamReport
	 */
	public String getPhysicalExamReport() {
		return physicalExamReport;
	}

	/**
	 * @param physicalExamReport
	 *            the physicalExamReport to set
	 */
	public void setPhysicalExamReport(String physicalExamReport) {
		this.physicalExamReport = physicalExamReport;
	}

	/**
	 * @return the physicalExamDate
	 */
	public Date getPhysicalExamDate() {
		return physicalExamDate;
	}

	/**
	 * @param physicalExamDate
	 *            the physicalExamDate to set
	 */
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setPhysicalExamDate(Date physicalExamDate) {
		this.physicalExamDate = physicalExamDate;
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
