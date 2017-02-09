package com.technology.po;

import java.util.Date;

/**
 * Cooperationbase entity. @author MyEclipse Persistence Tools
 */

public class Cooperationbase implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer type;
	private Integer kind;
	private Integer coopkind;
	private Integer rank;
	private Integer secret;
	private String coopcontent;
	private String region;
	private String course;
	private String area;
	private String year;
	private String name;
	private String willname;
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
	private Date signtime;
	private String validity;
	private Date starttime;
	private Date endtime;
	private Integer ispdf;
	private String introduce;
	private String question;
	private String preresult;
	private String secretcontent;
	private String othernote;
	private String fundnote;
	private String templetpath;
	private String wordpath;
	private String pdfpath;
	private String reportpath;
	private Float prefund;
	private Float realfund;
	private Float cityfund;

	// Constructors

	/** default constructor */
	public Cooperationbase() {
	}

	/** full constructor */
	public Cooperationbase(Integer serviceid, Integer type, Integer kind,
			Integer coopkind, Integer rank, Integer secret, String coopcontent,
			String region, String course, String area, String year,
			String name, String willname, String versionnum, String acceptnum,
			String projectnum, String filenum, Integer seq, Integer progessid,
			Integer isover, Integer isbuild, Integer leadid, Date reporttime,
			Date signtime, String validity, Date starttime, Date endtime,
			Integer ispdf, String introduce, String question, String preresult,
			String secretcontent, String othernote, String fundnote,
			String templetpath, String wordpath, String pdfpath,
			String reportpath, Float prefund, Float realfund, Float cityfund) {
		this.serviceid = serviceid;
		this.type = type;
		this.kind = kind;
		this.coopkind = coopkind;
		this.rank = rank;
		this.secret = secret;
		this.coopcontent = coopcontent;
		this.region = region;
		this.course = course;
		this.area = area;
		this.year = year;
		this.name = name;
		this.willname = willname;
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
		this.signtime = signtime;
		this.validity = validity;
		this.starttime = starttime;
		this.endtime = endtime;
		this.ispdf = ispdf;
		this.introduce = introduce;
		this.question = question;
		this.preresult = preresult;
		this.secretcontent = secretcontent;
		this.othernote = othernote;
		this.fundnote = fundnote;
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

	public Integer getKind() {
		return this.kind;
	}

	public void setKind(Integer kind) {
		this.kind = kind;
	}

	public Integer getCoopkind() {
		return this.coopkind;
	}

	public void setCoopkind(Integer coopkind) {
		this.coopkind = coopkind;
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

	public String getCoopcontent() {
		return this.coopcontent;
	}

	public void setCoopcontent(String coopcontent) {
		this.coopcontent = coopcontent;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
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

	public String getWillname() {
		return this.willname;
	}

	public void setWillname(String willname) {
		this.willname = willname;
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

	public Date getSigntime() {
		return this.signtime;
	}

	public void setSigntime(Date signtime) {
		this.signtime = signtime;
	}

	public String getValidity() {
		return this.validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
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

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getPreresult() {
		return this.preresult;
	}

	public void setPreresult(String preresult) {
		this.preresult = preresult;
	}

	public String getSecretcontent() {
		return this.secretcontent;
	}

	public void setSecretcontent(String secretcontent) {
		this.secretcontent = secretcontent;
	}

	public String getOthernote() {
		return this.othernote;
	}

	public void setOthernote(String othernote) {
		this.othernote = othernote;
	}

	public String getFundnote() {
		return this.fundnote;
	}

	public void setFundnote(String fundnote) {
		this.fundnote = fundnote;
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