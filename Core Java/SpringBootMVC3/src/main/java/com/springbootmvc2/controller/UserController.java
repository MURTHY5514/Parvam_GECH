package com.springbootmvc2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springbootmvc2.dto.UserDTO;
import com.springbootmvc2.model.User;
import com.springbootmvc2.repository.UserRepository;
import com.springbootmvc2.service.UserService;

import jakarta.validation.Valid;

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
	public String addUser(@Valid @ModelAttribute UserDTO userDTO, BindingResult result) {
		if(result.hasErrors()) {
			return "add_user";
		}
		service.storeUser(userDTO);
		return "redirect:/";
	}
}
