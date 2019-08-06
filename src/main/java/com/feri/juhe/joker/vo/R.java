package com.feri.juhe.joker.vo;

import lombok.Data;

/**
 * 泛型的应用*/
@Data
public class R<T> {
    private int code;
    private String msg;
    private T data;


    public static <E> R setOK(String msg,E obj){
        R<E> r=new R<>();
        r.setCode(200);
        r.setMsg(msg);
        r.setData(obj);
        return r;
    }
}
