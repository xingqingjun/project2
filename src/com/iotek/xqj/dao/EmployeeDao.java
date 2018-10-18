package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Employee;

/**
 * Created by Machenike on 2018/10/17.
 */
public interface EmployeeDao {
    public void addEmployee(Employee employee);//添加员工
    public Employee findEmployeeById(int id);//查看员工个人信息
}
