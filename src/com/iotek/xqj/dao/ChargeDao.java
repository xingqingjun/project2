package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Charge;
import com.iotek.xqj.entity.Resume;

import java.util.List;

/**
 * Created by Machenike on 2018/10/16.
 */
public interface ChargeDao {
    public Charge findChargeByNameAndPassword(Charge charge);//Ö÷¹ÜµÇÂ¼
    public List<Resume> findResumeByDept(String dept);
}
