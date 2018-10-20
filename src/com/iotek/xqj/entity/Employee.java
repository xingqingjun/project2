package com.iotek.xqj.entity;

import java.sql.Date;

/**
 * Created by Machenike on 2018/10/17.
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String dept;
    private String positon;
    private int phone;
    private String education;
    private String salary;
    private Date time;
    private String state;//Ô±¹¤×´Ì¬

    public Employee() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Employee(int id, String name, int age, String sex, String dept, String positon, int phone, String education, String salary, Date time) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.dept = dept;
        this.positon = positon;
        this.phone = phone;
        this.education = education;
        this.salary = salary;
        this.time = time;
    }

    public Employee(int id, String name, String sex, String dept, String positon, int phone, String education, String salary, Date time) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dept = dept;
        this.positon = positon;
        this.phone = phone;
        this.education = education;
        this.salary = salary;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPositon() {
        return positon;
    }

    public void setPositon(String positon) {
        this.positon = positon;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", dept='" + dept + '\'' +
                ", positon='" + positon + '\'' +
                ", phone=" + phone +
                ", education='" + education + '\'' +
                ", salary='" + salary + '\'' +
                ", time=" + time +
                '}';
    }
}
