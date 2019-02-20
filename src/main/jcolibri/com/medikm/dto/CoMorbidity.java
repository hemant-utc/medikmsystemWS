package com.medikm.dto;

/**
 * CoMorbidity entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class CoMorbidity implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer comorbCad;
	private String comorbHtn;
	private String comorbHyperlipidemia;
	private String comorbPneumonia;
	private String comorbGerd;
	private String comorbArthritis;
	private String comorbHypothyroidism;
	private String comorbHyperthyroidism;
	private String comorbMi;
	private String comorbChf;
	private String comorbPvd;
	private String comorbCvd;
	private String comorbDementia;
	private String comorbCopd;
	private String comorbConnTissDz;
	private String comorbPud;
	private String comorbMidLiverDz;
	private String comorbDiabetes;
	private String comorbDiabOrganDmage;
	private String comorbHemiplegia;
	private String comorbRenalDz;
	private String comorbAnyTumor;
	private String comorbLymphoma;
	private String comorbLeukemia;
	private String comorbSevLiverDz;
	private String comorbMets;
	private String comorbAids;
	private String comorbOther;

	// Constructors

	/** default constructor */
	public CoMorbidity() {
	}

	/** minimal constructor */
	public CoMorbidity(Integer id, Integer comorbCad, String comorbHtn) {
		this.id = id;
		this.comorbCad = comorbCad;
		this.comorbHtn = comorbHtn;
	}

	/** full constructor */
	public CoMorbidity(Integer id, Integer comorbCad, String comorbHtn, String comorbHyperlipidemia,
			String comorbPneumonia, String comorbGerd, String comorbArthritis, String comorbHypothyroidism,
			String comorbHyperthyroidism, String comorbMi, String comorbChf, String comorbPvd, String comorbCvd,
			String comorbDementia, String comorbCopd, String comorbConnTissDz, String comorbPud,
			String comorbMidLiverDz, String comorbDiabetes, String comorbDiabOrganDmage, String comorbHemiplegia,
			String comorbRenalDz, String comorbAnyTumor, String comorbLymphoma, String comorbLeukemia,
			String comorbSevLiverDz, String comorbMets, String comorbAids, String comorbOther) {
		this.id = id;
		this.comorbCad = comorbCad;
		this.comorbHtn = comorbHtn;
		this.comorbHyperlipidemia = comorbHyperlipidemia;
		this.comorbPneumonia = comorbPneumonia;
		this.comorbGerd = comorbGerd;
		this.comorbArthritis = comorbArthritis;
		this.comorbHypothyroidism = comorbHypothyroidism;
		this.comorbHyperthyroidism = comorbHyperthyroidism;
		this.comorbMi = comorbMi;
		this.comorbChf = comorbChf;
		this.comorbPvd = comorbPvd;
		this.comorbCvd = comorbCvd;
		this.comorbDementia = comorbDementia;
		this.comorbCopd = comorbCopd;
		this.comorbConnTissDz = comorbConnTissDz;
		this.comorbPud = comorbPud;
		this.comorbMidLiverDz = comorbMidLiverDz;
		this.comorbDiabetes = comorbDiabetes;
		this.comorbDiabOrganDmage = comorbDiabOrganDmage;
		this.comorbHemiplegia = comorbHemiplegia;
		this.comorbRenalDz = comorbRenalDz;
		this.comorbAnyTumor = comorbAnyTumor;
		this.comorbLymphoma = comorbLymphoma;
		this.comorbLeukemia = comorbLeukemia;
		this.comorbSevLiverDz = comorbSevLiverDz;
		this.comorbMets = comorbMets;
		this.comorbAids = comorbAids;
		this.comorbOther = comorbOther;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getComorbCad() {
		return this.comorbCad;
	}

	public void setComorbCad(Integer comorbCad) {
		this.comorbCad = comorbCad;
	}

	public String getComorbHtn() {
		return this.comorbHtn;
	}

	public void setComorbHtn(String comorbHtn) {
		this.comorbHtn = comorbHtn;
	}

	public String getComorbHyperlipidemia() {
		return this.comorbHyperlipidemia;
	}

	public void setComorbHyperlipidemia(String comorbHyperlipidemia) {
		this.comorbHyperlipidemia = comorbHyperlipidemia;
	}

	public String getComorbPneumonia() {
		return this.comorbPneumonia;
	}

	public void setComorbPneumonia(String comorbPneumonia) {
		this.comorbPneumonia = comorbPneumonia;
	}

	public String getComorbGerd() {
		return this.comorbGerd;
	}

	public void setComorbGerd(String comorbGerd) {
		this.comorbGerd = comorbGerd;
	}

	public String getComorbArthritis() {
		return this.comorbArthritis;
	}

	public void setComorbArthritis(String comorbArthritis) {
		this.comorbArthritis = comorbArthritis;
	}

	public String getComorbHypothyroidism() {
		return this.comorbHypothyroidism;
	}

	public void setComorbHypothyroidism(String comorbHypothyroidism) {
		this.comorbHypothyroidism = comorbHypothyroidism;
	}

	public String getComorbHyperthyroidism() {
		return this.comorbHyperthyroidism;
	}

	public void setComorbHyperthyroidism(String comorbHyperthyroidism) {
		this.comorbHyperthyroidism = comorbHyperthyroidism;
	}

	public String getComorbMi() {
		return this.comorbMi;
	}

	public void setComorbMi(String comorbMi) {
		this.comorbMi = comorbMi;
	}

	public String getComorbChf() {
		return this.comorbChf;
	}

	public void setComorbChf(String comorbChf) {
		this.comorbChf = comorbChf;
	}

	public String getComorbPvd() {
		return this.comorbPvd;
	}

	public void setComorbPvd(String comorbPvd) {
		this.comorbPvd = comorbPvd;
	}

	public String getComorbCvd() {
		return this.comorbCvd;
	}

	public void setComorbCvd(String comorbCvd) {
		this.comorbCvd = comorbCvd;
	}

	public String getComorbDementia() {
		return this.comorbDementia;
	}

	public void setComorbDementia(String comorbDementia) {
		this.comorbDementia = comorbDementia;
	}

	public String getComorbCopd() {
		return this.comorbCopd;
	}

	public void setComorbCopd(String comorbCopd) {
		this.comorbCopd = comorbCopd;
	}

	public String getComorbConnTissDz() {
		return this.comorbConnTissDz;
	}

	public void setComorbConnTissDz(String comorbConnTissDz) {
		this.comorbConnTissDz = comorbConnTissDz;
	}

	public String getComorbPud() {
		return this.comorbPud;
	}

	public void setComorbPud(String comorbPud) {
		this.comorbPud = comorbPud;
	}

	public String getComorbMidLiverDz() {
		return this.comorbMidLiverDz;
	}

	public void setComorbMidLiverDz(String comorbMidLiverDz) {
		this.comorbMidLiverDz = comorbMidLiverDz;
	}

	public String getComorbDiabetes() {
		return this.comorbDiabetes;
	}

	public void setComorbDiabetes(String comorbDiabetes) {
		this.comorbDiabetes = comorbDiabetes;
	}

	public String getComorbDiabOrganDmage() {
		return this.comorbDiabOrganDmage;
	}

	public void setComorbDiabOrganDmage(String comorbDiabOrganDmage) {
		this.comorbDiabOrganDmage = comorbDiabOrganDmage;
	}

	public String getComorbHemiplegia() {
		return this.comorbHemiplegia;
	}

	public void setComorbHemiplegia(String comorbHemiplegia) {
		this.comorbHemiplegia = comorbHemiplegia;
	}

	public String getComorbRenalDz() {
		return this.comorbRenalDz;
	}

	public void setComorbRenalDz(String comorbRenalDz) {
		this.comorbRenalDz = comorbRenalDz;
	}

	public String getComorbAnyTumor() {
		return this.comorbAnyTumor;
	}

	public void setComorbAnyTumor(String comorbAnyTumor) {
		this.comorbAnyTumor = comorbAnyTumor;
	}

	public String getComorbLymphoma() {
		return this.comorbLymphoma;
	}

	public void setComorbLymphoma(String comorbLymphoma) {
		this.comorbLymphoma = comorbLymphoma;
	}

	public String getComorbLeukemia() {
		return this.comorbLeukemia;
	}

	public void setComorbLeukemia(String comorbLeukemia) {
		this.comorbLeukemia = comorbLeukemia;
	}

	public String getComorbSevLiverDz() {
		return this.comorbSevLiverDz;
	}

	public void setComorbSevLiverDz(String comorbSevLiverDz) {
		this.comorbSevLiverDz = comorbSevLiverDz;
	}

	public String getComorbMets() {
		return this.comorbMets;
	}

	public void setComorbMets(String comorbMets) {
		this.comorbMets = comorbMets;
	}

	public String getComorbAids() {
		return this.comorbAids;
	}

	public void setComorbAids(String comorbAids) {
		this.comorbAids = comorbAids;
	}

	public String getComorbOther() {
		return this.comorbOther;
	}

	public void setComorbOther(String comorbOther) {
		this.comorbOther = comorbOther;
	}

}