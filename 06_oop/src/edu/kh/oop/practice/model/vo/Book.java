package edu.kh.oop.practice.model.vo;

public class Book {// 객체 정의

	private String title; // 책이름
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 작가

//	title ="자바의 정석";
//	price = 30000;
//	discountRate = 0.2;
//	author = "남궁성";

	public Book() {// 기본생성자

	}

	public Book(String title, int price, double discountRate, String author) {// 매개 생성사
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + author;
	}

}
