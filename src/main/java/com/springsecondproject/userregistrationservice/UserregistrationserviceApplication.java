package com.springsecondproject.userregistrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan

public class UserregistrationserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserregistrationserviceApplication.class, args);
//		ApplicationContext applicationContext = SpringApplication.run(UserregistrationserviceApplication.class, args);
//		String[] value = applicationContext.getBeanDefinitionNames();
//		for(String val: value)
//		{
//			System.out.println(val);
//		}
//
//		System.out.println("Application Started...");
//		}

	}


}