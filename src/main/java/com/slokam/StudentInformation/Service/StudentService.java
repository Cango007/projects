package com.slokam.StudentInformation.Service;

import java.util.List;

import com.slokam.StudentInformation.Entity.Student;

public interface StudentService  {
	
	
	
	public Student saveStudent(Student student);
	
	public void updateStudent(Student student);
	
	public List<Student> findAllStudents();
	
	public Student findById(Integer studentId);
	
	public void deleteByStudentId(Integer studentId);

}
