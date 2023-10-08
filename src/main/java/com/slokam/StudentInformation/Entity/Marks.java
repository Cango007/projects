package com.slokam.StudentInformation.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer marksId;

	private Integer  studentPersentage;

	public Integer getMarksId() {
		return marksId;
	}

	public void setMarksId(Integer marksId) {
		this.marksId = marksId;
	}

	public Integer getStudentPersentage() {
		return studentPersentage;
	}

	public void setStudentPersentage(Integer studentPersentage) {
		this.studentPersentage = studentPersentage;
	}

	@Override
	public String toString() {
		return "Marks [marksId=" + marksId + ", studentPersentage=" + studentPersentage + "]";
	}

	public Marks(Integer marksId, Integer studentPersentage) {
		super();
		this.marksId = marksId;
		this.studentPersentage = studentPersentage;
	}

	public Marks() {
		super();
	}
	
	
	
	

}
