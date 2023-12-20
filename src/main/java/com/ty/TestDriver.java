package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDriver 
{
	 public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(my_config.class);
		Person person =(Person) context.getBean("person");
		person.use();
		
	}

}
