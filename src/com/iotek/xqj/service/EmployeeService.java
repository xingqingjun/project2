package com.iotek.xqj.service;

import com.iotek.xqj.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Machenike on 2018/10/17.
 */
public interface EmployeeService {
    public void addEmployee(Employee employee);
    public Employee findEmployeeById(int id);
}
