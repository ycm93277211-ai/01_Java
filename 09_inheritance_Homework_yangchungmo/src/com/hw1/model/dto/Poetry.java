package com.hw1.model.dto;

public class Poetry extends Book {

	public int numberOfPoems; // 시 수

	public Poetry() {
		// TODO Auto-generated constructor stub
	}

	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}

//	public void displayInfo() {
//		System.out.println("[시집] 제목: "+getTitle()+"저자: "+getAuthor()+"시 수: "+ getNumberOfPoems());
//	}
//	
	@Override
	public String toString() {
		return"[시집]"+ super.toString()+"시 수: "+ numberOfPoems ;
	}

	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}

}
