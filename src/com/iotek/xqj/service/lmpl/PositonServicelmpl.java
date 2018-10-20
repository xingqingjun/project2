package com.iotek.xqj.service.lmpl;

import com.iotek.xqj.dao.PositonDao;
import com.iotek.xqj.entity.Positon;
import com.iotek.xqj.service.PositonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Machenike on 2018/10/13.
 */
@Service("positonService")
public class PositonServicelmpl implements PositonService {
    @Autowired
    private PositonDao positonDao;
    @Override
    public List<Positon> queryAllPositon(int deptId) {
        return positonDao.queryAllPositon(deptId);
    }

    @Override
    public List<Positon> AllPositon() {
        return positonDao.AllPositon();
    }

    @Override
    public Positon findPositon(int id) {
        return positonDao.findPositon(id);
    }

    @Override
    public void deletePositonById(int id) {
        positonDao.deletePositonById(id);
    }

    @Override
    public void addPositon(Positon positon) {
        positonDao.addPositon(positon);
    }

    @Override
    public void editPositonById(Positon positon) {
        positonDao.editPositonById(positon);
    }
}
