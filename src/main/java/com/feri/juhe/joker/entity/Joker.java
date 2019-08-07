package com.feri.juhe.joker.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.math.BigInteger;
import java.util.Date;

@Data
@TableName("t_joker")
public class Joker {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String content;
    private String hashid;
    private BigInteger unixtime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;
}