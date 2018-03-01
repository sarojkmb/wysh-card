package com.abrolly.service;

import java.util.List;

import com.abrolly.model.Customer;

public interface CustomerService {
	
	Customer getCUstomerById(long id);

	List<Customer> getAllCustomers();
}
