package edu.kh.oop.meth.model.service;

import java.util.Scanner;

import edu.kh.oop.meth.model.vo.Member;

public class MethodService {

	// 속성 (필드)

	private Scanner sc = new Scanner(System.in);

	// 가입한 회원의 정보를 저장할 변수
	private Member memberInfo = null;

	// 로그인한 회원의 정보를 저장할 변수
	private Member loginMember = null;

	// 기능 (생성자,메서드)

	// 메뉴 화면 출력 기능
	public void displayMenu() {

		int menuNum = 0; // 메뉴 선택용 변수

		// 무조건 한버은 수행
		do {
			System.out.println("==========회원 정보 관리 프로그램");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력:");
			menuNum = sc.nextInt();
			sc.nextLine();

			switch (menuNum) {
			//내가 호출한 메서드가 return 하는 값을 잘 생각하기!!!!!!!!!!
			case 1:
				System.out.println(signUp()); break;//return 될때 이 전체가 리턴값임
			case 2:
				System.out.println(login());   break;
			case 3:
				System.out.println(selectMemeber()); break;
			case 4:
				 int result = updateMember();
				 if(result==-1) {
					 System.out.println("로그인 후 이용바람");
				 }else if(result ==0) {
					 System.out.println("회원 정보 수정 실패 (비밀번호 불일치)");
				 }else {
//					 result = 1;
					 System.out.println("회원 정보가 수정되었습니다!");
				 }
				 
				 break;
			case 0:
				System.out.println("프로그램 종료..");
				break;
			default:
				System.out.println("메뉴에 있는 번호만 입력하세요!");
			}
		} while (menuNum != 0);
		{// menuNum 이 0이되면 반복 종료

		}

	}

	public String signUp() {// 회원가입 정의

		System.out.println("\n***********회원 가입*************");

		System.out.print("아이디: ");
		String memberId = sc.next();

		System.out.print("비밀번호: ");
		String memberPw = sc.next();

		System.out.print("비밀번호 확인: ");
		String memberPwCheck = sc.next();

		System.out.print("이름: ");
		String memberName = sc.next();

		System.out.print("나이: ");
		int memberAge = sc.nextInt();

		// 비밀번호, 비밀번화 확인이 일치하면 회원가입 진행
		// 일치하지 않으면 회원가입 실패
		if (memberPw.equals(memberPwCheck)) {// 일치하는 경우

			// 회원 가입
			// 새로운 회원 객체가 생성
			// ->Member 클래스 이용해서 새로운 객체를 생성
			// ->매개변수 생성자 이용
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			// 회원가입한 정보를 가진 객체의 주소값을
			// memberInfo 필드변수에 참조시킴
			// ->회원가입 진행후 memberInfo는
			// 더 이상 null이 아니다!

			return "회원 가입 성공❤";

		} else {// 일치하지 않는 경우
			return "회원가입 실패 (비밀번호 불일치)";
		}
	}

	public String login() {
		// 회원가입 되어있는 사람이 있는지 없는지 검사
		// 내가 입력한 아이디와 비밀번화로 가입한 사람의 정보가
		// 있는지 확인!

		System.out.println("\n*************로그인************");

		// 회원가입을 했는지 확인
		// == memberInfo 가 객체를 참조하고 있는지 확인
		// == null 인지 아닌지 확인
		if (null == memberInfo) {// 회원가입을 안한 경우
			// null: 아무것도 참조하고 있지 않음을 의미
			return "회원가입부터 진행해주세요!";
			// 조건이 성립되면 이 메서드 종료후 호출한 쪽으로 리턴함
			// 종료하기 때문에 else 문 쓸 필요 없음
		}
		// 회원가입을 했다면, 해당 라인으로 도달할 수 있음
		// 로그인 기능 수행

		System.out.print("아이디: ");
		String memberId = sc.next();

		System.out.print("비밀번호: ");
		String memberPW = sc.next();

		// 회원 가입 정보(memberInfor가 참조하는 Member 객체)에
		// 저장된 아이디,비밀번호가
		// 입력한 아이디,비밀번호와 같은면 ->로그인성공
		// 같지 않으면 아이디 또는 비밀번호 불일치 리턴

		// 아이디,비밀번호가 모두 일치할 경우
		if (memberId.equals(memberInfo.getMemberId()) && memberPW.equals(memberInfo.getMemberPw())) {

			// 로그인한 사람의 정보를 기억시키기
			// loginMember에 현재 로그인한 사람의 정보를 기억시키기
			// ==loginMember 에 memberInfo가 참조하고있는 객체에 주소 대입
			loginMember = memberInfo;
			// 얕은 복사
			return loginMember.getMemberName() + "님 확영합니다.";
		} else {

			return "아이디 또는 비밀번화가 일치하지 않습니다!";
		}
	}

	public String selectMemeber() {

		// ->조회하려면? 로그인을 했는지부터 확인
		// ->로그인 했다면?
		// 현재 로그인한 사람의 정보를 저장한 객체에서
		// 정보를 얻어오기(이름,아이디,나이)
		// ->로그인 안했다면> 로그인 후 이용해주세요

		System.out.println("\n*********회원 정보 조회***********");

		// 1) 로그인 여부 확인
		if (loginMember == null) {
			return "로그인 후 이용해주세요";
		}

		// 2) 로그인 되어있는 경우
		// 이름: 홍길동
		// 아이디: yang
		// 나이: 20세

		String str = "이름: " + loginMember.getMemberName();
		str += "\n아이디 : " + loginMember.getMemberId();
		str += "\n나이 : " + loginMember.getMemberAge() + "세";

		return str;

	}

	public int updateMember() {
		// 회원 정보 수정 기능

		System.out.print("\n***********회원 정보 수정*************");

		// 1) 로그인 여부 판별
		// 로그인이 되어있지 않으면 -1 반환
		if (loginMember == null) {
			return -1;
		}
		// 2)로그인이 되어있을 때
		// 2-1) 수정할 회원 정보 입력 받기(이름,나이)
		System.out.print("\n수정할 이름 입력: ");
		String inpuntName = sc.next();

		System.out.print("수정할 나이 입력: ");
		int inpuntAge = sc.nextInt();

		// 2-2) 비밀번호를 입력 받아서 현재 로그인한 회원의
		// 비밀번호와 일치하는지 확인
		System.out.println("비밀번호 입력 : ");
		String inpuntPw = sc.next();

		if (inpuntPw.equals(loginMember.getMemberPw())) {
			// -> 비밀번호가 일치하는 경우
			// 로그인한 회원의 이름과 나이 정보를
			// 수정하기 위해 입력받은 값으로 변경 후 1 반환
			loginMember.setMemberName(inpuntName);
			loginMember.setMemberAge(inpuntAge);

			return 1;
			
		} else {
			// ->비밀번화가 다를 경우 0 반환
			return 0;
		}
	}

}
