package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Gemonics entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class Gemonics implements java.io.Serializable {

	// Fields

	private Integer id;
	private String gname;
	private Set relativeDetailses = new HashSet(0);
	private Set case1s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Gemonics() {
	}

	/** minimal constructor */
	public Gemonics(Integer id, String gname) {
		this.id = id;
		this.gname = gname;
	}

	/** full constructor */
	public Gemonics(Integer id, String gname, Set relativeDetailses, Set case1s) {
		this.id = id;
		this.gname = gname;
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

	public String getGname() {
		return this.gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
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