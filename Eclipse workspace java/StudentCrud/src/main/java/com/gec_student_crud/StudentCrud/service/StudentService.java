package com.gec_student_crud.StudentCrud.service;

import org.springframework.stereotype.Service;

import com.gec_student_crud.StudentCrud.dto.StudentDTO;
import com.gec_student_crud.StudentCrud.model.Student;
import com.gec_student_crud.StudentCrud.repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public void saveStudent(StudentDTO studentDTO) {
		Student student = new Student();
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setAge(studentDTO.getAge());
		student.setPassword(studentDTO.getPassword());
		studentRepository.save(student);
	}

}
