package com.rainbow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//告知spring加载配置文件
@ImportResource(value = {"classpath:providers.xml"})
public class SpringbootDubboProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboProvider1Application.class, args);
	}
}
