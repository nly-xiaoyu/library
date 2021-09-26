package edu.hunau.hyx.bean;

public class Student {
    private Integer id;

    private Integer sno;

    private String sname;

    private Integer sage;

    private String ssex;

    private String stel;

    private String smajor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel == null ? null : stel.trim();
    }

    public String getSmajor() {
        return smajor;
    }

    public void setSmajor(String smajor) {
        this.smajor = smajor == null ? null : smajor.trim();
    }
}