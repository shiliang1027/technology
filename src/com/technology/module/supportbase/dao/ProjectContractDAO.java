package com.technology.module.supportbase.dao;

// default package

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;

import com.technology.module.supportbase.dao.po.ProjectContract;

/**
 * Data access object (DAO) for domain model class ProjectContract.
 * 
 * @see .ProjectContract
 * @author MyEclipse Persistence Tools
 */

public class ProjectContractDAO implements IProjectContractDAO
{
    // property constants
    public static final String SERVICEID   = "serviceid";
    public static final String PROJECTID   = "projectid";
    public static final String VERSIONNUM  = "versionnum";
    public static final String NAME	= "name";
    public static final String YEAR	= "year";
    public static final String MONEY       = "money";
    public static final String CITYMONEY   = "citymoney";
    public static final String PROGESSID   = "progessid";
    public static final String TEMPLETPATH = "templetpath";
    public static final String WORDPATH    = "wordpath";
    public static final String PDFPATH     = "pdfpath";

    private EntityManager getEntityManager()
    {
	return EntityManagerHelper.getEntityManager();
    }

    public void save(ProjectContract transientInstance)
    {
	EntityManagerHelper.log("saving ProjectContract instance", Level.INFO, null);
	try
	{
	    getEntityManager().persist(transientInstance);
	    EntityManagerHelper.log("save successful", Level.INFO, null);
	}
	catch (RuntimeException re)
	{
	    EntityManagerHelper.log("save failed", Level.SEVERE, re);
	    throw re;
	}
    }

    public void delete(ProjectContract persistentInstance)
    {
	EntityManagerHelper.log("deleting ProjectContract instance", Level.INFO, null);
	try
	{
	    getEntityManager().remove(persistentInstance);
	    EntityManagerHelper.log("delete successful", Level.INFO, null);
	}
	catch (RuntimeException re)
	{
	    EntityManagerHelper.log("delete failed", Level.SEVERE, re);
	    throw re;
	}
    }

    public ProjectContract update(ProjectContract detachedInstance)
    {
	EntityManagerHelper.log("updating ProjectContract instance", Level.INFO, null);
	try
	{
	    ProjectContract result = getEntityManager().merge(detachedInstance);
	    EntityManagerHelper.log("update successful", Level.INFO, null);
	    return result;
	}
	catch (RuntimeException re)
	{
	    EntityManagerHelper.log("update failed", Level.SEVERE, re);
	    throw re;
	}
    }

    public ProjectContract findById(Integer id)
    {
	EntityManagerHelper.log("finding ProjectContract instance with id: " + id, Level.INFO, null);
	try
	{
	    ProjectContract instance = getEntityManager().find(ProjectContract.class, id);
	    return instance;
	}
	catch (RuntimeException re)
	{
	    EntityManagerHelper.log("find failed", Level.SEVERE, re);
	    throw re;
	}
    }

    @SuppressWarnings("unchecked")
    public List<ProjectContract> findByProperty(String propertyName, Object value)
    {
	EntityManagerHelper.log("finding ProjectContract instance with property: " + propertyName + ", value: " + value, Level.INFO, null);
	try
	{
	    String queryString = "select model from ProjectContract model where model." + propertyName + "= :propertyValue";
	    return getEntityManager().createQuery(queryString).setParameter("propertyValue", value).getResultList();
	}
	catch (RuntimeException re)
	{
	    EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
	    ;
	    throw re;
	}
    }

    public List<ProjectContract> findByServiceid(Object serviceid)
    {
	return findByProperty(SERVICEID, serviceid);
    }

    public List<ProjectContract> findByProjectid(Object projectid)
    {
	return findByProperty(PROJECTID, projectid);
    }

    public List<ProjectContract> findByVersionnum(Object versionnum)
    {
	return findByProperty(VERSIONNUM, versionnum);
    }

    public List<ProjectContract> findByName(Object name)
    {
	return findByProperty(NAME, name);
    }

    public List<ProjectContract> findByYear(Object year)
    {
	return findByProperty(YEAR, year);
    }

    public List<ProjectContract> findByMoney(Object money)
    {
	return findByProperty(MONEY, money);
    }

    public List<ProjectContract> findByCitymoney(Object citymoney)
    {
	return findByProperty(CITYMONEY, citymoney);
    }

    public List<ProjectContract> findByProgessid(Object progessid)
    {
	return findByProperty(PROGESSID, progessid);
    }

    public List<ProjectContract> findByTempletpath(Object templetpath)
    {
	return findByProperty(TEMPLETPATH, templetpath);
    }

    public List<ProjectContract> findByWordpath(Object wordpath)
    {
	return findByProperty(WORDPATH, wordpath);
    }

    public List<ProjectContract> findByPdfpath(Object pdfpath)
    {
	return findByProperty(PDFPATH, pdfpath);
    }

    @SuppressWarnings("unchecked")
    public List<ProjectContract> findAll()
    {
	EntityManagerHelper.log("finding all ProjectContract instances", Level.INFO, null);
	try
	{
	    String queryString = "select model from ProjectContract model";
	    return getEntityManager().createQuery(queryString).getResultList();
	}
	catch (RuntimeException re)
	{
	    EntityManagerHelper.log("find all failed", Level.SEVERE, re);
	    ;
	    throw re;
	}
    }

}