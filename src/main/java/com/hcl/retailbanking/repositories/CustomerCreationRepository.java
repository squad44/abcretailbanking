package com.hcl.retailbanking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.retailbanking.pojos.CustomerCreation;

public interface CustomerCreationRepository extends JpaRepository<CustomerCreation, Long> {

}
