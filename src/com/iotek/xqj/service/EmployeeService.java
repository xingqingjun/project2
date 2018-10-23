package com.iotek.xqj.service;

import com.iotek.xqj.entity.Employee;
import com.iotek.xqj.entity.WorkRecord;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * Created by Machenike on 2018/10/17.
 */
public interface EmployeeService {
    public void addEmployee(Employee employee);
    public Employee findEmployeeById(int id);
    public void editEmployee(Employee employee);
    public List<Employee> findEmployeeByPositon(String positon);
    public List<Employee> findEmployeeByDept(String dept);
    public void addWorkRecord(WorkRecord workRecord);
    public WorkRecord findWorkRecordByTime(WorkRecord workRecord);
    public void addWorkRecord1(WorkRecord workRecord);//(³Ùµ½)
    public void addWorkRecord2(WorkRecord workRecord);//(¿õ¹¤)
    public void editWorkRecord(WorkRecord workRecord);
    public List<WorkRecord> findWorkRecordById(int id);
    public List<WorkRecord> findWork(WorkRecord workRecord);
}
