package com.iotek.xqj.entity;

/**
 * Created by Machenike on 2018/10/12.
 */
public class Positon {
    private int id;
    private int deptId;//����id
    private String name;

    public Positon() {
    }

    public Positon(int id, int deptId, String name) {
        this.id = id;
        this.deptId = deptId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Positon{" +
                "id=" + id +
                ", deptId=" + deptId +
                ", name='" + name + '\'' +
                '}';
    }
}
