package com.iotek.xqj.controller;

import com.iotek.xqj.entity.Employee;
import com.iotek.xqj.entity.WorkRecord;
import com.iotek.xqj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Machenike on 2018/10/17.
 */
@Controller
@RequestMapping("employee")
public class EmployeeServlet {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("look")
    public String look(int id, HttpSession session){
        Employee employee=employeeService.findEmployeeById(id);
        session.setAttribute("employee",employee);
        return "employee/look";
    }
    @RequestMapping("edit")
    public String edit(Employee employee){
        System.out.println(employee);
        employeeService.editEmployee(employee);
        return "forward:look";
    }
    @RequestMapping("inputMainview")
    public String inputMainview(){
        return "employee/mainView";
    }

    /**
     * ���ϰ࿨
     * @param id
     * @return
     */
    @RequestMapping("clockIn")
    @ResponseBody
    public String clockIn(int id) throws ParseException {
        System.out.println(id);
        SimpleDateFormat dd=new SimpleDateFormat("yyyy-MM-dd");
        String day=dd.format(new Date());//����
        System.out.println(day);
        Date day1=dd.parse(day);//תdate
        System.out.println(day1);
        String clockInTime=day+" 9:30:00";//�涨��ʱ��
        System.out.println(clockInTime);
        SimpleDateFormat ff=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=ff.format(new Date());//��ǰ��ʱ��
        Date time1=ff.parse(time);//תdate����
        System.out.println(time1);
            long beigin=ff.parse(clockInTime).getTime();
            long last=ff.parse(time).getTime();
            int minute=(int)((last-beigin)/1000/60);
        System.out.println(minute);
            int hour=(int)((last-beigin)/1000/60/60);
            WorkRecord workRecord1=new WorkRecord(id,day1);
            WorkRecord workRecord=employeeService.findWorkRecordByTime(workRecord1);
        System.out.println(workRecord);
        System.out.println("Сʱ"+hour);
            Employee employee=employeeService.findEmployeeById(id);
            System.out.println(employee);
        System.out.println(workRecord);
            if(workRecord==null){
                if(minute<=0){
                    System.out.println("�򿨳ɹ�");
                    WorkRecord workRecord2=new WorkRecord(id,employee.getName(),day1,time1);
                    employeeService.addWorkRecord(workRecord2);
                    return "success";
                }
                if(minute>0&&hour<=3){
                    System.out.println("aaa");
                    WorkRecord workRecord2=new WorkRecord(id,employee.getName(),day1,time1,minute);
                    employeeService.addWorkRecord1(workRecord2);
                    System.out.println("�ٵ�");
                    return "hour";
                }else {
                    int count=1;
                    System.out.println(111);
                    WorkRecord workRecord2=new WorkRecord(id,employee.getName(),day1,time1);
                    workRecord2.setAbsent(count);
                    System.out.println(workRecord1);
                    employeeService.addWorkRecord2(workRecord2);
                    System.out.println("����");
                    return "absent";
                }
            }else {
                return "fail";
            }




    }

    /**
     * �°��
     * @param id
     * @return
     */
    @RequestMapping("clockOut")
    @ResponseBody
    public String clockOut(int id) throws ParseException {
        System.out.println(111);
        SimpleDateFormat dd=new SimpleDateFormat("yyyy-MM-dd");
        String day=dd.format(new Date());
        Date day1=dd.parse(day);
        System.out.println(222);
        String clockInTime=day+" 18:00:00";//�涨��ʱ��
        SimpleDateFormat ff=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(333);
        String time=ff.format(new Date());//��ǰ��ʱ��
        System.out.println(444);
        Date time1=ff.parse(time);//תdate����daka
        System.out.println(time1);
        Date time2=ff.parse(clockInTime);//�涨
        System.out.println(clockInTime);
        System.out.println(time2);
        long beigin=ff.parse(clockInTime).getTime();
        long last=ff.parse(time).getTime();
        int minute=(int)((last-beigin)/1000/60);
        int hour=(int)((last-beigin)/1000/60/60);
        System.out.println(333);
        WorkRecord workRecord1=new WorkRecord(id,day1);
        WorkRecord workRecord=employeeService.findWorkRecordByTime(workRecord1);
        System.out.println(workRecord);
        System.out.println(workRecord.getClockOut()+"111");
        if(workRecord.getClockOut()==null){
            System.out.println(workRecord.getClockIn()+"222");
            if(workRecord.getClockIn()!=null){
                if(workRecord.getAbsent()==1){
                    WorkRecord workRecord2=new WorkRecord();
                    workRecord2.setId(id);
                    workRecord2.setTime(day1);
                    workRecord2.setClockOut(time1);
                    employeeService.editWorkRecord(workRecord2);
                    System.out.println("�Ѽ�¼����");
                    return "a1";
                }
                if(minute>=0&&minute<30){
                    System.out.println("�����°��δ�Ӱ�");
                    WorkRecord workRecord2=new WorkRecord();
                    workRecord2.setId(id);
                    workRecord2.setTime(day1);
                    System.out.println(time1);
                    workRecord2.setClockOut(time1);
                    employeeService.editWorkRecord(workRecord2);
                    return "a2";
                }
                if(minute<0&&hour>=-3){
                    System.out.println("����");
                    WorkRecord workRecord2=new WorkRecord();
                    workRecord2.setId(id);
                    workRecord2.setTime(day1);
                    workRecord2.setClockOut(time1);
                    workRecord2.setLeave(minute);
                    System.out.println(workRecord2);
                    employeeService.editWorkRecord(workRecord2);
                    return "a3";
                }
                if(hour<-3){
                        System.out.println("����");
                        WorkRecord workRecord2=new WorkRecord(id,day1,time1);
                        workRecord2.setAbsent(1);
                        employeeService.editWorkRecord(workRecord2);
                        return "a4";

                }
                if(minute>=30){
                        System.out.println("�Ӱ�"+minute+"����");
                        WorkRecord workRecord2=new WorkRecord();
                        workRecord2.setId(id);
                        workRecord2.setTime(day1);
                        workRecord2.setClockOut(time1);
                        workRecord2.setOverTime(minute);
                        employeeService.editWorkRecord(workRecord2);
                        return "minute";
                }


            }else {
                return "fal";//�ϰ࿨û��
            }
        }
        return "fail";//�Ѿ������°࿨
    }

    /**
     * �鿴����
     * @param id
     * @param session
     * @return
     */
    @RequestMapping("check")
    public String check(int id,HttpSession session){
        List<WorkRecord> workRecords=employeeService.findWorkRecordById(id);
        session.setAttribute("workRecord",workRecords);
        return "employee/check";
    }
    @RequestMapping("findWork")
    public String findWork(WorkRecord workRecord,HttpSession session){
        List<WorkRecord> workRecords=employeeService.findWork(workRecord);
        session.setAttribute("workRecord",workRecords);
        return "employee/findWork";
    }
}
