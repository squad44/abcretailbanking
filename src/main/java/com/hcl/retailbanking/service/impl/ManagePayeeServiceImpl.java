package com.hcl.retailbanking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.retailbanking.entities.ManagePayee;
import com.hcl.retailbanking.pojos.CustomerCreation;
import com.hcl.retailbanking.repositories.ManagePayeeRepository;
import com.hcl.retailbanking.service.ManagePayeeService;

@Service
public class ManagePayeeServiceImpl implements ManagePayeeService {
	@Autowired
	private ManagePayeeRepository managePayeeRepository;

	@Override
	public List<ManagePayee> getPayee(Long id) {
		return managePayeeRepository.findAllById(id);
	}

	@Override
	public String deletePayee(long customer_id) {
		return null;
	}

	@Override
	public boolean doPayeeValidation(long accountId, long customerId) {
		return false;
	}

	@Override
	public void addPayee(CustomerCreation customer, long accountId) {
		
	}

}