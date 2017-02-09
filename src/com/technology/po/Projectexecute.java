package com.technology.po;

import java.sql.Timestamp;

/**
 * Projectexecute entity. @author MyEclipse Persistence Tools
 */

public class Projectexecute implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer projectid;
	private String year;
	private String code;
	private Timestamp signtime;
	private Integer workid;
	private String error;
	private Integer progessid;
	private String templetpath;
	private String wordpath;
	private String pdfpath;
	private Float output;
	private Float gain;
	private Float tax;
	private Float erics;
	private Float coals;
	private Float waters;
	private Integer jobs;
	private Integer doctors;
	private Integer masters;
	private Integer mediums;
	private Integer highs;
	private Integer invents;
	private Integer authorizes;
	private Integer stands;
	private Integer papers;
	private Integer books;
	private Integer awards;
	private Integer copyrights;
	private Integer products;
	private Integer equips;
	private Integer techs;
	private Integer grounds;
	private Integer materials;
	private Integer types;
	private String othernote;

	// Constructors

	/** default constructor */
	public Projectexecute() {
	}

	/** full constructor */
	public Projectexecute(Integer serviceid, Integer projectid, String year,
			String code, Timestamp signtime, Integer workid, String error,
			Integer progessid, String templetpath, String wordpath,
			String pdfpath, Float output, Float gain, Float tax, Float erics,
			Float coals, Float waters, Integer jobs, Integer doctors,
			Integer masters, Integer mediums, Integer highs, Integer invents,
			Integer authorizes, Integer stands, Integer papers, Integer books,
			Integer awards, Integer copyrights, Integer products,
			Integer equips, Integer techs, Integer grounds, Integer materials,
			Integer types, String othernote) {
		this.serviceid = serviceid;
		this.projectid = projectid;
		this.year = year;
		this.code = code;
		this.signtime = signtime;
		this.workid = workid;
		this.error = error;
		this.progessid = progessid;
		this.templetpath = templetpath;
		this.wordpath = wordpath;
		this.pdfpath = pdfpath;
		this.output = output;
		this.gain = gain;
		this.tax = tax;
		this.erics = erics;
		this.coals = coals;
		this.waters = waters;
		this.jobs = jobs;
		this.doctors = doctors;
		this.masters = masters;
		this.mediums = mediums;
		this.highs = highs;
		this.invents = invents;
		this.authorizes = authorizes;
		this.stands = stands;
		this.papers = papers;
		this.books = books;
		this.awards = awards;
		this.copyrights = copyrights;
		this.products = products;
		this.equips = equips;
		this.techs = techs;
		this.grounds = grounds;
		this.materials = materials;
		this.types = types;
		this.othernote = othernote;
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

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getSigntime() {
		return this.signtime;
	}

	public void setSigntime(Timestamp signtime) {
		this.signtime = signtime;
	}

	public Integer getWorkid() {
		return this.workid;
	}

	public void setWorkid(Integer workid) {
		this.workid = workid;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
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

	public Float getOutput() {
		return this.output;
	}

	public void setOutput(Float output) {
		this.output = output;
	}

	public Float getGain() {
		return this.gain;
	}

	public void setGain(Float gain) {
		this.gain = gain;
	}

	public Float getTax() {
		return this.tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

	public Float getErics() {
		return this.erics;
	}

	public void setErics(Float erics) {
		this.erics = erics;
	}

	public Float getCoals() {
		return this.coals;
	}

	public void setCoals(Float coals) {
		this.coals = coals;
	}

	public Float getWaters() {
		return this.waters;
	}

	public void setWaters(Float waters) {
		this.waters = waters;
	}

	public Integer getJobs() {
		return this.jobs;
	}

	public void setJobs(Integer jobs) {
		this.jobs = jobs;
	}

	public Integer getDoctors() {
		return this.doctors;
	}

	public void setDoctors(Integer doctors) {
		this.doctors = doctors;
	}

	public Integer getMasters() {
		return this.masters;
	}

	public void setMasters(Integer masters) {
		this.masters = masters;
	}

	public Integer getMediums() {
		return this.mediums;
	}

	public void setMediums(Integer mediums) {
		this.mediums = mediums;
	}

	public Integer getHighs() {
		return this.highs;
	}

	public void setHighs(Integer highs) {
		this.highs = highs;
	}

	public Integer getInvents() {
		return this.invents;
	}

	public void setInvents(Integer invents) {
		this.invents = invents;
	}

	public Integer getAuthorizes() {
		return this.authorizes;
	}

	public void setAuthorizes(Integer authorizes) {
		this.authorizes = authorizes;
	}

	public Integer getStands() {
		return this.stands;
	}

	public void setStands(Integer stands) {
		this.stands = stands;
	}

	public Integer getPapers() {
		return this.papers;
	}

	public void setPapers(Integer papers) {
		this.papers = papers;
	}

	public Integer getBooks() {
		return this.books;
	}

	public void setBooks(Integer books) {
		this.books = books;
	}

	public Integer getAwards() {
		return this.awards;
	}

	public void setAwards(Integer awards) {
		this.awards = awards;
	}

	public Integer getCopyrights() {
		return this.copyrights;
	}

	public void setCopyrights(Integer copyrights) {
		this.copyrights = copyrights;
	}

	public Integer getProducts() {
		return this.products;
	}

	public void setProducts(Integer products) {
		this.products = products;
	}

	public Integer getEquips() {
		return this.equips;
	}

	public void setEquips(Integer equips) {
		this.equips = equips;
	}

	public Integer getTechs() {
		return this.techs;
	}

	public void setTechs(Integer techs) {
		this.techs = techs;
	}

	public Integer getGrounds() {
		return this.grounds;
	}

	public void setGrounds(Integer grounds) {
		this.grounds = grounds;
	}

	public Integer getMaterials() {
		return this.materials;
	}

	public void setMaterials(Integer materials) {
		this.materials = materials;
	}

	public Integer getTypes() {
		return this.types;
	}

	public void setTypes(Integer types) {
		this.types = types;
	}

	public String getOthernote() {
		return this.othernote;
	}

	public void setOthernote(String othernote) {
		this.othernote = othernote;
	}

}