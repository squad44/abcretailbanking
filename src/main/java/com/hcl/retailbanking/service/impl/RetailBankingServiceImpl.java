package com.hcl.retailbanking.service.impl;

import com.hcl.retailbanking.entities.CustomerCreationEntity;
import com.hcl.retailbanking.service.RetailBankingService;

public class RetailBankingServiceImpl implements RetailBankingService {

	@Override
	public boolean validateUser(long id) {
		return false;
	}

	@Override
	public CustomerCreationEntity fetchAccountSummary(long id) {
		return null;
	}
	
}