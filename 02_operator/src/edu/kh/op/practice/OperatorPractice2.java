package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {

		
//		20세 이상이면 "저는 성인 입니다", 아니면 "저는 미성년 입니다" 출력.
//		입력받은 값이 13세 이상이면서 19세 이하면 "청소년입니까? true"출력, 아니면 false 출력
//		입력받은 값이 65세 이상이거나, 12세 이하면 
//		"노인이거나 어린이 입니까? true" 출력 아니면 false 출력
		
		Scanner sc = new Scanner(System.in);
		
		int age =13;
				
		System.out.print("당신의 나이는?: ");
		int age1 = sc.nextInt();
		
		String result= (age>= 20) ? "저는 성인 입니다.":"저는 미성년 입니다.";
		System.out.println(result);
		
		boolean age2 =(age>=13)&&(age<=19);
		System.out.println("청소년입니까? " + age2);
		
		
		boolean age3 =(age<=12)||(age<=65);
		System.out.println("노인이거나 어린이 입니까? "+age3);
		
		
		
		
		
	}

}
