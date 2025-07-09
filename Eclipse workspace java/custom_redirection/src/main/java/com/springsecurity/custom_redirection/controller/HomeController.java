package com.springsecurity.custom_redirection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springsecurity.custom_redirection.dto.StudentDTO;
import com.springsecurity.custom_redirection.service.StudentService;

@Controller
public class HomeController {
	
	private StudentService studentService;
	
	public HomeController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping({"","/"})
	public String home() {
		return "home";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		StudentDTO studentDTO =  new StudentDTO();
		model.addAttribute("studentDTO", studentDTO);
		return "register";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/register")
	public String register(StudentDTO studentDTO, RedirectAttributes attributes) {
		studentService.saveStudent(studentDTO);
		attributes.addFlashAttribute("success","Student Successfully registered.");
		return "redirect:/";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
}
