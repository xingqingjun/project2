package com.iotek.xqj.controller;

import com.iotek.xqj.entity.*;
import com.iotek.xqj.service.AdminService;
import com.iotek.xqj.service.DeptService;
import com.iotek.xqj.service.EmployeeService;
import com.iotek.xqj.service.PositonService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    /**
     * 查看所有部门
     * @param session
     * @return
     */
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
    public String lookEmployee(int id, HttpSession session){
        Positon positon=positonService.findPositon(id);
        System.out.println(positon);
        List<Employee> employees=employeeService.findEmployeeByPositon(positon.getName());
        System.out.println(employees);
        session.setAttribute("employees",employees);
        return "admin/lookEmployee";
    }
    @RequestMapping("inputAddDept")
    public String inputAddDept(){
        return "admin/addDept";
    }

    /**
     * 添加部门
     * @param name
     * @return
     */
    @RequestMapping("addDept")
    public String addDept(String name){
        Date time=new Date(System.currentTimeMillis());
        Dept dept=new Dept(name,time);
        deptService.addDept(dept);
        return "forward:lookDept";
    }

    /**
     * 删除部门
     * @param id
     * @return
     */
    @RequestMapping("deleteDept")
    @ResponseBody
    public String deleteDept(int id){
        System.out.println(id);
        Dept dept=deptService.findDeptNameById(id);
        System.out.println(dept);
        List<Employee> employee=employeeService.findEmployeeByDept(dept.getName());
        for(Employee employee1:employee){
            if(employee1.getState().equals("在职")){
                return "";
            }
        }
        deptService.deleteDeptById(id);
            return "delete";
    }

    /**
     * 删除职位
     * @param id
     * @param positon
     * @return
     */
    @RequestMapping("deletePositon")
    @ResponseBody
    public String deletePositon(int id,String positon){
        List<Employee> employees=employeeService.findEmployeeByPositon(positon);
        for(Employee employee1:employees){
            if(employee1.getState().equals("在职")){
                return "";
            }
        }
        positonService.deletePositonById(id);
        return "delete";
    }

    /**
     * 进入修改部门界面
     * @return
     */
    @RequestMapping("inputEditDept")
    public String inputEditDept(int id,HttpSession session){
        Dept dept=deptService.findDeptNameById(id);
        session.setAttribute("dept",dept);
        return "admin/editDept";
    }

    /**
     * 修改部门
     * @param dept
     * @return
     */
    @RequestMapping("editDept")
    public String editDept(Dept dept){
        deptService.editDept(dept);
        return "forward:lookDept";
    }

    /**
     * 进入添加界面
     * @param id
     * @param session
     * @return
     */
    @RequestMapping("inputAddPositon")
    public String inputAddPositon(int id,HttpSession session){
        session.setAttribute("id",id);
        return "admin/addPositon";
    }

    /**
     * 添加职位
     * @param positon
     * @return
     */
    @RequestMapping("addPositon")
    public String addPositon(Positon positon){
        positon.setTime(new Date(System.currentTimeMillis()));
        positonService.addPositon(positon);
        return "forward:lookDept";
    }

    /**
     * 进入修改职位界面
     * @param id
     * @param session
     * @return
     */
    @RequestMapping("inputEditPositon")
    public String inputEditPositon(int id,HttpSession session){
        Positon positon=positonService.findPositon(id);
        session.setAttribute("positon",positon);
        return "admin/editPositon";
    }

    /**
     * 修改部门
     * @param positon
     * @return
     */
    @RequestMapping("editPositon")
    public String editPositon(Positon positon){
        positonService.editPositonById(positon);
        return "admin/lookDept";
    }
    @RequestMapping("train")
    public String train(){
        return "admin/train";
    }
    @RequestMapping("inputLookTrain")
    public String inputLookTrain(HttpSession session){
        List<Training> train=adminService.findTraining();
        session.setAttribute("train",train);
        return "admin/lookTrain";
    }

}
