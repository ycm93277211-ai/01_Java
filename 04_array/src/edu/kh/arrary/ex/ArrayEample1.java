package edu.kh.arrary.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEample1 {
	/*
	 * 
	 * 배열(Array)
	 * 
	 * -같은 자료형의 변수를 하나의 묶음으로 다루는 것. -묶여진 변수들은 하나의 배열명으로 불려지고 구분은 index 를 이용함 (index
	 * 는 0부터 시작하는 정수)
	 * 
	 * 
	 */

	public void ex1() {
		// 변수 vs 배열

		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는
		// 공간 4byte를 할당하고 그 공간에 num이라는 이름을 부여

		// 변수 대입
		num = 10;
		// 생성된 num이라는 변수공간에 10 이라는 정수값 대입

		// 변수 사용
		System.out.println(" num에 저장된 값 : " + num);

		// ----------------------------------

		// 배열 선언
		int arr[];// or int[] arr;
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름 부여
		// ** 해당 변수(arr)는 참조형으로 주소값만을 저장할 수 있다 **

		// 배열의 할당
		arr = new int[3];
		// new : "new 연산자" 라고하면
		// Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당함

		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열

		// new int[3] : Heao 영역에 int형 변수 3칸짜리 int[]을 생성(할당)

		System.out.println(arr);// 주소값 출력
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// -> Heap 영역에 생성된 공간은 절대 비어있을 수 없다
		// -> JVM 기본값이 들어가져 있다

		// boolean : false
		// 나머지 : 0
		// 참조형 : null

		// 배열 요소 값 대입
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
//		arr[3] = 500;  런타임 발생 에러
//		배열 범위 벗어나 예외 발생

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// [10,50,100] 요로케 출력하고 싶을때
		// 실제로 배열이 가진 모든 요소의 값을 알고 싶을때
		// Arrays.toString(배열명); -> String형
		// [10,50,100]
		System.out.print(Arrays.toString(arr));

	}

	public void ex2() {
		// 배열 선언 및 할당
		int[] arr = new int[4];

		// arr[0~3] 전부 JVM(자바가상기계)에 의헤 0으로 초기화 되어있는 상태

		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;

		// 배열과 for문
		// 배열의 길이(몇 칸 인가) : 배열명.length
		System.out.println("배열의 길이 : " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 100; // for을 이용한 초기화 방법
			System.out.printf("arr[%d]에 저장된 값: %d\n", i, arr[i]);
		}
		// 선언과 동시에 초기화
		int[] arr2 = { 1, 2, 3, 4, 5 };
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr2 라는 이름부여
		// Heap 메모리 영역에 int 5칸짜리 배열을 생성하고
		// 0번 인덱스부터 각 요소에 1~5까지 정수값을 대입.
		// int[] 주소값을 arr2 참조변수가 참조함.

		System.out.println(Arrays.toString(arr2));

	}

	public void ex3() {
		// 5명의 키(cm)를 입력받고 평균 구하기

//		1번 키 입력 : 170.5
//		2번 키 입력 : 163.7
//		.....
//		5번 키 입력 : 167.2
//		평균 : 177.02
		double sum = 0;

		Scanner sc = new Scanner(System.in);

		double[] hi = new double[5];

		// 배열의 각 요소에 값 대입하는 용도의 반복문

		for (int i = 0; i < hi.length; i++) {
			System.out.print((i + 1) + "번 키 입력: ");
			hi[i] = sc.nextDouble();
			// hi[0] = 170.2;
			// hi[1] = ..
			// hi[2] = ..
			// hi[3] = ..
			// hi[4] = ..
			sum += hi[i];
		}
		System.out.printf("\n평균 : %.2f cm", sum / hi.length);

	}

	public void ex4() {
		// 입력 받은 인우너 수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균 출력

		// ex)
		// 입력 받을 인원수: 4
		// 1번 점수 입력 : 100
		// 2번 점수 입력 : 100
		// 3번 점수 입력 : 100
		// 4번 점수 입력 : 100

		// 합계 : 290
		// 평균 : 72.5
		int sum = 0;
		Scanner sc1 = new Scanner(System.in);

		int[] jomsu = new int[4];

//		System.out.print("입력 받을 인원수: ");
//		jomsu[]	= sc1.nextInt();

		System.out.print("입력 받을 인원수: ");
//		jomsu[i]= sc1.nextInt();

		for (int i = 0; i < jomsu.length; i++) {

			System.out.print((i + 1) + "번 점수 입력: ");
			jomsu[i] = sc1.nextInt();
			sum += jomsu[i];
		}
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.2f", (double) (sum / jomsu.length));

	}

	public void ex5() {
		// 점심 메뉴 뽑기 프로그램
		String[] arr = { "김밥", "서브웨이", "햄버거", "백반", "국밥", "짜장면" };

		System.out.print("오늘 점심 메뉴: " + arr[(int) (Math.random() * 6)]);
		// Math.random() 0.0~1.0
		// Math.random() * 6 0~5

	}

	public void ex6() {

		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스인지 출력

		// 정수 입력 : 200
		// 1번째 인덱스에 존재

		// 정수입력: 5
		// 존재하지 않음

		Scanner sc2 = new Scanner(System.in);

		int[] arr = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, };

		System.out.print("정수입력: ");
		int num = sc2.nextInt();

		// 찾음 여부를 표시하기 위한 변수
		boolean flag = false;// 검사전에는 못찾았다고 가정

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				System.out.printf("%d번째 인덱스 존재", i);
				flag = true;// 일치하는 값을 찾았으므로 true로 변경
			}

		}
		if (!flag) {
			System.out.println("존재하지 않음");
		}
	}

	public void ex7() {
		Scanner sc2 = new Scanner(System.in);

		String[] arr = { "사과", "딸기", "바나나", "키위", "멜론", "아보카도" };
		System.out.print("과일 입력: ");
		String num = sc2.next();

		int i;
		for (i = 0; i < arr.length; i++) {
			if (num.equals(arr[i])) {
				// String 비교시 eqals() 사용!
				System.out.println(i + "번째 인덱스에 존재");
				break;
			}

		}
		if (i == arr.length) {
			System.out.println("존재하지 않음");

		}
	}

	public void ex8() {
		// 문자열 입력: hello
		// [h,e,l,l,o]
		// 검색할 문자 입력 :l
		// 2개있음 / 존재하지 않음

		// 1. 문자열을 입력받아 한 글자씩 잘라내어
		// char 배열에 순서대로 저장
		// 2. 문자하나를 입력받아 일치하는 문자가 char 배열에
		// 몇 개 존재하는지 확인
		// 3. 단, 일치하는 문자가 없을 경우 "존재하지 않습니다."

		// 사용해야하는 기술, 기능
		// 1)배열 검색
		// 2)문자열의 길이 구하기 : String.length()
		// ex) "hello".length() -> 5 반환
		// 3) String.charAt(index) : 문자열에서 특정 index에
		// 위치한 문자 하나를 얻어옴.
		// ex) "h e l l o".charAt(1) -> 'e' 반환
		// 0 1 2 3 4
		// 4)count(숫자세기)

		Scanner sc2 = new Scanner(System.in);

		System.out.print("문자열 입력: ");
		String input = sc2.nextLine();
		// hello world -> [h,e,l,l,o, ,w,o,r,l,d]
		// 1. 입력받은 문자열을 한글자씩 잘라내어
		// char 배열에 순서대로 저장
		// 1-1) 입력받은 문자열 길이만큼
		// char 배열 선언 및 할당하기

		char[] arr = new char[input.length()];//내가 콘솔에 쓴 글(input.length())을 char[]arr에 넣음

		// 1-2) 입력한 문자열을 한글자씩 잘라내어 char 배열의
		// 모든 요소에 순서대로 값 대입하기

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		System.out.println(Arrays.toString(arr));

		System.out.print("검색할 문자 입력: ");
		char ch = sc2.next().charAt(0);
		// String.charAt(index)->문자형''
		// "e".charAt(0); ->'e'
		// ->Scanner 에는 char 형태를 입력받을 수 있는 메서드가 없다
		// ->String 으로 우선 입력받고, 입력받은 String에서
		// char(index)메서드를 이용하여 해당 index 번쩨 존재하는
		// 문자 하나를 떼어 char 자료형 형태로 반환함.

		// arr이라는 배열에 입력한 문자가 몇개 존재하는지
		// 0번index부터 마지막 index까지 순호하며 검색하기 위함

		int count = 0;// 내가 찾는 글자 개수를 세기 위한 변수

		for (int i = 0; i < arr.length; i++) {
			if (ch == arr[i]) {
				count++;
				// arr[1] 갑과 검색할 문자 ch가 같은 경우
				// 카운트를 눌려라!
			}

		}
		//결과 출력
		if(count >0) { //일치하는 값 일을때
			System.out.print(count + "개 있음");
		}else {//일치하는 문자가 없는 경우

			System.out.println("존재하지 않음");
			
			
		}
	}
}
