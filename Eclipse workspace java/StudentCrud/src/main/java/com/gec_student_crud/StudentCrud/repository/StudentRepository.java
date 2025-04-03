package com.gec_student_crud.StudentCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gec_student_crud.StudentCrud.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
