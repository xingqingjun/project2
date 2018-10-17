package com.iotek.xqj.service.lmpl;

import com.iotek.xqj.dao.EmployeeDao;
import com.iotek.xqj.entity.Employee;
import com.iotek.xqj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}