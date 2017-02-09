package com.technology.po;

/**
 * Supportfund entity. @author MyEclipse Persistence Tools
 */

public class Supportfund implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer projectid;
	private String name;
	private Integer kind;
	private Float prefund;
	private Float fund1;
	private Float fund2;
	private Float fund3;
	private Float fund4;
	private Float grand;
	private Float precity;
	private Float realcity;
	private Float input;
	private String reson;
	private String usenote;

	// Constructors

	/** default constructor */
	public Supportfund() {
	}

	/** full constructor */
	public Supportfund(Integer projectid, String name, Integer kind,
			Float prefund, Float fund1, Float fund2, Float fund3, Float fund4,
			Float grand, Float precity, Float realcity, Float input,
			String reson, String usenote) {
		this.projectid = projectid;
		this.name = name;
		this.kind = kind;
		this.prefund = prefund;
		this.fund1 = fund1;
		this.fund2 = fund2;
		this.fund3 = fund3;
		this.fund4 = fund4;
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

	public Float getFund1() {
		return this.fund1;
	}

	public void setFund1(Float fund1) {
		this.fund1 = fund1;
	}

	public Float getFund2() {
		return this.fund2;
	}

	public void setFund2(Float fund2) {
		this.fund2 = fund2;
	}

	public Float getFund3() {
		return this.fund3;
	}

	public void setFund3(Float fund3) {
		this.fund3 = fund3;
	}

	public Float getFund4() {
		return this.fund4;
	}

	public void setFund4(Float fund4) {
		this.fund4 = fund4;
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