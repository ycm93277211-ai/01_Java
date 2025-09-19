package edu.kh.basic;

// 한 줄 주석: 컴파일러 해석X!! (메모)
/*범위 주석
 * 
 * 
 * 
 * */

public class JavaTest {
	
	// main 메서드(함수식): 자바 프로그램(애플리케이션)을 실행하기 위해서
	//						반드시 필요한 구문이다!!
	// main 작성 후 ctrl + space -> Enter 하면 자동완성 !
	public static void main(String[] args) {
		
		//main 메서드 안에 작성한 코드를 실행시키는 방법
		//단축기 : ctrl + F11
		
		System.out.println("Hello World!!!!!!!");
		//syso 작성 후 ctrl + space -> Enter 하면 자동완성 !
		
		//저장 단축키: ctrl + s
		System.out.println("hi");
		System.out.println(); //개행만 (띄어쓰기 느낌)
		System.out.println("저녁 뭐 먹지?");
		System.out.println("1234");
		System.out.println(1234);
		//단축키: ctrl + art + 위,아래 방향키 방향으로 해당 줄 복사 가능!!

		System.out.println("1 + 2");//"" 안에는 문자로 인식함!
		System.out.println(1 + 2);  //"" 안에 작성하지 않은 코드는 숫자, 변수로 인식 함!
		
		System.out.println(500000000 - 24);
		System.out.println(12 * 14);
		System.out.println(12 / 3);
		System.out.println(12 % 2); // % -> 이 녀석은 모듈러(modulo) 임 (나머지 구하는 기호)
		
		//""(문자열) + 숫자 함께 작성 : 이어쓰기
		// 숫자+숫자: 더하기 연산
		System.out.println("14 * 19 ="+ 14 * 19);
		
		// 자바는 사칙연산의 우선 순위를 그대로 따름
		// --> 우선 계산을 원하면 "()" 사용
		
		System.out.println("90 + 70 + 65 = " + (90 + 70 + 65));
		
	}
}
