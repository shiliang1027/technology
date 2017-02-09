package com.technology.serv;

import java.util.List;

import com.technology.po.Projectunit;

public interface ProjectunitServ
{

    public boolean save(Projectunit s);

    public boolean update(Projectunit s);

    public List findAll();
}
