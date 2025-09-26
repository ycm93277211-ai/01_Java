package edu.kh.inheritance.model.dto;

/*
 * 
 * Object
 * 		->Person
 * 				->Employee / Student(둘은 같은 부모를 가졌을 뿐 아무 관계 아님)
 * 
 * 
 * 
 * */

//final 클래스 : 상속불가 -> 누군가의 부모가 될 수 없다.. 받을 수만 있음!!
public /* final */ class Employee extends Person {

	// 필드
	private String company; // 회사명

	public Employee() {
	}

	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);// Person 매개변수 생성자
		this.company = company;
	}

	// Person 으로 부터 상속받은 메서드 중
	// move() 메서드를 Employee에 맞게 재정의(==오버라이딩)

	// @Override 어노테이션 : 해당 메서드가 오버라이딩 되었음을
	// 컴파일러에게 알려주는 역할 -> 컴파일러가 문법체크도 해줌
	// ->부모에게 행당 메서드가 있는지 체크

	@Override
	public void move() {
		System.out.println("오버라이딩된 move()");
		System.out.println("야다");
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;

	}

	@Override
	public String toString() {
		return super.toString() + company;
	}
	//final 메서드 -> 오버라이딩 불가..
	//- 메서드의 기능이 변하면 안되는 경우
	public final void onlyEmployee() {
		System.out.println("final 클래스입니다");
		
	}

}
