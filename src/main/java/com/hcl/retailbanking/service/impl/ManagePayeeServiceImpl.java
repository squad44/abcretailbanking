package com.hcl.retailbanking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.retailbanking.repositories.ManagePayeeRepository;
import com.hcl.retailbanking.service.ManagePayeeService;

public class ManagePayeeServiceImpl implements ManagePayeeService {

	@Autowired
	ManagePayeeRepository managePayeeRepository;
	
	@Override
	public String deletePayee(long payeeId) {
		
		boolean payee = managePayeeRepository.existsById(payeeId);
		
		if(!payee) {
			managePayeeRepository.deleteById(payeeId);	
			return "Payee deleted successfully";
		}
		else 
		     return "Payee doesn't exist";        
		
	}

}
