package com.technology.po;

/**
 * Executefund entity. @author MyEclipse Persistence Tools
 */

public class Executefund implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer executeid;
	private Integer kind;
	private Float planfund;
	private Float selffund;
	private Float realfund;
	private Float outfund;
	private String usenote;

	// Constructors

	/** default constructor */
	public Executefund() {
	}

	/** full constructor */
	public Executefund(Integer executeid, Integer kind, Float planfund,
			Float selffund, Float realfund, Float outfund, String usenote) {
		this.executeid = executeid;
		this.kind = kind;
		this.planfund = planfund;
		this.selffund = selffund;
		this.realfund = realfund;
		this.outfund = outfund;
		this.usenote = usenote;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getExecuteid() {
		return this.executeid;
	}

	public void setExecuteid(Integer executeid) {
		this.executeid = executeid;
	}

	public Integer getKind() {
		return this.kind;
	}

	public void setKind(Integer kind) {
		this.kind = kind;
	}

	public Float getPlanfund() {
		return this.planfund;
	}

	public void setPlanfund(Float planfund) {
		this.planfund = planfund;
	}

	public Float getSelffund() {
		return this.selffund;
	}

	public void setSelffund(Float selffund) {
		this.selffund = selffund;
	}

	public Float getRealfund() {
		return this.realfund;
	}

	public void setRealfund(Float realfund) {
		this.realfund = realfund;
	}

	public Float getOutfund() {
		return this.outfund;
	}

	public void setOutfund(Float outfund) {
		this.outfund = outfund;
	}

	public String getUsenote() {
		return this.usenote;
	}

	public void setUsenote(String usenote) {
		this.usenote = usenote;
	}

}