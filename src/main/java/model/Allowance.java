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
public class Allowance {
    private int awcId;
    private String awcType;
    private Date awcDate;
    private float awcMoney;

    public Allowance() {
    }

    public Allowance(int awcId, String awcType, Date awcDate, float awcMoney) {
        this.awcId = awcId;
        this.awcType = awcType;
        this.awcDate = awcDate;
        this.awcMoney = awcMoney;
    }

    public int getAwcId() {
        return awcId;
    }

    public void setAwcId(int awcId) {
        this.awcId = awcId;
    }

    public String getAwcType() {
        return awcType;
    }

    public void setAwcType(String awcType) {
        this.awcType = awcType;
    }

    public Date getAwcDate() {
        return awcDate;
    }

    public void setAwcDate(Date awcDate) {
        this.awcDate = awcDate;
    }

    public float getAwcMoney() {
        return awcMoney;
    }

    public void setAwcMoney(float awcMoney) {
        this.awcMoney = awcMoney;
    }
    
    
}
