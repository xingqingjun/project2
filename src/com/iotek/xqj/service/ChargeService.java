package com.iotek.xqj.service;

import com.iotek.xqj.entity.Charge;

/**
 * Created by Machenike on 2018/10/16.
 */
public interface ChargeService {
    public Charge findChargeByNameAndPassword(Charge charge);
}
