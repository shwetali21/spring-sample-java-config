package com.spring.fundamentals.repository;

import java.util.List;

import com.spring.fundamentals.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}