package edu.hunau.hyx.bean;

public class Premit {
    private Integer id;

    private String prename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename == null ? null : prename.trim();
    }
}