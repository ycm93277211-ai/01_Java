package edu.kh.poly.ex2.model.service;

public class YCMCalculator implements Calculator {
	// implements 다중 상속 가능

	// extends: 확장하다
	// (부)클래스-(자)클래스
	// (부)인터페이스-(자)인터페이스

	// implements : 구현하다
	// (부)인터페이스-(자)클래스

	// 상속불가
	// (부)클래스-(자)인터페이스

	@Override
	public int plus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

}
