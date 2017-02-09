package com.activiti.demo.serv;

import java.util.List;

import org.apache.log4j.Logger;

import com.activiti.demo.dao.ActivitiDemoDAO;
import com.activiti.demo.dao.po.User;

/**
 * 该java的描述信息
 * 
 * @author shiliang Tel:18661205639
 * @version 1.0
 * @since 2014-7-9 上午9:49:30
 * @category com.activiti.demo.serv
 * @copyright
 */
public class ActivitiDemoServImpl implements ActivitiDemoServ {

	private static Logger log = Logger.getLogger(ActivitiDemoServImpl.class);

	private ActivitiDemoDAO dao;

	public ActivitiDemoDAO getDao() {
		return dao;
	}

	public void setDao(ActivitiDemoDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<User> findUsers(User user, Integer startIndex,
			Integer endIndex, String sort, String order) {
		log.info("[findUsers]");
		return dao.findUsers(user,startIndex,endIndex,sort,order);
	}

	@Override
	public int countUsers(User user) {
		return dao.countUsers(user);
	}

}
