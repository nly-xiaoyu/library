package edu.hunau.hyx.bean;

import java.util.Date;

public class StudentBook {
    private Integer id;

    private String sno;

    private String bno;

    private Date time;

    private Byte renew;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno == null ? null : bno.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Byte getRenew() {
        return renew;
    }

    public void setRenew(Byte renew) {
        this.renew = renew;
    }
}