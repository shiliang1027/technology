package com.technology.po;

import java.sql.Timestamp;

/**
 * Serviceopen entity. @author MyEclipse Persistence Tools
 */

public class Serviceopen implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private String year;
	private Timestamp starttime;
	private Timestamp endtime;
	private Integer seq;

	// Constructors

	/** default constructor */
	public Serviceopen() {
	}

	/** full constructor */
	public Serviceopen(Integer serviceid, String year, Timestamp starttime,
			Timestamp endtime, Integer seq) {
		this.serviceid = serviceid;
		this.year = year;
		this.starttime = starttime;
		this.endtime = endtime;
		this.seq = seq;
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

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Timestamp getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

}