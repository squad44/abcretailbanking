package com.hcl.retailbanking.service;

import com.hcl.retailbanking.entities.Admin;

public interface AdminService {

	Admin fetchAdminDetails(String userName, String password);

}
