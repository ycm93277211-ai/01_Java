package com.hw1.model.vo;

import java.io.PrintStream;

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

	}

	public Person(int age, double height, double weight) {
		super();

		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public  String information() {// 출력
		 return String.format("이름: %s 나이: %d 신장: %.1f 체중: %.1f",
                 name, age, height, weight);
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
