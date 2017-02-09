package com.technology.serv;

import java.util.List;

import com.technology.dao.IProjectunitDao;
import com.technology.po.Projectunit;

public class ProjectunitServImpl implements ProjectunitServ
{

    private IProjectunitDao projectunitDao;

    public List findAll()
    {
	return projectunitDao.findAll();
    }

    public boolean save(Projectunit s)
    {
	return projectunitDao.save(s);
    }

    public boolean update(Projectunit s)
    {
	return projectunitDao.update(s);
    }

    public IProjectunitDao getProjectunitDao()
    {
	return projectunitDao;
    }

    public void setProjectunitDao(IProjectunitDao projectunitDao)
    {
	this.projectunitDao = projectunitDao;
    }

}
