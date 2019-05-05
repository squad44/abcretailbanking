package com.hcl.retailbanking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.retailbanking.entities.CustomerCreationEntity;

public interface CustomerCreationRepository extends JpaRepository<CustomerCreationEntity, Long> {

}
