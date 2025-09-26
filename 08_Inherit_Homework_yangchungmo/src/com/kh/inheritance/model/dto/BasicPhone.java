package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {

	private String hasPhysicalKeyboard;// 물리적키보드 유무

	public BasicPhone() {
	}

	public BasicPhone(String brand, String model, int year, int price, String hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	
	@Override
	public String toString() {
		return super.toString()+ hasPhysicalKeyboard ;
	}

	public void checkKeyboard() {

	}

}
