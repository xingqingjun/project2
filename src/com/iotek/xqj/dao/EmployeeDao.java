package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Employee;
import com.iotek.xqj.entity.WorkRecord;

import java.util.Date;
import java.util.List;

/**
 * Created by Machenike on 2018/10/17.
 */
public interface EmployeeDao {
    public void addEmployee(Employee employee);//添加员工
    public Employee findEmployeeById(int id);//查看员工个人信息
    public void editEmployee(Employee employee);//修改个人信息
    public List<Employee> findEmployeeByPositon(String positon);
    public List<Employee> findEmployeeByDept(String dept);//通过部门查找
    public void addWorkRecord(WorkRecord workRecord);//添加考勤(正常打卡)
    public void addWorkRecord1(WorkRecord workRecord);//(迟到)
    public void addWorkRecord2(WorkRecord workRecord);//(旷工)
    public WorkRecord findWorkRecordByTime(WorkRecord workRecord);//通过考勤时间查询
    public void editWorkRecord(WorkRecord workRecord);//更新下班考勤
    public List<WorkRecord> findWorkRecordById(int id);//查询
    public List<WorkRecord> findWork(WorkRecord workRecord);//模糊查询

}
