package com.technology.module.welcome.action;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import com.website.extend.struts.action.BaseAction;

/**
 * 该java的描述信息
 * 
 * @author shiliang Tel:18661205639
 * @version 1.0
 * @since 2014-7-14 下午9:55:46
 * @category com.technology.module.welcome.action
 * @copyright
 */
@SuppressWarnings("serial")
public class WelcomeAction extends BaseAction {
	private static Logger log = Logger.getLogger(WelcomeAction.class);
	private String securityCode;
	private String username;
	private String pwd;

	public String index() throws Exception {
		return "index";
	}

	public String login() throws Exception {
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			return "logined";
		}
		String kaptchaExpected = (String) SecurityUtils
				.getSubject()
				.getSession()
				.getAttribute(
						com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		log.info("正确验证码：" + kaptchaExpected);
		log.info("输入验证码：" + securityCode);
		if (securityCode == null
				|| !securityCode.equalsIgnoreCase(kaptchaExpected)) {
			setAjax("验证码错误");
			return "index";
		}
		// 创建用户名和密码的令牌
		UsernamePasswordToken token = new UsernamePasswordToken(username, pwd);
		// 记录该令牌
		token.setRememberMe(true);
		try {
			subject.login(token);
			log.info(subject.getPrincipal() + "登录成功");
		} catch (UnknownAccountException ex) {// 用户名没有找到。
			setAjax("账号错误！登陆失败");
			log.error(ex);
			return "index";
		} catch (IncorrectCredentialsException ex) {// 用户名密码不匹配。
			log.error(ex);
			setAjax("密码错误！登陆失败");
			return "index";
		} catch (AuthenticationException e) {// 其他的登录错误
			log.error(e);
			setAjax("其它错误");
			return "index";
		}
		return "logined";
	}

	public String logout() throws Exception {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "logout";
	}

	public String main() throws Exception {
		return "main";
	}
	
	public String register()throws Exception {
		return "register";
	}
	
	public String passwordforget()throws Exception {
		return "passwordforget";
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
