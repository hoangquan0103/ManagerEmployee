/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Hoang Quan
 */
public class Contract {
    private int ctId;
    private Date startDate;
    private Date endDate;
    private Date signDate;
    private String content;
    private int resign;
    private float ctSalary;
    private Employee employeeId;
   
    public Contract() {
    }

    public Contract(Date startDate, Date endDate, Date signDate, String content, int resign, float ctSalary, Employee employeeId) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.signDate = signDate;
        this.content = content;
        this.resign = resign;
        this.ctSalary = ctSalary;
        this.employeeId = employeeId;
    }

    public int getCtId() {
        return ctId;
    }

    public void setCtId(int ctId) {
        this.ctId = ctId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getResign() {
        return resign;
    }

    public void setResign(int resign) {
        this.resign = resign;
    }

    public float getCtSalary() {
        return ctSalary;
    }

    public void setCtSalary(float ctSalary) {
        this.ctSalary = ctSalary;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Contract{" + "ctId=" + ctId + ", startDate=" + startDate + ", endDate=" + endDate + ", signDate=" + signDate + ", content=" + content + ", resign=" + resign + ", ctSalary=" + ctSalary + ", employeeId=" + employeeId + '}';
    }
    
}
