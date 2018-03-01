package com.abrolly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abrolly.model.Customer;
import com.abrolly.repository.CustomerRepository;
import com.abrolly.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService employeeService;
	
	@Autowired
	CustomerRepository repository;
	
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Customer> getEmployees() {
		return employeeService.getAllCustomers();
	}

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable("id") long id) {
		return employeeService.getCUstomerById(id);
	}
    
    @RequestMapping("/save")
	public String process(){
		repository.save(new Customer("Jack", "Smith"));
		repository.save(new Customer("Adam", "Johnson"));
		repository.save(new Customer("Kim", "Smith"));
		repository.save(new Customer("David", "Williams"));
		repository.save(new Customer("Peter", "Davis"));
		return "Done";
	}
	
	
	@RequestMapping("/findall")
	public String findAll(){
		String result = "<html>";
		
		for(Customer cust : repository.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		result = repository.findOne(id).toString();
		return result;
	}
	
	@RequestMapping("/findbylastname")
	public String fetchDataByLastName(@RequestParam("lastname") String lastName){
		String result = "<html>";
		
		for(Customer cust: repository.findByLastName(lastName)){
			result += "<div>" + cust.toString() + "</div>"; 
		}
		
		return result + "</html>";
	}
    
    
}


