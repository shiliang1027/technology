package com.technology.module.supportbase.dao;

// default package

import java.util.List;
import java.util.logging.Level;

import javax.persistence.EntityManager;

import com.system.config.dao.JPABaseDao;
import com.technology.module.supportbase.dao.po.Suppoortbase;
import com.technology.module.user.dao.UserDaoImpl;

/**
 * Data access object (DAO) for domain model class Suppoortbase.
 * 
 * @see .Suppoortbase
 * @author MyEclipse Persistence Tools
 */

public class SuppoortbaseDaoImpl extends JPABaseDao implements SuppoortbaseDao
{
    // property constants
    public static final String SERVICEID   = "serviceid";
    public static final String TYPE	= "type";
    public static final String KIND	= "kind";
    public static final String RANK	= "rank";
    public static final String SECRET      = "secret";
    public static final String ACTIVITY    = "activity";
    public static final String INVOATE     = "invoate";
    public static final String REGION      = "region";
    public static final String TECHREGION  = "techregion";
    public static final String YEAR	= "year";
    public static final String NAME	= "name";
    public static final String VERSIONNUM  = "versionnum";
    public static final String ACCEPTNUM   = "acceptnum";
    public static final String PROJECTNUM  = "projectnum";
    public static final String FILENUM     = "filenum";
    public static final String SEQ	 = "seq";
    public static final String PROGESSID   = "progessid";
    public static final String ISOVER      = "isover";
    public static final String ISBUILD     = "isbuild";
    public static final String LEADID      = "leadid";
    public static final String SOURCE      = "source";
    public static final String CREATIVE    = "creative";
    public static final String ADVANCE     = "advance";
    public static final String PERIOD      = "period";
    public static final String ALINVEST    = "alinvest";
    public static final String PREINVEST   = "preinvest";
    public static final String ALUTILITY   = "alutility";
    public static final String PREUTILITY  = "preutility";
    public static final String ALSTYLE     = "alstyle";
    public static final String PRESTYLE    = "prestyle";
    public static final String OUTINVEST   = "outinvest";
    public static final String NEWARTS     = "newarts";
    public static final String NEWPRODUCT  = "newproduct";
    public static final String NEWEQUIP    = "newequip";
    public static final String SOFT	= "soft";
    public static final String PAPER       = "paper";
    public static final String STANDARD    = "standard";
    public static final String OTHER1      = "other1";
    public static final String OTHER2      = "other2";
    public static final String ADVANTAGE   = "advantage";
    public static final String HARVEST     = "harvest";
    public static final String ISPDF       = "ispdf";
    public static final String GOAL	= "goal";
    public static final String BASE	= "base";
    public static final String PURPOSE     = "purpose";
    public static final String CONTENT     = "content";
    public static final String STAGEGOAL   = "stagegoal";
    public static final String TECHGOAL    = "techgoal";
    public static final String BENGOAL     = "bengoal";
    public static final String WORKGOAL    = "workgoal";
    public static final String PREVIEW     = "preview";
    public static final String ENVIRONMENT = "environment";
    public static final String OTHERNOTE   = "othernote";
    public static final String FUNDNOTE    = "fundnote";
    public static final String TEMPLETPATH = "templetpath";
    public static final String WORDPATH    = "wordpath";
    public static final String PDFPATH     = "pdfpath";
    public static final String REPORTPATH  = "reportpath";


    private String sqlPre = SuppoortbaseDaoImpl.class.getName();

    /**
     * 
     * @description
     * 
     * @author libo
     * @date Jul 16, 2014
     * @version 1.0.0
     * @param transientInstance
     */
    public void save(Suppoortbase transientInstance)
    {
	try
	{
	    getSqlSession().insert(sqlPre + ".saveSuppoortbase", transientInstance);
	}
	catch (RuntimeException re)
	{
	    EntityManagerHelper.log("save failed", Level.SEVERE, re);
	    throw re;
	}
    }

    @Override
    public void delete(Suppoortbase persistentInstance)
    {
	// TODO Auto-generated method stub
	
    }

    @Override
    public List<Suppoortbase> findAll()
    {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Suppoortbase findById(Integer id)
    {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Suppoortbase update(Suppoortbase detachedInstance)
    {
	// TODO Auto-generated method stub
	return null;
    }


}