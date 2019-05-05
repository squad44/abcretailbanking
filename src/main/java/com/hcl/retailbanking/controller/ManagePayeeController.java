package com.hcl.retailbanking.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.retailbanking.entities.ManagePayee;
import com.hcl.retailbanking.service.ManagePayeeService;

@RestController
public class ManagePayeeController {
	
	@Autowired 
	private ManagePayeeService managePayeeService;
	
	@GetMapping("/viewPayee/{id}")
	public List<ManagePayee> viewPayee(@PathVariable Long id){
		 return managePayeeService.getPayee(id);
	}
/*
	
	@PostMapping("addPayee")
	public CustomerCreationEntity addPayee(@RequestParam(name = "accountId", required = true) Long accountId,
			@RequestBody CustomerCreation customer) {
		if(customer.getCustomerId() == null) {
			boolean isAlreadyExist = managePayeeService.doPayeeValidation(accountId, customer.getCustomerId());
			
			if(!isAlreadyExist) {
				managePayeeService.addPayee(customer, accountId);
			}
		}
	}*/
	
}