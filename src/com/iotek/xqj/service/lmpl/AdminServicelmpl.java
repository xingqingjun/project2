package com.iotek.xqj.service.lmpl;

import com.iotek.xqj.dao.AdminDao;
import com.iotek.xqj.entity.Admin;
import com.iotek.xqj.entity.Resume;
import com.iotek.xqj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * Created by Machenike on 2018/10/13.
 */
@Service("adminService")
public class AdminServicelmpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin byNameAndPassword(Admin admin) {
        return adminDao.byNameAndPassword(admin);
    }

    @Override
    public List<Resume> allResume() {
        return adminDao.allResume();
    }

    @Override
    public void deleteById(int id) {
      adminDao.deleteById(id);
    }

    @Override
    public Resume allResumeById(int id) {
        return adminDao.allResumeById(id);
    }

    @Override
    public Resume editInterviewById(int id, Date interview) {
        return adminDao.editInterviewById(id,interview);
    }

    @Override
    public int date(Date bTime, Date lTime) {
        return adminDao.date(bTime,lTime);
    }

    @Override
    public void deleteResume(Resume resume) {
        adminDao.deleteResume(resume);
    }
}
