package com.technology.po;

/**
 * Projectunit entity. @author MyEclipse Persistence Tools
 */

public class Projectunit implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer projectid;
	private Integer unitid;
	private Integer kind;
	private String work;

	// Constructors

	/** default constructor */
	public Projectunit() {
	}

	/** full constructor */
	public Projectunit(Integer serviceid, Integer projectid, Integer unitid,
			Integer kind, String work) {
		this.serviceid = serviceid;
		this.projectid = projectid;
		this.unitid = unitid;
		this.kind = kind;
		this.work = work;
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

	public Integer getUnitid() {
		return this.unitid;
	}

	public void setUnitid(Integer unitid) {
		this.unitid = unitid;
	}

	public Integer getKind() {
		return this.kind;
	}

	public void setKind(Integer kind) {
		this.kind = kind;
	}

	public String getWork() {
		return this.work;
	}

	public void setWork(String work) {
		this.work = work;
	}

}