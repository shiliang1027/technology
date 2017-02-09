package com.technology.module.supportbase.serv;

import com.technology.module.supportbase.dao.SuppoortbaseDaoImpl;
import com.technology.module.supportbase.dao.po.Suppoortbase;

public class SuppoortbaseServImpl implements SuppoortbaseServ
{

    private SuppoortbaseDaoImpl suppoortbaseDAO;

    public SuppoortbaseDaoImpl getSuppoortbaseDAO()
    {
	return suppoortbaseDAO;
    }

    public void setSuppoortbaseDAO(SuppoortbaseDaoImpl suppoortbaseDAO)
    {
	this.suppoortbaseDAO = suppoortbaseDAO;
    }

    @Override
    public Suppoortbase findById(Integer id)
    {
	return suppoortbaseDAO.findById(id);
    }

    @Override
    public boolean save(Suppoortbase suppoortbase)
    {
	try
	{
	    suppoortbaseDAO.save(suppoortbase);

	}
	catch (Exception e)
	{
	    return false;
	}

	return true;
    }

    @Override
    public boolean update(Suppoortbase suppoortbase)
    {
	if (null != suppoortbaseDAO.update(suppoortbase))
	{
	    return true;
	}

	return false;
    }

}
