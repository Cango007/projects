package com.slokam.StudentInformation.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	@Column
	private String studentName;
	@Column
	private Integer studentAge;
	@Column
	private String studentGrade;
	@OneToMany(targetEntity = Marks.class,cascade = CascadeType.ALL)
	@JoinColumn(name="FK",referencedColumnName = "studentId")
	private List<Marks> studentsPersentagetList;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	public List<Marks> getStudentsPersentaget() {
		return studentsPersentagetList;
	}
	public void setStudentsPersentaget(List<Marks> studentsPersentaget) {
		this.studentsPersentagetList = studentsPersentaget;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentGrade=" + studentGrade + ", studentsPersentaget=" + studentsPersentagetList + "]";
	}
	public Student(Integer studentId, String studentName, Integer studentAge, String studentGrade,
			List<Marks> studentsPersentaget) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentGrade = studentGrade;
		this.studentsPersentagetList = studentsPersentaget;
	}
	public Student() {
		super();
	}
	
	

}
