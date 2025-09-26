package com.hw1.model.vo;

public class Person {

	/*
	 * # name : String - age : int - height : double - weight : double + Person() +
	 * Person(age:int, height:double, weight:double) + information() : String
	 */

	protected String name;
	private int age;
	private double height;
	private double weight;

	public Person() {
		
		System.out.println(name +"홍길동");
		System.out.println(name +"김말똥");
		System.out.println(name +"강개순");
		
	}

	public Person( int age, double height, double weight) {
		super();
		
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public String information() {
		return "";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
