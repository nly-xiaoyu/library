package edu.hunau.hyx.bean;

public class Major {
    private Integer id;

    private String mno;

    private String mname;

    private String mdept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno == null ? null : mno.trim();
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMdept() {
        return mdept;
    }

    public void setMdept(String mdept) {
        this.mdept = mdept == null ? null : mdept.trim();
    }
}