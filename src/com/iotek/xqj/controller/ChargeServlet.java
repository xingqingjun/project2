package com.iotek.xqj.controller;

import com.iotek.xqj.entity.Charge;
import com.iotek.xqj.entity.Employee;
import com.iotek.xqj.entity.Resume;
import com.iotek.xqj.service.ChargeService;
import com.iotek.xqj.service.EmployeeService;
import com.iotek.xqj.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.List;

/**
 * Created by Machenike on 2018/10/16.
 */
@RequestMapping("charge")
@Controller
public class ChargeServlet {
    @Autowired
    private ChargeService chargeService;
    @Autowired
    private VisitorService visitorService;
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("inputLogin")
    public String inputLogin(){
        return "charge/login";
    }
    @RequestMapping("login")
    public String login(Charge charge, HttpSession session){
        Charge charge1=chargeService.findChargeByNameAndPassword(charge);
        if(charge1!=null){
            session.setAttribute("de",charge1);
            System.out.println(charge1.getDept());
            return "charge/mainView";
        }else {
            return "charge/login";
        }
    }
    @RequestMapping("inform")
    public String inform(String de,HttpSession session){
        System.out.println(de);
        List<Resume> resume=chargeService.findResumeByDept(de);
        System.out.println(resume);
        session.setAttribute("resume",resume);
        return "charge/inform";
    }
    @RequestMapping("record")
    public String record(int id){
        String type="员工";
        visitorService.editType(id,type);
        Resume resume=visitorService.lookResume(id);
        Employee employee=new Employee(resume.getId(),resume.getName(),resume.getSex(),resume.getDept(),resume.getPositon(),resume.getPhone(),resume.getEducation(),resume.getSalary(),new Date(System.currentTimeMillis()));
        employeeService.addEmployee(employee);
        String record="已录用";
        visitorService.editRecord(id,record);
        return "forward:inform";

    }

}
