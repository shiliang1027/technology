package com.technology.dao;

import java.util.List;

import com.technology.po.Supportbase;

/**
 * 该java的描述信息
 * @author shiliang Tel:18661205639
 * @version 1.0
 * @since 2014-7-17 下午8:35:35
 * @category com.technology.dao
 * @copyright 
 */
public interface ISupportbaseDao {

    public boolean save(Supportbase s);
    
    public boolean update(Supportbase s);
    
    public List findAll();
}
