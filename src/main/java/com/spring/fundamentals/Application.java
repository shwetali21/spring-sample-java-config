package com.spring.fundamentals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.fundamentals.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
		System.out.println("customerService address :" + customerService);
		
		CustomerService customerService2 = appContext.getBean("customerService", CustomerService.class);
		System.out.println("customerService address :" + customerService2);
		
		System.out.println(customerService.findAll().get(0).getFirstName());
	}
}
