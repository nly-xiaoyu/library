package edu.hunau.hyx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 五香加孜然
 * @creat2020--12--16--15:05
 */
@SpringBootApplication

@MapperScan(basePackages = {"edu.hunau.hyx.mapper"})
public class HelloApplication {
    //启动springboot工程
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }



}
