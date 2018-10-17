package com.iotek.xqj.entity;

import java.sql.Date;

/**
 * Created by Machenike on 2018/10/12.
 */
public class Resume {
    private int id;//游客id
    private String name;
    private String sex;
    private int age;
    private String education;//学历
    private int phone;
    private String email;
    private String dept;//部门
    private String positon;//职位
    private String political;//政治面貌
    private String lastJob;//上份工作
    private String workExperience;//工作经验
    private String salary;
    private String habby;
    private String state;//提交状态
    private Date time;//投递时间
    private String interview="未面试";//面试状态
    private String look="未查看";//查看状态
    private Date interviewTime;//面试时间
    private String inform="未通知";//是否通知面试
    private String record="未录用";//是否录用

    public Resume() {
    }

    public Resume(int id, String name, String sex, int age, String education, int phone, String email, String dept, String positon, String political, String lastJob, String workExperience, String salary, String habby, String state, Date time, String interview, String look, Date interviewTime, String inform, String record) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.phone = phone;
        this.email = email;
        this.dept = dept;
        this.positon = positon;
        this.political = political;
        this.lastJob = lastJob;
        this.workExperience = workExperience;
        this.salary = salary;
        this.habby = habby;
        this.state = state;
        this.time = time;
        this.interview = interview;
        this.look = look;
        this.interviewTime = interviewTime;
        this.inform = inform;
        this.record = record;
    }

    public Resume(int id, String name, String sex, int age, String education, int phone, String email, String dept, String positon, String political, String lastJob, String workExperience, String salary, String habby, String state, Date time, String interview, String look, Date interviewTime, String inform) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.phone = phone;
        this.email = email;
        this.dept = dept;
        this.positon = positon;
        this.political = political;
        this.lastJob = lastJob;
        this.workExperience = workExperience;
        this.salary = salary;
        this.habby = habby;
        this.state = state;
        this.time = time;
        this.interview = interview;
        this.look = look;
        this.interviewTime = interviewTime;
        this.inform = inform;
    }

    public Date getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(Date interviewTime) {
        this.interviewTime = interviewTime;
    }

    public String getInform() {
        return inform;
    }

    public void setInform(String inform) {
        this.inform = inform;
    }

    public Date getTime() {
        return time;
    }

    public String getInterview() {
        return interview;
    }

    public void setInterview(String interview) {
        this.interview = interview;
    }

    public String getLook() {
        return look;
    }

    public void setLook(String look) {
        this.look = look;
    }

    public Resume(int id, String name, String sex, int age, String education, int phone, String email, String dept, String positon, String political, String lastJob, String workExperience, String salary, String habby, String state, Date time, String interview, String look) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.phone = phone;
        this.email = email;
        this.dept = dept;
        this.positon = positon;
        this.political = political;
        this.lastJob = lastJob;
        this.workExperience = workExperience;
        this.salary = salary;
        this.habby = habby;
        this.state = state;
        this.time = time;
        this.interview = interview;
        this.look = look;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Resume(int id, String name, String sex, int age, String education, int phone, String email, String dept, String positon, String political, String lastJob, String workExperience, String salary, String habby) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.phone = phone;
        this.email = email;
        this.dept = dept;
        this.positon = positon;
        this.political = political;
        this.lastJob = lastJob;
        this.workExperience = workExperience;
        this.salary = salary;
        this.habby = habby;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Resume(String name, String sex, int age, String education, int phone, String email, String dept, String positon, String political, String lastJob, String workExperience, String salary, String habby) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.phone = phone;
        this.email = email;
        this.dept = dept;
        this.positon = positon;
        this.political = political;
        this.lastJob = lastJob;
        this.workExperience = workExperience;
        this.salary = salary;
        this.habby = habby;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public String getLastJob() {
        return lastJob;
    }

    public void setLastJob(String lastJob) {
        this.lastJob = lastJob;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getHabby() {
        return habby;
    }

    public void setHabby(String habby) {
        this.habby = habby;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", dept='" + dept + '\'' +
                ", positon='" + positon + '\'' +
                ", political='" + political + '\'' +
                ", lastJob='" + lastJob + '\'' +
                ", workExperience='" + workExperience + '\'' +
                ", salary='" + salary + '\'' +
                ", habby='" + habby + '\'' +
                '}';
    }
}