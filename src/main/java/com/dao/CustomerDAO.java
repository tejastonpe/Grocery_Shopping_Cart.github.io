package com.dao;

import com.model.Customer;

public interface CustomerDAO {
	
	Customer validateCustomer(String username,String pwd);
	
	//crud
	
	int addCustomer(Customer cust);
	
	//update
	
	//delete

}
