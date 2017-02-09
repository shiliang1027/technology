package com.technology.serv;

import java.util.List;

import com.technology.dao.ISupportbaseDao;
import com.technology.po.Supportbase;

public class SupportbaseServImpl implements SupportbaseServ
{

    private ISupportbaseDao supportbaseDao;

    public boolean save(Supportbase supportbase)
    {
	try
	{
	    supportbaseDao.save(supportbase);

	}
	catch (Exception e)
	{
	    return false;
	}

	return true;
    }

    public boolean update(Supportbase suppoortbase)
    {
	if (supportbaseDao.update(suppoortbase))
	{
	    return true;
	}

	return false;
    }

    public ISupportbaseDao getSupportbaseDao()
    {
	return supportbaseDao;
    }

    public void setSupportbaseDao(ISupportbaseDao supportbaseDao)
    {
	this.supportbaseDao = supportbaseDao;
    }

    public List findAll()
    {
	return supportbaseDao.findAll();
    }

}
