package com.spring.collections.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emails")
public class Emails {
@Autowired
	private Student student;
public Emails() {
		System.out.println("Emails Constructor Invoked");
	}  

}
