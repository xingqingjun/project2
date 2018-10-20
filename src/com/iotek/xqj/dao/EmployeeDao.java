package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Employee;

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
}
