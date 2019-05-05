package com.hcl.retailbanking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.retailbanking.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	Admin findByUserNameAndPassword(String userName, String password);
}
