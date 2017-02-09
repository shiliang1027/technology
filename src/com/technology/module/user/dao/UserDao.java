package com.technology.module.user.dao;

import java.util.List;

import com.technology.module.user.dao.po.User;


/**
 * 该java的描述信息
 * @author shiliang Tel:18661205639
 * @version 1.0
 * @since 2014-7-10 下午1:26:28
 * @category com.technology.module.user.dao
 * @copyright 
 */
public interface UserDao {

	List<User> findUsers(User user, Integer start, Integer end, String sort,
			String order);

	int countUsers(User user);

}
