package com.springSecurityDemo.springSecurityDemo.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springSecurityDemo.springSecurityDemo.dto.StudentDTO;
import com.springSecurityDemo.springSecurityDemo.model.Student;
import com.springSecurityDemo.springSecurityDemo.repository.StudentRepo;

@Service
public class StudentService {

	private StudentRepo studentRepo;
	private PasswordEncoder passwordEncoder;

	public StudentService(StudentRepo studentRepo, PasswordEncoder passwordEncoder) {
		super();
		this.studentRepo = studentRepo;
		this.passwordEncoder = passwordEncoder;
	}

	public void storeStudent(StudentDTO studentDTO) {
		Student student = new Student();

		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(passwordEncoder.encode(studentDTO.getPassword()));
		student.setRole("ROLE_USER");
		studentRepo.save(student);
	}
}
