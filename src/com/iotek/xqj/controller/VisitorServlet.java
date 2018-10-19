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
import java.util.ArrayList;
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
        if(name!=""){
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
        if(visitor1!=null){
            System.out.println(111);
            int id=visitorService.findId(visitor.getName());
            System.out.println(222);
            session.setAttribute("id",id);
            System.out.println(visitor1.getType());
            if(visitor1.getType().equals("员工")){
                return "employee/mainView";
            }
            return "visitor/visitorView";
        }else {
            return "visitor/login";
        }
    }
    @RequestMapping("log")
    @ResponseBody
    public String log(String name,String password){
        System.out.println(111);
        Visitor visitor=new Visitor(name, password);
        Visitor visitor1=visitorService.findVisitorByNameAndPassword(visitor);
        if(visitor1==null){
            return "fail";
        }else {
            return "sucess";
        }
    }
    @RequestMapping("regist")
    public String regist(Visitor visitor){
        Visitor visitor1=visitorService.findVisitorByName(visitor.getName());
        if(visitor1==null&&visitor.getName()!=""&&visitor.getPassword()!=""){
            visitorService.addVisitor(visitor);
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
        List<Dept> list= deptService.queryAllDept();
        session.setAttribute("dept",list);
        return "visitor/visitor";
    }

    /**
     * 添加简历
     * @param resume
     * @param session
     * @return
     */
    @RequestMapping("addResume")
    public String addResume(Resume resume,HttpSession session){
        System.out.println(resume.getId());
        resume.setState("未提交");
        resume.setInterview("未面试");
        resume.setLook("未查看");
        resume.setInform("未通知");
        resume.setRecord("未录用");

        visitorService.addResume(resume);
        List<Dept> list= deptService.queryAllDept();
        session.setAttribute("dept",list);
        return "visitor/visitorView";//添加简历
    }

    /**
     *
     * @param id
     * @param session
     * @return
     */
    @RequestMapping("showResume")
    public String showResume(int id,HttpSession session){
        System.out.println(id);
        Resume resume=visitorService.lookResume(id);
        //resume.setLook("已查看");
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
        session.removeAttribute("dept");
        session.setAttribute("dept",dept);
        System.out.println(dept);
        Resume resume=visitorService.lookResume(id);
        System.out.println(resume);
        session.setAttribute("resume",resume);
        return "visitor/editResume";
    }
    @RequestMapping("positon")
    @ResponseBody
    public void queryAllPositon(String dept, PrintWriter printWriter){
        System.out.println(dept);
        int id=deptService.findDeptIdByName(dept);
        System.out.println(id);
        List<Positon> list1=positonService.queryAllPositon(id);
        Object list=JSON.toJSON(list1);
        System.out.println(list);
        printWriter.print(list);//职位
    }
//   @RequestMapping("positon")
//   @ResponseBody
//   public Object queryAllPositon(int deptId){
//       List<Positon> list1=positonService.queryAllPositon(deptId);
//       System.out.println(list1);
//       List<String> list=new ArrayList<>();
//       for(Positon l:list1){
//           list.add(l.getName());
//       }
//       System.out.println(list);
//       Object l=JSON.toJSON(list);
//       System.out.println(l);
//       return l;
//
//   }

    /**
     *修改简历
     * @param resume
     * @return
     */
    @RequestMapping("editResume")
    public String editResume(Resume resume,HttpSession session){
        System.out.println(resume.getId());
        visitorService.editResume(resume);
        System.out.println(666);
        System.out.println(resume);
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
        return "redirect:/mainView.jsp";
    }
    @RequestMapping("put")
    public String put(int id){
        Resume resume=visitorService.lookResume(id);
        resume.setState("已提交");
        resume.setTime(new Date(System.currentTimeMillis()));
        visitorService.editStateAndTime(resume);
        return "forward:visitorView";
    }
    @RequestMapping("lookInform")
    public String lookInform(int id,HttpSession session){
        Resume resume=visitorService.lookInform(id);
        session.setAttribute("resume",resume);
        return "visitor/lookInform";
    }
    @RequestMapping("hid")
    @ResponseBody
    public String hid(int id){
        System.out.println(id);
        Resume resume=visitorService.lookResume(id);
        if(resume!=null){
            System.out.println(999);
            return "yes";

        }else {
            return "no";
        }
    }

}
