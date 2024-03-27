/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hoang Quan
 */
public class AcademicLevel {
    private int lvId;
    private String lvName;

    public AcademicLevel() {
    }
    
    public AcademicLevel(int lvId, String lvName) {
        this.lvId = lvId;
        this.lvName = lvName;
    }

    public int getLevelId() {
        return lvId;
    }

    public void setLevelId(int lvId) {
        this.lvId = lvId;
    }

    public String getLevelName() {
        return lvName;
    }

    public void setLevelName(String lvName) {
        this.lvName = lvName;
    }

    @Override
    public String toString() {
        return "AcademicLevel{" + "lvId=" + lvId + ", lvName=" + lvName + '}';
    }
}
