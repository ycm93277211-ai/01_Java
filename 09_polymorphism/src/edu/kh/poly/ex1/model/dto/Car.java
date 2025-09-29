package edu.kh.poly.ex1.model.dto;

public class Car {
	// 속성
	private String engine; // 엔진
	private String fuel; // 연료
	private int wheel; // 바퀴

	// 기능(생성자 + 메서드)

	public Car() {
	}

	public Car(String enjine, String fuel, int wheel) {
		super();
		this.engine = enjine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	public String getEnjine() {
		return engine;
	}

	public void setEnjine(String enjine) {
		this.engine = enjine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	// 오버라이딩?
	// ->부모클래스에서 정의된 메서드를 자식클래스가 재정의하는 것
	@Override
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	}

}
