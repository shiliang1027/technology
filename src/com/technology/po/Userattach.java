package com.technology.po;

/**
 * Userattach entity. @author MyEclipse Persistence Tools
 */

public class Userattach implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userid;
	private Integer seq;
	private String name;
	private Integer kind;
	private String file;
	private String path;

	// Constructors

	/** default constructor */
	public Userattach() {
	}

	/** full constructor */
	public Userattach(Integer userid, Integer seq, String name, Integer kind,
			String file, String path) {
		this.userid = userid;
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

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
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