package edu.hunau.hyx.bean;

public class Book {
    private Integer id;

    private String bname;

    private Integer bno;

    private String authoe;

    private Double price;

    private Integer locnum;

    private String locarea;

    private String ramark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public Integer getBno() {
        return bno;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public String getAuthoe() {
        return authoe;
    }

    public void setAuthoe(String authoe) {
        this.authoe = authoe == null ? null : authoe.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getLocnum() {
        return locnum;
    }

    public void setLocnum(Integer locnum) {
        this.locnum = locnum;
    }

    public String getLocarea() {
        return locarea;
    }

    public void setLocarea(String locarea) {
        this.locarea = locarea == null ? null : locarea.trim();
    }

    public String getRamark() {
        return ramark;
    }

    public void setRamark(String ramark) {
        this.ramark = ramark == null ? null : ramark.trim();
    }
}