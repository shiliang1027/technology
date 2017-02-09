package com.technology.module.user.dao;

import java.util.List;

import com.system.config.dao.JPABaseDao;
import com.technology.module.user.dao.po.User;

/**
 * 该java的描述信息
 * @author shiliang Tel:18661205639
 * @version 1.0
 * @since 2014-7-10 下午1:26:50
 * @category com.technology.module.user.dao
 * @copyright 
 */
public class UserDaoImpl extends JPABaseDao implements UserDao {
	private String sqlPre = UserDaoImpl.class.getName();
	@Override
	public List<User> findUsers(User user, Integer start, Integer end,
			String sort, String order) {
		return getSqlSession().selectList(sqlPre+".queryUsers",user);
	}

	@Override
	public int countUsers(User user) {
		return Integer.parseInt(String.valueOf(getSqlSession()
				.selectOne(sqlPre + ".countUsers",user)));
	}

}
