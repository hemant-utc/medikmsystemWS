package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Genetics entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class Genetics implements java.io.Serializable {

	// Fields

	private Integer id;
	private String gnName;
	private Set relativeDetailses = new HashSet(0);
	private Set case1s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Genetics() {
	}

	/** minimal constructor */
	public Genetics(Integer id, String gnName) {
		this.id = id;
		this.gnName = gnName;
	}

	/** full constructor */
	public Genetics(Integer id, String gnName, Set relativeDetailses, Set case1s) {
		this.id = id;
		this.gnName = gnName;
		this.relativeDetailses = relativeDetailses;
		this.case1s = case1s;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGnName() {
		return this.gnName;
	}

	public void setGnName(String gnName) {
		this.gnName = gnName;
	}

	public Set getRelativeDetailses() {
		return this.relativeDetailses;
	}

	public void setRelativeDetailses(Set relativeDetailses) {
		this.relativeDetailses = relativeDetailses;
	}

	public Set getCase1s() {
		return this.case1s;
	}

	public void setCase1s(Set case1s) {
		this.case1s = case1s;
	}

}