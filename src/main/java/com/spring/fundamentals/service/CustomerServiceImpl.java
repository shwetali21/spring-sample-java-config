package com.spring.fundamentals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.fundamentals.model.Customer;
import com.spring.fundamentals.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//@Autowired
	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {}
	
	//For constructor injection
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Using Constructor Injection");
		this.customerRepository = customerRepository;
	}

	//For setter injection
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Using Setter Injection");
		this.customerRepository = customerRepository;
	}


	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
