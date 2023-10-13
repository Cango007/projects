package com.slokam.StudentInformation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Student> saveStudent(@RequestBody Student student)
	{
	return	new ResponseEntity<Student>(studentService.saveStudent(student),HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student)
	{
	return new ResponseEntity<Student>(studentService.saveStudent(student),HttpStatus.OK);
	}
	@GetMapping("/findAllStudents")
	public ResponseEntity<List<Student>> findAllStudents()
	{
		return new ResponseEntity<List<Student>>(studentService.findAllStudents(),HttpStatus.OK);
	}
	@GetMapping("/findById/{studentId}")
	public ResponseEntity<List<ResponseEntity<Student>>> findById(@PathVariable("studentId") Integer studentId)
	{
		return new ResponseEntity<List<ResponseEntity<Student>>>( (List<ResponseEntity<Student>>) studentService.findById(studentId),HttpStatus.OK);
	}
	@DeleteMapping("/deleteById/{studentId}")
	public void deleteByStudentId(@PathVariable("studentId") Integer studentId)
	{
		studentService.deleteByStudentId(studentId);
	}
	@GetMapping("/findByName/{studentName}")
	public List<Student> findByName(@PathVariable("studentName") String studentName)
	{
	return	studentService.findByStudentName(studentName);
		
	}
	@GetMapping("getData/{studentName}/{studentAge}")
	public List<Student> getDataFromTwo(@PathVariable("studentName") String studentName,@PathVariable("studentAge") Integer studentAge)
	{
		return studentService.dataFromStudentTwo(studentName, studentAge);
	}

}
