package com.iotek.xqj.controller;

import com.iotek.xqj.entity.Charge;
import com.iotek.xqj.service.ChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Machenike on 2018/10/16.
 */
@RequestMapping("charge")
@Controller
public class ChargeServlet {
    @Autowired
    private ChargeService chargeService;
    @RequestMapping("login")
    public String login(Charge charge){
        Charge charge1=chargeService.findChargeByNameAndPassword(charge);
        if(charge1!=null){
            return "charge/mainView";
        }else {
            return "charge/login";
        }
    }
}
