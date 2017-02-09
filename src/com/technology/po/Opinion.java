package com.technology.po;

import java.sql.Timestamp;

/**
 * Opinion entity. @author MyEclipse Persistence Tools
 */

public class Opinion implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer kind;
	private Integer flowid;
	private Integer recordid;
	private Integer userid;
	private Timestamp examtime;
	private String examtext;

	// Constructors

	/** default constructor */
	public Opinion() {
	}

	/** full constructor */
	public Opinion(Integer kind, Integer flowid, Integer recordid,
			Integer userid, Timestamp examtime, String examtext) {
		this.kind = kind;
		this.flowid = flowid;
		this.recordid = recordid;
		this.userid = userid;
		this.examtime = examtime;
		this.examtext = examtext;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getKind() {
		return this.kind;
	}

	public void setKind(Integer kind) {
		this.kind = kind;
	}

	public Integer getFlowid() {
		return this.flowid;
	}

	public void setFlowid(Integer flowid) {
		this.flowid = flowid;
	}

	public Integer getRecordid() {
		return this.recordid;
	}

	public void setRecordid(Integer recordid) {
		this.recordid = recordid;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Timestamp getExamtime() {
		return this.examtime;
	}

	public void setExamtime(Timestamp examtime) {
		this.examtime = examtime;
	}

	public String getExamtext() {
		return this.examtext;
	}

	public void setExamtext(String examtext) {
		this.examtext = examtext;
	}

}