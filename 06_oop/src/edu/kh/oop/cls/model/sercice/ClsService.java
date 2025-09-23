package edu.kh.oop.cls.model.sercice;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

//ClsService와 Student/TestVo는 패키지가 다름
public class ClsService /* extends Student */ {
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

		System.out.println(std.v1); // public
//		->전체에서 직접 접근 가능한 public 인 v1만 에러발생 x

//		System.out.println(std.v2); //protected 상속을 못 받음
//		System.out.println(std.v3); // default   불가능 다른패키지 x
//		System.out.println(std.v4); // private   불가능 해당클래스 아니면 안됌

	}

	public void ex2() {

		// static 필드 확인 예제
		// 학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();

		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
//		노란줄이 뜨는 이유 (경고)

//		static 이 붙은 변수(필드)/메서드 는
//		  	클래스명.변수명 으로 사용함

		System.out.println(Student.schoolName);

		// static 의 가장 큰 특징
		// 객채를 만들지 않아도 클래스 이름으로
		// 값에 바로 접근 가능
	}

	public void ex3() {
		// 생성자 확인 테스트

		// User 클래스 이용하여 u1객체 생성
		User u1 = new User();

		// 기본생성자를 개발자가 직접 만들지 않았다면
		// 컴파일러가 자동으로 기본생성자 만들어줌

		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGaneder());// char은 유니코드로 인해 공백

		User u2 = new User();

		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGaneder());

		// 문제점 : u1이 참조하고 있는 User 객체와
		// u2가 참조하고 있는 User 객체의 필드값이 모두 동일함
		// 왜? 같은 기본생성자로 User 객체를 생성하고 있기 때문에
		// 기본생성자에 작성된 코드가 똑같이 수행됨

		System.out.println("-----------------------------");

		// 해결방법 1 : setter를 이용해서 새로운값 제대입
		u2.setUserId("bbbb");
		u2.setUserPw("aaaaa");
		u2.setUserName("김영희");
		u2.setUserAge(30);
		u2.setUserGaneder('여');

		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGaneder());

		// 해결방법 2 : 매개변수 생성자를 이용해서
		// 객체가 생성될 때 부터 다른값으로 필드를 초기화

		User u3 = new User("test3", "password123");

	}

	public void ex4() {

		// 매개변수 생성자 예제
		User u1 = new User();// 기본생성자
		User u2 = new User("user02", "pass02");// 매개변수 2개 생성자
		User u3 = new User("user03", "pass03", "박길동", 20, '남');
		// 매개변수 5개 생성자(전부 초기화)

		System.out.printf("u1 / %s/ %s/ %s / %d/ %c\n", 
				u1.getUserId(), u1.getUserPw(), u1.getUserName(),
				u1.getUserAge(), u1.getUserGaneder());
		
		System.out.printf("u1 / %s/ %s/ %s / %d/ %c\n",
				u2.getUserId(), u2.getUserPw(), u2.getUserName(),
				u2.getUserAge(), u2.getUserGaneder());
		
		System.out.printf("u1 / %s/ %s/ %s / %d/ %c\n", 
				u3.getUserId(), u3.getUserPw(), u3.getUserName(),
				u3.getUserAge(), u3.getUserGaneder());

	}
}
