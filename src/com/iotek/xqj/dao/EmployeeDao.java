package com.iotek.xqj.dao;

import com.iotek.xqj.entity.Employee;
import com.iotek.xqj.entity.WorkRecord;

import java.util.Date;
import java.util.List;

/**
 * Created by Machenike on 2018/10/17.
 */
public interface EmployeeDao {
    public void addEmployee(Employee employee);//���Ա��
    public Employee findEmployeeById(int id);//�鿴Ա��������Ϣ
    public void editEmployee(Employee employee);//�޸ĸ�����Ϣ
    public List<Employee> findEmployeeByPositon(String positon);
    public List<Employee> findEmployeeByDept(String dept);//ͨ�����Ų���
    public void addWorkRecord(WorkRecord workRecord);//��ӿ���(������)
    public void addWorkRecord1(WorkRecord workRecord);//(�ٵ�)
    public void addWorkRecord2(WorkRecord workRecord);//(����)
    public WorkRecord findWorkRecordByTime(WorkRecord workRecord);//ͨ������ʱ���ѯ
    public void editWorkRecord(WorkRecord workRecord);//�����°࿼��
    public List<WorkRecord> findWorkRecordById(int id);//��ѯ
    public List<WorkRecord> findWork(WorkRecord workRecord);//ģ����ѯ

}
