package com.slokam.StudentInformation.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.StudentInformation.Dao.StudentDao;
import com.slokam.StudentInformation.Entity.Student;
import com.slokam.StudentInformation.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentDao studentDao;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
            studentDao.save(student);		
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@Override
	public Student findById(Integer studentId) {
		// TODO Auto-generated method stub
		return studentDao.findById(studentId).get();
	}

	@Override
	public void deleteByStudentId(Integer studentId) {
		// TODO Auto-generated method stub
		studentDao.deleteById(studentId);
	}

	@Override
	public List<Student> findByStudentName(String studentName) {
		// TODO Auto-generated method stub
		return studentDao.findByStudentName(studentName);
	}

	@Override
	public List<Student> findByStudentNameLike(String studentNameLike) {
		// TODO Auto-generated method stub
		return studentDao.findByStudentNameLike(studentNameLike);
	}

	@Override
	public List<Student> dataFromStudentTwo(String studentName, Integer studentAge) {
		// TODO Auto-generated method stub
		return studentDao.dataFromStudentTwo(studentName, studentAge);
	}


	
	
	
	
}
