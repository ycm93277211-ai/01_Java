package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {	
	
	Scanner sc1 = new Scanner(System.in);

	public void practice1() {
//      1번문제
		
		
//      인원 수 : 29
//		사탕 개수 : 100
//		1인당 사탕 개수 : 3
//		남는 사탕 개수 : 13
		
		
		System.out.print("인원수: ");
		int str1 = sc1.nextInt();
	
		System.out.print("사탕 개수: ");
		int str2 = sc1.nextInt();
		
	
//		int a= 29;
//		int b= 100;
//		int c= b/a;
//		int d= b%a;
		
		System.out.printf("1인당 사탕 개수: %d\n", str2/str1);
		System.out.printf("남는 사탕 개수: %d ",str2%str1);
		
		

		
		
		
		
		
		
		
		
		
	}
	public void practice2() {
		
		//2번문제
//		이름 : 홍길동
//		학년(정수만) : 3
//		반(정수만) : 4
//		번호(정수만) : 15
//		성별(남학생/여학생) : 남학생
//		성적(소수점 아래 둘째 자리까지) : 85.75
//		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		
		
		System.out.print("이름 : ");
		String str3 = sc1.next();
		
		
		System.out.print("학년 : ");
		int str4 = sc1.nextInt();
		
		System.out.print("반 : ");
		int str5 = sc1.nextInt();
		
		System.out.print("번호 : ");
		int str6 = sc1.nextInt();
		
		System.out.print("남학생/여학생 : ");
		String str7 = sc1.next();
		
		System.out.print("성적 : ");
		double str8 = sc1.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f 이다. ",str3, str4, str5, str6, str7,str8 );
		
		
	}
	public void practice3() {
		
		System.out.print("국어 :");
		int kor = sc1.nextInt();
		
		System.out.print("영어 :");
		int eng = sc1.nextInt();
		
		System.out.print("수학 :");
		int meth = sc1.nextInt();
		
		
		int kor1 =60;
		int eng1 = 80;
		int meth1 = 40;
//		
//		int result= kor1+eng1+meth1;
//		double cc = result/3.0;
//		System.out.printf("합계: %d\n",result);
//		System.out.println();
//		System.out.printf("평균: %.1f",cc);
		
		
//		System.out.printf("합계: %.0f\n",kor+eng+meth);
//		System.out.println();
//		System.out.printf("평균: %.2f",(kor+eng+meth)/3);
		
		int sum = kor1+eng1+meth1; 
		double avg = sum / 3.0; 
		
		System.out.println("합계"+ sum);
		System.out.printf("평균: %.1f",avg);
		
		boolean result = (kor1>=40)&&(eng1>=40)&&(meth1>=40)&&(avg>=60);
		
		System.out.println(result? "합격" :" 불합격" );
		
		
		
		
		
	}
	
}
