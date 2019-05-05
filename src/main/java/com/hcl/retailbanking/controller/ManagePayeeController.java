package com.hcl.retailbanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.retailbanking.entities.CustomerCreationEntity;
import com.hcl.retailbanking.pojos.CustomerCreation;
import com.hcl.retailbanking.service.ManagePayeeService;

@RestController
public class ManagePayeeController {

	@Autowired
	ManagePayeeService managePayeeService;
	
	@PostMapping("addPayee")
	public CustomerCreationEntity addPayee(@RequestParam(name = "accountId", required = true) long accountId,
			@RequestBody CustomerCreation customer) {
		if(customer.getCustomerAccountNumber() != null) {
			boolean isAlreadyExist = managePayeeService.doPayeeValidation(accountId, customer.getCustomerAccountNumber());
			
			if(!isAlreadyExist) {
				retailbankService.addPayee(customer, accountId);
			}
		}
	}
	
}