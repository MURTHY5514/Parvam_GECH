package com.springbootdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootdatajpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
