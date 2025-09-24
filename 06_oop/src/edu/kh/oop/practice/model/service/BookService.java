package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {// 객체 메서드 정리

	public void practice() {

		Book bk = new Book();

		Book bk1 = new Book("자바의 정석", 30000, 0.2, "남궁수");

		System.out.println(bk);

		System.out.println(bk1);

		System.out.println("========================================");

		Book bk2 = new Book();

		System.out.println("수정된 결과");

		bk2.setTitle("C언어");
		bk2.setPrice(30000);
		bk2.setDiscountRate(0.1);
		bk2.setAuthor("홍길동");

		System.out.println(bk2);

		System.out.println("========================================");

		double sum1 = bk1.getPrice() - (bk1.getPrice() * bk1.getDiscountRate());
		double sum2 = bk2.getPrice() - (bk2.getPrice() * bk2.getDiscountRate());

		System.out.println("도서명= " + bk2.getTitle());
		System.out.println("\n할인된 가격= " + (int) sum2 + "원");
		System.out.println("\n도서명= " + bk1.getTitle());
		System.out.println("\n할인된 가격= " + (int) sum1 + "원");

	}

}
