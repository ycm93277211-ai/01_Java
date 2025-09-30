package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentService {

	// <E>: 제네릭
	// -> 타입을 제한하는 문법
	// -> 제네릭에 쓴 문법만 들어갈 수 있음
	// 제네릭은 객체(Reference Type==참조형)만 허용
	// 자바 7 이상에서는 우변 제네릭 타입을 생략 가능 하다
	// 다이아몬드 연산자 == <> : 컴마일러가 좌변을 보고 우변 타입을 추론!!
	private List<Object> testList = new ArrayList<>();

	// 학생 정보를 저장할 List 생성
	private List<Student> studentList = new ArrayList<>(); // 아주 중요함!!!!! 시험에 나올거 같음

	private Scanner sc = new Scanner(System.in);

	/**
	 * 메뉴 출력용 메서드
	 * 
	 * alt + shift + j : 메서드 설명용 주석
	 * 
	 * @author user 양충모(야야야야ㅑ양)
	 */
	
	public void displayMenu() {
		int menuNum = 0;// 메뉴 선택용 변수

		do {
			
			try {
				System.out.println("\n=============학생 관리 프로그램=================");
				System.out.println("1. 학생 정보 추가");
				System.out.println("2. 학생 정보 전체 조회");
				System.out.println("3. 학생 정보 수정");
				System.out.println("4. 학생 정보 제거");
				System.out.println("5. 이름으로 검색(완전일치)");
				System.out.println("6. 이름으로 검색(포함)");
				System.out.println("0. 프로그램 종료");
				
				System.out.print("메뉴 번호 선택: ");
				menuNum =sc.nextInt();
				sc.nextLine(); //입력버퍼 개행문자 제거용
				
				switch (menuNum) {
				case 1: System.out.println(addStudent()); break;
				case 2:					break;
				case 3:					break;
				case 4:					break;
				case 5:					break;
				case 6:					break;
				case 0:System.out.println("프로그램 종료");	break;

				default:System.out.println("메뉴에 작성된 번호만 입력하세요!!!!!!!!!!!!");
					break;
				}
				
					
			
				
			} catch (InputMismatchException e) {
				System.out.println("\nerror: 입력행식이 유효하지 않습니다 "
						+ "다시 시도해주세요");
				sc.nextLine();// 입력버퍼 남아있는 잘못된 코드 + 개행문자 제거
				
				menuNum = -1;//첫 반복시 잘못 입력하는 경우
							 //menuNum이 초기값인 0을 가지고있어 반복문이 종료됨.
							 //이를 방지하기 위해서 임의값 -1 대입
			}
		} while (menuNum != 0);
			
		}
			
		

	public String addStudent() {
			// UncherkedException : 강제처리 x,예외 발생하면 자동으로 상위 호출 메서드로 예외 전파
			// InputMismatchException, NullPointerException...
			
			System.out.println("=========학생 정보 추가=========");
			
			System.out.print("이름: ");
			String name = sc.next();
					
			System.out.print("나이: ");
			int age = sc.nextInt();
			
			System.out.print("사는 곳: ");
			String region = sc.next();
					
			sc.nextLine();
			System.out.print("성별(m/f): ");
			char gender = sc.next().charAt(0); // m or f
			
			System.out.print("점수: ");
			int score = sc.nextInt();
			
			// Student 새 객체 생성 후 studentList에 추가
			if(studentList.add(new Student(name,age,region,gender,score))) {
				return"성공";
			} 
			else{
				return"실패";
			}
			
	
		
	}

	// new ArrayList(); : 기본생성자 -> 가본 크가 10칸 리스트 생성(의미 없음,알고 있으면 좋음)
	// 하지만 리스트의 크기는 늘었다 줄었다 하기 때문에 큰 의미는 없음

	// List==부모 ,ArrayList==자식
	// List - > 인터페이스: List에 반드시 필요한 필수 기능을 모아둔 인터페이스다
	// * 인터페이스 객체 생성 불가, 단 부모 참조 변수는 가능

	// ArrayList: 배열 형태 List (가장 대표적인 List 자식 클래스)
	// -> 검색(조회) 효율적 이다

	// Vector== 자식 : 동기화 제공하여 느림 ,List 중 성능이 가장 구림

	// LinkedList : 추가,수정,삭제에서 효율적임

	public void ex() { // List 테스트용 메서드
		// List.add(E e) : 리스트에 객체를 추가
		// 매개변수 타입 object == 모든 객체 타입을 매개변수로 전달할 수 있음
		testList.add("문자열");
		testList.add(new Scanner(System.in));
		testList.add(1000);// AutoBoxing (자동으로 기본자료형을 객체형태로 변환함)
		testList.add(new Object());

		// 컬렉션 특징 : 여러 타입의 데이터를 저장할 수 있다.!.

		// Object List.get(int index): 리스트에서 index 번째에 있는 객체를 반환
		// 반환형이 object == 모든 객체를 반환할 수 있다.

		System.out.println(testList.get(0));
		System.out.println(testList.get(1));
		System.out.println(testList.get(2));
		System.out.println(testList.get(3));

		for (Object e : testList) {
			System.out.println(e);
		}

	}

}
