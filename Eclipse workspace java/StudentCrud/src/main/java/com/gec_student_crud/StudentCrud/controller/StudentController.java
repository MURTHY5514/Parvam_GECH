package com.gec_student_crud.StudentCrud.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gec_student_crud.StudentCrud.dto.StudentDTO;
import com.gec_student_crud.StudentCrud.model.Student;
import com.gec_student_crud.StudentCrud.repository.StudentRepository;
import com.gec_student_crud.StudentCrud.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {
	
	private final StudentService studentService;
	private final StudentRepository studentRepository;
	//constructor injection
	public StudentController(StudentService studentService, StudentRepository studentRepository) {
		super();
		this.studentService = studentService;
		this.studentRepository = studentRepository;
	}
	
	@GetMapping({"","/"})
	public String home(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students",students);
		return "home";
	}
	@GetMapping("/add-student")
	public String addStudent(Model model) {
		model.addAttribute("studentDTO", new StudentDTO());
		return "add_student";
	}
	@PostMapping("/add-student")
	public String addStudent(@Valid @ModelAttribute StudentDTO studentDTO, 
			BindingResult result, Model model, RedirectAttributes attributes) {
		Student student  = studentRepository.findByEmail(studentDTO.getEmail());
		if(student!=null) {
			result.addError(new FieldError("StudentDTO", "email", "Email is already exists"));
		}
		if(studentDTO.getImage().isEmpty()) {
			result.addError(new FieldError("StudentDTO", "image", "Image is required"));
		}
		if(result.hasErrors()) {
			return "add_student";
		}
		studentService.saveStudent(studentDTO);
		attributes.addFlashAttribute("success", "Student added Successfuly");
		return "redirect:/";
	}
	
	@GetMapping("/std-delete")
	public String deleteStudent(@RequestParam Long id) {
		studentService.deleteStudent(id);
		
		return "redirect:/";
	}
	
	@GetMapping("/std-edit")
	public String editStudent(@RequestParam Long id, Model model) {
		StudentDTO studentDTO = studentService.editStudent(id);
		Student student = studentRepository.findById(id).get();
		model.addAttribute("studentDTO", studentDTO);
		model.addAttribute("student", student);
		return "edit-student";
	}
	
	@PostMapping("/edit-student")
	public String updateStudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result, @RequestParam Long id, Model model) {
		Student student1  = studentRepository.findByEmail(studentDTO.getEmail());
		if(student1!=null && student1.getId()!=id) {
			result.addError(new FieldError("StudentDTO", "email", "Email is already exists"));
		}
		if(result.hasErrors()) {
			Student student = studentRepository.findById(id).get();
			model.addAttribute("student", student);
			return "edit-student";
		}
		studentService.updateStudent(studentDTO,id);
		
		return "redirect:/";
	}
}
