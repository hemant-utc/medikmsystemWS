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
public class SurgicalProcedureRequest {

	private Integer surgicalProcedureType;
	private Date surgicalProcedureDate;
	private Integer encounterId;

	/**
	 * @return the surgicalProcedureType
	 */
	public Integer getSurgicalProcedureType() {
		return surgicalProcedureType;
	}

	/**
	 * @param surgicalProcedureType
	 *            the surgicalProcedureType to set
	 */
	public void setSurgicalProcedureType(Integer surgicalProcedureType) {
		this.surgicalProcedureType = surgicalProcedureType;
	}

	/**
	 * @return the surgicalProcedureDate
	 */
	public Date getSurgicalProcedureDate() {
		return surgicalProcedureDate;
	}

	/**
	 * @param surgicalProcedureDate
	 *            the surgicalProcedureDate to set
	 */

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setSurgicalProcedureDate(Date surgicalProcedureDate) {
		this.surgicalProcedureDate = surgicalProcedureDate;
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
