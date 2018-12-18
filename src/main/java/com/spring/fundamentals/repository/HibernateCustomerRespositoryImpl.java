package com.spring.fundamentals.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.fundamentals.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRespositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("Albus");
		customer.setLastName("Dumbledore");

		customers.add(customer);

		return customers;
	}
}
