package com.feri.juhe.joker.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.feri.juhe.joker.entity.Joker;
import com.feri.juhe.joker.service.JokerService;
import com.feri.juhe.joker.vo.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "笑话大全",tags = "笑话大全")
@RestController
public class JokerController {
    @Autowired
    private JokerService jokerService;

    //新增
    @ApiOperation(value = "新增",notes = "新增笑话")
    @PostMapping("/juhe/joker/save.do")
    public ResultBean save(@RequestBody Joker joker){
       return ResultBean.exec(jokerService.save(joker),"新增");
    }
    //删除
    @ApiOperation(value = "删除",notes = "删除笑话")
    @DeleteMapping("/juhe/joker/del/{id}")
    public ResultBean del(@PathVariable int id){
        return ResultBean.exec(jokerService.removeById(id),"删除");
    }
    //修改
    @ApiOperation(value = "修改",notes = "修改笑话")
    @PutMapping("/juhe/joker/update.do")
    public ResultBean update(@RequestBody Joker joker){
        return ResultBean.exec(jokerService.updateById(joker),"修改");
    }
    //查询全部
    @ApiOperation(value = "查询全部",notes = "查询全部笑话")
    @GetMapping("/juhe/joker/all.do")
    public ResultBean all(){
        return ResultBean.setOK("OK",jokerService.list());
    }
    //查询详情
    @ApiOperation(value = "查询详情",notes = "查询详情笑话")
    @GetMapping("/juhe/joker/detail/{id}")
    public ResultBean detail(@PathVariable int id){
        return ResultBean.setOK("OK",jokerService.getById(id));
    }
    //分页查询
    @ApiOperation(value = "分页查询",notes = "分页查询笑话")
    @GetMapping("/juhe/joker/page/{page}/{count}")
    public ResultBean page(@PathVariable int page,@PathVariable int count){
        Page<Joker> jokerPage=new Page<>(page,count);
        return ResultBean.setOK("OK",jokerService.page(jokerPage));
    }
}
