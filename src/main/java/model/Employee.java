/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Hoang Quan
 */
public class Employee {
    private int employeeId;
    private String name;
    private String sex;
    private Date dob;
    private String phone;
    private String password;
    private Role role;
    private String idCard;
    private String address;
    private String picture;
    
    private Department dpmId;
    private Position pstId;
    private AcademicLevel lvId;
    

    public Employee() {
    }

    public Employee(String name, String phone, String password, Role role, Department dpmId, Position pstId, AcademicLevel lvId) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.role = role;
        this.dpmId = dpmId;
        this.pstId = pstId;
        this.lvId = lvId;
    }

    public Employee(String sex, Date dob, String idCard, String address, String picture) {
        this.sex = sex;
        this.dob = dob;
        this.idCard = idCard;
        this.address = address;
        this.picture = picture;
    }
    
    public Employee(String name, String phone, String password, Role role, String picture, Department dpmId, Position pstId, AcademicLevel lvId) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.role = role;
        this.picture = picture;
        this.dpmId = dpmId;
        this.pstId = pstId;
        this.lvId = lvId;
    }

    
    public Employee(String name, String sex, Date dob, String phone, String password, 
            Role role, String idCard, String address, String picture, 
            Department dpmId, Position pstId, AcademicLevel lvId) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.phone = phone;
        this.password = password;
        this.role = role;
        this.idCard = idCard;
        this.address = address;
        this.picture = picture;
        this.dpmId = dpmId;
        this.pstId = pstId;
        this.lvId = lvId;
    }

    public Employee(int employeeId, String name, String sex, Date dob, String phone, String password, 
            Role role, String idCard, String address, String picture, 
            Department dpmId, Position pstId, AcademicLevel lvId) {
        this.employeeId = employeeId;
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.phone = phone;
        this.password = password;
        this.role = role;
        this.idCard = idCard;
        this.address = address;
        this.picture = picture;
        this.dpmId = dpmId;
        this.pstId = pstId;
        this.lvId = lvId;
    }
    

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Department getDpmId() {
        return dpmId;
    }

    public void setDpmId(Department dpmId) {
        this.dpmId = dpmId;
    }

    public Position getPstId() {
        return pstId;
    }

    public void setPstId(Position pstId) {
        this.pstId = pstId;
    }

    public AcademicLevel getLvId() {
        return lvId;
    }

    public void setLvId(AcademicLevel lvId) {
        this.lvId = lvId;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", name=" + name + ", sex=" + sex + ", dob=" + dob + ", phone=" + phone + ", password=" + password 
                + ", role=" + role + ", idCard=" + idCard + ", address=" + address + ", picture=" + picture 
                + ", dpmId=" + dpmId + ", pstId=" + pstId + ", lvId=" + lvId + '}';
    }
    
    
}
