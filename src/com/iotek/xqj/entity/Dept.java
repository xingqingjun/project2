package com.iotek.xqj.entity;

import java.sql.Date;

/**
 * Created by Machenike on 2018/10/12.
 */
public class Dept {
    private int id;
    private String name;
    private Date time;//创建时间

    public Dept() {
    }

    public Dept(int id, String name, Date time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public Dept(String name, Date time) {
        this.name = name;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
