package com.institute;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.institute.users.Student;
import com.institute.users.Teacher;

@SpringBootApplication
public class SpringIntroApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringIntroApplication.class, args);
		Student st = ctx.getBean(Student.class);
		Teacher th = ctx.getBean(Teacher.class);
	}

}
