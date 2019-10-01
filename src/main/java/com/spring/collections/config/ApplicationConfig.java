package com.spring.collections.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
@ComponentScan("com.spring.collections.classes")
public class ApplicationConfig {
	@Bean
	@Scope("prototype")
	public ArrayList<String> arrayList1(){
		System.out.println("Bean of ArrayList<String> created");
		ArrayList<String> al = new ArrayList<String>();
		al.add("Lucky");
		al.add("Ruman");
		return al;
	}
	@Bean
	@Scope("prototype")
	public ArrayList<Integer> arrayList2(){
		System.out.println("Bean of ArrayList<Integer> created");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(101);
		al.add(107);
		return al;
	}
}
