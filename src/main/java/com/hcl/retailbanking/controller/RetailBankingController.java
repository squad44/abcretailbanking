package com.hcl.retailbanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.retailbanking.entities.CustomerCreationEntity;
import com.hcl.retailbanking.pojos.Response;
import com.hcl.retailbanking.service.RetailBankingService;
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.retailbanking.entities.Admin;
import com.hcl.retailbanking.pojos.Response;
import com.hcl.retailbanking.service.AdminService;
>>>>>>> development

@RestController
@RequestMapping("/retailbanking")
public class RetailBankingController {

	@Autowired
<<<<<<< HEAD
	RetailBankingService retailbankService;

	@PostMapping("/customerLogin")
	public Response customerLogin(@RequestParam("id") int id) {
		if (retailbankService.validateUser(id)) {
			return new Response("Welcome", Boolean.TRUE);
		}
		return new Response("Please check the user id", Boolean.FALSE);
	}

	@PostMapping("/accountSummary")
	public CustomerCreationEntity getAccountSummary(@RequestParam("id") Long id) {
		return retailbankService.fetchAccountSummary(id);
	}

}
=======
	private AdminService adminService;

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

}
>>>>>>> development
