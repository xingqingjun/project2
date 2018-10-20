package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Employee;

import java.util.List;

/**
 * Created by Machenike on 2018/10/17.
 */
public interface EmployeeDao {
    public void addEmployee(Employee employee);//���Ա��
    public Employee findEmployeeById(int id);//�鿴Ա��������Ϣ
    public void editEmployee(Employee employee);//�޸ĸ�����Ϣ
    public List<Employee> findEmployeeByPositon(String positon);
    public List<Employee> findEmployeeByDept(String dept);//ͨ�����Ų���
}
