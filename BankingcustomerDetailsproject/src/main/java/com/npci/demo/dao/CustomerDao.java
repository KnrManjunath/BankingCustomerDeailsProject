package com.npci.demo.dao;


import java.util.List;
import com.npci.demo.response.TranscationResponse;

public interface CustomerDao { 
	
	public List<TranscationResponse> getTransDetail();

}
