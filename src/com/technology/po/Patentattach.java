package com.technology.po;

/**
 * Patentattach entity. @author MyEclipse Persistence Tools
 */

public class Patentattach implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer serviceid;
	private Integer projectid;
	private Integer seq;
	private String name;
	private Integer kind;
	private String file;
	private String path;

	// Constructors

	/** default constructor */
	public Patentattach() {
	}

	/** full constructor */
	public Patentattach(Integer serviceid, Integer projectid, Integer seq,
			String name, Integer kind, String file, String path) {
		this.serviceid = serviceid;
		this.projectid = projectid;
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