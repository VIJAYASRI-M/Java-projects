package com.example.springboot;

import com.example.springboot.Example.Programmer;
import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setName("Vijayasri");
		student.setId(2);
		student.setMarks(508);

		StudentService service = context.getBean(StudentService.class);
		service.add(student);
		System.out.println(service.listAllStudents());

	}

}
