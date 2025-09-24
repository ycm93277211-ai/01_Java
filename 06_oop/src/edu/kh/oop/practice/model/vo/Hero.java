package edu.kh.oop.practice.model.vo;

public class Hero {// 객체 정의

//	- nickname : String // 닉네임
//	- job : String // 직업
//	- hp : int // 체력
//	- mp : int // 마력
//	- level : int // 레벨
//	- exp : double // 경험치
	// 히어로 객체들
	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;

	public Hero() {
	}// 기본 생성자

	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {// 매개생성자
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
	}

	public void attack(double exp) {
		this.exp += exp;
		System.out.println(nickname + "는/은 공격을 했다!!!! 현재 경험치 : " + this.exp);
		if(this.exp>=300) {
			level++;
			System.out.println("레벨이 올랐습니다 현재레벨: " + level);
		}
	}

	public void dash() {
		mp -= 10;
		System.out.println(nickname + "의 엄청 빠른 대시!! 남은 마력: " + mp);
		if (mp == 0) {
			System.out.println("[마력 부족] 더 이상 대시 할 수 없어요 ㅠㅠ");
		}
	}

	@Override
	public String toString() {
		return ("-현재 레벨: " + level + "\n-현재 hp: " + hp + "\n-현재 mp: " + mp + "\n-현재 exp: "+exp);
	}

	// 간접 진입 메서드
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

}
