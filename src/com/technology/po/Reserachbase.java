package com.technology.po;

import java.util.Date;

/**
 * Reserachbase entity. @author MyEclipse Persistence Tools
 */

public class Reserachbase implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer type;
	private Integer rank;
	private Integer secret;
	private String region;
	private String year;
	private String name;
	private Integer research;
	private Integer rekind;
	private Integer reaim;
	private Integer isunion;
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
	private String introduce;
	private String othernote;
	private String benefit;
	private String templetpath;
	private String wordpath;
	private String pdfpath;
	private String reportpath;
	private Float prefund;
	private Float realfund;
	private Float selffund;
	private Float cityfund;

	// Constructors

	/** default constructor */
	public Reserachbase() {
	}

	/** full constructor */
	public Reserachbase(Integer serviceid, Integer type, Integer rank,
			Integer secret, String region, String year, String name,
			Integer research, Integer rekind, Integer reaim, Integer isunion,
			String versionnum, String acceptnum, String projectnum,
			String filenum, Integer seq, Integer progessid, Integer isover,
			Integer isbuild, Integer leadid, Date reporttime, Date starttime,
			Date endtime, Integer ispdf, String introduce, String othernote,
			String benefit, String templetpath, String wordpath,
			String pdfpath, String reportpath, Float prefund, Float realfund,
			Float selffund, Float cityfund) {
		this.serviceid = serviceid;
		this.type = type;
		this.rank = rank;
		this.secret = secret;
		this.region = region;
		this.year = year;
		this.name = name;
		this.research = research;
		this.rekind = rekind;
		this.reaim = reaim;
		this.isunion = isunion;
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
		this.introduce = introduce;
		this.othernote = othernote;
		this.benefit = benefit;
		this.templetpath = templetpath;
		this.wordpath = wordpath;
		this.pdfpath = pdfpath;
		this.reportpath = reportpath;
		this.prefund = prefund;
		this.realfund = realfund;
		this.selffund = selffund;
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

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
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

	public Integer getResearch() {
		return this.research;
	}

	public void setResearch(Integer research) {
		this.research = research;
	}

	public Integer getRekind() {
		return this.rekind;
	}

	public void setRekind(Integer rekind) {
		this.rekind = rekind;
	}

	public Integer getReaim() {
		return this.reaim;
	}

	public void setReaim(Integer reaim) {
		this.reaim = reaim;
	}

	public Integer getIsunion() {
		return this.isunion;
	}

	public void setIsunion(Integer isunion) {
		this.isunion = isunion;
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

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getOthernote() {
		return this.othernote;
	}

	public void setOthernote(String othernote) {
		this.othernote = othernote;
	}

	public String getBenefit() {
		return this.benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
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

	public Float getSelffund() {
		return this.selffund;
	}

	public void setSelffund(Float selffund) {
		this.selffund = selffund;
	}

	public Float getCityfund() {
		return this.cityfund;
	}

	public void setCityfund(Float cityfund) {
		this.cityfund = cityfund;
	}

}