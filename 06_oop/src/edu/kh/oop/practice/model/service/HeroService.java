package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {

	public void practice() {

		Hero hr1 = new Hero("이구역짱", " 전사", 200, 20, 1, 0); // 전사
		Hero hr2 = new Hero("Zi존위자드", "마법사", 100, 100, 1, 0); // 마법사

		System.out.println("=================== 캐릭터 생성 ====================");

		System.out.println("전사 직업으로" + "'" + hr1.getNickname() + "'" + "님이 생성되었습니다!");
		System.out.println("현재 레벨 : " + hr1.getLevel());
		System.out.println("현재 hp : " + hr1.getHp());
		System.out.println("현재 mp : " + hr1.getMp());
		System.out.println("현재 경험치 : " + hr1.getExp());

		System.out.println("=================== 캐릭터 생성 ====================");

		System.out.println("전사 직업으로" + "'" + hr2.getNickname() + "'" + "님이 생성되었습니다!");
		System.out.println("현재 레벨 : " + hr2.getLevel());
		System.out.println("현재 hp : " + hr2.getHp());
		System.out.println("현재 mp : " + hr2.getMp());
		System.out.println("현재 경험치 : " + hr2.getExp());

		System.out.printf("=================== %s 시점 ====================\n", hr1.getNickname());

		hr1.attack(100);
		hr1.attack(50.5);
		hr1.attack(49.5);

		hr1.dash();
		hr1.dash();

		System.out.printf("=================== '%s'님의 정보  ====================\n", hr1.getNickname());
		System.out.println(hr1.toString());
		

		System.out.printf("=================== %s 시점 ====================\n", hr2.getNickname());

		hr2.attack(300);
		hr2.dash();
		hr2.attack(300);
		hr2.attack(300);


		System.out.printf("=================== '%s'님의 정보  ====================\n", hr2.getNickname());
		System.out.println(hr2.toString());

	}

}
