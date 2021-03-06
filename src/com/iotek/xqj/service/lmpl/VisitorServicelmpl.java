package com.iotek.xqj.service.lmpl;

import com.iotek.xqj.dao.VisitorDao;
import com.iotek.xqj.entity.Resume;
import com.iotek.xqj.entity.Visitor;
import com.iotek.xqj.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

/**
 * Created by Machenike on 2018/10/11.
 */
@Service("visitorService")
public class VisitorServicelmpl implements VisitorService {
    @Autowired
    private VisitorDao visitorDao;
    @Override
    public Visitor findVisitorByName(String name) {
        return  visitorDao.findVisitorByName(name);
    }

    @Override
    public Visitor findVisitorByNameAndPassword(Visitor visitor) {
        return visitorDao.findVisitorByNameAndPassword(visitor);
    }

    @Override
    public int findId(String name) {
        return visitorDao.findId(name);
    }

    @Override
    public void addVisitor(Visitor visitor) {
        visitorDao.addVisitor(visitor);

    }

    @Override
    public void addResume(Resume resume) {
        visitorDao.addResume(resume);
    }

    @Override
    public Resume lookResume(int id) {
        return visitorDao.lookResume(id);
    }

    @Override
    public void editResume(Resume resume) {
        visitorDao.editResume(resume);
    }

    @Override
    public void editPassword(int id,String password) {
        visitorDao.editPassword(id,password);
    }

    @Override
    public Resume lookInform(int id) {
        return visitorDao.lookResume(id);
    }

    @Override
    public void editType(int id,String type) {
        visitorDao.editType(id,type);
    }

    @Override
    public void editRecord(int id, String record) {
        visitorDao.editRecord(id,record);
    }

    @Override
    public void editStateAndTime(Resume resume) {
        visitorDao.editStateAndTime(resume);
    }

    @Override
    public void editLook(Resume resume) {
        visitorDao.editLook(resume);
    }



}
