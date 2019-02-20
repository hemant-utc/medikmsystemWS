package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Functionalstatus entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class Functionalstatus implements java.io.Serializable {

	// Fields

	private Integer id;
	private String status;
	private Set case1s = new HashSet(0);
	private Set patients = new HashSet(0);

	// Constructors

	/** default constructor */
	public Functionalstatus() {
	}

	/** minimal constructor */
	public Functionalstatus(String status) {
		this.status = status;
	}

	/** full constructor */
	public Functionalstatus(String status, Set case1s, Set patients) {
		this.status = status;
		this.case1s = case1s;
		this.patients = patients;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getCase1s() {
		return this.case1s;
	}

	public void setCase1s(Set case1s) {
		this.case1s = case1s;
	}

	public Set getPatients() {
		return this.patients;
	}

	public void setPatients(Set patients) {
		this.patients = patients;
	}

}