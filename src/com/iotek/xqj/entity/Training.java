package com.iotek.xqj.entity;

import java.util.Date;

/**
 * Created by Machenike on 2018/10/22.
 */
public class Training {
    private int id;
    private String name;
    private String dept;
    private Date time;

    public Training() {
    }

    public Training(int id, String name, String dept, Date time) {
        this.id = id;
        this.name = name;
        this.dept = dept;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", time=" + time +
                '}';
    }
}
