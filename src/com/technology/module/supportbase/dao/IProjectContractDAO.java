package com.technology.module.supportbase.dao;
// default package


import java.util.Date;
import java.util.List;

import com.technology.module.supportbase.dao.po.ProjectContract;

/**
 * Interface for ProjectContractDAO.
 * @author MyEclipse Persistence Tools
 */

public interface IProjectContractDAO {
    public void save(ProjectContract transientInstance);
    public void delete(ProjectContract persistentInstance);
	public ProjectContract update(ProjectContract detachedInstance);
	public ProjectContract findById( Integer id);
	public List<ProjectContract> findByProperty(String propertyName, Object value);
	public List<ProjectContract> findByServiceid(Object serviceid);
	public List<ProjectContract> findByProjectid(Object projectid);
	public List<ProjectContract> findByVersionnum(Object versionnum);
	public List<ProjectContract> findByName(Object name);
	public List<ProjectContract> findByYear(Object year);
	public List<ProjectContract> findByMoney(Object money);
	public List<ProjectContract> findByCitymoney(Object citymoney);
	public List<ProjectContract> findByProgessid(Object progessid);
	public List<ProjectContract> findByTempletpath(Object templetpath);
	public List<ProjectContract> findByWordpath(Object wordpath);
	public List<ProjectContract> findByPdfpath(Object pdfpath);
	public List<ProjectContract> findAll();
}