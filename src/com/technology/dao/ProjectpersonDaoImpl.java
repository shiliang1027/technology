package com.technology.dao;

import java.util.List;

import org.apache.log4j.Logger;

import com.system.config.dao.BaseDao;
import com.technology.po.Projectperson;

public class ProjectpersonDaoImpl extends BaseDao implements ProjectpersonDao
{

    private Logger log = Logger.getLogger(ProjectpersonDaoImpl.class);

    public List findAll()
    {
	return this.getHibernateTemplate().find(" from projectperson");
    }

    public boolean save(Projectperson s)
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

    public boolean update(Projectperson s)
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
