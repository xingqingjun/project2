package com.iotek.xqj;

import com.iotek.xqj.dao.AdminDao;
import com.iotek.xqj.dao.ChargeDao;
import com.iotek.xqj.dao.DeptDao;
import com.iotek.xqj.dao.VisitorDao;
import com.iotek.xqj.entity.*;
import com.iotek.xqj.service.EmployeeService;
import com.iotek.xqj.service.PositonService;
import com.iotek.xqj.service.VisitorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Machenike on 2018/10/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class a {
    @Autowired
    private VisitorDao visitorDao;
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private VisitorService visitorService;
    @Autowired
    private PositonService positonService;
    @Autowired
    private ChargeDao chargeDao;
    @Autowired
    private EmployeeService employeeService;

    @Test
    public void findVisitor() {

        System.out.println(employeeService.findEmployeeByPositon("人事部经理"));
        System.out.println(deptDao.findDeptNameById(4));

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));
        SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
        String a = dd.format(new Date());
        System.out.println(dd.format(new Date()));
        String b = a + " 9:30:00";
        System.out.println(b);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date c = dateFormat.parse(b);
            System.out.println(c);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void test1(){
        Date a=new Date();
        WorkRecord workRecord2=new WorkRecord();
        workRecord2.setId(5);
        workRecord2.setTime(a);
        employeeService.editWorkRecord(workRecord2);
    }
}