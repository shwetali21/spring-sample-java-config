package com.spring.fundamentals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.fundamentals.repository.CustomerRepository;
import com.spring.fundamentals.repository.HibernateCustomerRespositoryImpl;
import com.spring.fundamentals.service.CustomerService;
import com.spring.fundamentals.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.spring.fundamentals"})
public class AppConfig { 

	/*@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRespository());	//Setter Injection
		return service;
	}*/

	/*@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRespository()); //constructor injection
		return service;
	}*/

	/*@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl();	//Used with @Autowired
		return service;
	}*/

	/*@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRespository() {
		return new HibernateCustomerRespositoryImpl();
	}*/
}
