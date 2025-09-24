package edu.kh.oop.mrthod.model;

import edu.kh.oop.meth.model.service.MethodService;
import edu.kh.oop.meth.model.vo.Member;
import edu.kh.oop.mrthod.model.service.MethodExample;

public class MethodRun {

	public static void main(String[] args) {

		MethodExample me = new MethodExample();
//		me.method1();
		
		 MethodService sv = new  MethodService();//기본생성자
//		sv.displayMenu();
		
		Member member = new Member("user01","pass01","홍길동",20);
		
		System.out.println(member);
//		==System.out.println(member.toString());
	}
}
