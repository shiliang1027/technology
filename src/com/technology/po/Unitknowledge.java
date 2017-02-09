package com.technology.po;

/**
 * Unitknowledge entity. @author MyEclipse Persistence Tools
 */

public class Unitknowledge implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer unitid;
	private Integer prepatent;
	private Integer realpatent;
	private Integer validpatent;
	private Integer preinvent;
	private Integer realinvent;
	private Integer preutility;
	private Integer realutility;
	private Integer softcopy;
	private Integer prepatent3;
	private Integer realpatent3;
	private Integer preinvent3;
	private Integer realinvent3;
	private Integer preutility3;
	private Integer realutility3;
	private Integer softcopy3;
	private String knownote;
	private Integer papersum;
	private Integer scisum;
	private Integer magsum;
	private Integer patentid;
	private String managepatent;

	// Constructors

	/** default constructor */
	public Unitknowledge() {
	}

	/** minimal constructor */
	public Unitknowledge(Integer unitid) {
		this.unitid = unitid;
	}

	/** full constructor */
	public Unitknowledge(Integer unitid, Integer prepatent, Integer realpatent,
			Integer validpatent, Integer preinvent, Integer realinvent,
			Integer preutility, Integer realutility, Integer softcopy,
			Integer prepatent3, Integer realpatent3, Integer preinvent3,
			Integer realinvent3, Integer preutility3, Integer realutility3,
			Integer softcopy3, String knownote, Integer papersum,
			Integer scisum, Integer magsum, Integer patentid,
			String managepatent) {
		this.unitid = unitid;
		this.prepatent = prepatent;
		this.realpatent = realpatent;
		this.validpatent = validpatent;
		this.preinvent = preinvent;
		this.realinvent = realinvent;
		this.preutility = preutility;
		this.realutility = realutility;
		this.softcopy = softcopy;
		this.prepatent3 = prepatent3;
		this.realpatent3 = realpatent3;
		this.preinvent3 = preinvent3;
		this.realinvent3 = realinvent3;
		this.preutility3 = preutility3;
		this.realutility3 = realutility3;
		this.softcopy3 = softcopy3;
		this.knownote = knownote;
		this.papersum = papersum;
		this.scisum = scisum;
		this.magsum = magsum;
		this.patentid = patentid;
		this.managepatent = managepatent;
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

	public Integer getPrepatent() {
		return this.prepatent;
	}

	public void setPrepatent(Integer prepatent) {
		this.prepatent = prepatent;
	}

	public Integer getRealpatent() {
		return this.realpatent;
	}

	public void setRealpatent(Integer realpatent) {
		this.realpatent = realpatent;
	}

	public Integer getValidpatent() {
		return this.validpatent;
	}

	public void setValidpatent(Integer validpatent) {
		this.validpatent = validpatent;
	}

	public Integer getPreinvent() {
		return this.preinvent;
	}

	public void setPreinvent(Integer preinvent) {
		this.preinvent = preinvent;
	}

	public Integer getRealinvent() {
		return this.realinvent;
	}

	public void setRealinvent(Integer realinvent) {
		this.realinvent = realinvent;
	}

	public Integer getPreutility() {
		return this.preutility;
	}

	public void setPreutility(Integer preutility) {
		this.preutility = preutility;
	}

	public Integer getRealutility() {
		return this.realutility;
	}

	public void setRealutility(Integer realutility) {
		this.realutility = realutility;
	}

	public Integer getSoftcopy() {
		return this.softcopy;
	}

	public void setSoftcopy(Integer softcopy) {
		this.softcopy = softcopy;
	}

	public Integer getPrepatent3() {
		return this.prepatent3;
	}

	public void setPrepatent3(Integer prepatent3) {
		this.prepatent3 = prepatent3;
	}

	public Integer getRealpatent3() {
		return this.realpatent3;
	}

	public void setRealpatent3(Integer realpatent3) {
		this.realpatent3 = realpatent3;
	}

	public Integer getPreinvent3() {
		return this.preinvent3;
	}

	public void setPreinvent3(Integer preinvent3) {
		this.preinvent3 = preinvent3;
	}

	public Integer getRealinvent3() {
		return this.realinvent3;
	}

	public void setRealinvent3(Integer realinvent3) {
		this.realinvent3 = realinvent3;
	}

	public Integer getPreutility3() {
		return this.preutility3;
	}

	public void setPreutility3(Integer preutility3) {
		this.preutility3 = preutility3;
	}

	public Integer getRealutility3() {
		return this.realutility3;
	}

	public void setRealutility3(Integer realutility3) {
		this.realutility3 = realutility3;
	}

	public Integer getSoftcopy3() {
		return this.softcopy3;
	}

	public void setSoftcopy3(Integer softcopy3) {
		this.softcopy3 = softcopy3;
	}

	public String getKnownote() {
		return this.knownote;
	}

	public void setKnownote(String knownote) {
		this.knownote = knownote;
	}

	public Integer getPapersum() {
		return this.papersum;
	}

	public void setPapersum(Integer papersum) {
		this.papersum = papersum;
	}

	public Integer getScisum() {
		return this.scisum;
	}

	public void setScisum(Integer scisum) {
		this.scisum = scisum;
	}

	public Integer getMagsum() {
		return this.magsum;
	}

	public void setMagsum(Integer magsum) {
		this.magsum = magsum;
	}

	public Integer getPatentid() {
		return this.patentid;
	}

	public void setPatentid(Integer patentid) {
		this.patentid = patentid;
	}

	public String getManagepatent() {
		return this.managepatent;
	}

	public void setManagepatent(String managepatent) {
		this.managepatent = managepatent;
	}

}