package com.technology.module.user.action;

import java.util.List;

import org.apache.log4j.Logger;

import com.technology.module.user.dao.po.User;
import com.technology.module.user.serv.UserServ;
import com.website.extend.struts.action.BaseAction;

/**
 * 该java的描述信息
 * @author shiliang Tel:18661205639
 * @version 1.0
 * @since 2014-7-10 下午1:26:00
 * @category com.technology.module.user.action
 * @copyright 
 */
@SuppressWarnings("serial")
public class UserAction extends BaseAction {
	private static Logger log = Logger.getLogger(UserAction.class);
	private UserServ serv;
	private User user;
	private List<User> list;
	
	public String queryUsers(){
		list = serv.findUsers(user, (getPage() - 1) * getRows(), getRows(),
				getSort(), getOrder());
		super.data(serv.countUsers(user), list);
		log.info("[queryUsers]"+getAjax());
		return "ajax";
	}
	public UserServ getServ() {
		return serv;
	}
	public void setServ(UserServ serv) {
		this.serv = serv;
	}
	
	
}
