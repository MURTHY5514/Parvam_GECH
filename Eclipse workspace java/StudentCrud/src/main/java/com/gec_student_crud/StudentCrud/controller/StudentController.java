package com.gec_student_crud.StudentCrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gec_student_crud.StudentCrud.dto.StudentDTO;
import com.gec_student_crud.StudentCrud.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {
	
	private final StudentService studentService;
	//constructor injection
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping({"","/"})
	public String home() {
		return "home";
	}
	@GetMapping("/add-student")
	public String addStudent(Model model) {
		model.addAttribute("studentDTO", new StudentDTO());
		return "add_student";
	}
	@PostMapping("/add-student")
	public String addStudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "add_student";
		}
		System.out.println(studentDTO.getName()+"2");
		studentService.saveStudent(studentDTO);
		return "redirect:/";
	}
}
