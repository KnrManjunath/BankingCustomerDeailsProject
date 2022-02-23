package com.npci.demo.response;

import lombok.Data;
public class TranscationResponse {
	
	
	
	
	
	private int trans_id;
	private String name;
	private float amount;
	private int to_c_id;
	
	public TranscationResponse() {
		super();
		//TODO Auto-generated constructor stub
}
	public TranscationResponse(int trans_id, String name, float amount, int to_c_id) {
		super();
		this.trans_id = trans_id;
		this.name = name;
		this.amount = amount;
		this.to_c_id = to_c_id;
}
	public int getTrans_id() {
		return trans_id;
	}
	
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getAmpount() {
		return amount;
	}
	
	public void setamount(float amount) {
		this.amount = amount;
	}
	
	public int getTo_c_id() {
		return to_c_id;
	}
	
	public void setTo_c_id(int to_c_id) {
		this.to_c_id = to_c_id;
	}
	
	@Override
	public String toString() {
		return "TranscationResponse [trans_id=" +trans_id +", name=" +name +", amount=" +amount + ",to_c_id=" + to_c_id + "]";
		
	}
	
	
}