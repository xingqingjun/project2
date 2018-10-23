package com.iotek.xqj.entity;

import java.util.Date;

/**
 * Created by Machenike on 2018/10/19.
 */
public class WorkRecord {
    private int id;
    private String name;
    private Date time;//����
    private Date clockIn;//�ϰ��ʱ��
    private Date clockOut;//�°��ʱ��
    private int late;//�ٵ�Сʱ
    private int absent;//��������
    private int leave;//����Сʱ
    private int overTime;//�Ӱ�Сʱ

    public WorkRecord() {
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

    public Date getClockIn() {
        return clockIn;
    }

    public void setClockIn(Date clockIn) {
        this.clockIn = clockIn;
    }

    public Date getClockOut() {
        return clockOut;
    }

    public void setClockOut(Date clockOut) {
        this.clockOut = clockOut;
    }

    public int getLate() {
        return late;
    }

    public void setLate(int late) {
        this.late = late;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    public int getLeave() {
        return leave;
    }

    public void setLeave(int leave) {
        this.leave = leave;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public WorkRecord(int id, String name, Date time, Date clockIn) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.clockIn = clockIn;
    }


    public WorkRecord(int id, String name, Date time, Date clockIn, int late) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.clockIn = clockIn;
        this.late = late;
    }

    public WorkRecord(int id, Date time) {
        this.id = id;
        this.time = time;
    }

    public WorkRecord(int id, Date time, Date clockOut) {
        this.id = id;
        this.time = time;
        this.clockOut = clockOut;
    }

    public WorkRecord(int id, Date time, Date clockOut, int leave) {
        this.id = id;
        this.time = time;
        this.clockOut = clockOut;
        this.leave = leave;
    }

    public WorkRecord(int id, String name, Date time, Date clockIn, Date clockOut, int late, int absent, int leave, int overTime) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.clockIn = clockIn;
        this.clockOut = clockOut;
        this.late = late;
        this.absent = absent;
        this.leave = leave;
        this.overTime = overTime;
    }

    @Override
    public String toString() {
        return "WorkRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", clockIn=" + clockIn +
                ", clockOut=" + clockOut +
                ", late=" + late +
                ", absent=" + absent +
                ", leave=" + leave +
                ", overTime=" + overTime +
                '}';
    }
}
