package com.kh.inheritance.model.dto;

public class Phone {
//	- brand : String // 브랜드
//	- model : String // 모델명
//	- year : int // 출시년도
//	- price : int // 가격

	private String brand;
	private String model;
	private int year;
	private int price;

	public Phone() {
	}

	public Phone(String brand, String model, int year, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public void printInfo() {

	}

	@Override
	public String toString() {
		return "Brand: " + brand + "Model: " + model + "Year: " + year + "\nprice :" + price + "원";
	}
	 
}
