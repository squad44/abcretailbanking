package com.hcl.retailbanking.service;

import java.util.List;

import com.hcl.retailbanking.service.impl.ManagePayeeServiceImpl;

public interface ManagePayeeService {
	List<ManagePayeeServiceImpl> getPayee(Long accountId);
}
