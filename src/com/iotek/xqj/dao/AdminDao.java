package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Admin;
import com.iotek.xqj.entity.Resume;

import java.sql.Date;
import java.util.List;

/**
 * Created by Machenike on 2018/10/13.
 */
public interface AdminDao {
    public Admin byNameAndPassword(Admin admin);
    public List<Resume> allResume();//所有
    public void deleteById(int id);
    public Resume allResumeById(int id);
    public Resume editInterviewById(int id, Date interview);//修改面试时间
    public int date (Date bTime,Date lTime);//两个时间相隔天数
}
