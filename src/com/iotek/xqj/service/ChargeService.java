package com.iotek.xqj.service;

import com.iotek.xqj.entity.Charge;
import com.iotek.xqj.entity.Resume;

import java.util.List;

/**
 * Created by Machenike on 2018/10/16.
 */
public interface ChargeService {
    public Charge findChargeByNameAndPassword(Charge charge);
    public List<Resume> findResumeByDept(String dept);
}
