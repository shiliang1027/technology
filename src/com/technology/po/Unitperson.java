package com.technology.po;

/**
 * Unitperson entity. @author MyEclipse Persistence Tools
 */

public class Unitperson implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer unitid;
	private Integer worksum;
	private Integer techsum;
	private Integer highsum;
	private Integer mediumsum;
	private Integer lowsum;
	private Integer other1sum;
	private Integer doctorsum;
	private Integer mastersum;
	private Integer bachesum;
	private Integer other2sum;
	private String legalperson;
	private Integer legalsex;
	private String legaljob;
	private Integer legalrank;
	private String legalphone;
	private String legalfax;
	private String legalmobile;
	private String legalemail;
	private String leadperson;
	private Integer leadsex;
	private String leadjob;
	private Integer leadrank;
	private String leadphone;
	private String leadfax;
	private String leadmobile;
	private String leademail;
	private Integer last1sum;
	private Integer last3sum;
	private Integer last2sum;

	// Constructors

	/** default constructor */
	public Unitperson() {
	}

	/** minimal constructor */
	public Unitperson(Integer unitid) {
		this.unitid = unitid;
	}

	/** full constructor */
	public Unitperson(Integer unitid, Integer worksum, Integer techsum,
			Integer highsum, Integer mediumsum, Integer lowsum,
			Integer other1sum, Integer doctorsum, Integer mastersum,
			Integer bachesum, Integer other2sum, String legalperson,
			Integer legalsex, String legaljob, Integer legalrank,
			String legalphone, String legalfax, String legalmobile,
			String legalemail, String leadperson, Integer leadsex,
			String leadjob, Integer leadrank, String leadphone, String leadfax,
			String leadmobile, String leademail, Integer last1sum,
			Integer last3sum, Integer last2sum) {
		this.unitid = unitid;
		this.worksum = worksum;
		this.techsum = techsum;
		this.highsum = highsum;
		this.mediumsum = mediumsum;
		this.lowsum = lowsum;
		this.other1sum = other1sum;
		this.doctorsum = doctorsum;
		this.mastersum = mastersum;
		this.bachesum = bachesum;
		this.other2sum = other2sum;
		this.legalperson = legalperson;
		this.legalsex = legalsex;
		this.legaljob = legaljob;
		this.legalrank = legalrank;
		this.legalphone = legalphone;
		this.legalfax = legalfax;
		this.legalmobile = legalmobile;
		this.legalemail = legalemail;
		this.leadperson = leadperson;
		this.leadsex = leadsex;
		this.leadjob = leadjob;
		this.leadrank = leadrank;
		this.leadphone = leadphone;
		this.leadfax = leadfax;
		this.leadmobile = leadmobile;
		this.leademail = leademail;
		this.last1sum = last1sum;
		this.last3sum = last3sum;
		this.last2sum = last2sum;
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

	public Integer getWorksum() {
		return this.worksum;
	}

	public void setWorksum(Integer worksum) {
		this.worksum = worksum;
	}

	public Integer getTechsum() {
		return this.techsum;
	}

	public void setTechsum(Integer techsum) {
		this.techsum = techsum;
	}

	public Integer getHighsum() {
		return this.highsum;
	}

	public void setHighsum(Integer highsum) {
		this.highsum = highsum;
	}

	public Integer getMediumsum() {
		return this.mediumsum;
	}

	public void setMediumsum(Integer mediumsum) {
		this.mediumsum = mediumsum;
	}

	public Integer getLowsum() {
		return this.lowsum;
	}

	public void setLowsum(Integer lowsum) {
		this.lowsum = lowsum;
	}

	public Integer getOther1sum() {
		return this.other1sum;
	}

	public void setOther1sum(Integer other1sum) {
		this.other1sum = other1sum;
	}

	public Integer getDoctorsum() {
		return this.doctorsum;
	}

	public void setDoctorsum(Integer doctorsum) {
		this.doctorsum = doctorsum;
	}

	public Integer getMastersum() {
		return this.mastersum;
	}

	public void setMastersum(Integer mastersum) {
		this.mastersum = mastersum;
	}

	public Integer getBachesum() {
		return this.bachesum;
	}

	public void setBachesum(Integer bachesum) {
		this.bachesum = bachesum;
	}

	public Integer getOther2sum() {
		return this.other2sum;
	}

	public void setOther2sum(Integer other2sum) {
		this.other2sum = other2sum;
	}

	public String getLegalperson() {
		return this.legalperson;
	}

	public void setLegalperson(String legalperson) {
		this.legalperson = legalperson;
	}

	public Integer getLegalsex() {
		return this.legalsex;
	}

	public void setLegalsex(Integer legalsex) {
		this.legalsex = legalsex;
	}

	public String getLegaljob() {
		return this.legaljob;
	}

	public void setLegaljob(String legaljob) {
		this.legaljob = legaljob;
	}

	public Integer getLegalrank() {
		return this.legalrank;
	}

	public void setLegalrank(Integer legalrank) {
		this.legalrank = legalrank;
	}

	public String getLegalphone() {
		return this.legalphone;
	}

	public void setLegalphone(String legalphone) {
		this.legalphone = legalphone;
	}

	public String getLegalfax() {
		return this.legalfax;
	}

	public void setLegalfax(String legalfax) {
		this.legalfax = legalfax;
	}

	public String getLegalmobile() {
		return this.legalmobile;
	}

	public void setLegalmobile(String legalmobile) {
		this.legalmobile = legalmobile;
	}

	public String getLegalemail() {
		return this.legalemail;
	}

	public void setLegalemail(String legalemail) {
		this.legalemail = legalemail;
	}

	public String getLeadperson() {
		return this.leadperson;
	}

	public void setLeadperson(String leadperson) {
		this.leadperson = leadperson;
	}

	public Integer getLeadsex() {
		return this.leadsex;
	}

	public void setLeadsex(Integer leadsex) {
		this.leadsex = leadsex;
	}

	public String getLeadjob() {
		return this.leadjob;
	}

	public void setLeadjob(String leadjob) {
		this.leadjob = leadjob;
	}

	public Integer getLeadrank() {
		return this.leadrank;
	}

	public void setLeadrank(Integer leadrank) {
		this.leadrank = leadrank;
	}

	public String getLeadphone() {
		return this.leadphone;
	}

	public void setLeadphone(String leadphone) {
		this.leadphone = leadphone;
	}

	public String getLeadfax() {
		return this.leadfax;
	}

	public void setLeadfax(String leadfax) {
		this.leadfax = leadfax;
	}

	public String getLeadmobile() {
		return this.leadmobile;
	}

	public void setLeadmobile(String leadmobile) {
		this.leadmobile = leadmobile;
	}

	public String getLeademail() {
		return this.leademail;
	}

	public void setLeademail(String leademail) {
		this.leademail = leademail;
	}

	public Integer getLast1sum() {
		return this.last1sum;
	}

	public void setLast1sum(Integer last1sum) {
		this.last1sum = last1sum;
	}

	public Integer getLast3sum() {
		return this.last3sum;
	}

	public void setLast3sum(Integer last3sum) {
		this.last3sum = last3sum;
	}

	public Integer getLast2sum() {
		return this.last2sum;
	}

	public void setLast2sum(Integer last2sum) {
		this.last2sum = last2sum;
	}

}