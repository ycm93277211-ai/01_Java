package edu.kh.inheritance.model.vo.service;

import edu.kh.inheritance.model.Student;
import edu.kh.inheritance.model.dto.Person;

public class InheritanceServic {
	
	//상송 확인 예제
	public void ex1() {
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		System.out.println(p.toString());
		
		
		Student std = new Student();
		std.setName("고길동");
		std.setGrade(1);
		
		
		
	}

}
