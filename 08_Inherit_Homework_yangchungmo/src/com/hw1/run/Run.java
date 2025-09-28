package com.hw1.run;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student[] str = new Student[3];
		str[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		str[1] = new Student("김말똥", 21, 182.3, 80.0, 2, "경영학과");
		str[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");



		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i].information());
		}
		System.out.println("==============================================================");
		
		
		Employee[] ems = new Employee[2];
		ems[0] = new Employee("박보검", 26, 180.3, 72.0, 1000000000, "영업부");
		ems[1] = new Employee("강동원", 38, 182.0, 76.0, 2000000000, "기획부");
		
		for (int j = 0; j < ems.length; j++) {
			System.out.println(ems[j].information());
		}
	}
}