package com.slokam.StudentInformation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.StudentInformation.Entity.Student;
import com.slokam.StudentInformation.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
  @Autowired
	private StudentService studentService;
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student)
	{
	return	 studentService.saveStudent(student);
	}
	@PutMapping("/update")
	public void updateStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
	}
	@GetMapping("/findAllStudents")
	public List<Student> findAllStudents()
	{
		return studentService.findAllStudents();
	}
	@GetMapping("/findById/{studentId}")
	public Student findById(@PathVariable("studentId") Integer studentId)
	{
		return studentService.findById(studentId);
	}
	@DeleteMapping("/deleteById/{studentId}")
	public void deleteByStudentId(@PathVariable("studentId") Integer studentId)
	{
		studentService.deleteByStudentId(studentId);
	}
}
