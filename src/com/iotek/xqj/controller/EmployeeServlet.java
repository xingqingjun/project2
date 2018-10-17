package com.iotek.xqj.controller;

import com.iotek.xqj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Machenike on 2018/10/17.
 */
@Controller
@RequestMapping("employee")
public class EmployeeServlet {
    @Autowired
    private EmployeeService employeeService;

}
