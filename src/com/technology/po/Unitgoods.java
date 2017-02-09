package com.technology.po;

/**
 * Unitgoods entity. @author MyEclipse Persistence Tools
 */

public class Unitgoods implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer unitid;
	private Integer seq;
	private String name;
	private Float income;
	private Float tax;

	// Constructors

	/** default constructor */
	public Unitgoods() {
	}

	/** full constructor */
	public Unitgoods(Integer unitid, Integer seq, String name, Float income,
			Float tax) {
		this.unitid = unitid;
		this.seq = seq;
		this.name = name;
		this.income = income;
		this.tax = tax;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUnitid() {
		return this.unitid;
	}

	public void setUnitid(Integer unitid) {
		this.unitid = unitid;
	}

	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getIncome() {
		return this.income;
	}

	public void setIncome(Float income) {
		this.income = income;
	}

	public Float getTax() {
		return this.tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

}