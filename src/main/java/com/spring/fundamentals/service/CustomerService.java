package com.spring.fundamentals.service;

import java.util.List;

import com.spring.fundamentals.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}