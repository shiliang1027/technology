package com.technology.po;

import java.sql.Timestamp;

/**
 * Service entity. @author MyEclipse Persistence Tools
 */

public class Service implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer state;
	private Integer type;
	private Integer kind;
	private Integer rank;
	private Integer region;
	private Integer deptid;
	private Integer code;
	private Timestamp name;
	private String path;
	private String file;

	// Constructors

	/** default constructor */
	public Service() {
	}

	/** full constructor */
	public Service(Integer state, Integer type, Integer kind, Integer rank,
			Integer region, Integer deptid, Integer code, Timestamp name,
			String path, String file) {
		this.state = state;
		this.type = type;
		this.kind = kind;
		this.rank = rank;
		this.region = region;
		this.deptid = deptid;
		this.code = code;
		this.name = name;
		this.path = path;
		this.file = file;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
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

	public Integer getRegion() {
		return this.region;
	}

	public void setRegion(Integer region) {
		this.region = region;
	}

	public Integer getDeptid() {
		return this.deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Timestamp getName() {
		return this.name;
	}

	public void setName(Timestamp name) {
		this.name = name;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

}