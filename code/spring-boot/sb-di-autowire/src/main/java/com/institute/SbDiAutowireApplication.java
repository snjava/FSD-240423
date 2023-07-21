package com.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.institute.controller.StudentController;
import com.institute.util.DBProperties;

@SpringBootApplication
public class SbDiAutowireApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SbDiAutowireApplication.class, args);
		StudentController st = ctx.getBean(StudentController.class);
		st.saveStudentData();
	}
	
	@Bean
	public DBProperties getDbProp() {
		DBProperties prop = new DBProperties("MySql-URL","MySql-UserName","MySql-Password");
		return prop;
	}

}
