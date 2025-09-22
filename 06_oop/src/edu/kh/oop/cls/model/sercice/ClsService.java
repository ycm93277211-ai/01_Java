package edu.kh.oop.cls.model.sercice;

import edu.kh.oop.cls.model.vo.Student;

//ClsService와 Student/TestVo는 패키지가 다름
public class ClsService  /*extends Student*/ {
	// 부보로 Student 클래스를 상속받음
	// ClsServise(자식)<-Student(부모)

	public void ex1() {
		// 클래스 접근제한자 확인하기

		Student std = new Student();

		// TestVo test = new TestVo();
		// (default) 클래스는 같은 패키지에서만 사용 가능
		// 다른 패키지라 import 도 불가능

		// 필드 접근제한자 확인하기
		// 상속 관계에서 직접 접근 가능 범위 테스트
		// * 상속받으면 부모의 것도 마치 내것처럼 사용!!!*
//		System.out.println(v1); // public    가능
//		System.out.println(v2); // protected 가능
//		System.out.println(v3); // default   불가능 다른패키지 x
//		System.out.println(v4); // private   불가능 해당클래스 아니면 안됌

		
		System.out.println(std.v1); //public
//		->전체에서 직접 접근 가능한 public 인 v1만 에러발생 x
		
//		System.out.println(std.v2); //protected 상속을 못 받음
//		System.out.println(std.v3); // default   불가능 다른패키지 x
//		System.out.println(std.v4); // private   불가능 해당클래스 아니면 안됌
		
		
	}
}
