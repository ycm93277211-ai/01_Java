package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;

public class Zoo {

	Scanner sc = new Scanner(System.in);

	List<Animal> animals = new ArrayList<>();

	public Zoo() {
	}

	public void addAnimal(Animal animal) {// (자료형 ,매개변수)==(Animal, animal) // animal 에 동물추 가
		 animals.add(animal);
	}

	public void showAnimals() {
		System.out.println("동물들의 울음소리를 들어보세요!!!!");
		for(Animal animal : animals) {
			animal.sound();//->“animal 이 Tiger 로 가정됐을 때, Tiger 클래스 안에 있는 sound() 
							//메서드가 실행 됨 (다형성)
			
		}

	}

	public void displayMenu() {

		int input;

		do {
			System.out.println("******* KH 동물원 *******");

			System.out.println("원하는 작업을 선택하세요  ");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.print("선택: ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				showAnimals();
				break;
			case 2:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");	
			}

		} while (input != 2);

	}
}
