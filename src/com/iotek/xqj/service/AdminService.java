package com.iotek.xqj.service;

import com.iotek.xqj.entity.Admin;
import com.iotek.xqj.entity.Resume;

import java.sql.Date;
import java.util.List;

/**
 * Created by Machenike on 2018/10/13.
 */
public interface AdminService {
    public Admin byNameAndPassword(Admin admin);
    public List<Resume> allResume();
    public void deleteById(int id);
    public Resume allResumeById(int id);
    public Resume editInterviewById(int id, Date interview);
    public int date (Date bTime,Date lTime);
    public void deleteResume(Resume resume);
}
