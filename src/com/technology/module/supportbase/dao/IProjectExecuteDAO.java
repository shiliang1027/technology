package com.technology.module.supportbase.dao;
// default package


import java.util.Date;
import java.util.List;

import com.technology.module.supportbase.dao.po.ProjectExecute;

/**
 * Interface for ProjectExecuteDAO.
 * @author MyEclipse Persistence Tools
 */

public interface IProjectExecuteDAO {
    public void save(ProjectExecute transientInstance);
    public void delete(ProjectExecute persistentInstance);
	public ProjectExecute update(ProjectExecute detachedInstance);
	public ProjectExecute findById( Integer id);
	public List<ProjectExecute> findByProperty(String propertyName, Object value);
	public List<ProjectExecute> findByServiceid(Object serviceid);
	public List<ProjectExecute> findByProjectid(Object projectid);
	public List<ProjectExecute> findByYear(Object year);
	public List<ProjectExecute> findByCode(Object code);
	public List<ProjectExecute> findByWorkid(Object workid);
	public List<ProjectExecute> findByError(Object error);
	public List<ProjectExecute> findByProgessid(Object progessid);
	public List<ProjectExecute> findByTempletpath(Object templetpath);
	public List<ProjectExecute> findByWordpath(Object wordpath);
	public List<ProjectExecute> findByPdfpath(Object pdfpath);
	public List<ProjectExecute> findByOutput(Object output);
	public List<ProjectExecute> findByGain(Object gain);
	public List<ProjectExecute> findByTax(Object tax);
	public List<ProjectExecute> findByErics(Object erics);
	public List<ProjectExecute> findByCoals(Object coals);
	public List<ProjectExecute> findByWaters(Object waters);
	public List<ProjectExecute> findByJobs(Object jobs);
	public List<ProjectExecute> findByDoctors(Object doctors);
	public List<ProjectExecute> findByMasters(Object masters);
	public List<ProjectExecute> findByMediums(Object mediums);
	public List<ProjectExecute> findByHighs(Object highs);
	public List<ProjectExecute> findByInvents(Object invents);
	public List<ProjectExecute> findByAuthorizes(Object authorizes);
	public List<ProjectExecute> findByStands(Object stands);
	public List<ProjectExecute> findByPapers(Object papers);
	public List<ProjectExecute> findByBooks(Object books);
	public List<ProjectExecute> findByAwards(Object awards);
	public List<ProjectExecute> findByCopyrights(Object copyrights);
	public List<ProjectExecute> findByProducts(Object products);
	public List<ProjectExecute> findByEquips(Object equips);
	public List<ProjectExecute> findByTechs(Object techs);
	public List<ProjectExecute> findByGrounds(Object grounds);
	public List<ProjectExecute> findByMaterials(Object materials);
	public List<ProjectExecute> findByTypes(Object types);
	public List<ProjectExecute> findByOthernote(Object othernote);
	public List<ProjectExecute> findAll();
}