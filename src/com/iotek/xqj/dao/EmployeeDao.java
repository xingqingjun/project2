package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Employee;

/**
 * Created by Machenike on 2018/10/17.
 */
public interface EmployeeDao {
    public void addEmployee(Employee employee);//���Ա��
    public Employee findEmployeeById(int id);//�鿴Ա��������Ϣ
}
