package edu.hunau.hyx.bean;

public class StudentBorrow {
    private Integer id;

    private String sno;

    private String bno;

    private byte[] state;

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

    public byte[] getState() {
        return state;
    }

    public void setState(byte[] state) {
        this.state = state;
    }
}