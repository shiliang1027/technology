package com.technology.serv;

import java.util.List;

import com.technology.po.Supportbase;

public interface SupportbaseServ
{
    public boolean save(Supportbase suppoortbase);

    public boolean update(Supportbase suppoortbase);

    public List findAll();
}
