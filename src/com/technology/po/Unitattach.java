package com.technology.po;

/**
 * Unitattach entity. @author MyEclipse Persistence Tools
 */

public class Unitattach implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer unitid;
	private Integer seq;
	private String name;
	private Integer kind;
	private String file;
	private String path;

	// Constructors

	/** default constructor */
	public Unitattach() {
	}

	/** full constructor */
	public Unitattach(Integer unitid, Integer seq, String name, Integer kind,
			String file, String path) {
		this.unitid = unitid;
		this.seq = seq;
		this.name = name;
		this.kind = kind;
		this.file = file;
		this.path = path;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUnitid() {
		return this.unitid;
	}

	public void setUnitid(Integer unitid) {
		this.unitid = unitid;
	}

	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}