package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.springboot.service"})
@MapperScan(basePackages="com.springboot.mapper")
public class SpringbootqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootqApplication.class, args);
	}

}
