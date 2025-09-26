package edu.kh.inheritance.model.vo.service;

import edu.kh.inheritance.model.Student;
import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;

public class InheritanceServic {

	// 상송 확인 예제
	public void ex1() {
		Person p = new Person();

		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		System.out.println(p.toString());

		// person 클래스로부터 상속받은 멤버메서드
		// 사용가능
		Student std = new Student();
		std.setName("고길동");
		std.setAge(0);
		std.setNationality(null);
		// Student만의 고유한 멤버 사용 가능
		std.setClassroom(0);
		std.setGrade(1);

		Student std2 = new Student("홍길순", 20, "미국", 1, 3);
		System.out.println(std2.getName());
		System.out.println(std2.getAge());
		System.out.println(std2.getNationality());
		System.out.println(std2.getGrade());
		System.out.println(std2.getClassroom());

		Employee emp = new Employee("김노동", 30, "한국", "KH정보교육원");

		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());

	}

	// 오버라이딩 확인 예제

	public void ex2() {
		Student std = new Student();
		Employee emp = new Employee();

		std.move();// 부모꺼 그대로 쓰는 중(오버라이딩 x)

		emp.move();// 부모꺼 받고 Employee 에서 재정의(오버라이딩 O)
	}

	public void ex3() {
		Person p = new Person("김철수",17,"한국");
		System.out.println(p);
		
		//print 구문 수행시 참조변수명만 작성해도 
		//자동으로 toString 메서드 호출
		
		Student std = new Student("강호동",18,"미국",2,6);
		System.out.println(std.toString());
		
//		Employee 객체 생성("김노동",36,"한국","샘송")
		
		Employee emp = new Employee("김노동",36,"한국","샘송");
		System.out.println(emp.toString());
	}
	
}
