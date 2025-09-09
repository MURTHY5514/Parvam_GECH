package com.springbootdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootdatajpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	Student findByEmail(String email);
}
