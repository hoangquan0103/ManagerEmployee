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
public class PublishBonus {
    private int pbId;
    private int pbDetail;
    private String pbContent;
    private Date pbDate;
    private int pbType;

    public PublishBonus() {
    }

    public PublishBonus(int pbId, int pbDetail, String pbContent, Date pbDate, int pbType) {
        this.pbId = pbId;
        this.pbDetail = pbDetail;
        this.pbContent = pbContent;
        this.pbDate = pbDate;
        this.pbType = pbType;
    }

    public int getPbId() {
        return pbId;
    }

    public void setPbId(int pbId) {
        this.pbId = pbId;
    }

    public int getPbDetail() {
        return pbDetail;
    }

    public void setPbDetail(int pbDetail) {
        this.pbDetail = pbDetail;
    }

    public String getPbContent() {
        return pbContent;
    }

    public void setPbContent(String pbContent) {
        this.pbContent = pbContent;
    }

    public Date getPbDate() {
        return pbDate;
    }

    public void setPbDate(Date pbDate) {
        this.pbDate = pbDate;
    }

    public int getPbType() {
        return pbType;
    }

    public void setPbType(int pbType) {
        this.pbType = pbType;
    }
    
    
}
