package com.iotek.xqj.service;

import com.iotek.xqj.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
