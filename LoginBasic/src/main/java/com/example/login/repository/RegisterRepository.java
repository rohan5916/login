package com.example.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login.entity.Register;

public interface RegisterRepository extends JpaRepository<Register, Long> {

	Register findByEmail(String emailId);

}
