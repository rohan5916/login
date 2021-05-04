package com.example.login.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.login.entity.Agents;
import com.example.login.entity.Register;
import com.example.login.repository.RegisterRepository;
import com.example.login.service.RegisterService;

@Controller
public class RegisterController {
	@Autowired
	private RegisterRepository registerRepo;
	
	@Autowired
	private RegisterService registerService;

	@RequestMapping("/showReg")
	public String showReg() {
		return "showReg";
	}
	
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("register") Register register) {
		registerRepo.save(register);
		return "showLoginPage";
	}
	
	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "showLoginPage";
	}
	
	@ModelAttribute("todos")
	public Register abcd() {
	    return new Register();
	}
	
	
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailId") String emailId,@RequestParam("password") String password,ModelMap modelMap) {
		
		Register register = registerRepo.findByEmail(emailId);

		if(register!=null) {
		if(register.getEmail().equals(emailId) && register.getPassword().equals(password)) {
			List<Agents> agents = registerService.getAgents();
			modelMap.addAttribute("agent", agents);
			return "dashboard";
		}else {
			modelMap.addAttribute("error","Invalid Username/Password");
			return "showLoginPage";
		}
		}else {
			modelMap.addAttribute("error","Invalid Username/Password");
			return "showLoginPage";
		}
		
		
		


		
	
	}


}
