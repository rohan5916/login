package com.example.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.entity.Agents;
import com.example.login.repository.AgentsRepository;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private AgentsRepository agentRepo;
	
	@Override
	public List<Agents> getAgents() {
		List<Agents> findAll = agentRepo.findAll();
		return findAll;
		
	}

}
