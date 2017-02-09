package com.technology.module.supportbase.dao;

// default package

import java.util.Date;
import java.util.List;

import com.technology.module.supportbase.dao.po.Suppoortbase;

/**
 * Interface for SuppoortbaseDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface SuppoortbaseDao
{
    public void save(Suppoortbase transientInstance);

    public void delete(Suppoortbase persistentInstance);

    public Suppoortbase update(Suppoortbase detachedInstance);

    public Suppoortbase findById(Integer id);

    public List<Suppoortbase> findAll();
}