package com.technology.module.user.serv;

import java.util.List;

import com.technology.module.user.dao.UserDao;
import com.technology.module.user.dao.po.User;

/**
 * 该java的描述信息
 * @author shiliang Tel:18661205639
 * @version 1.0
 * @since 2014-7-10 下午1:28:46
 * @category com.technology.module.user.serv
 * @copyright 
 */
public class UserServImpl implements UserServ {

	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public List<User> findUsers(User user, Integer start, Integer end,
			String sort, String order) {
		return dao.findUsers(user,start,end,sort,order);
	}

	@Override
	public int countUsers(User user) {
		return dao.countUsers(user);
	}
	
	
}
