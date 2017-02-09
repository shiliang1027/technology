package com.activiti.demo.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.activiti.demo.dao.po.User;
import com.system.config.dao.BaseDao;

/**
 * 该java的描述信息
 * 
 * @author shiliang Tel:18661205639
 * @version 1.0
 * @since 2014-7-9 上午9:48:46
 * @category com.activiti.demo.dao
 * @copyright
 */
public class ActivitiDemoDAOImpl extends BaseDao implements ActivitiDemoDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findUsers(User user, Integer startIndex,
			Integer endIndex, String sort, String order) {
		List<User> list = this.getHibernateTemplate().findByCriteria(
				getDetachedCriteria(user).addOrder(
						order.equals("asc") ? Order.asc(sort) : Order
								.desc(sort)), startIndex, endIndex);
		return list;
	}

	@Override
	public int countUsers(User user) {
		return (Integer) this
				.getHibernateTemplate()
				.findByCriteria(
						getDetachedCriteria(user).setProjection(
								Projections.rowCount())).get(0);
	}

	private DetachedCriteria getDetachedCriteria(User user) {
		DetachedCriteria detachedCriteria = DetachedCriteria
				.forClass(User.class);
		if (user != null && user.getCode() != null
				&& !"".equals(user.getCode())) {
			detachedCriteria.add(Restrictions.like("code", user.getCode(),
					MatchMode.ANYWHERE));
		}
		return detachedCriteria;
	}

}
