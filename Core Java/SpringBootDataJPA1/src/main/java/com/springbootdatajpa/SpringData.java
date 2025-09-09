package com.springbootdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbootdatajpa.entity.Student;
import com.springbootdatajpa.repository.StudentRepository;

@Component
public class SpringData {
	
	@Autowired
	StudentRepository repository;
	
	public void addStudent() {
		Student st = new Student("mohan", 23, "someone@gmail.com");
		repository.save(st);
	}
	public void getStudent() {
		Student student = repository.findById(1).get();
		System.out.println(student);
	}
	public void getStudentByEmail() {
		Student student = repository.findByEmail("someone2@gmail.com");
		System.out.println(student);
	}
}
