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
	public CustomerCreationEntity addPayee(@RequestParam(name = "accountId", required = true) Long accountId,
			@RequestBody CustomerCreation customer) {
		if(customer.getCustomerId() == null) {
			boolean isAlreadyExist = managePayeeService.doPayeeValidation(accountId, customer.getCustomerId());
			
			if(!isAlreadyExist) {
				managePayeeService.addPayee(customer, accountId);
			}
		}
	}
	
}