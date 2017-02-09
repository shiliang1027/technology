package com.technology.po;

/**
 * Rateitem entity. @author MyEclipse Persistence Tools
 */

public class Rateitem implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer bigid;
	private Integer smallid;
	private String smallname;
	private Integer itemid;
	private String itemname;
	private Float maxrate;
	private Float minrate;

	// Constructors

	/** default constructor */
	public Rateitem() {
	}

	/** full constructor */
	public Rateitem(Integer bigid, Integer smallid, String smallname,
			Integer itemid, String itemname, Float maxrate, Float minrate) {
		this.bigid = bigid;
		this.smallid = smallid;
		this.smallname = smallname;
		this.itemid = itemid;
		this.itemname = itemname;
		this.maxrate = maxrate;
		this.minrate = minrate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getSmallname() {
		return this.smallname;
	}

	public void setSmallname(String smallname) {
		this.smallname = smallname;
	}

	public Integer getItemid() {
		return this.itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public Float getMaxrate() {
		return this.maxrate;
	}

	public void setMaxrate(Float maxrate) {
		this.maxrate = maxrate;
	}

	public Float getMinrate() {
		return this.minrate;
	}

	public void setMinrate(Float minrate) {
		this.minrate = minrate;
	}

}