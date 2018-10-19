package com.iotek.xqj.controller;

import com.iotek.xqj.entity.*;
import com.iotek.xqj.service.AdminService;
import com.iotek.xqj.service.DeptService;
import com.iotek.xqj.service.EmployeeService;
import com.iotek.xqj.service.PositonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.List;

/**
 * Created by Machenike on 2018/10/13.
 */
@Controller
@RequestMapping("admin")
public class AdminServlet {
    @Autowired
    private AdminService adminService;
    @Autowired
    private DeptService deptService;
    @Autowired
    private PositonService positonService;
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("inputLogin")
    public String inputLogin(){
        return "admin/login";
    }
    @RequestMapping("login")
    public String login(Admin admin){
        Admin admin1=adminService.byNameAndPassword(admin);
        if(admin!=null){
            return "forward:inputMainView";
        }else {
            return "admin/login";
        }
    }
    @RequestMapping("inputMainView")
    public String inputMainView(){
        return "admin/mainView";
    }
    @RequestMapping("inputAllResume")
    public String inputAllResume(){
        return "forward:allResume";
    }
    @RequestMapping("allResume")
    public String allResume(HttpSession session){
        List<Resume> list=adminService.allResume();
        session.setAttribute("resume",list);
        return "admin/allResume";
    }
    @RequestMapping("remove")
    @ResponseBody
    public String remove(int id){
        Resume resume=adminService.allResumeById(id);
        resume.setState("未提交");
        Resume resume1=new Resume(id,resume.getState());
        System.out.println(resume1);
        adminService.deleteResume(resume1);
        return "success";
    }
    @RequestMapping("lookResume")
    public String lookResume(int id,HttpSession session){
        Resume resume=adminService.allResumeById(id);
        session.setAttribute("resume",resume);
        return "admin/lookResume";
    }
    @RequestMapping("editInterview")
    @ResponseBody
    public String editInterview(int id, Date interview){
        Resume resume=adminService.allResumeById(id);
        int day=adminService.date(resume.getTime(),interview);
        if(day>0&&day<=7){
            return "success";
        }else {
            return "fail";
        }
    }
    @RequestMapping("editInterviewTime")
    public String editInterviewTime(int id, Date interview){
        adminService.editInterviewById(id,interview);
        return "forward:inputMainView";
    }
    @RequestMapping("showResume")
    public String showResume(int id,HttpSession session){
        System.out.println(id);
        Resume resume=adminService.allResumeById(id);
        resume.setLook("已查看");
        System.out.println(222);
        session.setAttribute("resume",resume);
        return "admin/lookResume";
    }
    @RequestMapping("inputManageDept")
    public String manageDept(){
        return "admin/manageDept";
    }
    @RequestMapping("lookDept")
    public String lookDept(HttpSession session){
        List<Dept> dept=deptService.queryAllDept();
        session.setAttribute("dept",dept);
        return "admin/lookDept";
    }
    @RequestMapping("lookPositon")
    public String lookPositon(int id,HttpSession session){
        List<Positon> positon=positonService.queryAllPositon(id);
        System.out.println(positon);
        System.out.println(111);
        //String dept=deptService.findDeptNameById(id);
        //session.setAttribute("dept",dept);
        session.setAttribute("positon",positon);
        return "admin/lookPositon";
    }
    @RequestMapping("lookEmployee")
    public String lookEmployee(String positon,HttpSession session){
        List<Employee> employees=employeeService.findEmployeeByPositon(positon);
        System.out.println(employees);
        session.setAttribute("employees",employees);
        return "admin/lookEmployee";
    }

}
