package com.example.springboot;

import com.example.springboot.Models.Programmer;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootApplication.class, args);

		Programmer programmer= context.getBean(Programmer.class);
		programmer.getComputer().compile();
		System.out.println(programmer.getAge());

	}

}
