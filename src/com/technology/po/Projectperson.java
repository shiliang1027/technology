package com.technology.po;

/**
 * Projectperson entity. @author MyEclipse Persistence Tools
 */

public class Projectperson implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer projectid;
	private Integer role;
	private String name;
	private Integer sex;
	private Integer old;
	private Integer exist;
	private String unitname;
	private String idcard;
	private Integer rank;
	private String job;
	private Integer degree;
	private String nowmajor;
	private Integer worktime;
	private String task;

	// Constructors

	/** default constructor */
	public Projectperson() {
	}

	/** full constructor */
	public Projectperson(Integer serviceid, Integer projectid, Integer role,
			String name, Integer sex, Integer old, Integer exist,
			String unitname, String idcard, Integer rank, String job,
			Integer degree, String nowmajor, Integer worktime, String task) {
		this.serviceid = serviceid;
		this.projectid = projectid;
		this.role = role;
		this.name = name;
		this.sex = sex;
		this.old = old;
		this.exist = exist;
		this.unitname = unitname;
		this.idcard = idcard;
		this.rank = rank;
		this.job = job;
		this.degree = degree;
		this.nowmajor = nowmajor;
		this.worktime = worktime;
		this.task = task;
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

	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getOld() {
		return this.old;
	}

	public void setOld(Integer old) {
		this.old = old;
	}

	public Integer getExist() {
		return this.exist;
	}

	public void setExist(Integer exist) {
		this.exist = exist;
	}

	public String getUnitname() {
		return this.unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getDegree() {
		return this.degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	public String getNowmajor() {
		return this.nowmajor;
	}

	public void setNowmajor(String nowmajor) {
		this.nowmajor = nowmajor;
	}

	public Integer getWorktime() {
		return this.worktime;
	}

	public void setWorktime(Integer worktime) {
		this.worktime = worktime;
	}

	public String getTask() {
		return this.task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}