package com.iotek.xqj.service.lmpl;

import com.iotek.xqj.dao.ChargeDao;
import com.iotek.xqj.entity.Charge;
import com.iotek.xqj.entity.Resume;
import com.iotek.xqj.service.ChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Machenike on 2018/10/16.
 */
@Service("chargeService")
public class ChargeServicelmpl implements ChargeService {
    @Autowired
    private ChargeDao chargeDao;
    @Override
    public Charge findChargeByNameAndPassword(Charge charge) {
        return chargeDao.findChargeByNameAndPassword(charge);
    }

    @Override
    public List<Resume> findResumeByDept(String dept) {
        return chargeDao.findResumeByDept(dept);
    }
}
