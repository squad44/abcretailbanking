package com.hcl.retailbanking.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.retailbanking.entities.ManagePayee;

public interface ManagePayeeRepository extends JpaRepository<ManagePayee, Long> {

	List<ManagePayee> findAllById(Long id);

}