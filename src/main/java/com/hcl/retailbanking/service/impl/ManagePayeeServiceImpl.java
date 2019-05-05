package com.hcl.retailbanking.service.impl;

import com.hcl.retailbanking.pojos.CustomerCreation;
import com.hcl.retailbanking.service.ManagePayeeService;

public class ManagePayeeServiceImpl implements ManagePayeeService {

	@Override
	public String deletePayee(long customer_id) {
		return null;
	}

	@Override
	public boolean doPayeeValidation(long accountId, long customerId) {
		return false;
	}

	@Override
	public void addPayee(CustomerCreation customer, long accountId) {
		
	}

}