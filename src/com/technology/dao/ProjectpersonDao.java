package com.technology.dao;

import java.util.List;

import com.technology.po.Projectperson;

public interface ProjectpersonDao
{

    public boolean save(Projectperson s);

    public boolean update(Projectperson s);

    public List findAll();
}
