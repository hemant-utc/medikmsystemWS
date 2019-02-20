/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "co_morbidity")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "CoMorbidity.findAll", query = "SELECT c FROM CoMorbidity c") })
public class CoMorbidity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Basic(optional = false)
	@Column(name = "ComorbCAD")
	private int comorbCAD;
	@Basic(optional = false)
	@Column(name = "ComorbHTN")
	private char comorbHTN;
	@Column(name = "ComorbHyperlipidemia")
	private Character comorbHyperlipidemia;
	@Column(name = "ComorbPneumonia")
	private Character comorbPneumonia;
	@Column(name = "ComorbGERD")
	private Character comorbGERD;
	@Column(name = "ComorbArthritis")
	private Character comorbArthritis;
	@Column(name = "ComorbHypothyroidism")
	private Character comorbHypothyroidism;
	@Column(name = "ComorbHyperthyroidism")
	private Character comorbHyperthyroidism;
	@Column(name = "ComorbMI")
	private Character comorbMI;
	@Column(name = "ComorbCHF")
	private Character comorbCHF;
	@Column(name = "ComorbPVD")
	private Character comorbPVD;
	@Column(name = "ComorbCVD")
	private Character comorbCVD;
	@Column(name = "ComorbDementia")
	private Character comorbDementia;
	@Column(name = "ComorbCOPD")
	private Character comorbCOPD;
	@Column(name = "ComorbConnTissDz")
	private Character comorbConnTissDz;
	@Column(name = "ComorbPUD")
	private Character comorbPUD;
	@Column(name = "ComorbMidLiverDz")
	private Character comorbMidLiverDz;
	@Column(name = "ComorbDiabetes")
	private Character comorbDiabetes;
	@Column(name = "ComorbDiabOrganDmage")
	private Character comorbDiabOrganDmage;
	@Column(name = "ComorbHemiplegia")
	private Character comorbHemiplegia;
	@Column(name = "ComorbRenalDz")
	private Character comorbRenalDz;
	@Column(name = "ComorbAnyTumor")
	private Character comorbAnyTumor;
	@Column(name = "ComorbLymphoma")
	private Character comorbLymphoma;
	@Column(name = "ComorbLeukemia")
	private Character comorbLeukemia;
	@Column(name = "ComorbSevLiverDz")
	private Character comorbSevLiverDz;
	@Column(name = "ComorbMets")
	private Character comorbMets;
	@Column(name = "ComorbAIDS")
	private Character comorbAIDS;
	@Column(name = "ComorbOther")
	private Character comorbOther;
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;

	public CoMorbidity() {
	}

	public CoMorbidity(Integer id) {
		this.id = id;
	}

	public CoMorbidity(Integer id, int comorbCAD, char comorbHTN) {
		this.id = id;
		this.comorbCAD = comorbCAD;
		this.comorbHTN = comorbHTN;
	}

	public int getComorbCAD() {
		return comorbCAD;
	}

	public void setComorbCAD(int comorbCAD) {
		this.comorbCAD = comorbCAD;
	}

	public char getComorbHTN() {
		return comorbHTN;
	}

	public void setComorbHTN(char comorbHTN) {
		this.comorbHTN = comorbHTN;
	}

	public Character getComorbHyperlipidemia() {
		return comorbHyperlipidemia;
	}

	public void setComorbHyperlipidemia(Character comorbHyperlipidemia) {
		this.comorbHyperlipidemia = comorbHyperlipidemia;
	}

	public Character getComorbPneumonia() {
		return comorbPneumonia;
	}

	public void setComorbPneumonia(Character comorbPneumonia) {
		this.comorbPneumonia = comorbPneumonia;
	}

	public Character getComorbGERD() {
		return comorbGERD;
	}

	public void setComorbGERD(Character comorbGERD) {
		this.comorbGERD = comorbGERD;
	}

	public Character getComorbArthritis() {
		return comorbArthritis;
	}

	public void setComorbArthritis(Character comorbArthritis) {
		this.comorbArthritis = comorbArthritis;
	}

	public Character getComorbHypothyroidism() {
		return comorbHypothyroidism;
	}

	public void setComorbHypothyroidism(Character comorbHypothyroidism) {
		this.comorbHypothyroidism = comorbHypothyroidism;
	}

	public Character getComorbHyperthyroidism() {
		return comorbHyperthyroidism;
	}

	public void setComorbHyperthyroidism(Character comorbHyperthyroidism) {
		this.comorbHyperthyroidism = comorbHyperthyroidism;
	}

	public Character getComorbMI() {
		return comorbMI;
	}

	public void setComorbMI(Character comorbMI) {
		this.comorbMI = comorbMI;
	}

	public Character getComorbCHF() {
		return comorbCHF;
	}

	public void setComorbCHF(Character comorbCHF) {
		this.comorbCHF = comorbCHF;
	}

	public Character getComorbPVD() {
		return comorbPVD;
	}

	public void setComorbPVD(Character comorbPVD) {
		this.comorbPVD = comorbPVD;
	}

	public Character getComorbCVD() {
		return comorbCVD;
	}

	public void setComorbCVD(Character comorbCVD) {
		this.comorbCVD = comorbCVD;
	}

	public Character getComorbDementia() {
		return comorbDementia;
	}

	public void setComorbDementia(Character comorbDementia) {
		this.comorbDementia = comorbDementia;
	}

	public Character getComorbCOPD() {
		return comorbCOPD;
	}

	public void setComorbCOPD(Character comorbCOPD) {
		this.comorbCOPD = comorbCOPD;
	}

	public Character getComorbConnTissDz() {
		return comorbConnTissDz;
	}

	public void setComorbConnTissDz(Character comorbConnTissDz) {
		this.comorbConnTissDz = comorbConnTissDz;
	}

	public Character getComorbPUD() {
		return comorbPUD;
	}

	public void setComorbPUD(Character comorbPUD) {
		this.comorbPUD = comorbPUD;
	}

	public Character getComorbMidLiverDz() {
		return comorbMidLiverDz;
	}

	public void setComorbMidLiverDz(Character comorbMidLiverDz) {
		this.comorbMidLiverDz = comorbMidLiverDz;
	}

	public Character getComorbDiabetes() {
		return comorbDiabetes;
	}

	public void setComorbDiabetes(Character comorbDiabetes) {
		this.comorbDiabetes = comorbDiabetes;
	}

	public Character getComorbDiabOrganDmage() {
		return comorbDiabOrganDmage;
	}

	public void setComorbDiabOrganDmage(Character comorbDiabOrganDmage) {
		this.comorbDiabOrganDmage = comorbDiabOrganDmage;
	}

	public Character getComorbHemiplegia() {
		return comorbHemiplegia;
	}

	public void setComorbHemiplegia(Character comorbHemiplegia) {
		this.comorbHemiplegia = comorbHemiplegia;
	}

	public Character getComorbRenalDz() {
		return comorbRenalDz;
	}

	public void setComorbRenalDz(Character comorbRenalDz) {
		this.comorbRenalDz = comorbRenalDz;
	}

	public Character getComorbAnyTumor() {
		return comorbAnyTumor;
	}

	public void setComorbAnyTumor(Character comorbAnyTumor) {
		this.comorbAnyTumor = comorbAnyTumor;
	}

	public Character getComorbLymphoma() {
		return comorbLymphoma;
	}

	public void setComorbLymphoma(Character comorbLymphoma) {
		this.comorbLymphoma = comorbLymphoma;
	}

	public Character getComorbLeukemia() {
		return comorbLeukemia;
	}

	public void setComorbLeukemia(Character comorbLeukemia) {
		this.comorbLeukemia = comorbLeukemia;
	}

	public Character getComorbSevLiverDz() {
		return comorbSevLiverDz;
	}

	public void setComorbSevLiverDz(Character comorbSevLiverDz) {
		this.comorbSevLiverDz = comorbSevLiverDz;
	}

	public Character getComorbMets() {
		return comorbMets;
	}

	public void setComorbMets(Character comorbMets) {
		this.comorbMets = comorbMets;
	}

	public Character getComorbAIDS() {
		return comorbAIDS;
	}

	public void setComorbAIDS(Character comorbAIDS) {
		this.comorbAIDS = comorbAIDS;
	}

	public Character getComorbOther() {
		return comorbOther;
	}

	public void setComorbOther(Character comorbOther) {
		this.comorbOther = comorbOther;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CoMorbidity)) {
			return false;
		}
		CoMorbidity other = (CoMorbidity) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.CoMorbidity[ id=" + id + " ]";
	}

}
