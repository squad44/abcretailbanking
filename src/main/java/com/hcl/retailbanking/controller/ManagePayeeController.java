package com.hcl.retailbanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.retailbanking.service.ManagePayeeService;

@RestController
public class ManagePayeeController {
	
	@Autowired
	ManagePayeeService managePayeeService;

	@DeleteMapping("/deletePayee")
	public String deletePayee(@RequestParam(name="PayeeId",required=true) long PayeeId) {
		String message = managePayeeService.deletePayee(PayeeId);
		return message;
	}
}
