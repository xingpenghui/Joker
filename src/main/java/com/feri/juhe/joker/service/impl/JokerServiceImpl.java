package com.feri.juhe.joker.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feri.juhe.joker.dao.JokerDao;
import com.feri.juhe.joker.entity.Joker;
import com.feri.juhe.joker.service.JokerService;
import org.springframework.stereotype.Service;

@Service
public class JokerServiceImpl extends ServiceImpl<JokerDao, Joker> implements JokerService  {
}
