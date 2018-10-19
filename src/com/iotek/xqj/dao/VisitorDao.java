package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Resume;
import com.iotek.xqj.entity.Visitor;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Machenike on 2018/10/11.
 */
public interface VisitorDao {
    public Visitor findVisitorByName(String name);
    public Visitor findVisitorByNameAndPassword(Visitor visitor);
    public int findId(String name);
    public void addVisitor(Visitor visitor);
    public void addResume(Resume resume);
    public Resume lookResume(int id);
    public void editResume( Resume resume);
    public void editPassword(int id,String password);
    public Resume lookInform(int id);//查看通知
    public void editType(int id,String type);//修改类型
    public void editRecord(int id,String record);//修改录用状态
    public void editStateAndTime(Resume resume);//修改提交状态和时间
    public void editLook(Resume resume);//修改查看状态

}
