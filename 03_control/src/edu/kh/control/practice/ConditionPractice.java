package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한개 입력하세요: ");
		int num= sc.nextInt();
		String result;
		
		if(num<0) {
			result = "양수만 입력해주세요.";
		}
		else if(num>=0 && num%2 == 0 ) {
			result = "짝수입니다";
		}
	    else  {
			result = "홀수입니다";
		}
		System.out.print(result);
	}
	public void practice2() {
		
		String result;
		System.out.print("국어 점수: ");
		int kor = sc.nextInt();
		
		System.out.print("수학 점수: ");	
		int meth = sc.nextInt();
		
		System.out.print("영어 점수: ");	
		int eng = sc.nextInt();
		
		int sum = kor+meth+eng;
		double ave = sum/3.0;
		
		if(kor<=40 && meth<=40&& eng<=40 && ave<=60) {
			result= "불합격";
		}
		else {
			System.out.printf("국어: %d\n",kor);
			System.out.printf("수학: %d\n",meth);
			System.out.printf("영어: %d\n",eng);
			System.out.printf("합계: %d\n",sum);
			System.out.printf("영어: %.1f\n",ave);
			result = "축하합니다, 합격입니다!";
		}
			
		System.out.println(result);
		}
}
