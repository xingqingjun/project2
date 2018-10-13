package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Dept;

import java.util.List;

/**
 * Created by Machenike on 2018/10/12.
 */
public interface DeptDao {
    public List<Dept> queryAllDept();
    public String findDeptNameById(int id);
}
