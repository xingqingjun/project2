package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Charge;

/**
 * Created by Machenike on 2018/10/16.
 */
public interface ChargeDao {
    public Charge findChargeByNameAndPassword(Charge charge);
}
