package edu.hunau.hyx.bean;

/**
 * @author 五香加孜然
 * @creat2021--09--27--23:02
 */
public class Response {
    private String msg;
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
