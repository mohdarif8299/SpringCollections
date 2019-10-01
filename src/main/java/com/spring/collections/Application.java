package com.spring.collections;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.collections.config.ApplicationConfig;
public class Application {
	public static void main(String[] args) {
		System.out.println("Creating Container");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		System.out.println("Container Created");
//		Student student = context.getBean("student1",Student.class);
		//Emails emails = context.getBean("emails",Emails.class);
		context.close();
	}
}
