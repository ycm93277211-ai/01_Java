package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	// 속성

	private Scanner sc = new Scanner(System.in);

	// 회원가입한 사람의 정보를 저장해둘 참조변수
	// Member 5칸 객체배열 선언 및 할당
	private Member[] memberArr = new Member[5];

	// 현재 로그인한 회원의 정보를 저장할 참조 변수 선언
	private Member loginMember = null;// 비로그인 상태

	// 기능
	public MemberService() {// 기본생성자
		// memberArr 배열, 0,1,2 인덱스 초기화

		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");// memArr[0] 0번째 요소에 member 필드변수를 넣겠다
		memberArr[1] = new Member("user02", "pass02", "계보린", 25, "경기");
		memberArr[2] = new Member("user03", "pass03", "고길동", 45, "강원");
	}

	// 메뉴 출력용 메서드
	public void displayMenu() {
		int menuNum = 0;// 메뉴 선택용 변수

		// 무조건 한번은 반복
		do {
			System.out.println("===회원 관리 프로그램 v2==");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원 정보 조회");
			System.out.println("4.회원 정보 수정");
			System.out.println("5.지역 조회");
			System.out.println("0.프로그램 종료");

			System.out.println("메뉴 입력: ");
			menuNum = sc.nextInt();
			sc.nextLine();

			switch (menuNum) {
			case 1:
				System.out.println(signup());
				break;
			case 2:
				System.out.println(login());
			case 3:
			case 4:
			case 5:searchRegion(); break;
			case 0:
				System.out.println("프로그램 종료..");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}

		} while (menuNum != 0); // menuNum 이 0이 되면 반복 종료
	}

	// 사이드 메서드 : 메인 기능은 아니나, 다른 메서드에 도움이 되는 메서드
	// memberArr의 비어있는 인덱스 번호를 반환하는 역할
	// 단, 비어있는 인덱스가 없다면 -1 반환
	public int emptyIndex() {
		for (int i = 0; i < memberArr.length; i++) {
			// 현재 인덱스에 있는 요소가 참조하는 값이 null인 경우의 인덱스를 반환 (null인 경우 자리에 넣을 수 있다)
			if (memberArr[i] == null) {
				return i;// 현재 메서드를 종료하고 호출한곳으로 i 값을 가지고 되돌아감
			}
		}
		// for 문을 수행했지만 인덱스값이 return 되지 않은 경우
		// 해당 위치 코드가 수행된다!
		// -> for 문에서 return 되지 않았다 == 배열에 비칸이 없음
		return -1;
	}

	// 회원가입
	public String signup() {
		System.out.println("\n=======회원 가입========");

		// 객체배열 memberArr에 새로 가입할 회원 정보를 저장할 예정
		// -> memberArr배열에 빈자르 있는지 확인
		// -> 빈 공간의 인덱스 번호를 얻어오기
		// -> 없을 때 : -1 반환
		int index = emptyIndex();
		if (index == -1) {
			return "회원가입 불가";
		}
		// 회원 가입 가능일 때
		System.out.println("아이디 : ");
		String memberId = sc.next();

		System.out.println("비밀번호 : ");
		String memberPw = sc.next();

		System.out.println("비밀번호 확인 : ");
		String memberPwCheck = sc.next();

		System.out.println("이름 : ");
		String memberName = sc.next();

		System.out.println("나이 : ");
		int memberAge = sc.nextInt();

		System.out.println("지역 : ");
		String region = sc.next();

		// 비밀번호, 비밀번호 확인이 일치하면 회원가입 진행
		// 일치하지 않으면 회원가입 실패
		if (memberPw.equals(memberPwCheck)) {// 일치
			// 새로운 Member 객체 생성해서 할당된 주소를
			// memberArr의 비어있는 인덱스에 대입
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, region);
			return "회원가입 성공";
		} else {// 불일치
			return ("회원가입 실패  비밀번호 불일치");
		}

	}

	public String login() {
		System.out.println("\n=============로그인============");

		// 1)아이디,비밀번호 입력받기
		System.out.println("아이디 : ");
		String memberId = sc.next();
		System.out.println("비밀번호 : ");
		String memberPw = sc.next();

		// 2) memberArr 배열 내 요소를 순서대로 접근하여
		// 2-1)현재 접근 요소가 null이 아닌지 확인(비교 이후 null이랑 비교 하면 에러 발생)
		for (int i = 0; i < memberArr.length; i++) {
			if (memberArr[i] != null) {// 회원 정보가 있을 경우
				// 2-2)회원 정보가 있을 경우
				// ->회원정보의 아이디,비밀번호 와 입력받은 로그인 아이디 비번이 같은지 비교
				if (memberArr[i].getMemberId().equals(memberId) && memberArr[i].getMemberPw().equals(memberPw)) {
					// 2-3) 아이디 / 비번 같다면 로그인 회원 정보 객체 참조할 변수
					// loginMember에 현재 접근 중인 memeberArr[i] 요소에 저잗ㅇ된 주소를 얕은 복사
					loginMember = memberArr[i];
					break;// 더 이상 같은 아이디,바번이 없을 것 이라고 예상 효율을 위해 종료
				}
			}
		}

		// 3)로그인 성공/실패 여부에 따라 결과 값 반환
		// ->로그인 성공: 홍길동님 환영합니다!
		// ->로그인 실패: 아이디 또는 비밀번호가 일치하지 않습니다
		if (loginMember == null) {
			return "아이디 또는 비밀번호가 일치하지 않습니다";
		} else {
			return loginMember.getMemberName() + "환영합니다";
		}

	}

	public void searchRegion() {
		System.out.println("\n=====회원 검색 (지역)======");
		System.out.print("검색할 지역을 압력하새요");
		String inputRegion = sc.next();

		// 1)memberArr 배열의 모든 요소 순차 접근

		boolean flag = true; // 검색 결과 신호용 변수

		for (int i = 0; i < memberArr.length; i++) {
			// 2) memberArr[i] 요소가 null 인 경우 반복 종료
			if (memberArr[i] == null)
				break;

			// 3)memberArr[i] 요소가 null 이 아니라면
			// memberArr[i]요소에 저장된 지역이 입력받은 지역과 같을 경우
			// memberArr[i] 요소에 저장된 객체의 회원 아이디 ,이름을 출력

			if (memberArr[i].getRegion().equals(inputRegion)) {
				System.out.printf("아이디: %s ,이름: %s\n", memberArr[i].getMemberId(), memberArr[i].getMemberName());
				flag = false; // 찾았다는 신호
			}
		}
		// 4)입력한 지역과 일치하는 회원이 없다면 결과 출력
		if (flag) {
			System.out.println("일치하는 검색결과가 없습니다.!");

		}

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
