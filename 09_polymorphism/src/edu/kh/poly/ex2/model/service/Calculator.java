package edu.kh.poly.ex2.model.service;

//계산기 인터페이스
//-> 모든 계산기에 대한 공통 필드, 기능명을 제공하는 접점(interface)의 용도
public interface Calculator {

	// 인터페이스: 추상클래스의 변행체(추상클래스보다 추상도 높음)
	// -추상클래스: 일부만 추상메서드(0개 이상)
	// -인터페이스 : 모두 추상메서드

	// 필드는 묵시적으로 public static final -> 상수(대문자만 쓸 수 있음)
	// -> 필드안에 접근제한자 안써도 전부 상수다! 가능

	// 속성(필드)

	public static final double PI = 3.14;
	static final int MAX_NUM = 100000;
	public final int MIN_NUM = -100000;
	int ZERO = 0;

	// 기능
	// 메서드 묵시적으로 public abstract
	public abstract int plus(int num1,int num2);
	
	int minus(int num,int num2);
	// L 쓰지 않아도 public abstract 있음
	
	public abstract int multiple (int num1,int num2);
	
	public abstract int divide (int num1,int num2);
	
	
	
	
}
