package com.hcl.retailbanking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.retailbanking.pojos.CustomerCreation;
import com.hcl.retailbanking.repositories.CustomerCreationRepository;
import com.hcl.retailbanking.service.RetailBankingService;

public class RetailBankingServiceImpl implements RetailBankingService {

	
	@Autowired
	CustomerCreationRepository customerCreationRepository;


	@Override
	public String customerRegistration(CustomerCreation customer) {
		if(customer.getBalance()>=5000.0) {
		CustomerCreation savedCustomer = customerCreationRepository.save(customer);
		return "Account Created Successfully, your A/C no is : " + savedCustomer.getCustomerId();
		}
		else
			return "Minimum balance of 5000.00 is required to open an A/C";
	}}
