package com.iotek.xqj.service;

import com.iotek.xqj.entity.Resume;
import com.iotek.xqj.entity.Visitor;

import java.sql.Date;

/**
 * Created by Machenike on 2018/10/11.
 */
public interface VisitorService {
    public Visitor findVisitorByName(String name);
    public Visitor findVisitorByNameAndPassword(Visitor visitor);
    public int findId(String name);
    public void addVisitor(Visitor visitor);
    public void addResume(Resume resume);
    public Resume lookResume(int id);//查看自己简历通过id关联
    public void editResume(int id,Resume resume);//修改简历
    public void editPassword(int id,String password);//修改密码
    public Resume lookInform(int id);

}
