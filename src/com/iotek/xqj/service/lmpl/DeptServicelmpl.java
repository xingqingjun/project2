package com.iotek.xqj.service.lmpl;

import com.iotek.xqj.dao.DeptDao;
import com.iotek.xqj.entity.Dept;
import com.iotek.xqj.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by Machenike on 2018/10/12.
 */
@Service("deptService")
public class DeptServicelmpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public List<Dept> queryAllDept() {
        return deptDao.queryAllDept();
    }

    @Override
    public Dept findDeptNameById(int id) {
        return deptDao.findDeptNameById(id);
    }

    @Override
    public int findDeptIdByName(String name) {
        return deptDao.findDeptIdByName(name);
    }

    @Override
    public void addDept(Dept dept) {
        deptDao.addDept(dept);
    }

    @Override
    public void deleteDeptById(int id) {
        deptDao.deleteDeptById(id);
    }

    @Override
    public void editDept(Dept dept) {
        deptDao.editDept(dept);
    }
}
