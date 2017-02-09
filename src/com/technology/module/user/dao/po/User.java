package com.technology.module.user.dao.po;

// Generated 2014-3-24 10:22:30 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import com.system.config.dao.po.Entity;

/**
 * User generated by hbm2java
 */
@SuppressWarnings("serial")
public class User extends Entity {

	private Integer kind;
	private Integer state;
	private Integer channel;
	private Integer system;
	private String userid;
	private String code;
	private String oldpwd;
	private String pwd;
	private String secretmobile;
	private String name;
	private String nickname;
	private String mobile;
	private String email;
	private String tinyqq;
	private String qq;
	private String weibo;
	private String renren;
	private Date createtime;
	private Date logintime;
	private String loginip;
	private Integer property;
	private Integer today;
	private Integer daymax;
	private Integer isreceive;
	private Integer isad;
	private String validcode;
	private Integer isvalid;

	public User() {
	}

	public User(String code) {
		this.code = code;
	}

	public User(Integer kind, Integer state, Integer channel, Integer system,
			String userid, String code, String pwd, String secretmobile,
			String name, String nickname, String mobile, String email,
			String tinyqq, String qq, String weibo, String renren,
			Date createtime, Date logintime, String loginip, Integer property,
			Integer today, Integer daymax, Integer isreceive, Integer isad) {
		this.kind = kind;
		this.state = state;
		this.channel = channel;
		this.system = system;
		this.userid = userid;
		this.code = code;
		this.pwd = pwd;
		this.secretmobile = secretmobile;
		this.name = name;
		this.nickname = nickname;
		this.mobile = mobile;
		this.email = email;
		this.tinyqq = tinyqq;
		this.qq = qq;
		this.weibo = weibo;
		this.renren = renren;
		this.createtime = createtime;
		this.logintime = logintime;
		this.loginip = loginip;
		this.property = property;
		this.today = today;
		this.daymax = daymax;
		this.isreceive = isreceive;
		this.isad = isad;
	}

	public Integer getKind() {
		return this.kind;
	}

	public void setKind(Integer kind) {
		this.kind = kind;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getChannel() {
		return this.channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}

	public Integer getSystem() {
		return this.system;
	}

	public void setSystem(Integer system) {
		this.system = system;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOldpwd() {
		return oldpwd;
	}

	public void setOldpwd(String oldpwd) {
		this.oldpwd = oldpwd;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSecretmobile() {
		return this.secretmobile;
	}

	public void setSecretmobile(String secretmobile) {
		this.secretmobile = secretmobile;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public String getTinyqq() {
		return this.tinyqq;
	}

	public void setTinyqq(String tinyqq) {
		this.tinyqq = tinyqq;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWeibo() {
		return this.weibo;
	}

	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}

	public String getRenren() {
		return this.renren;
	}

	public void setRenren(String renren) {
		this.renren = renren;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getLogintime() {
		return this.logintime;
	}

	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}

	public String getLoginip() {
		return this.loginip;
	}

	public void setLoginip(String loginip) {
		this.loginip = loginip;
	}

	public Integer getProperty() {
		return this.property;
	}

	public void setProperty(Integer property) {
		this.property = property;
	}

	public Integer getToday() {
		return this.today;
	}

	public void setToday(Integer today) {
		this.today = today;
	}

	public Integer getDaymax() {
		return this.daymax;
	}

	public void setDaymax(Integer daymax) {
		this.daymax = daymax;
	}

	public Integer getIsreceive() {
		return this.isreceive;
	}

	public void setIsreceive(Integer isreceive) {
		this.isreceive = isreceive;
	}

	public Integer getIsad() {
		return this.isad;
	}

	public void setIsad(Integer isad) {
		this.isad = isad;
	}

	public String getValidcode() {
		return validcode;
	}

	public void setValidcode(String validcode) {
		this.validcode = validcode;
	}

	public Integer getIsvalid() {
		return isvalid;
	}

	public void setIsvalid(Integer isvalid) {
		this.isvalid = isvalid;
	}

}
