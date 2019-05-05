package com.hcl.retailbanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.retailbanking.pojos.CustomerCreation;
import com.hcl.retailbanking.pojos.Response;
import com.hcl.retailbanking.service.AdminService;
import com.hcl.retailbanking.service.ManagePayeeService;

@RestController
@RequestMapping("/retailbanking")
public class RetailBankingController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	ManagePayeeService managePayeeService;
	
	@Autowired
	RetailbankingService retailbankingService;

	@PostMapping("/adminlogin")
	public Response adminLogin(@RequestParam String userName, @RequestParam String password) {
		Admin admin = adminService.fetchAdminDetails(userName, password);
		if (admin == null) {
			return new Response("UserName and Password is not match", Boolean.FALSE);

		} else if (admin.getUserName().equals(userName) && admin.getPassword().equals(password)) {

			return new Response(userName + " Logged-in Successfully ", Boolean.TRUE);
		}
		return null;
	}
	
	@DeleteMapping("/deletePayee")
	public String deletePayee(@RequestParam long customer_id) {
		String message = ManagePayeeService.deletePayee(customer_id);
	}
	
	  @PostMapping("/customerregistration")
			public String customerRegistration(@RequestBody CustomerCreation customer){
			  String message =  retailbankingService.customerRegistration(customer);
			 return message;
	}

}
