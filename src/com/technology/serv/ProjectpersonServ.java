package com.technology.serv;

import java.util.List;

import com.technology.po.Projectperson;

public interface ProjectpersonServ
{

    public boolean save(Projectperson s);

    public boolean update(Projectperson s);

    public List findAll();
}
