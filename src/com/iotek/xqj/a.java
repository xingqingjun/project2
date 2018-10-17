package com.iotek.xqj;

import com.iotek.xqj.dao.AdminDao;
import com.iotek.xqj.dao.DeptDao;
import com.iotek.xqj.dao.VisitorDao;
import com.iotek.xqj.entity.Admin;
import com.iotek.xqj.entity.Positon;
import com.iotek.xqj.entity.Visitor;
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
    @Test
    public void findVisitor(){
        Visitor visitor=new Visitor("aaa");
        System.out.println(positonService.queryAllPositon(1));
        System.out.println(visitorService.lookResume(1));
    }
}
