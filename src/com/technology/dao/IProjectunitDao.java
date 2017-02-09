package com.technology.dao;

import java.util.List;

import com.technology.po.Projectunit;

public interface IProjectunitDao
{

    public boolean save(Projectunit s);

    public boolean update(Projectunit s);

    public List findAll();
}
