package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Relationship entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class Relationship implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String relation;
	private Set relativeDetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Relationship() {
	}

	/** minimal constructor */
	public Relationship(Integer typeId, String relation) {
		this.typeId = typeId;
		this.relation = relation;
	}

	/** full constructor */
	public Relationship(Integer typeId, String relation, Set relativeDetailses) {
		this.typeId = typeId;
		this.relation = relation;
		this.relativeDetailses = relativeDetailses;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getRelation() {
		return this.relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Set getRelativeDetailses() {
		return this.relativeDetailses;
	}

	public void setRelativeDetailses(Set relativeDetailses) {
		this.relativeDetailses = relativeDetailses;
	}

}