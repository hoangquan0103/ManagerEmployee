/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hoang Quan
 */
public class TimeKeeping {
    private int timeKeepingId;
    private int year;
    private int month;
    private int day;
    private int startHour;
    private int endHour;
    private int startMinute;
    private int endMinute;
    private int jobType;

    public TimeKeeping() {
    }
    
    

    public TimeKeeping(int timeKeepingId, int year, int month, int day, int startHour, int endHour, int startMinute, int endMinute, int jobType) {
        this.timeKeepingId = timeKeepingId;
        this.year = year;
        this.month = month;
        this.day = day;
        this.startHour = startHour;
        this.endHour = endHour;
        this.startMinute = startMinute;
        this.endMinute = endMinute;
        this.jobType = jobType;
    }

    public int getTimeKeepingId() {
        return timeKeepingId;
    }

    public void setTimeKeepingId(int timeKeepingId) {
        this.timeKeepingId = timeKeepingId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    public int getJobType() {
        return jobType;
    }

    public void setJobType(int jobType) {
        this.jobType = jobType;
    }

    @Override
    public String toString() {
        return "TimeKeeping{" + "timeKeepingId=" + timeKeepingId + ", year=" + year + ", month=" + month + ", day=" + day + ", startHour=" + startHour + ", endHour=" + endHour + ", startMinute=" + startMinute + ", endMinute=" + endMinute + ", jobType=" + jobType + '}';
    }
    
    
}
