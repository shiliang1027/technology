package com.technology.dao;

import java.util.List;

import com.technology.po.Projectprogress;

public interface ProjectprogressDao
{
    public boolean save(Projectprogress s);

    public boolean update(Projectprogress s);

    public List findAll();
}
