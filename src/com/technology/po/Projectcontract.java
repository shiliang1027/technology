package com.technology.po;

import java.sql.Timestamp;

/**
 * Projectcontract entity. @author MyEclipse Persistence Tools
 */

public class Projectcontract implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer projectid;
	private String versionnum;
	private String name;
	private String year;
	private Timestamp signtime;
	private Float money;
	private Float citymoney;
	private Integer progessid;
	private String templetpath;
	private String wordpath;
	private String pdfpath;

	// Constructors

	/** default constructor */
	public Projectcontract() {
	}

	/** full constructor */
	public Projectcontract(Integer serviceid, Integer projectid,
			String versionnum, String name, String year, Timestamp signtime,
			Float money, Float citymoney, Integer progessid,
			String templetpath, String wordpath, String pdfpath) {
		this.serviceid = serviceid;
		this.projectid = projectid;
		this.versionnum = versionnum;
		this.name = name;
		this.year = year;
		this.signtime = signtime;
		this.money = money;
		this.citymoney = citymoney;
		this.progessid = progessid;
		this.templetpath = templetpath;
		this.wordpath = wordpath;
		this.pdfpath = pdfpath;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getServiceid() {
		return this.serviceid;
	}

	public void setServiceid(Integer serviceid) {
		this.serviceid = serviceid;
	}

	public Integer getProjectid() {
		return this.projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	public String getVersionnum() {
		return this.versionnum;
	}

	public void setVersionnum(String versionnum) {
		this.versionnum = versionnum;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Timestamp getSigntime() {
		return this.signtime;
	}

	public void setSigntime(Timestamp signtime) {
		this.signtime = signtime;
	}

	public Float getMoney() {
		return this.money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public Float getCitymoney() {
		return this.citymoney;
	}

	public void setCitymoney(Float citymoney) {
		this.citymoney = citymoney;
	}

	public Integer getProgessid() {
		return this.progessid;
	}

	public void setProgessid(Integer progessid) {
		this.progessid = progessid;
	}

	public String getTempletpath() {
		return this.templetpath;
	}

	public void setTempletpath(String templetpath) {
		this.templetpath = templetpath;
	}

	public String getWordpath() {
		return this.wordpath;
	}

	public void setWordpath(String wordpath) {
		this.wordpath = wordpath;
	}

	public String getPdfpath() {
		return this.pdfpath;
	}

	public void setPdfpath(String pdfpath) {
		this.pdfpath = pdfpath;
	}

}