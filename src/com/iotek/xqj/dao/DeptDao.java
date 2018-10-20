package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Dept;

import java.util.List;

/**
 * Created by Machenike on 2018/10/12.
 */
public interface DeptDao {
    public List<Dept> queryAllDept();
    public Dept findDeptNameById(int id);
    public int findDeptIdByName(String name);
    public void addDept(Dept dept);//��Ӳ���
    public void deleteDeptById(int id);//ɾ������
    public void editDept(Dept dept);//�޸Ĳ���
}
