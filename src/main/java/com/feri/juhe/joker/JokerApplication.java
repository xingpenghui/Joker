package com.feri.juhe.joker;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication //SpringBoot 开关类标记
@MapperScan("com.feri.juhe.joker.dao") //扫描MybatisDao层代码
@EnableSwagger2 //Swagger生效注解
@ServletComponentScan//启用注解 Servlet相关注解
@EnableScheduling //启用定时任务 Spring Task
public class JokerApplication {
    public static void main(String[] args) {
        SpringApplication.run(JokerApplication.class,args);
    }


    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // paginationInterceptor.setLimit(你的最大单页限制数量，默认 500 条，小于 0 如 -1 不受限制);
        return paginationInterceptor;
    }
}
