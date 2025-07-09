package com.springsecurity.custom_redirection.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springsecurity.custom_redirection.model.Student;
import com.springsecurity.custom_redirection.repository.StudentRepository;

public class StudentDetailsService implements UserDetailsService {

	private StudentRepository studentRepository;
	
	
	public StudentDetailsService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}





	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Student student =  studentRepository.findByEmail(username).orElseThrow(
				() ->new UsernameNotFoundException("Student not found: "+username)
				);
		return new StudentDetails(student);
	}

}
