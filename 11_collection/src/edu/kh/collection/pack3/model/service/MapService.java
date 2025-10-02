package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {

	// Map: key 와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	// Key : value -> 이 한 쌍을 Entry 라고 부름
	// Key= Value(콘솔창에 이렇게 나옴)
	
	
	// -Key를 모아두면 Set의 특징(중복X)
	// -Valus를 모아두면 List의 특징(중복O)
	
	public void ex1() {
		//HashMap< K , V >: Map의 자식 클래스 중 가장 대표되는 Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Map.put(Integer Key, String Value):  추가
		map.put(1, "홍길동");//{1=홍길동}
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
		
		//Key 중복 테스트
		map.put(1, "양충모");//중복 허용 X, 대신 Value 값 덮어쓰기
		
		//Value 중복 테스트
		map.put(7, "최길동");// 중복허용 O
		
		System.out.println(map);
	}
	/**
	 * Map(Member) 사용 예제
	 */
	public void ex2() {
		
		// VO/DTO(값 저장용 객체)
		//-> 특정 데이터 묶음의 재사용이 많은 경우 사용함.
		//-> 재사용이 적은 VO는 오히려 코드 낭비
		//-> Map 을 이용해서 VO와 비슷한 코드를 작성할 수 있음
		
		// 1) VO 버전
		Member member = new Member();
		
		//값 세팅
		member.setId("userId");// id = userId
		member.setPw("pass01");// pw = pass01
		member.setAge(30);	   // age = 30
		
		// 2) Map 버전
		Map<String, Object> map = new HashMap<>();
		// Value 가 Object 타입== 어떤 객체든  Value에 들어올 수 있다!!
		
		//값 세팅
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		//값 출력
		// object(Value) Map.get(key)
		//-> 매개변수로 전달받은 Key와 대응되는 Value반환
		//map.get(key)-> Value 값 출력
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("age"));
		
		System.out.println("------------------------------------------");
		
		//** Map 에 저장된 데이터에 순차적으로 접근하기**
		
		// Map 에서 Key 만 모아두면 Set 의 특징을 가잔다(중복 저장 x)
		//->이를 활용하면 Map 에서 KeySet() 메서드 제공
		//-> Key 만 모아서 Set 으로 변환
		
		Set<String> set= map.keySet(); 
		//id,pw,age 라는 key 가 저장된 Set 반환
		
		System.out.println("keySet(): "+set);
		
		//향상된 for 문
		
		for(String key:set) {
			System.out.println(map.get(key));
		}
		// map 에 저장된 데이터가 많거나 (반복 필요)
		// 어떤 key 가 있는지 불분명할때
		// 또는 map 에 저장된 모든 데이터에 접근해야할 때
		// keySet() + 향상된 for 문 코드 사용 용이
		
		
		
		
		
	}
	/**
	 * List 에 Map 여러개 추가하야 다루기
	 */
	public void ex3() {
		
	//List 객체 생성
		
		// List 객체 생성되었고, 해당 list 에는 Map 만 들어올 수 있을을 제한함!!
		List<Map<String,Object>> list = new ArrayList<>();
		
		// Map 객체는 아직 생성 x
		
		for(int i =0;i<10;i++) {
			
			// Map 객체 생성
			Map<String, Object> map = new LinkedHashMap<>();
			// HashMap은 순서를 보장하지 않는 자료구조
			// 순서를 유지하고 싶은면 'LinkedHashMap'이용
			//-> 'LinkedHashMap'은 put 한 순서를 유지 시켜줌!!!
			
			// Map에 데이터 추가
			map.put("id", "user0"+i);
			map.put("pw", "pass0"+i);
			
			// Map 을 list 에 추가
			list.add(map);
		}
		// for 문 종료 시 list 에 10개의 Map 객체가 추가되었음
		System.out.println(list);
		
		// 향상된 for 문 이용해서 key "id"에 대응되는 value 값 전부 출력하기
		
		for(Map<String, Object> temp :list) {
			System.out.println(temp.get("id"));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
