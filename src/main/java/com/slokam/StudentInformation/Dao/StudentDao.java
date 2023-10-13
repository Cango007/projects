package com.slokam.StudentInformation.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.slokam.StudentInformation.Entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
	
	public List<Student> findByStudentName(String studentName);

	public List<Student> findByStudentNameLike(String studentNameLike);
	
	@Query("from Student where studentName=?1 and studentAge<?2 ")
	public List<Student> dataFromStudentTwo(String studentName,Integer studentAge);

}
