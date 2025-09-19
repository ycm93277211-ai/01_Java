package edu.kh.array.ex;

import java.util.Arrays;

public class Array2Example {

//	2차원 배열

//	잘형이 같은 1차원 1배열을 묶음으로 다루는것
//	행 , 열 개념이 추가

	public void ex1() {

//		2차원 배열 선언
		int[][] arr;
//		->int 2차원 배열을 참조하는 참조변수 arr선언
//		참조변수 , 참조형 , 레퍼런스 변수 레퍼런스

//		2차원 배열 할당
//		-> new 자료형[행][열];
		arr = new int[2][3];
//		heap 영역에 int 2차원 배열 2행 3열 공간을 할당
//		그 공간의 주소를 arr 참조변수에 대입

//		2차원 배열 초기화
//		1)행 , 열 인덱스를 이용해서 직접 초기화 
//		arr[0][0]=10;
//		arr[0][1]=20;
//		arr[0][2]=30;
//		
//		arr[1][0]=40;
//		arr[1][1]=50;
//		arr[1][2]=60;

//		2) 2중 for 문을 이용한 초기화
		int num = 10;// 배열 요소 최기화에 사용할 변수

//		**배열의 길이**
		System.out.println(arr.length); // 2 (행 길이)
//		arr이 참조하고 있는 2차원 배열의 행의 길이

		System.out.println(arr[0].length); // 3 (열 길이)
		System.out.println(arr[1].length); // 3 (열 길이)
//		arr[0],arr[1] 이 참조하고있는 배열의 길이

		for (int row = 0; row < arr.length; row++) { // 행 반복 (0,1)

			for (int col = 0; col < arr[row].length; col++) {// 열 반복 (0,1,2)

				arr[row][col] = num;
				num += 10;
			}
		}
//		3)선언과 동시에 초기화 
		int[][] arr2 = { { 10, 20, 30 }, { 40, 50, 60 } };

//		Arrays.toString();
//		참조하고 있는 1차운 배열의 값(주소값만)을 문자열로 반환
		System.out.println(Arrays.toString(arr));

//		Arrays.deepToString();
//		깊게 파고들어서 모든 값을 문자열로 반환
		System.out.println(Arrays.deepToString(arr2));

	}

	public void ex2() {
//		2차원 배열 선언과 동시에 초기화
//		3행 3열 짜리 정수형태 2차원 배열
//		1~9까지 초기화
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		행 별로 합출력
//		0행의 합: 6
//		1행의 합: 15
//		2행의 합: 24

		for (int row = 0; row < arr.length; row++) { // 행 반복(0,1,2)

			int sum = 0;

			for (int col = 0; col < arr[row].length; col++) { // 열 반복
				sum += arr[row][col];
			} // 안쪽 for문 중괄호 끝
			System.out.printf("%d행의 합 : %d\n", row, sum);
		}
		System.out.println("'=========================");

		// 열 별로 합출력
		// ex)
//		0열의 합 : 12
//		1열의 합 : 15
//		2열의 합 : 18

//		고정해야하는것: 열, 계속반복: 행

		for (int col = 0; col < arr[0].length; col++) {// 열 반복
			int sum = 0;

			for (int row = 0; row < arr.length; row++) {// 행 반복
				sum += arr[row][col];
			}
			System.out.printf("%d열의 합 : %d\n", col, sum);
		}

	}

	public void ex3() {
//		가변 배열:
//		2차원 배열 생성 시 마지막 배열 차수(열)를 지정하지 않고
//		나중에 서로 크기가 다른 배열을 생성하여 참조하는 배열
		
		char[][] arr = new char[4][];
//			char 2차원 배열 생성 시 행 부분만 생성
		
		arr[0] =new char[3];
		arr[1] =new char[4];
		arr[2] =new char[5];
		arr[3] =new char[2];
		
		char ch ='a';
		
		for(int row = 0;row< arr.length; row++) { //0,1,2,3
			for(int col =0; col< arr[row].length;col++) {
				
				arr[row][col] = ch++;
			}
		}System.out.println(Arrays.deepToString(arr));
		
	}
}
