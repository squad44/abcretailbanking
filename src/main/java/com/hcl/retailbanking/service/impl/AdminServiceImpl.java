package com.hcl.retailbanking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.retailbanking.entities.Admin;
import com.hcl.retailbanking.repositories.AdminRepository;
import com.hcl.retailbanking.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin fetchAdminDetails(String userName, String password) {
		Admin admin=adminRepository.findByUserNameAndPassword(userName,password);
		return admin;
	}

}
