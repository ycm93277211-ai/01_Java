package edu.kh.array.practice.service;

import java.security.DrbgParameters.NextBytes;
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
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int arr[] = new int[num];

		for (int i = 0; i < arr.length; i++) {

			System.out.print((i + 1) + " ");
		}
	}

	public void practice4() {
//		정수 5개를 입력 받아 배열을 초기화 하고
//		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
//		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
//
//		[실행 화면 1]            
//		입력 0 : 5                    
//		입력 1 : 8                 
//		입력 2 : 9
//		입력 3 : 10
//		입력 4 : 4
//		검색할 값 : 8
//		인덱스 : 1
//
//		[실행 화면 2]
//		입력 0 : 5
//		입력 1 : 8
//		입력 2 : 9
//		입력 3 : 10
//		입력 4 : 4
//		검색할 값 : 1
//		일치하는 값이 존재하지 않습니다.

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {// arr[] 배열값 저장
			System.out.printf("입력 %d: ", i);
			arr[i] = sc.nextInt();
		}

		System.out.print("검색할 값: ");
		int num = sc.nextInt();

		int foundIdx = -1; //참 거짓 판별
		
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				foundIdx = i;
			}

		}
		if (foundIdx != -1) {
			System.out.printf("인덱스 : %d",foundIdx );
		} else {
			System.out.print("일치하는 값이 존재하지 않습니다.");
		}
	}
}
