package com.hw1.model.vo;

public class Student extends Person{

//	- grade : int // 학년
//	- major : String // 전공
//	20 178.2 70.0 1 정보시스템공학과
	private int grade;
	private String major;
	
	public Student() {
	}

	public Student(String name,int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	
	

	public String information() {
		return "";
	}
	
	
	
	
	
}
