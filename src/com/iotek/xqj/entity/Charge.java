package com.iotek.xqj.entity;

/**
 * Created by Machenike on 2018/10/16.
 */
public class Charge {
    private int id;
    private String name;//’À∫≈
    private String password;//√‹¬Î
    private String dept;//≤ø√≈

    public Charge() {
    }

    public Charge(int id, String name, String password, String dept) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.dept = dept;
    }

    public Charge(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "Charge{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
