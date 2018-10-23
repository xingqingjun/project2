package com.iotek.xqj.service.lmpl;

import com.iotek.xqj.dao.EmployeeDao;
import com.iotek.xqj.entity.Employee;
import com.iotek.xqj.entity.WorkRecord;
import com.iotek.xqj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Machenike on 2018/10/17.
 */
@Service("employeeService")
public class EmployeeServicelmpl implements EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    @Override
    public Employee findEmployeeById(int id) {
        return employeeDao.findEmployeeById(id);
    }

    @Override
    public void editEmployee(Employee employee) {
        employeeDao.editEmployee(employee);
    }

    @Override
    public List<Employee> findEmployeeByPositon(String positon) {
        return employeeDao.findEmployeeByPositon(positon);
    }

    @Override
    public List<Employee> findEmployeeByDept(String dept) {
        return employeeDao.findEmployeeByDept(dept);
    }

    @Override
    public void addWorkRecord(WorkRecord workRecord) {
        employeeDao.addWorkRecord(workRecord);
    }

    @Override
    public WorkRecord findWorkRecordByTime(WorkRecord workRecord) {
        return employeeDao.findWorkRecordByTime(workRecord);
    }

    @Override
    public void addWorkRecord1(WorkRecord workRecord) {
        employeeDao.addWorkRecord1(workRecord);
    }

    @Override
    public void addWorkRecord2(WorkRecord workRecord) {
        employeeDao.addWorkRecord2(workRecord);

    }

    @Override
    public void editWorkRecord(WorkRecord workRecord) {
        employeeDao.editWorkRecord(workRecord);
    }

    @Override
    public List<WorkRecord> findWorkRecordById(int id) {
        return employeeDao.findWorkRecordById(id);
    }

    @Override
    public List<WorkRecord> findWork(WorkRecord workRecord) {
        return employeeDao.findWork(workRecord);
    }
}
