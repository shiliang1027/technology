package com.technology.po;

import java.util.Date;

/**
 * Supportbase entity. @author MyEclipse Persistence Tools
 */

public class Supportbase implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer type;
	private Integer kind;
	private Integer rank;
	private Integer secret;
	private Integer activity;
	private Integer invoate;
	private Integer region;
	private Integer techregion;
	private String year;
	private String name;
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
	private Integer source;
	private Integer creative;
	private Integer advance;
	private Integer period;
	private Integer alinvest;
	private Integer preinvest;
	private Integer alutility;
	private Integer preutility;
	private Integer alstyle;
	private Integer prestyle;
	private Integer outinvest;
	private Integer newarts;
	private Integer newproduct;
	private Integer newequip;
	private Integer soft;
	private Integer paper;
	private Integer standard;
	private Integer other1;
	private Integer other2;
	private String advantage;
	private String harvest;
	private Integer ispdf;
	private String goal;
	private String base;
	private String purpose;
	private String content;
	private String stagegoal;
	private String techgoal;
	private String bengoal;
	private String workgoal;
	private String preview;
	private String environment;
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
	public Supportbase() {
	}

	/** full constructor */
	public Supportbase(Integer serviceid, Integer type, Integer kind,
			Integer rank, Integer secret, Integer activity, Integer invoate,
			Integer region, Integer techregion, String year, String name,
			String versionnum, String acceptnum, String projectnum,
			String filenum, Integer seq, Integer progessid, Integer isover,
			Integer isbuild, Integer leadid, Date reporttime, Date starttime,
			Date endtime, Integer source, Integer creative, Integer advance,
			Integer period, Integer alinvest, Integer preinvest,
			Integer alutility, Integer preutility, Integer alstyle,
			Integer prestyle, Integer outinvest, Integer newarts,
			Integer newproduct, Integer newequip, Integer soft, Integer paper,
			Integer standard, Integer other1, Integer other2, String advantage,
			String harvest, Integer ispdf, String goal, String base,
			String purpose, String content, String stagegoal, String techgoal,
			String bengoal, String workgoal, String preview,
			String environment, String othernote, String fundnote,
			String templetpath, String wordpath, String pdfpath,
			String reportpath, Float prefund, Float realfund, Float cityfund) {
		this.serviceid = serviceid;
		this.type = type;
		this.kind = kind;
		this.rank = rank;
		this.secret = secret;
		this.activity = activity;
		this.invoate = invoate;
		this.region = region;
		this.techregion = techregion;
		this.year = year;
		this.name = name;
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
		this.source = source;
		this.creative = creative;
		this.advance = advance;
		this.period = period;
		this.alinvest = alinvest;
		this.preinvest = preinvest;
		this.alutility = alutility;
		this.preutility = preutility;
		this.alstyle = alstyle;
		this.prestyle = prestyle;
		this.outinvest = outinvest;
		this.newarts = newarts;
		this.newproduct = newproduct;
		this.newequip = newequip;
		this.soft = soft;
		this.paper = paper;
		this.standard = standard;
		this.other1 = other1;
		this.other2 = other2;
		this.advantage = advantage;
		this.harvest = harvest;
		this.ispdf = ispdf;
		this.goal = goal;
		this.base = base;
		this.purpose = purpose;
		this.content = content;
		this.stagegoal = stagegoal;
		this.techgoal = techgoal;
		this.bengoal = bengoal;
		this.workgoal = workgoal;
		this.preview = preview;
		this.environment = environment;
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

	public Integer getActivity() {
		return this.activity;
	}

	public void setActivity(Integer activity) {
		this.activity = activity;
	}

	public Integer getInvoate() {
		return this.invoate;
	}

	public void setInvoate(Integer invoate) {
		this.invoate = invoate;
	}

	public Integer getRegion() {
		return this.region;
	}

	public void setRegion(Integer region) {
		this.region = region;
	}

	public Integer getTechregion() {
		return this.techregion;
	}

	public void setTechregion(Integer techregion) {
		this.techregion = techregion;
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

	public Integer getSource() {
		return this.source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getCreative() {
		return this.creative;
	}

	public void setCreative(Integer creative) {
		this.creative = creative;
	}

	public Integer getAdvance() {
		return this.advance;
	}

	public void setAdvance(Integer advance) {
		this.advance = advance;
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public Integer getAlinvest() {
		return this.alinvest;
	}

	public void setAlinvest(Integer alinvest) {
		this.alinvest = alinvest;
	}

	public Integer getPreinvest() {
		return this.preinvest;
	}

	public void setPreinvest(Integer preinvest) {
		this.preinvest = preinvest;
	}

	public Integer getAlutility() {
		return this.alutility;
	}

	public void setAlutility(Integer alutility) {
		this.alutility = alutility;
	}

	public Integer getPreutility() {
		return this.preutility;
	}

	public void setPreutility(Integer preutility) {
		this.preutility = preutility;
	}

	public Integer getAlstyle() {
		return this.alstyle;
	}

	public void setAlstyle(Integer alstyle) {
		this.alstyle = alstyle;
	}

	public Integer getPrestyle() {
		return this.prestyle;
	}

	public void setPrestyle(Integer prestyle) {
		this.prestyle = prestyle;
	}

	public Integer getOutinvest() {
		return this.outinvest;
	}

	public void setOutinvest(Integer outinvest) {
		this.outinvest = outinvest;
	}

	public Integer getNewarts() {
		return this.newarts;
	}

	public void setNewarts(Integer newarts) {
		this.newarts = newarts;
	}

	public Integer getNewproduct() {
		return this.newproduct;
	}

	public void setNewproduct(Integer newproduct) {
		this.newproduct = newproduct;
	}

	public Integer getNewequip() {
		return this.newequip;
	}

	public void setNewequip(Integer newequip) {
		this.newequip = newequip;
	}

	public Integer getSoft() {
		return this.soft;
	}

	public void setSoft(Integer soft) {
		this.soft = soft;
	}

	public Integer getPaper() {
		return this.paper;
	}

	public void setPaper(Integer paper) {
		this.paper = paper;
	}

	public Integer getStandard() {
		return this.standard;
	}

	public void setStandard(Integer standard) {
		this.standard = standard;
	}

	public Integer getOther1() {
		return this.other1;
	}

	public void setOther1(Integer other1) {
		this.other1 = other1;
	}

	public Integer getOther2() {
		return this.other2;
	}

	public void setOther2(Integer other2) {
		this.other2 = other2;
	}

	public String getAdvantage() {
		return this.advantage;
	}

	public void setAdvantage(String advantage) {
		this.advantage = advantage;
	}

	public String getHarvest() {
		return this.harvest;
	}

	public void setHarvest(String harvest) {
		this.harvest = harvest;
	}

	public Integer getIspdf() {
		return this.ispdf;
	}

	public void setIspdf(Integer ispdf) {
		this.ispdf = ispdf;
	}

	public String getGoal() {
		return this.goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getBase() {
		return this.base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStagegoal() {
		return this.stagegoal;
	}

	public void setStagegoal(String stagegoal) {
		this.stagegoal = stagegoal;
	}

	public String getTechgoal() {
		return this.techgoal;
	}

	public void setTechgoal(String techgoal) {
		this.techgoal = techgoal;
	}

	public String getBengoal() {
		return this.bengoal;
	}

	public void setBengoal(String bengoal) {
		this.bengoal = bengoal;
	}

	public String getWorkgoal() {
		return this.workgoal;
	}

	public void setWorkgoal(String workgoal) {
		this.workgoal = workgoal;
	}

	public String getPreview() {
		return this.preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

	public String getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
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