package edu.kh.poly.ex2.run;

import edu.kh.poly.ex2.model.service.Calculator;
import edu.kh.poly.ex2.model.service.HGDCalculator;
import edu.kh.poly.ex2.model.service.YCMCalculator;

public class AbstractRun {

	public static void main(String[] args) {

//		new AbstractService().ex1();
		
		
		//===================================
		
		Calculator cal =  new YCMCalculator();
		System.out.println("합: "+cal.plus(20 , 30));
		System.out.println("차: "+cal.minus(20, 30));
		System.out.println("곱: "+cal.multiple(20, 30));
		System.out.println("몫: "+cal.divide(20, 30));
		
		Calculator cal2 = new HGDCalculator();
		
	}

}
