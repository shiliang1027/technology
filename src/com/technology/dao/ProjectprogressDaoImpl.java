package com.technology.dao;

import java.util.List;

import org.apache.log4j.Logger;

import com.system.config.dao.BaseDao;
import com.technology.po.Projectprogress;

/**
 * @description 项目进度表DAO 
 * 
 * @author libo
 * @date Jul 19, 2014
 * @version 1.0.0
 * @since 1.0
 */
public class ProjectprogressDaoImpl extends BaseDao implements ProjectprogressDao
{
    private Logger log = Logger.getLogger(ProjectprogressDaoImpl.class);

    public List findAll()
    {
	return this.getHibernateTemplate().find(" from Projectprogress ");
    }

    public boolean save(Projectprogress s)
    {
	boolean result = false;

	try
	{
	    this.getHibernateTemplate().save(s);

	    result = true;
	}
	catch (Exception e)
	{
	    log.error("ProjectprogressDaoImpl.save error", e);
	}
	return result;
    }

    public boolean update(Projectprogress s)
    {
	boolean result = false;

	try
	{
	    this.getHibernateTemplate().update(s);

	    result = true;
	}
	catch (Exception e)
	{
	    log.error("ProjectprogressDaoImpl.save error", e);
	}
	return result;
    }

}
