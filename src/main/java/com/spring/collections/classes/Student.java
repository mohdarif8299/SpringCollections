package com.spring.collections.classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component(value="student1")
@Scope("singleton")
public class Student {
	@Autowired
	private Emails emails;
	@Autowired
	public Student(Emails emails) {
		System.out.println("Student Constructor invoked");
	}	
}
