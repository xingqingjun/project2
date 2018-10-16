package com.iotek.xqj.controller;

import com.alibaba.fastjson.JSON;
import com.iotek.xqj.entity.Dept;
import com.iotek.xqj.entity.Positon;
import com.iotek.xqj.entity.Resume;
import com.iotek.xqj.entity.Visitor;
import com.iotek.xqj.service.DeptService;
import com.iotek.xqj.service.PositonService;
import com.iotek.xqj.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

/**
 * Created by Machenike on 2018/10/11.
 */
@RequestMapping("visitor")
@Controller
public class VisitorServlet {
    @Autowired
    private VisitorService visitorService;
    @Autowired
    private DeptService deptService;
    @Autowired
    private PositonService positonService;

    @RequestMapping("findVisitor")
    @ResponseBody
    public String findVisitor(String name){
        if(name!=null){
            Visitor visitor=visitorService.findVisitorByName(name);
            if(visitor==null){
                return "ok";
            }else {
                return "no";
            }

        }else {
            return "emtity";
        }
    }
    @RequestMapping("inputRegist")
    public String inputRegist(){
        return "visitor/regist";
    }
    @RequestMapping("inputLogin")
    public String inputLogin(){
        return "visitor/login";
    }
    @RequestMapping("login")
    public String login(Visitor visitor, HttpSession session){
        Visitor visitor1=visitorService.findVisitorByNameAndPassword(visitor);
        if(visitor!=null){
            System.out.println(111);
            int id=visitorService.findId(visitor.getName());
            System.out.println(222);
            session.setAttribute("id",id);
            return "visitor/visitorView";
        }else {
            return "visitor/login";
        }
    }
    @RequestMapping("log")
    @ResponseBody
    public String log(Visitor visitor){
        Visitor visitor1=visitorService.findVisitorByNameAndPassword(visitor);
        if(visitor1==null){
            return "fail";
        }else {
            return "sucess";
        }
    }
    @RequestMapping("regist")
    public String regist(Visitor visitor){
        Visitor visitor1=visitorService.findVisitorByNameAndPassword(visitor);
        if(visitor1!=null){
            return "visitor/login";
        }else {
            return "visitor/regist";
        }
    }
    @RequestMapping("input")
    public String input(){
        return "visitor/regist";
    }
    @RequestMapping("aResume")
    public String aResume(int id,HttpSession session){
        session.setAttribute("id",id);
        return "visitor/visitor";
    }
    @RequestMapping("addResume")
    public String addResume(Resume resume,int id,HttpSession session){
        resume.setDept(deptService.findDeptNameById(id));
        visitorService.addResume(resume);
        List<Dept> list= deptService.queryAllDept();
        session.setAttribute("dept",list);
        return "visitor/visitorView";//添加简历
    }
    @RequestMapping("showResume")
    public String showResume(int id,HttpSession session){
        Resume resume=visitorService.lookResume(id);
        resume.setLook("已查看");
        session.setAttribute("resume",resume);
        return "visitor/lookResume";
    }
    @RequestMapping("visitorView")
    public String visitorView(){
        return "visitor/visitorView";
    }
    @RequestMapping("edt")
    public String adt(int id,HttpSession session){
        List<Dept> dept=deptService.queryAllDept();
        session.setAttribute("dept",dept);
        Resume resume=visitorService.lookResume(id);
        session.setAttribute("resume",resume);
        return "visitor/editResume";
    }
    @RequestMapping("positon")
    @ResponseBody
    public void queryAllPositon(int deptId, PrintWriter printWriter){
        List<Positon> list1=positonService.queryAllPositon(deptId);
        Object list=JSON.toJSON("list1");
        printWriter.print(list);//职位
    }
    @RequestMapping("editResume")
    public String editResume(int id,Resume resume){
        visitorService.editResume(id,resume);
        return "visitor/visitorView";
    }
    @RequestMapping("ePassword")
    public String ePassword(int id,HttpSession session){
        session.setAttribute("id",id);
        return "visitor/editPassword";
    }
    @RequestMapping("editPassword")
    public String editPassword(int id,String password){
        visitorService.editPassword(id,password);
        return "visitor/visitorView";
    }
    @RequestMapping("inputMainView")
    public String inputMainView(){
        return "forward:mainView.jsp";
    }
    @RequestMapping("put")
    public String put(int id){
        Resume resume=visitorService.lookResume(id);
        resume.setState("已提交");
        resume.setTime(new Date(System.currentTimeMillis()));
        return "forward:visitorView";
    }
    @RequestMapping("lookInform")
    public String lookInform(int id,HttpSession session){
        Resume resume=visitorService.lookInform(id);
        session.setAttribute("resume",resume);
        return "visitor/lookInform";
    }

}
