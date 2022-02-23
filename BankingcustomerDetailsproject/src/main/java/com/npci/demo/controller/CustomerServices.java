package com.npci.demo.controller;

import java.util.List;

public interface CustomerServices {

	String deleteCusString(int c_id);

	List<TransactionResponse> getTransDeatils();

	Customer getById(int c_id);

	String deleteCustomer(int c_id);

	List<TransactionResponse> getTransDeatils11();

	List<TransactionResponse> getTransDeatils1();

}
