package com.iotek.xqj;

import com.iotek.xqj.dao.AdminDao;
import com.iotek.xqj.dao.ChargeDao;
import com.iotek.xqj.dao.DeptDao;
import com.iotek.xqj.dao.VisitorDao;
import com.iotek.xqj.entity.*;
import com.iotek.xqj.service.PositonService;
import com.iotek.xqj.service.VisitorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
    @Test
    public void findVisitor(){
        Visitor visitor=new Visitor("aaa");
        System.out.println(positonService.queryAllPositon(1));
        System.out.println(adminDao.allResume());
        System.out.println(adminDao.allResumeById(3));
        Charge charge=new Charge("aaa","111");
        System.out.println(chargeDao.findChargeByNameAndPassword(charge));
        System.out.println(chargeDao.findResumeByDept("»À ¬≤ø"));


    }
}
