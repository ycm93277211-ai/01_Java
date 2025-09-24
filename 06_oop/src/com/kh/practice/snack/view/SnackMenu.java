package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	Scanner sc = new Scanner(System.in);
	
	SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류:");
		String str = sc.next();
		System.out.print("이름:");
		String str1 = sc.next();
		System.out.print("맛:");
		String str2 = sc.next();
		System.out.print("개수:");
		int str3 = sc.nextInt();
		System.out.print("가격:");
		int str4 = sc.nextInt();
		System.out.println("저장 완료되었습니다.");
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) :");
		char ch = sc.next().charAt(0);
		if(ch =='n') {
			
		}else {
			System.out.println(str+"("+str1+ str2+")");
		}
		
	}
}
