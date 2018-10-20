package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Positon;

import java.util.List;

/**
 * Created by Machenike on 2018/10/12.
 */
public interface PositonDao {
    public List<Positon> queryAllPositon(int deptId);
    public List<Positon> AllPositon();
    public Positon findPositon(int id);//通过id查询
    public void deletePositonById(int id);
    public void addPositon(Positon positon);//添加职位
    public void editPositonById(Positon positon);//修改职位
}
