package com.hcl.retailbanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.retailbanking.entities.CustomerCreationEntity;
import com.hcl.retailbanking.service.RetailBankingService;

@RestController
public class RetailBankingController {

	@Autowired
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