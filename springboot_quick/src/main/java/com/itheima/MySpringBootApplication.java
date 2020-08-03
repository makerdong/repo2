package com.itheima;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication：标注SpringBoot的启动类，该注解具备多种功能
@SpringBootApplication
public class MySpringBootApplication {

    //main是java程序的入口
    public static void main(String[] args) {
        //run方法 表示运行SpringBoot的引导类  run参数就是SpringBoot引导类的字节码对象
        SpringApplication.run(MySpringBootApplication.class);

    }
}
