package com.technology.po;

/**
 * Cooperationfund entity. @author MyEclipse Persistence Tools
 */

public class Cooperationfund implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer projectid;
	private String name;
	private Integer kind;
	private Float prefund;
	private Float grand;
	private Float precity;
	private Float realcity;
	private Float input;
	private String reson;
	private String usenote;

	// Constructors

	/** default constructor */
	public Cooperationfund() {
	}

	/** full constructor */
	public Cooperationfund(Integer projectid, String name, Integer kind,
			Float prefund, Float grand, Float precity, Float realcity,
			Float input, String reson, String usenote) {
		this.projectid = projectid;
		this.name = name;
		this.kind = kind;
		this.prefund = prefund;
		this.grand = grand;
		this.precity = precity;
		this.realcity = realcity;
		this.input = input;
		this.reson = reson;
		this.usenote = usenote;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProjectid() {
		return this.projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getKind() {
		return this.kind;
	}

	public void setKind(Integer kind) {
		this.kind = kind;
	}

	public Float getPrefund() {
		return this.prefund;
	}

	public void setPrefund(Float prefund) {
		this.prefund = prefund;
	}

	public Float getGrand() {
		return this.grand;
	}

	public void setGrand(Float grand) {
		this.grand = grand;
	}

	public Float getPrecity() {
		return this.precity;
	}

	public void setPrecity(Float precity) {
		this.precity = precity;
	}

	public Float getRealcity() {
		return this.realcity;
	}

	public void setRealcity(Float realcity) {
		this.realcity = realcity;
	}

	public Float getInput() {
		return this.input;
	}

	public void setInput(Float input) {
		this.input = input;
	}

	public String getReson() {
		return this.reson;
	}

	public void setReson(String reson) {
		this.reson = reson;
	}

	public String getUsenote() {
		return this.usenote;
	}

	public void setUsenote(String usenote) {
		this.usenote = usenote;
	}

}