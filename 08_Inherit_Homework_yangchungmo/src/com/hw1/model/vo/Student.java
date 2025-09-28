package com.hw1.model.vo;

import java.io.PrintStream;

public class Student extends Person {

//	- grade : int // 학년
//	- major : String // 전공
	private int grade;
	private String major;

	public Student() {
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		
		this.name = name;
		this.grade = grade;
		this.major = major;
	}

	@Override
	public String information() {
		return super.information()+String.format(" 학년: %d 전공: %s", grade, major);
	}

}
