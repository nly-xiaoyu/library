package edu.hunau.hyx.bean;

import java.util.Date;

public class Appointment {
    private Integer id;

    private Integer uid;

    private Integer bid;

    private Date borrow;

    private Date reback;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Date getBorrow() {
        return borrow;
    }

    public void setBorrow(Date borrow) {
        this.borrow = borrow;
    }

    public Date getReback() {
        return reback;
    }

    public void setReback(Date reback) {
        this.reback = reback;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}