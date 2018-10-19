package com.iotek.xqj.entity;

/**
 * Created by Machenike on 2018/10/12.
 */
public class Dept {
    private int id;
    private String name;
    private Dept time;//创建时间

    public Dept() {
    }

    public Dept(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Dept(int id, String name, Dept time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public Dept getTime() {
        return time;
    }

    public void setTime(Dept time) {
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

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
