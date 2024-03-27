/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hoang Quan
 */
public class Department {
    private int dpmId;
    private String dpmName;

    public Department() {
    }
        
    public Department(int dpmId, String dpmName) {
        this.dpmId = dpmId;
        this.dpmName = dpmName;
    }

    public int getDepartId() {
        return dpmId;
    }

    public void setDepartId(int dpmId) {
        this.dpmId = dpmId;
    }

    public String getDepartName() {
        return dpmName;
    }

    public void setDepartName(String dpmName) {
        this.dpmName = dpmName;
    }

    @Override
    public String toString() {
        return "Department{" + "dpmId=" + dpmId + ", dpmName=" + dpmName + '}';
    }
}
