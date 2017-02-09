package com.technology.module.supportbase.serv;

import com.technology.module.supportbase.dao.po.Suppoortbase;

public interface SuppoortbaseServ
{
    public boolean save(Suppoortbase suppoortbase);
    

    public boolean update(Suppoortbase suppoortbase);
    
    public Suppoortbase findById(Integer id);
}
