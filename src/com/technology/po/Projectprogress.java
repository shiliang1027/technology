package com.technology.po;

import java.util.Date;

/**
 * Projectprogress entity. @author MyEclipse Persistence Tools
 */

public class Projectprogress implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer projectid;
	private Date startdate;
	private Date enddate;
	private String content;
	private String result;

	// Constructors

	/** default constructor */
	public Projectprogress() {
	}

	/** full constructor */
	public Projectprogress(Integer serviceid, Integer projectid,
			Date startdate, Date enddate, String content, String result) {
		this.serviceid = serviceid;
		this.projectid = projectid;
		this.startdate = startdate;
		this.enddate = enddate;
		this.content = content;
		this.result = result;
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

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}