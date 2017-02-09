package com.technology.po;

import java.util.Date;

/**
 * Unitbase entity. @author MyEclipse Persistence Tools
 */

public class Unitbase implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer type;
	private Integer manageid;
	private String name;
	private Integer state;
	private String mcode;
	private String ccode;
	private Integer character1;
	private Float capital;
	private Integer coin;
	private Date registerdate;
	private String address;
	private Integer industry;
	private String province;
	private String city;
	private String zerocode;
	private String upunit;
	private String fixphone;
	private String fax;
	private String url;
	private String feature;
	private String identify;
	private String note;
	private Integer isregister;
	private String basename;
	private Integer isdoctor;
	private Integer doctornum;
	private String bank;
	private String credit;
	private String bankname;
	private String bankaccount;
	private Integer ukind;

	// Constructors

	/** default constructor */
	public Unitbase() {
	}

	/** full constructor */
	public Unitbase(Integer type, Integer manageid, String name, Integer state,
			String mcode, String ccode, Integer character1, Float capital,
			Integer coin, Date registerdate, String address, Integer industry,
			String province, String city, String zerocode, String upunit,
			String fixphone, String fax, String url, String feature,
			String identify, String note, Integer isregister, String basename,
			Integer isdoctor, Integer doctornum, String bank, String credit,
			String bankname, String bankaccount, Integer ukind) {
		this.type = type;
		this.manageid = manageid;
		this.name = name;
		this.state = state;
		this.mcode = mcode;
		this.ccode = ccode;
		this.character1 = character1;
		this.capital = capital;
		this.coin = coin;
		this.registerdate = registerdate;
		this.address = address;
		this.industry = industry;
		this.province = province;
		this.city = city;
		this.zerocode = zerocode;
		this.upunit = upunit;
		this.fixphone = fixphone;
		this.fax = fax;
		this.url = url;
		this.feature = feature;
		this.identify = identify;
		this.note = note;
		this.isregister = isregister;
		this.basename = basename;
		this.isdoctor = isdoctor;
		this.doctornum = doctornum;
		this.bank = bank;
		this.credit = credit;
		this.bankname = bankname;
		this.bankaccount = bankaccount;
		this.ukind = ukind;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getManageid() {
		return this.manageid;
	}

	public void setManageid(Integer manageid) {
		this.manageid = manageid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getMcode() {
		return this.mcode;
	}

	public void setMcode(String mcode) {
		this.mcode = mcode;
	}

	public String getCcode() {
		return this.ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public Integer getCharacter1() {
		return this.character1;
	}

	public void setCharacter1(Integer character1) {
		this.character1 = character1;
	}

	public Float getCapital() {
		return this.capital;
	}

	public void setCapital(Float capital) {
		this.capital = capital;
	}

	public Integer getCoin() {
		return this.coin;
	}

	public void setCoin(Integer coin) {
		this.coin = coin;
	}

	public Date getRegisterdate() {
		return this.registerdate;
	}

	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getIndustry() {
		return this.industry;
	}

	public void setIndustry(Integer industry) {
		this.industry = industry;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZerocode() {
		return this.zerocode;
	}

	public void setZerocode(String zerocode) {
		this.zerocode = zerocode;
	}

	public String getUpunit() {
		return this.upunit;
	}

	public void setUpunit(String upunit) {
		this.upunit = upunit;
	}

	public String getFixphone() {
		return this.fixphone;
	}

	public void setFixphone(String fixphone) {
		this.fixphone = fixphone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFeature() {
		return this.feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getIdentify() {
		return this.identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getIsregister() {
		return this.isregister;
	}

	public void setIsregister(Integer isregister) {
		this.isregister = isregister;
	}

	public String getBasename() {
		return this.basename;
	}

	public void setBasename(String basename) {
		this.basename = basename;
	}

	public Integer getIsdoctor() {
		return this.isdoctor;
	}

	public void setIsdoctor(Integer isdoctor) {
		this.isdoctor = isdoctor;
	}

	public Integer getDoctornum() {
		return this.doctornum;
	}

	public void setDoctornum(Integer doctornum) {
		this.doctornum = doctornum;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCredit() {
		return this.credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getBankname() {
		return this.bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBankaccount() {
		return this.bankaccount;
	}

	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
	}

	public Integer getUkind() {
		return this.ukind;
	}

	public void setUkind(Integer ukind) {
		this.ukind = ukind;
	}

}