package com.springbootmvc2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootmvc2.dto.UserDTO;
import com.springbootmvc2.model.User;
import com.springbootmvc2.repository.UserRepository;
import com.springbootmvc2.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserRepository repository;
	@Autowired
	private UserService service;
	
	@GetMapping({"","/"})
	public String home(Model model) {
		List<User> all = repository.findAll();
		model.addAttribute("users",all);
		return "home";
	}
	
	@GetMapping("/add-user")
	public String addUser(Model model) {
		UserDTO dto = new UserDTO();
		model.addAttribute("userDTO",dto);
		return "add_user";
	}
	
	@PostMapping("/add-user")
	public String addUser(@ModelAttribute UserDTO userDTO) {
		service.storeUser(userDTO);
		return "redirect:/";
	}
}
