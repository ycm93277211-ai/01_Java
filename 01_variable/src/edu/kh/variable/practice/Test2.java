package edu.kh.variable.practice;

public class Test2 {

	public static void main(String[] args) {

		// 문제 1번
		int age = 22;
	    System.out.println("나는 "+ age + "살입니다.");
		
	    // 문제 2번
		int score = 90;
	    System.out.println("최종 점수:" +(score+10));	
	    
	    //강사님 풀이
	    //  int score = 90;
	   // score += 10;
	    		System.out.println("최종 점수:" +score);
	    
	    // 문제 3번
		int a = 10;
		double b = a;
		System.out.println(b);
		
		// 문제 4번  // 혼자 못 했음
		double pi = 3.14159;
		int num =(int)pi;
		System.out.printf("pi = %.2f, num =%d\n",pi,num);
	   
	
		
		// 문제 5번 "문자: A, 코드값: 65"
		char ch ='A';
		int i10 = ch;
		System.out.printf("문자: %c, 코드값: %d\n",ch,i10);
		System.out.println("문자: "+ ch + ","+"코드값 :" + (int)ch);
					
		// 문제 6번
		final int PRICE = 5000;
		int count = 3;                    //"물건 가격: 5000원, 개수: 3개, 총액: 15000원"
		System.out.println("물건 가격: "+ PRICE +"원"+", "+"개수: "+ count +"개"+ ", "+"총액: "+(PRICE*count)+"원");
		
		//패턴
		System.out.printf("물건 가격: %d원, 개수: %d개, 총액: %d원\n",PRICE,count,PRICE * count);  // 혼자 못 했음
        
		
		// 문제 7번
		
		int i1 =95;//국어
		int i2 =87;//영어    //국어: 95, 영어: 87, 수학: 90  
		int i3 =90;//수학    //   총점: 272, 평균: 90.67
		
		//한 줄로 쓰는 법 (같은 자료형일때)
		//int i1 =95,i2 =87,i3 =90
		
		int i4 = i1+i2+i3;
		double i5 = i4 / 3.0 ; //3.0으로 나눠줘야 자동형변환이 발생하여  원하는 값이 나옴
		
		
	    
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n",i1,i2,i3);
		System.out.printf("총점: %d, 평균: %.2f\n",i4,i5);
		
		//8번 문제
		String name = "양충모";
		int age1= 22;
		double height =172.2;
		System.out.printf("출연자 이름 %s\n",name);
		System.out.printf("나이:  %d\n",age1);
		System.out.printf("키: %.1f\n",height);
		
		//한 줄로 프린트 가능
		System.out.printf("출연자 이름 %s\n나이:  %d\n키: %.1f\n",name,age1,height);
		//문제9
		double dobleAge = age1;
		System.out.print(age1);
		
		//문제 10
		
		
		
		
	}
	
	
	
	
	

}
