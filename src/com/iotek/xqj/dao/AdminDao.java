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
    public List<Resume> allResume();//����
    public void deleteById(int id);
    public Resume allResumeById(int id);
    public Resume editInterviewById(int id, Date interview);//�޸�����ʱ��
    public int date (Date bTime,Date lTime);//����ʱ���������
    public void deleteResume(Resume resume);//ɾ������(�ĳ�δ�ύ)
}
