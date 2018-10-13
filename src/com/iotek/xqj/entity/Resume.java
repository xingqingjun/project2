package com.iotek.xqj.entity;

/**
 * Created by Machenike on 2018/10/12.
 */
public class Resume {
    private int id;
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

    public Resume() {
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