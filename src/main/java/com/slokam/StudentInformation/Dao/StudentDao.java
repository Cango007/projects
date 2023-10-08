package com.slokam.StudentInformation.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slokam.StudentInformation.Entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
