package com.medikm.dto;

/**
 * Guideline entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class Guideline implements java.io.Serializable {

	// Fields

	private GuidelineId id;
	private String guidelineName;
	private String flowchart;
	private String details;
	private String guidelineFileName;

	// Constructors

	/** default constructor */
	public Guideline() {
	}

	/** minimal constructor */
	public Guideline(GuidelineId id) {
		this.id = id;
	}

	/** full constructor */
	public Guideline(GuidelineId id, String guidelineName, String flowchart, String details, String guidelineFileName) {
		this.id = id;
		this.guidelineName = guidelineName;
		this.flowchart = flowchart;
		this.details = details;
		this.guidelineFileName = guidelineFileName;
	}

	// Property accessors

	public GuidelineId getId() {
		return this.id;
	}

	public void setId(GuidelineId id) {
		this.id = id;
	}

	public String getGuidelineName() {
		return this.guidelineName;
	}

	public void setGuidelineName(String guidelineName) {
		this.guidelineName = guidelineName;
	}

	public String getFlowchart() {
		return this.flowchart;
	}

	public void setFlowchart(String flowchart) {
		this.flowchart = flowchart;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getGuidelineFileName() {
		return this.guidelineFileName;
	}

	public void setGuidelineFileName(String guidelineFileName) {
		this.guidelineFileName = guidelineFileName;
	}

}