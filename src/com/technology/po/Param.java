package com.technology.po;

/**
 * Param entity. @author MyEclipse Persistence Tools
 */

public class Param implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer kind;
	private Integer value;
	private String name;
	private String service;
	private Integer type;

	// Constructors

	/** default constructor */
	public Param() {
	}

	/** full constructor */
	public Param(Integer kind, Integer value, String name, String service,
			Integer type) {
		this.kind = kind;
		this.value = value;
		this.name = name;
		this.service = service;
		this.type = type;
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

	public Integer getValue() {
		return this.value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}