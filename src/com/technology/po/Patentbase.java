package com.technology.po;

import java.util.Date;

/**
 * Patentbase entity. @author MyEclipse Persistence Tools
 */

public class Patentbase implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer type;
	private Integer rank;
	private Integer secret;
	private String year;
	private String name;
	private String patentname;
	private String patentcode;
	private Date authordate;
	private Integer industkind;
	private String versionnum;
	private String acceptnum;
	private String projectnum;
	private String filenum;
	private Integer seq;
	private Integer progessid;
	private Integer isover;
	private Integer isbuild;
	private Integer leadid;
	private Date reporttime;
	private Date starttime;
	private Date endtime;
	private Integer ispdf;
	private String innovation;
	private String implement;
	private String relation;
	private String goal;
	private String market;
	private String already;
	private String othernote;
	private String recommend;
	private String templetpath;
	private String wordpath;
	private String pdfpath;
	private String reportpath;
	private Float prefund;
	private Float realfund;
	private Float cityfund;

	// Constructors

	/** default constructor */
	public Patentbase() {
	}

	/** full constructor */
	public Patentbase(Integer serviceid, Integer type, Integer rank,
			Integer secret, String year, String name, String patentname,
			String patentcode, Date authordate, Integer industkind,
			String versionnum, String acceptnum, String projectnum,
			String filenum, Integer seq, Integer progessid, Integer isover,
			Integer isbuild, Integer leadid, Date reporttime, Date starttime,
			Date endtime, Integer ispdf, String innovation, String implement,
			String relation, String goal, String market, String already,
			String othernote, String recommend, String templetpath,
			String wordpath, String pdfpath, String reportpath, Float prefund,
			Float realfund, Float cityfund) {
		this.serviceid = serviceid;
		this.type = type;
		this.rank = rank;
		this.secret = secret;
		this.year = year;
		this.name = name;
		this.patentname = patentname;
		this.patentcode = patentcode;
		this.authordate = authordate;
		this.industkind = industkind;
		this.versionnum = versionnum;
		this.acceptnum = acceptnum;
		this.projectnum = projectnum;
		this.filenum = filenum;
		this.seq = seq;
		this.progessid = progessid;
		this.isover = isover;
		this.isbuild = isbuild;
		this.leadid = leadid;
		this.reporttime = reporttime;
		this.starttime = starttime;
		this.endtime = endtime;
		this.ispdf = ispdf;
		this.innovation = innovation;
		this.implement = implement;
		this.relation = relation;
		this.goal = goal;
		this.market = market;
		this.already = already;
		this.othernote = othernote;
		this.recommend = recommend;
		this.templetpath = templetpath;
		this.wordpath = wordpath;
		this.pdfpath = pdfpath;
		this.reportpath = reportpath;
		this.prefund = prefund;
		this.realfund = realfund;
		this.cityfund = cityfund;
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

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getSecret() {
		return this.secret;
	}

	public void setSecret(Integer secret) {
		this.secret = secret;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatentname() {
		return this.patentname;
	}

	public void setPatentname(String patentname) {
		this.patentname = patentname;
	}

	public String getPatentcode() {
		return this.patentcode;
	}

	public void setPatentcode(String patentcode) {
		this.patentcode = patentcode;
	}

	public Date getAuthordate() {
		return this.authordate;
	}

	public void setAuthordate(Date authordate) {
		this.authordate = authordate;
	}

	public Integer getIndustkind() {
		return this.industkind;
	}

	public void setIndustkind(Integer industkind) {
		this.industkind = industkind;
	}

	public String getVersionnum() {
		return this.versionnum;
	}

	public void setVersionnum(String versionnum) {
		this.versionnum = versionnum;
	}

	public String getAcceptnum() {
		return this.acceptnum;
	}

	public void setAcceptnum(String acceptnum) {
		this.acceptnum = acceptnum;
	}

	public String getProjectnum() {
		return this.projectnum;
	}

	public void setProjectnum(String projectnum) {
		this.projectnum = projectnum;
	}

	public String getFilenum() {
		return this.filenum;
	}

	public void setFilenum(String filenum) {
		this.filenum = filenum;
	}

	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getProgessid() {
		return this.progessid;
	}

	public void setProgessid(Integer progessid) {
		this.progessid = progessid;
	}

	public Integer getIsover() {
		return this.isover;
	}

	public void setIsover(Integer isover) {
		this.isover = isover;
	}

	public Integer getIsbuild() {
		return this.isbuild;
	}

	public void setIsbuild(Integer isbuild) {
		this.isbuild = isbuild;
	}

	public Integer getLeadid() {
		return this.leadid;
	}

	public void setLeadid(Integer leadid) {
		this.leadid = leadid;
	}

	public Date getReporttime() {
		return this.reporttime;
	}

	public void setReporttime(Date reporttime) {
		this.reporttime = reporttime;
	}

	public Date getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Integer getIspdf() {
		return this.ispdf;
	}

	public void setIspdf(Integer ispdf) {
		this.ispdf = ispdf;
	}

	public String getInnovation() {
		return this.innovation;
	}

	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}

	public String getImplement() {
		return this.implement;
	}

	public void setImplement(String implement) {
		this.implement = implement;
	}

	public String getRelation() {
		return this.relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getGoal() {
		return this.goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getMarket() {
		return this.market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getAlready() {
		return this.already;
	}

	public void setAlready(String already) {
		this.already = already;
	}

	public String getOthernote() {
		return this.othernote;
	}

	public void setOthernote(String othernote) {
		this.othernote = othernote;
	}

	public String getRecommend() {
		return this.recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
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

	public String getReportpath() {
		return this.reportpath;
	}

	public void setReportpath(String reportpath) {
		this.reportpath = reportpath;
	}

	public Float getPrefund() {
		return this.prefund;
	}

	public void setPrefund(Float prefund) {
		this.prefund = prefund;
	}

	public Float getRealfund() {
		return this.realfund;
	}

	public void setRealfund(Float realfund) {
		this.realfund = realfund;
	}

	public Float getCityfund() {
		return this.cityfund;
	}

	public void setCityfund(Float cityfund) {
		this.cityfund = cityfund;
	}

}