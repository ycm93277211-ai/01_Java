package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone {

	private String operatingSystem;// 운영체제

	private int storageCapacity;// 스토리지공간크기

	public SmartPhone() {
	}

	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}

	@Override
	public String toString() {
		return super.toString() + "\noperatingSystem: " + operatingSystem + "\nstorageCapacity: " + storageCapacity
				+ "GB";
	}

}
