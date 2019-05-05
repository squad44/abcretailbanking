package com.hcl.retailbanking.service;

import org.springframework.stereotype.Service;

import com.hcl.retailbanking.entities.CustomerCreationEntity;

@Service
public interface RetailBankingService {

	boolean validateUser(long id);

	CustomerCreationEntity fetchAccountSummary(long id);
	
}