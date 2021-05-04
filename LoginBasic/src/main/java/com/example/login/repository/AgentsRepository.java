package com.example.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login.entity.Agents;

public interface AgentsRepository extends JpaRepository<Agents, Long>{

}
