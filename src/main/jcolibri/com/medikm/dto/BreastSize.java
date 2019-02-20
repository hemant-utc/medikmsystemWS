package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * BreastSize entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class BreastSize implements java.io.Serializable {

	// Fields

	private Integer id;
	private String bsize;
	private Set physicalExams = new HashSet(0);

	// Constructors

	/** default constructor */
	public BreastSize() {
	}

	/** minimal constructor */
	public BreastSize(Integer id, String bsize) {
		this.id = id;
		this.bsize = bsize;
	}

	/** full constructor */
	public BreastSize(Integer id, String bsize, Set physicalExams) {
		this.id = id;
		this.bsize = bsize;
		this.physicalExams = physicalExams;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBsize() {
		return this.bsize;
	}

	public void setBsize(String bsize) {
		this.bsize = bsize;
	}

	public Set getPhysicalExams() {
		return this.physicalExams;
	}

	public void setPhysicalExams(Set physicalExams) {
		this.physicalExams = physicalExams;
	}

}