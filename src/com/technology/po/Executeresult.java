package com.technology.po;

/**
 * Executeresult entity. @author MyEclipse Persistence Tools
 */

public class Executeresult implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer executeid;
	private String name;
	private Integer kind;
	private String content;
	private String authors;

	// Constructors

	/** default constructor */
	public Executeresult() {
	}

	/** full constructor */
	public Executeresult(Integer executeid, String name, Integer kind,
			String content, String authors) {
		this.executeid = executeid;
		this.name = name;
		this.kind = kind;
		this.content = content;
		this.authors = authors;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getExecuteid() {
		return this.executeid;
	}

	public void setExecuteid(Integer executeid) {
		this.executeid = executeid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getKind() {
		return this.kind;
	}

	public void setKind(Integer kind) {
		this.kind = kind;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthors() {
		return this.authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

}