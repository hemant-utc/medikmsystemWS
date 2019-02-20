package com.medikm.input.request;

import javax.xml.bind.annotation.XmlRootElement;

import com.medikm.input.entity.DiseaseType;
import com.medikm.input.entity.DxWkType;

/**
 * 
 * @author Monika
 *
 */
@XmlRootElement(name = "imagingStatusRequest")
public class WorkupkindTypeRequest {

	private Integer typeId;
	private String name;
	private DxWkType dxWkType;
	private DiseaseType diseaseType;

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DxWkType getDxWkType() {
		return dxWkType;
	}

	public void setDxWkType(DxWkType dxWkType) {
		this.dxWkType = dxWkType;
	}

	public DiseaseType getDiseaseType() {
		return diseaseType;
	}

	public void setDiseaseType(DiseaseType diseaseType) {
		this.diseaseType = diseaseType;
	}

}
