package com.hcl.retailbanking.service;

import com.hcl.retailbanking.pojos.CustomerCreation;

public interface ManagePayeeService {

	 public String deletePayee(long customer_id);

	public boolean doPayeeValidation(long accountId, long customerId);

	public void addPayee(CustomerCreation customer, long accountId);

}