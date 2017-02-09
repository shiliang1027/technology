package com.technology.dao;

import java.util.List;

import org.apache.log4j.Logger;

import com.system.config.dao.BaseDao;
import com.technology.po.Projectunit;

public class ProjectunitDaoImpl extends BaseDao implements IProjectunitDao
{
    private Logger log = Logger.getLogger(ProjectunitDaoImpl.class);

    public List findAll()
    {
	return this.getHibernateTemplate().find(" from Projectunit");
    }

    public boolean save(Projectunit s)
    {
	boolean result = false;

	try
	{
	    this.getHibernateTemplate().save(s);

	    result = true;
	}
	catch (Exception e)
	{
	    log.error("ProjectunitDaoImpl.save error", e);
	}
	return result;
    }

    public boolean update(Projectunit s)
    {
	boolean result = false;

	try
	{
	    this.getHibernateTemplate().update(s);

	    result = true;
	}
	catch (Exception e)
	{
	    log.error("ProjectunitDaoImpl.save error", e);
	}
	return result;
    }

}
