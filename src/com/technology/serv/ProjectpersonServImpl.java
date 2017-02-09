package com.technology.serv;

import java.util.List;

import com.technology.dao.ProjectpersonDao;
import com.technology.po.Projectperson;

public class ProjectpersonServImpl implements ProjectpersonServ
{

    private ProjectpersonDao projectpersonDao;

    public List findAll()
    {
	return projectpersonDao.findAll();
    }

    public boolean save(Projectperson s)
    {
	return projectpersonDao.save(s);
    }

    public boolean update(Projectperson s)
    {
	return projectpersonDao.update(s);
    }

    public ProjectpersonDao getProjectpersonDao()
    {
	return projectpersonDao;
    }

    public void setProjectpersonDao(ProjectpersonDao projectpersonDao)
    {
	this.projectpersonDao = projectpersonDao;
    }
}
