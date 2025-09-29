package com.hw1.model.dto;

public  class Novel extends Book {

	private String genre;// 장르

	public Novel() {
		// TODO Auto-generated constructor stub
	}

	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}


//	public void displayInfo() {
//		System.out.println("[소설] 제목: "+ getTitle() +"저자: "+getAuthor()
//							+"장르: "+getGenre());
//	}
	@Override
	public String toString() {
		return "[소설]"+super.toString()+ genre ;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	

}
