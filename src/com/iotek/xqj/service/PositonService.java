package com.iotek.xqj.service;

import com.iotek.xqj.entity.Positon;

import java.util.List;

/**
 * Created by Machenike on 2018/10/13.
 */
public interface PositonService {
    public List<Positon> queryAllPositon(int deptId);
    public List<Positon> AllPositon();
}
