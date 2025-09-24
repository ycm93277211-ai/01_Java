package edu.kh.oop.meth.model.vo;

public class Member {// 회원 클래스
	// 속성 + 기능

	// 필드==속성
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;

	// 기능 ==메서드/생성자
	public Member() {
	}

	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	//object 클래스 : 모든 클래스의 최상위 부모
	//object.toString()
	//->객체의 위치 + 주소값을 해시코드 형태로 문자열 반환
	
	//Override 란>
	//부모가 가진 메서드를 자식이 재정의 하는 것
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName + ", memberAge="
				+ memberAge + "]";
	}
	
	//	toString() 메서드 : 객체가 문자열로 변환되어야 할때 사용하는 메서드
	//->보통 객체의 필드값을 출력하는 용도로 오버라이딩 하여 사용함.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
