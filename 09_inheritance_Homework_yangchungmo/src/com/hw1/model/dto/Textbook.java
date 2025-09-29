package com.hw1.model.dto;

public class Textbook extends Book {

	private String subject;// 과목

	public Textbook() {
	}

	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}

//
//	public void displayInfo() {
//		System.out.println("[전문 서적] 제목: " + getTitle() + "저자: " + getAuthor() + "과목: " + getSubject());
//	}

	@Override
	public String toString() {
		return "[전문 서적]"+ super.toString()+ subject ;
	}
	
	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
