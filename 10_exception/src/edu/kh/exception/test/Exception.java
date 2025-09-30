package edu.kh.exception.test;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 컴파일 에러: 개발자가 코드 잘못쓴 경우
		// ex) int a = 99.9;
		// 개발자가 코드 수정하여 컴파일 에러를 고칠 수 있다.

		// 런타임 에러: 프로그램 수행 중 발생하는 에러
		// 주로 if 문으로 처리 가능하다.
		
		int[] arr = new int[3];// 길이 3:인덱스 0,1,2까지
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		// arr[3] = 40;
		
		if(3>=arr.length) { //배열 인데스 범위 초과한 값이 들어왔다면
			System.out.println("배열 범위를 초과했습니다.");
		}else { //아니라면
			arr[3] = 40;
			System.out.println("배열 범위 안전적.....");
		}
	}

}
