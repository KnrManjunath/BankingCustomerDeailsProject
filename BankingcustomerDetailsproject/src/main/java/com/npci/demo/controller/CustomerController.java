package com.npci.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cutomers")
public class CustomerController {
	
	@Autowired CustomerServices customerServices;
	private List<Customer> customers;
	
	
	//display all customers
	@GetMapping("/getallcustomer")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = null;
		try {
			customers = CustomerService.getAllCustomerCustomer();
		} catch (Exception e) {
			//TODO: handle exception
			e.getMessage();
		}
		return new ResponseEntity<List<Customer>> (customers,HttpStatus.OK);
		
	}
	
	//display customer of id
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<List<Customer>> getById(@PathVaraiable ("id") int c_id) {
		Customer customer = null;
		try {
			customer = customerServices.getById(c_id);
		} catch (Exception e) {
			//TODO: handle exception
			e.getMessage();
		}
		return new ResponseEntity<List<Customer>> (customers,HttpStatus.OK);

	}
	
	////display a new customers
	@GetMapping("/getallcustomer")
	public ResponseEntity<List<Customer>> addcustomerEntity(@RequestAttribute Customers customers) {
		List<Customer> customer = null;
		try {
			customers = CustomerService.addCustomer(customer);
		} catch (Exception e) {
			//TODO: handle exception
			e.getMessage();
		}
		return new ResponseEntity<List<Customer>> ((List<Customer>) customers,HttpStatus.ACCEPTED);
		
}
// delete an existing customer
	@DeleteMapping ("/deletecustomer/{id}")
	public List<Customer> deleteCustomer(@PathVariable ("id") int c_id) {
		String customer = null;
		try {
			customer = customerServices.deleteCustomer(c_id);
		} catch (Exception e) {
			//TODO:handle exception
			e.getMessage();
		}
		return customers;
		
	}
	
	//transaction details of customers
	@GetMapping("/gettransactiondetails")
	public ResponseEntity<List<TransactionResponser>> getTransDetails() {
		List<TransactionResponse> customer = null;
		try {
			customer = customerServices.getTransDeatils1();
		} catch (Exception e) {
			//TODO: handle exception
					
		}
		return new ResponseEntity<List<TransactionResponser>> (HttpStatus.ACCEPTED);
		
	}
	
}
