package com.hcl.retailbanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.retailbanking.service.ManagePayeeService;

@RestController
public class ManagePayeeController {
	
	@Autowired 
	private ManagePayeeService managePayeeService;
	
	@GetMapping("/viewPayee/{accountId}")
	public List<ManagePayee> viewPayee(@PathVariable Long accountId){
		 return managePayeeService.getPayee(accountId);
	}

}
