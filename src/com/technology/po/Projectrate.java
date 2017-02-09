package com.technology.po;

import java.sql.Timestamp;

/**
 * Projectrate entity. @author MyEclipse Persistence Tools
 */

public class Projectrate implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer projectid;
	private Integer expertid;
	private Integer bigid;
	private Integer smallid;
	private Integer itemid;
	private Float rate;
	private Timestamp ratetime;

	// Constructors

	/** default constructor */
	public Projectrate() {
	}

	/** full constructor */
	public Projectrate(Integer serviceid, Integer projectid, Integer expertid,
			Integer bigid, Integer smallid, Integer itemid, Float rate,
			Timestamp ratetime) {
		this.serviceid = serviceid;
		this.projectid = projectid;
		this.expertid = expertid;
		this.bigid = bigid;
		this.smallid = smallid;
		this.itemid = itemid;
		this.rate = rate;
		this.ratetime = ratetime;
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

	public Integer getExpertid() {
		return this.expertid;
	}

	public void setExpertid(Integer expertid) {
		this.expertid = expertid;
	}

	public Integer getBigid() {
		return this.bigid;
	}

	public void setBigid(Integer bigid) {
		this.bigid = bigid;
	}

	public Integer getSmallid() {
		return this.smallid;
	}

	public void setSmallid(Integer smallid) {
		this.smallid = smallid;
	}

	public Integer getItemid() {
		return this.itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	public Float getRate() {
		return this.rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public Timestamp getRatetime() {
		return this.ratetime;
	}

	public void setRatetime(Timestamp ratetime) {
		this.ratetime = ratetime;
	}

}