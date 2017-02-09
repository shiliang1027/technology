package com.technology.po;

/**
 * Unitbenefit entity. @author MyEclipse Persistence Tools
 */

public class Unitbenefit implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer unitid;
	private Float fixasset;
	private Float floatfund;
	private Float output;
	private Float sales;
	private Float outtax;
	private Float tax;
	private Float research;
	private Float profit;
	private Float ratio;
	private Float last1income;
	private Float last2income;
	private Float last3income;
	private Float last1gain;
	private Float last2gain;
	private Float last3gain;
	private Float last1tax;
	private Float last2tax;
	private Float last3tax;
	private Float last1earn;
	private Float last2earn;
	private Float last3earn;
	private Float last1invest;
	private Float last2invest;
	private Float last3invest;

	// Constructors

	/** default constructor */
	public Unitbenefit() {
	}

	/** minimal constructor */
	public Unitbenefit(Integer unitid) {
		this.unitid = unitid;
	}

	/** full constructor */
	public Unitbenefit(Integer unitid, Float fixasset, Float floatfund,
			Float output, Float sales, Float outtax, Float tax, Float research,
			Float profit, Float ratio, Float last1income, Float last2income,
			Float last3income, Float last1gain, Float last2gain,
			Float last3gain, Float last1tax, Float last2tax, Float last3tax,
			Float last1earn, Float last2earn, Float last3earn,
			Float last1invest, Float last2invest, Float last3invest) {
		this.unitid = unitid;
		this.fixasset = fixasset;
		this.floatfund = floatfund;
		this.output = output;
		this.sales = sales;
		this.outtax = outtax;
		this.tax = tax;
		this.research = research;
		this.profit = profit;
		this.ratio = ratio;
		this.last1income = last1income;
		this.last2income = last2income;
		this.last3income = last3income;
		this.last1gain = last1gain;
		this.last2gain = last2gain;
		this.last3gain = last3gain;
		this.last1tax = last1tax;
		this.last2tax = last2tax;
		this.last3tax = last3tax;
		this.last1earn = last1earn;
		this.last2earn = last2earn;
		this.last3earn = last3earn;
		this.last1invest = last1invest;
		this.last2invest = last2invest;
		this.last3invest = last3invest;
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

	public Float getFixasset() {
		return this.fixasset;
	}

	public void setFixasset(Float fixasset) {
		this.fixasset = fixasset;
	}

	public Float getFloatfund() {
		return this.floatfund;
	}

	public void setFloatfund(Float floatfund) {
		this.floatfund = floatfund;
	}

	public Float getOutput() {
		return this.output;
	}

	public void setOutput(Float output) {
		this.output = output;
	}

	public Float getSales() {
		return this.sales;
	}

	public void setSales(Float sales) {
		this.sales = sales;
	}

	public Float getOuttax() {
		return this.outtax;
	}

	public void setOuttax(Float outtax) {
		this.outtax = outtax;
	}

	public Float getTax() {
		return this.tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

	public Float getResearch() {
		return this.research;
	}

	public void setResearch(Float research) {
		this.research = research;
	}

	public Float getProfit() {
		return this.profit;
	}

	public void setProfit(Float profit) {
		this.profit = profit;
	}

	public Float getRatio() {
		return this.ratio;
	}

	public void setRatio(Float ratio) {
		this.ratio = ratio;
	}

	public Float getLast1income() {
		return this.last1income;
	}

	public void setLast1income(Float last1income) {
		this.last1income = last1income;
	}

	public Float getLast2income() {
		return this.last2income;
	}

	public void setLast2income(Float last2income) {
		this.last2income = last2income;
	}

	public Float getLast3income() {
		return this.last3income;
	}

	public void setLast3income(Float last3income) {
		this.last3income = last3income;
	}

	public Float getLast1gain() {
		return this.last1gain;
	}

	public void setLast1gain(Float last1gain) {
		this.last1gain = last1gain;
	}

	public Float getLast2gain() {
		return this.last2gain;
	}

	public void setLast2gain(Float last2gain) {
		this.last2gain = last2gain;
	}

	public Float getLast3gain() {
		return this.last3gain;
	}

	public void setLast3gain(Float last3gain) {
		this.last3gain = last3gain;
	}

	public Float getLast1tax() {
		return this.last1tax;
	}

	public void setLast1tax(Float last1tax) {
		this.last1tax = last1tax;
	}

	public Float getLast2tax() {
		return this.last2tax;
	}

	public void setLast2tax(Float last2tax) {
		this.last2tax = last2tax;
	}

	public Float getLast3tax() {
		return this.last3tax;
	}

	public void setLast3tax(Float last3tax) {
		this.last3tax = last3tax;
	}

	public Float getLast1earn() {
		return this.last1earn;
	}

	public void setLast1earn(Float last1earn) {
		this.last1earn = last1earn;
	}

	public Float getLast2earn() {
		return this.last2earn;
	}

	public void setLast2earn(Float last2earn) {
		this.last2earn = last2earn;
	}

	public Float getLast3earn() {
		return this.last3earn;
	}

	public void setLast3earn(Float last3earn) {
		this.last3earn = last3earn;
	}

	public Float getLast1invest() {
		return this.last1invest;
	}

	public void setLast1invest(Float last1invest) {
		this.last1invest = last1invest;
	}

	public Float getLast2invest() {
		return this.last2invest;
	}

	public void setLast2invest(Float last2invest) {
		this.last2invest = last2invest;
	}

	public Float getLast3invest() {
		return this.last3invest;
	}

	public void setLast3invest(Float last3invest) {
		this.last3invest = last3invest;
	}

}