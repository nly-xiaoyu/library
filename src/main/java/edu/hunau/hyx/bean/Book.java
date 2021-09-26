package edu.hunau.hyx.bean;

public class Book {
    private Integer id;

    private String bno;

    private String bname;

    private String bauthor;

    private Double bprice;

    private Integer bnum;

    private String bshelf;

    private String bremark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno == null ? null : bno.trim();
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor == null ? null : bauthor.trim();
    }

    public Double getBprice() {
        return bprice;
    }

    public void setBprice(Double bprice) {
        this.bprice = bprice;
    }

    public Integer getBnum() {
        return bnum;
    }

    public void setBnum(Integer bnum) {
        this.bnum = bnum;
    }

    public String getBshelf() {
        return bshelf;
    }

    public void setBshelf(String bshelf) {
        this.bshelf = bshelf == null ? null : bshelf.trim();
    }

    public String getBremark() {
        return bremark;
    }

    public void setBremark(String bremark) {
        this.bremark = bremark == null ? null : bremark.trim();
    }
}