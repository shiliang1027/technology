package com.activiti.demo.dao;

import java.util.List;

import com.activiti.demo.dao.po.User;

/**
 * 该java的描述信息
 * @author shiliang Tel:18661205639
 * @version 1.0
 * @since 2014-7-9 上午9:48:13
 * @category com.activiti.demo.dao
 * @copyright 
 */
public interface ActivitiDemoDAO {

	public abstract List<User> findUsers(User user, Integer startIndex, Integer endIndex,
			String sort, String order);

	public abstract int countUsers(User user);

}
