package edu.kh.io.pack2.run;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
/*
		// 불변성의(Immutable) String - > 우리가 흔히 쓰는 String

		// 1. new 연산자 - > heap 영역에 새로 주소를 만듦
		String st1 = new String("Hello");
		String st2 = new String("Hello");
		System.out.println(System.identityHashCode(st1));//681842940
		System.out.println(System.identityHashCode(st2));//1392838282
		st1 = st1 + "world";
		System.out.println(System.identityHashCode(st1));//1706377736
		
		// 2. 리털럴 표기법(우리가 흔히 쓰는 표현,상수 풀에 가서 있으면 출력 즉 있는거 참조 해서 출력)
		String st3 = "Hello";
		String st4 = "Hello";
		System.out.println(System.identityHashCode(st3));//523429237
		System.out.println(System.identityHashCode(st4));//523429237
		// String  상수 풀
		st3 = st3 + "world";
		System.out.println(System.identityHashCode(st3));//1804094807
		
		
		
		// 가변성(Mutable)의 StrngBuider(비동기화 빠름), StringBuffer(동기화 느림)
		//사용 이유->메모리 효율성
		StringBuilder sb = new StringBuilder();
		System.out.println(System.identityHashCode(sb));//951007336
		sb.append("Hellow World");
		sb.append(" 12345");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));//951007336
 */
		
		ByteService service = new ByteService();
//		service.fileByteOutput();
//		service.bufferedFileByteOutput();
//		service.fileByteInput();
//		service.bufferedFilebyteInput();
		service. FileCopy();
	}
}
