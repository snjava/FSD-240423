package com.institute.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Table(name = "studedu")
@Entity
public class Education {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int eid;
	private String eduStream;
	private int passingYear;
	private double percent;
	
	@JsonBackReference
	@ManyToOne
	private Student studEdu;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEduStream() {
		return eduStream;
	}
	public void setEduStream(String eduStream) {
		this.eduStream = eduStream;
	}
	public int getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public Student getStudEdu() {
		return studEdu;
	}
	public void setStudEdu(Student studEdu) {
		this.studEdu = studEdu;
	}
}
