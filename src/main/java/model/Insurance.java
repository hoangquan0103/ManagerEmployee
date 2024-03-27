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
public class Insurance {
    private int insurId;
    private int insurNumber;
    private Date insurDate;
    private String location;
    private String hosptitalName;

    public Insurance() {
    }
    
    

    public Insurance(int insurId, int insurNumber, Date insurDate, String location, String hosptitalName) {
        this.insurId = insurId;
        this.insurNumber = insurNumber;
        this.insurDate = insurDate;
        this.location = location;
        this.hosptitalName = hosptitalName;
    }

    public int getInsurId() {
        return insurId;
    }

    public void setInsurId(int insurId) {
        this.insurId = insurId;
    }

    public int getInsurNumber() {
        return insurNumber;
    }

    public void setInsurNumber(int insurNumber) {
        this.insurNumber = insurNumber;
    }

    public Date getInsurDate() {
        return insurDate;
    }

    public void setInsurDate(Date insurDate) {
        this.insurDate = insurDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHosptitalName() {
        return hosptitalName;
    }

    public void setHosptitalName(String hosptitalName) {
        this.hosptitalName = hosptitalName;
    }

    @Override
    public String toString() {
        return "Insurance{" + "insurId=" + insurId + ", insurNumber=" + insurNumber + ", insurDate=" + insurDate + ", location=" + location + ", hosptitalName=" + hosptitalName + '}';
    }
    
}
