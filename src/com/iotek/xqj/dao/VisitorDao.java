package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Resume;
import com.iotek.xqj.entity.Visitor;

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
    public void editResume(int id,Resume resume);
    public void editPassword(int id,String password);
    public Resume lookInform(int id);//查看通知
}
