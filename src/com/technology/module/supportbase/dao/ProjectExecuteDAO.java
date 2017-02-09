package com.technology.module.supportbase.dao;
// default package


import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;

import com.technology.module.supportbase.dao.po.ProjectExecute;

/**
 * Data access object (DAO) for domain model class ProjectExecute.
 * @see .ProjectExecute
  * @author MyEclipse Persistence Tools 
 */

public class ProjectExecuteDAO  implements IProjectExecuteDAO{
	//property constants
	public static final String SERVICEID = "serviceid";
	public static final String PROJECTID = "projectid";
	public static final String YEAR = "year";
	public static final String CODE = "code";
	public static final String WORKID = "workid";
	public static final String ERROR = "error";
	public static final String PROGESSID = "progessid";
	public static final String TEMPLETPATH = "templetpath";
	public static final String WORDPATH = "wordpath";
	public static final String PDFPATH = "pdfpath";
	public static final String OUTPUT = "output";
	public static final String GAIN = "gain";
	public static final String TAX = "tax";
	public static final String ERICS = "erics";
	public static final String COALS = "coals";
	public static final String WATERS = "waters";
	public static final String JOBS = "jobs";
	public static final String DOCTORS = "doctors";
	public static final String MASTERS = "masters";
	public static final String MEDIUMS = "mediums";
	public static final String HIGHS = "highs";
	public static final String INVENTS = "invents";
	public static final String AUTHORIZES = "authorizes";
	public static final String STANDS = "stands";
	public static final String PAPERS = "papers";
	public static final String BOOKS = "books";
	public static final String AWARDS = "awards";
	public static final String COPYRIGHTS = "copyrights";
	public static final String PRODUCTS = "products";
	public static final String EQUIPS = "equips";
	public static final String TECHS = "techs";
	public static final String GROUNDS = "grounds";
	public static final String MATERIALS = "materials";
	public static final String TYPES = "types";
	public static final String OTHERNOTE = "othernote";





	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}	
	    public void save(ProjectExecute transientInstance) {
    				EntityManagerHelper.log("saving ProjectExecute instance", Level.INFO, null);
	        try {
            getEntityManager().persist(transientInstance);
            			EntityManagerHelper.log("save successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("save failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    public void delete(ProjectExecute persistentInstance) {
    				EntityManagerHelper.log("deleting ProjectExecute instance", Level.INFO, null);
	        try {
            getEntityManager().remove(persistentInstance);
            			EntityManagerHelper.log("delete successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("delete failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    public ProjectExecute update(ProjectExecute detachedInstance) {
    				EntityManagerHelper.log("updating ProjectExecute instance", Level.INFO, null);
	        try {
            ProjectExecute result = getEntityManager().merge(detachedInstance);
            			EntityManagerHelper.log("update successful", Level.INFO, null);
	            return result;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("update failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    public ProjectExecute findById( Integer id) {
    				EntityManagerHelper.log("finding ProjectExecute instance with id: " + id, Level.INFO, null);
	        try {
            ProjectExecute instance = getEntityManager().find(ProjectExecute.class, id);
            return instance;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("find failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    @SuppressWarnings("unchecked")
    public List<ProjectExecute> findByProperty(String propertyName, Object value) {
    				EntityManagerHelper.log("finding ProjectExecute instance with property: " + propertyName + ", value: " + value, Level.INFO, null);
			try {
			String queryString = "select model from ProjectExecute model where model." 
			 						+ propertyName + "= :propertyValue";
			return getEntityManager().createQuery(queryString)
 				.setParameter("propertyValue", value).getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
	;
			throw re;
		}
	}
	
	public List<ProjectExecute> findByServiceid(Object serviceid) {
		return findByProperty(SERVICEID, serviceid);
	}
	
	public List<ProjectExecute> findByProjectid(Object projectid) {
		return findByProperty(PROJECTID, projectid);
	}
	
	public List<ProjectExecute> findByYear(Object year) {
		return findByProperty(YEAR, year);
	}
	
	public List<ProjectExecute> findByCode(Object code) {
		return findByProperty(CODE, code);
	}
	
	public List<ProjectExecute> findByWorkid(Object workid) {
		return findByProperty(WORKID, workid);
	}
	
	public List<ProjectExecute> findByError(Object error) {
		return findByProperty(ERROR, error);
	}
	
	public List<ProjectExecute> findByProgessid(Object progessid) {
		return findByProperty(PROGESSID, progessid);
	}
	
	public List<ProjectExecute> findByTempletpath(Object templetpath) {
		return findByProperty(TEMPLETPATH, templetpath);
	}
	
	public List<ProjectExecute> findByWordpath(Object wordpath) {
		return findByProperty(WORDPATH, wordpath);
	}
	
	public List<ProjectExecute> findByPdfpath(Object pdfpath) {
		return findByProperty(PDFPATH, pdfpath);
	}
	
	public List<ProjectExecute> findByOutput(Object output) {
		return findByProperty(OUTPUT, output);
	}
	
	public List<ProjectExecute> findByGain(Object gain) {
		return findByProperty(GAIN, gain);
	}
	
	public List<ProjectExecute> findByTax(Object tax) {
		return findByProperty(TAX, tax);
	}
	
	public List<ProjectExecute> findByErics(Object erics) {
		return findByProperty(ERICS, erics);
	}
	
	public List<ProjectExecute> findByCoals(Object coals) {
		return findByProperty(COALS, coals);
	}
	
	public List<ProjectExecute> findByWaters(Object waters) {
		return findByProperty(WATERS, waters);
	}
	
	public List<ProjectExecute> findByJobs(Object jobs) {
		return findByProperty(JOBS, jobs);
	}
	
	public List<ProjectExecute> findByDoctors(Object doctors) {
		return findByProperty(DOCTORS, doctors);
	}
	
	public List<ProjectExecute> findByMasters(Object masters) {
		return findByProperty(MASTERS, masters);
	}
	
	public List<ProjectExecute> findByMediums(Object mediums) {
		return findByProperty(MEDIUMS, mediums);
	}
	
	public List<ProjectExecute> findByHighs(Object highs) {
		return findByProperty(HIGHS, highs);
	}
	
	public List<ProjectExecute> findByInvents(Object invents) {
		return findByProperty(INVENTS, invents);
	}
	
	public List<ProjectExecute> findByAuthorizes(Object authorizes) {
		return findByProperty(AUTHORIZES, authorizes);
	}
	
	public List<ProjectExecute> findByStands(Object stands) {
		return findByProperty(STANDS, stands);
	}
	
	public List<ProjectExecute> findByPapers(Object papers) {
		return findByProperty(PAPERS, papers);
	}
	
	public List<ProjectExecute> findByBooks(Object books) {
		return findByProperty(BOOKS, books);
	}
	
	public List<ProjectExecute> findByAwards(Object awards) {
		return findByProperty(AWARDS, awards);
	}
	
	public List<ProjectExecute> findByCopyrights(Object copyrights) {
		return findByProperty(COPYRIGHTS, copyrights);
	}
	
	public List<ProjectExecute> findByProducts(Object products) {
		return findByProperty(PRODUCTS, products);
	}
	
	public List<ProjectExecute> findByEquips(Object equips) {
		return findByProperty(EQUIPS, equips);
	}
	
	public List<ProjectExecute> findByTechs(Object techs) {
		return findByProperty(TECHS, techs);
	}
	
	public List<ProjectExecute> findByGrounds(Object grounds) {
		return findByProperty(GROUNDS, grounds);
	}
	
	public List<ProjectExecute> findByMaterials(Object materials) {
		return findByProperty(MATERIALS, materials);
	}
	
	public List<ProjectExecute> findByTypes(Object types) {
		return findByProperty(TYPES, types);
	}
	
	public List<ProjectExecute> findByOthernote(Object othernote) {
		return findByProperty(OTHERNOTE, othernote);
	}
	

	@SuppressWarnings("unchecked")
	public List<ProjectExecute> findAll() {
					EntityManagerHelper.log("finding all ProjectExecute instances", Level.INFO, null);
			try {
			String queryString = "select model from ProjectExecute model";
			return getEntityManager().createQuery(queryString).getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find all failed", Level.SEVERE, re);
	;
			throw re;
		}
	}
	
}