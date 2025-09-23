package edu.kh.array.practice.service;

import java.util.Arrays;
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

		int foundIdx = -1; // 참 거짓 판별

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				foundIdx = i;
			}

		}
		if (foundIdx != -1) {
			System.out.printf("인덱스 : %d", foundIdx);
		} else {
			System.out.print("일치하는 값이 존재하지 않습니다.");
		}
	}

	public void practice5() {

//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//
//		[실행 화면]
//		문자열 : application
//		문자 : i
//		application 에 i 가 존재하는 위치(인덱스) : 4 8
//		i 개수 : 2

		System.out.print("문자열: ");
		String str = sc.next();

		System.out.print("문자: ");
		char ch = sc.next().charAt(0);

		int count = 0;
		char[] arr = str.toCharArray();// ex)"hello"-> [h,e,l,l,o,w]

		System.out.print(str + "에" + ch + "가 존재하는 위치(인덱스) : ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == (ch)) {// arr[i] == ch char끼리 비교할때 == 사용함
				System.out.print(i + " ");
				count += 1;// 개수값 모으기

			}
		}
		System.out.println();
		System.out.print(ch + "의 개수: " + count);

	}

	public void practice6() {

		System.out.print("정수 값 : ");
		int num = sc.nextInt();

		while (true) {

			if (num >= 2 && num <= 9) {
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d \n", num, i, num * i);
					// 뒤에 곱 하는 값
				
				}
			} else {
				System.out.println("2~9 사이의 정수 값을 입력해 주세요 ");
			}
			
			break; //중복문 탈출
		}

	}

	public void practice7() {

		System.out.print("주민등록번호 : ");
		String input = sc.next();

		char[] arr = new char[input.length()];
		for (int i = 0; i < arr.length; i++) {

			if (i <= 7) {// 7번 인덱스 이하 성별까지
				arr[i] = input.charAt(i);// 이거 뭥미
			} else {// 8번 인덱스 이상
				arr[i] = '*';
			}

			System.out.print(arr[i]);
		}

	}

	public void practice8() {

		while (true) {// 3이상의 수가 입력될 떄까지 무한반복
						// 3이상 홀수가 입력되면 원하는 코드 수행 후 break 문으로 종료 예정

			System.out.print("정수 : ");
			int input = sc.nextInt();

			if (input < 3 || input % 2 == 0) {
				System.out.print("다시 입력하세요!");
			} else {
				// 입력받은 정수 만큼의 크기를 갖는 배열 생성
				int[] arr = new int[input];

				int num = 1; // arr 배열에 대입될 값
				for (int i = 0; i < arr.length; i++) {
					// 요소에 값 대입하기
					if (i <= arr.length / 2) { // 중간까지-> 증가
						arr[i] = num++;
					} else {// 중간 이후 -> 감소
						arr[i] = --num;
					}
					if (i == arr.length - 1) {
						System.out.print(arr[i]);
					} else {
						System.out.print(arr[i] + ",");
					}

				}
				break; // while문 멈춤
			}
		}

	}

	public void practice9() {

	}

	public void practice10() {

		int[] arr = new int[10];

		System.out.print("발생한 난수 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int max = 1;// 최대값을 담아줄 변수
		int min = 10;// 최솟값을 담아줄 변수

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {// 해당 인덱스 값이 max 값보다 큰 경우
				max = arr[i];
			}
			if (arr[i] < min) {// 해당 인덱스 값이 min 값보다 작은 경우
				min = arr[i];
			}
		}
		System.err.println("최대값 : " + max);
		System.err.print("최소값 : " + min);
	}

	public void practice11() {

	}

	public void practice12() {

	}

	public void practice13() {

	}

	public void practice14() {

		// 1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하세요 :");
		int size = sc.nextInt();

		sc.nextLine();// 입력 버퍼에 남은 개행문자 제거

		String[] arr = new String[size];
		// 2. 첫 배열에 저장할 문자열 입력받기

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}

		// 3.반복이 시작되는 구간부터 while 작성
		// 내부에 종료조건 만들어 break 이용하여 멈춤
		while (true) {
			System.out.print("값을 더 입력하시겠습니다(Y/N)");
			char ch = sc.next().charAt(0);
			sc.nextLine();

			// 4. 값을 더 입력할 경우
			if (ch == 'Y' || ch == 'y') {

				// 5.더 입력 받을 개수 입력받기
				System.out.print("더 입력 받을 개수: ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거

				// 6. 새로 값을 입력받을 배열 생성
				// -->기존 배열 크기 + 추가 입력 갯수

				String[] newArr = new String[arr.length + addSize];

				// 7. 배열 복사 + 새로운 문자열 입력받기
				for (int i = 0; i < newArr.length; i++) {
					if (i < arr.length) {// 인덱스의 값이 기존 배열보다 작을 경우 (깊은 복사)
						newArr[i] = arr[i];
					} else {
						System.out.print((i + 1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				// 8. 기존 배열 공간을 참조하던 변수 arr 에
				// 새로운 배열 공간의 주소를 가진 newArr 대입 (얕은 복사)
				arr = newArr;

			} else if (ch == 'N' || ch == 'n') {// 값을 더 입력하지 않을 경우
				break;
			} else {// 잘못 입력한 경우
				System.out.print("다시 입력하세요");
			}

		}
		// 9. 배열값 모두 출력
		System.out.println(Arrays.toString(arr));

	}
}
