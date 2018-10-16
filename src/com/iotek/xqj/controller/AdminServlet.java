package com.iotek.xqj.controller;

import com.iotek.xqj.entity.Admin;
import com.iotek.xqj.entity.Resume;
import com.iotek.xqj.service.AdminService;
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
    @RequestMapping("inputLogin")
    public String inputLogin(){
        return "admin/login";
    }
    @RequestMapping("login")
    public String login(Admin admin){
        Admin admin1=adminService.byNameAndPassword(admin);
        if(admin!=null){
            return "admin/mainView";
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
        return "forword:allResume";
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
        adminService.deleteById(id);
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

}
