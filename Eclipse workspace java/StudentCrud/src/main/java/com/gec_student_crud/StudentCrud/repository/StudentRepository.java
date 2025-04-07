package com.gec_student_crud.StudentCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gec_student_crud.StudentCrud.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	/*
	 * spring data jpa -> jpa -> hibernate -> jdbc(java database connection)
	 * -> database
	 * 
	 * 1. to get all details -> findAll();
	 * 2. to get single data -> findById(id);
	 * 3. to delete data -> deleteById(id);/ delete(object)
	 * 4. to create or update data -> save(object)
	 * */
}
