package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone("Sumsang\n", "Galaxy S20\n", 2020, 1200000, "Android", 128);

		BasicPhone bp = new BasicPhone("Nokia\n", "3310\n", 2000, 100000, "\n이 휴대폰은 물리적 키보드가 있습니다.");

		System.out.println(sp);
		System.out.println("=======================================================");
		System.out.println(bp);
		System.out.println("3\r\n2\r\n1");
	}

}
