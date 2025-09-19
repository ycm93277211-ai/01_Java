package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

//		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//
//		[실행 화면]
//		1 2 3 4 5 6 7 8 9
//		짝수 번째 인덱스 합 : 25
//		
		int[] arr = new int[9];
		int sum = 0;
		System.out.println("[실행 화면]");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");

			if (i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.printf("짝수 번째 인덱스 합 : %d", sum);
	}

	public void practice2() {

		System.out.print("[실행 화면]\n");

		int[] arr = new int[9];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);

			if (i % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.printf("홀수 번째 인덱스 합 : %d", sum);
	}
	public void practice3() {
		
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//
//		[실행 화면]
//		양의 정수 : 5
//		1 2 3 4 5
		
		
		System.out.println("[실행 화면]");
		System.out.println("양의 정수 : ");
		
				
		
	}
}
