package com.technology.dao;

import java.util.List;

import org.apache.log4j.Logger;

import com.system.config.dao.BaseDao;
import com.technology.po.Supportbase;

public class SupportbaseDaoImpl extends BaseDao implements ISupportbaseDao
{
    private Logger log = Logger.getLogger(SupportbaseDaoImpl.class);

    public boolean save(Supportbase s)
    {
	boolean result = false;

	try
	{
	    this.getHibernateTemplate().save(s);

	    result = true;
	}
	catch (Exception e)
	{
	    log.error("SupportbaseDaoImpl.save error", e);
	}
	return result;
    }

    public List findAll()
    {
	return this.getHibernateTemplate().find(" from supportbase");
    }

    /**
     * 
     * @description
     * 
     * @author libo
     * @date Jul 19, 2014
     * @version 1.0.0
     * @param s
     * @return
     */
    public boolean update(Supportbase s)
    {
	boolean result = false;

	try
	{
	    this.getHibernateTemplate().update(s);

	    result = true;
	}
	catch (Exception e)
	{
	    log.error("SupportbaseDaoImpl.update error", e);
	}
	return result;

    }
}