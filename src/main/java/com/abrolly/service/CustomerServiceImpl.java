package com.abrolly.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abrolly.model.Customer;
import com.abrolly.repository.CustomerRepository;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer getCUstomerById(long id) {
		return customerRepository.findOne(id);
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customerList = new ArrayList<>();
		customerRepository.findAll().forEach(customerList::add);
		return customerList;

	}

}
