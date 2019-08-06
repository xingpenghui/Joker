package com.feri.juhe.joker.vo;

import lombok.Data;

@Data
public class ResultBean {
    private int code;
    private String msg;
    private Object data;

    public static ResultBean setOK(String msg,Object obj){
        ResultBean rb=new ResultBean();
        rb.setCode(200);
        rb.setMsg(msg);
        rb.setData(obj);
        return rb;
    }
    public static ResultBean setOK(String msg){
        ResultBean rb=new ResultBean();
        rb.setCode(200);
        rb.setMsg(msg);
        rb.setData(null);
        return rb;
    }
    public static ResultBean setERROR(String msg){
        ResultBean rb=new ResultBean();
        rb.setCode(400);
        rb.setMsg(msg);
        rb.setData(null);
        return rb;
    }
    public static ResultBean exec(boolean issucc,String msg){
        return issucc?setOK(msg):setERROR(msg);
    }
}
