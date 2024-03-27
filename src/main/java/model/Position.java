/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hoang Quan
 */
public class Position {
    private int pstId;
    private String pstName;

    public Position() {
    }

    public Position(int pstId, String pstName) {
        this.pstId = pstId;
        this.pstName = pstName;
    }

    public int getPosiId() {
        return pstId;
    }

    public void setPosiId(int pstId) {
        this.pstId = pstId;
    }

    public String getPosiName() {
        return pstName;
    }

    public void setPosiName(String pstName) {
        this.pstName = pstName;
    }

    @Override
    public String toString() {
        return "Position{" + "pstId=" + pstId + ", pstName=" + pstName + '}';
    }
    
    
}
