package com.green.memoserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.green.memoserver")
@SpringBootApplication
public class MemoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemoServerApplication.class, args);
    }

}
