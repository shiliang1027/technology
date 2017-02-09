package com.technology.po;

import java.sql.Timestamp;

/**
 * Modlog entity. @author MyEclipse Persistence Tools
 */

public class Modlog implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer projectid;
	private Integer userid;
	private Timestamp modtime;
	private String modtable;
	private String modfield;
	private String first;
	private String last;
	private Integer operate;

	// Constructors

	/** default constructor */
	public Modlog() {
	}

	/** full constructor */
	public Modlog(Integer serviceid, Integer projectid, Integer userid,
			Timestamp modtime, String modtable, String modfield, String first,
			String last, Integer operate) {
		this.serviceid = serviceid;
		this.projectid = projectid;
		this.userid = userid;
		this.modtime = modtime;
		this.modtable = modtable;
		this.modfield = modfield;
		this.first = first;
		this.last = last;
		this.operate = operate;
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

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Timestamp getModtime() {
		return this.modtime;
	}

	public void setModtime(Timestamp modtime) {
		this.modtime = modtime;
	}

	public String getModtable() {
		return this.modtable;
	}

	public void setModtable(String modtable) {
		this.modtable = modtable;
	}

	public String getModfield() {
		return this.modfield;
	}

	public void setModfield(String modfield) {
		this.modfield = modfield;
	}

	public String getFirst() {
		return this.first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return this.last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public Integer getOperate() {
		return this.operate;
	}

	public void setOperate(Integer operate) {
		this.operate = operate;
	}

}