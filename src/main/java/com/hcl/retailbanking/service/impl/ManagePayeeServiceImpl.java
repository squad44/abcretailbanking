package com.hcl.retailbanking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.retailbanking.service.ManagePayeeService;

@Service
public class ManagePayeeServiceImpl implements ManagePayeeService {
	@Autowired
	private ManagePayeeRepository managePayeeRepository;

	@Override
	public List<ManagePayeeServiceImpl> getPayee(Long accountId) {
		return manageRepository.findByAccountId(accountId);
	}

}
