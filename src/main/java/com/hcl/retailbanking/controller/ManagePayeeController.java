package com.hcl.retailbanking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagePayeeController {
	
	@GetMapping("/viewPayee/{accountId}")
	public List<ManagePayee> viewPayee(@PathVariable Long accountId){
		 return managePayeeService.getPayee(accountId);
	}

}
