package com.hw2.run;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {

		Zoo zo= new Zoo();
		
		
		Tiger ti = new Tiger("호랑이");//객체 생성
		zo.addAnimal(ti);
		
		Monkey mo = new Monkey("원숭이");//객체 생성
		zo.addAnimal(mo);

		zo.displayMenu();
	}

}
