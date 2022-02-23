package com.npci.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.npci.demo.controller.Customers;
import com.npci.demo.response.TranscationResponse;

@Service
public interface Customerservice {
	
	public  List<Customers> getAllCustomers();
	
	public Customers getById(int c_id);
	
	public List<Customers> getbyLoc(String address);
	
	public Customers addCustomer(Customers customer);
	
	public String deleteCustomer(int c_id);
	
	public List<TranscationResponse> getTransDetails();
	
	
	

}
