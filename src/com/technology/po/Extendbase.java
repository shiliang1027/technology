package com.technology.po;

import java.util.Date;

/**
 * Extendbase entity. @author MyEclipse Persistence Tools
 */

public class Extendbase implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer type;
	private Integer rank;
	private Integer secret;
	private Integer region;
	private String year;
	private String name;
	private String advantage;
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
	private String pcondition;
	private String techcontent;
	private String techpath;
	private String effect;
	private String othernote;
	private String fundnote;
	private String templetpath;
	private String wordpath;
	private String pdfpath;
	private String reportpath;
	private Float scale;
	private Float gain;
	private Float output;
	private Float tax;
	private Float alinvest;
	private Float newinvest;
	private Float prefund;
	private Float realfund;
	private Float cityfund;

	// Constructors

	/** default constructor */
	public Extendbase() {
	}

	/** full constructor */
	public Extendbase(Integer serviceid, Integer type, Integer rank,
			Integer secret, Integer region, String year, String name,
			String advantage, String versionnum, String acceptnum,
			String projectnum, String filenum, Integer seq, Integer progessid,
			Integer isover, Integer isbuild, Integer leadid, Date reporttime,
			Date starttime, Date endtime, Integer ispdf, String pcondition,
			String techcontent, String techpath, String effect,
			String othernote, String fundnote, String templetpath,
			String wordpath, String pdfpath, String reportpath, Float scale,
			Float gain, Float output, Float tax, Float alinvest,
			Float newinvest, Float prefund, Float realfund, Float cityfund) {
		this.serviceid = serviceid;
		this.type = type;
		this.rank = rank;
		this.secret = secret;
		this.region = region;
		this.year = year;
		this.name = name;
		this.advantage = advantage;
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
		this.pcondition = pcondition;
		this.techcontent = techcontent;
		this.techpath = techpath;
		this.effect = effect;
		this.othernote = othernote;
		this.fundnote = fundnote;
		this.templetpath = templetpath;
		this.wordpath = wordpath;
		this.pdfpath = pdfpath;
		this.reportpath = reportpath;
		this.scale = scale;
		this.gain = gain;
		this.output = output;
		this.tax = tax;
		this.alinvest = alinvest;
		this.newinvest = newinvest;
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

	public Integer getRegion() {
		return this.region;
	}

	public void setRegion(Integer region) {
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

	public String getAdvantage() {
		return this.advantage;
	}

	public void setAdvantage(String advantage) {
		this.advantage = advantage;
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

	public String getPcondition() {
		return this.pcondition;
	}

	public void setPcondition(String pcondition) {
		this.pcondition = pcondition;
	}

	public String getTechcontent() {
		return this.techcontent;
	}

	public void setTechcontent(String techcontent) {
		this.techcontent = techcontent;
	}

	public String getTechpath() {
		return this.techpath;
	}

	public void setTechpath(String techpath) {
		this.techpath = techpath;
	}

	public String getEffect() {
		return this.effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
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

	public Float getScale() {
		return this.scale;
	}

	public void setScale(Float scale) {
		this.scale = scale;
	}

	public Float getGain() {
		return this.gain;
	}

	public void setGain(Float gain) {
		this.gain = gain;
	}

	public Float getOutput() {
		return this.output;
	}

	public void setOutput(Float output) {
		this.output = output;
	}

	public Float getTax() {
		return this.tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

	public Float getAlinvest() {
		return this.alinvest;
	}

	public void setAlinvest(Float alinvest) {
		this.alinvest = alinvest;
	}

	public Float getNewinvest() {
		return this.newinvest;
	}

	public void setNewinvest(Float newinvest) {
		this.newinvest = newinvest;
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