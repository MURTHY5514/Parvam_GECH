package com.springsecurity.custom_redirection.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springsecurity.custom_redirection.dto.StudentDTO;
import com.springsecurity.custom_redirection.model.Student;
import com.springsecurity.custom_redirection.repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository studentRepository;
	private PasswordEncoder passwordEncoder;
	


	public StudentService(StudentRepository studentRepository, PasswordEncoder passwordEncoder) {
		super();
		this.studentRepository = studentRepository;
		this.passwordEncoder = passwordEncoder;
	}





	public void saveStudent(StudentDTO studentDTO) {
		Student student = new Student();
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(passwordEncoder.encode(studentDTO.getPassword()));
		studentRepository.save(student);
	}
}
