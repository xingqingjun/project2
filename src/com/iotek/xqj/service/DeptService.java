package com.iotek.xqj.service;

import com.iotek.xqj.entity.Dept;

import java.util.List;

/**
 * Created by Machenike on 2018/10/12.
 */
public interface DeptService {
    public List<Dept> queryAllDept();
    public String findDeptNameById(int id);
    public int findDeptIdByName(String name);
}
