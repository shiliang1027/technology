package com.technology.po;

import java.util.Date;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer unitid;
	private Integer role;
	private String project;
	private String account;
	private String password;
	private String name;
	private String ename;
	private Integer sex;
	private Integer nation;
	private Date birthday;
	private String fixphone;
	private String homephone;
	private String mobile;
	private String email;
	private String zcode;
	private String fax;
	private String url;
	private String workaddress;
	private String homeaddress;
	private Integer paperkind;
	private String papercode;
	private String department;
	private String job;
	private Integer rank;
	private Integer unirank;
	private Integer record;
	private Integer degree;
	private String degreeyear;
	private String gradute;
	private String lastgradute;
	private String major;
	private String nowmajor;
	private Integer ismasterm;
	private Integer isdoctorm;
	private Integer isacade;
	private String works;
	private String score;
	private Integer province;
	private Integer city;
	private Integer allowance;
	private Integer ekind;
	private Integer bregion;
	private Integer mregion;
	private Integer sregion;
	private String bank;
	private String bankname;
	private String bankaccount;
	private Integer bprovince;
	private Integer bcity;
	private String bbranch;
	private String research;
	private String award;
	private String review;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Integer unitid, Integer role, String account) {
		this.unitid = unitid;
		this.role = role;
		this.account = account;
	}

	/** full constructor */
	public User(Integer unitid, Integer role, String project, String account,
			String password, String name, String ename, Integer sex,
			Integer nation, Date birthday, String fixphone, String homephone,
			String mobile, String email, String zcode, String fax, String url,
			String workaddress, String homeaddress, Integer paperkind,
			String papercode, String department, String job, Integer rank,
			Integer unirank, Integer record, Integer degree, String degreeyear,
			String gradute, String lastgradute, String major, String nowmajor,
			Integer ismasterm, Integer isdoctorm, Integer isacade,
			String works, String score, Integer province, Integer city,
			Integer allowance, Integer ekind, Integer bregion, Integer mregion,
			Integer sregion, String bank, String bankname, String bankaccount,
			Integer bprovince, Integer bcity, String bbranch, String research,
			String award, String review) {
		this.unitid = unitid;
		this.role = role;
		this.project = project;
		this.account = account;
		this.password = password;
		this.name = name;
		this.ename = ename;
		this.sex = sex;
		this.nation = nation;
		this.birthday = birthday;
		this.fixphone = fixphone;
		this.homephone = homephone;
		this.mobile = mobile;
		this.email = email;
		this.zcode = zcode;
		this.fax = fax;
		this.url = url;
		this.workaddress = workaddress;
		this.homeaddress = homeaddress;
		this.paperkind = paperkind;
		this.papercode = papercode;
		this.department = department;
		this.job = job;
		this.rank = rank;
		this.unirank = unirank;
		this.record = record;
		this.degree = degree;
		this.degreeyear = degreeyear;
		this.gradute = gradute;
		this.lastgradute = lastgradute;
		this.major = major;
		this.nowmajor = nowmajor;
		this.ismasterm = ismasterm;
		this.isdoctorm = isdoctorm;
		this.isacade = isacade;
		this.works = works;
		this.score = score;
		this.province = province;
		this.city = city;
		this.allowance = allowance;
		this.ekind = ekind;
		this.bregion = bregion;
		this.mregion = mregion;
		this.sregion = sregion;
		this.bank = bank;
		this.bankname = bankname;
		this.bankaccount = bankaccount;
		this.bprovince = bprovince;
		this.bcity = bcity;
		this.bbranch = bbranch;
		this.research = research;
		this.award = award;
		this.review = review;
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

	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getNation() {
		return this.nation;
	}

	public void setNation(Integer nation) {
		this.nation = nation;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getFixphone() {
		return this.fixphone;
	}

	public void setFixphone(String fixphone) {
		this.fixphone = fixphone;
	}

	public String getHomephone() {
		return this.homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZcode() {
		return this.zcode;
	}

	public void setZcode(String zcode) {
		this.zcode = zcode;
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

	public String getWorkaddress() {
		return this.workaddress;
	}

	public void setWorkaddress(String workaddress) {
		this.workaddress = workaddress;
	}

	public String getHomeaddress() {
		return this.homeaddress;
	}

	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}

	public Integer getPaperkind() {
		return this.paperkind;
	}

	public void setPaperkind(Integer paperkind) {
		this.paperkind = paperkind;
	}

	public String getPapercode() {
		return this.papercode;
	}

	public void setPapercode(String papercode) {
		this.papercode = papercode;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getUnirank() {
		return this.unirank;
	}

	public void setUnirank(Integer unirank) {
		this.unirank = unirank;
	}

	public Integer getRecord() {
		return this.record;
	}

	public void setRecord(Integer record) {
		this.record = record;
	}

	public Integer getDegree() {
		return this.degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	public String getDegreeyear() {
		return this.degreeyear;
	}

	public void setDegreeyear(String degreeyear) {
		this.degreeyear = degreeyear;
	}

	public String getGradute() {
		return this.gradute;
	}

	public void setGradute(String gradute) {
		this.gradute = gradute;
	}

	public String getLastgradute() {
		return this.lastgradute;
	}

	public void setLastgradute(String lastgradute) {
		this.lastgradute = lastgradute;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getNowmajor() {
		return this.nowmajor;
	}

	public void setNowmajor(String nowmajor) {
		this.nowmajor = nowmajor;
	}

	public Integer getIsmasterm() {
		return this.ismasterm;
	}

	public void setIsmasterm(Integer ismasterm) {
		this.ismasterm = ismasterm;
	}

	public Integer getIsdoctorm() {
		return this.isdoctorm;
	}

	public void setIsdoctorm(Integer isdoctorm) {
		this.isdoctorm = isdoctorm;
	}

	public Integer getIsacade() {
		return this.isacade;
	}

	public void setIsacade(Integer isacade) {
		this.isacade = isacade;
	}

	public String getWorks() {
		return this.works;
	}

	public void setWorks(String works) {
		this.works = works;
	}

	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Integer getProvince() {
		return this.province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public Integer getCity() {
		return this.city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getAllowance() {
		return this.allowance;
	}

	public void setAllowance(Integer allowance) {
		this.allowance = allowance;
	}

	public Integer getEkind() {
		return this.ekind;
	}

	public void setEkind(Integer ekind) {
		this.ekind = ekind;
	}

	public Integer getBregion() {
		return this.bregion;
	}

	public void setBregion(Integer bregion) {
		this.bregion = bregion;
	}

	public Integer getMregion() {
		return this.mregion;
	}

	public void setMregion(Integer mregion) {
		this.mregion = mregion;
	}

	public Integer getSregion() {
		return this.sregion;
	}

	public void setSregion(Integer sregion) {
		this.sregion = sregion;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
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

	public Integer getBprovince() {
		return this.bprovince;
	}

	public void setBprovince(Integer bprovince) {
		this.bprovince = bprovince;
	}

	public Integer getBcity() {
		return this.bcity;
	}

	public void setBcity(Integer bcity) {
		this.bcity = bcity;
	}

	public String getBbranch() {
		return this.bbranch;
	}

	public void setBbranch(String bbranch) {
		this.bbranch = bbranch;
	}

	public String getResearch() {
		return this.research;
	}

	public void setResearch(String research) {
		this.research = research;
	}

	public String getAward() {
		return this.award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public String getReview() {
		return this.review;
	}

	public void setReview(String review) {
		this.review = review;
	}

}