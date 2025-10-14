package toyfactoryminiproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class ToyFactory {

	private Map<Integer, String> ma = new HashMap<>();
	private Set<ToyClass> toy = new HashSet<>();

	Scanner sc = new Scanner(System.in);

	public ToyFactory() {
		ma.put(1, "면직물");
		ma.put(2, "플라스틱");
		ma.put(3, "유리");
		ma.put(4, "고무");

		toy.add(new ToyClass("마미롱레그", 8, 36000, "분홍색", 19950805, addMaterials(1, 4)));
		// addMaterials == Set 객체를 반환할 메서드 호출 즉 메서드 만들기
		toy.add(new ToyClass("키시미시", 5, 15000, "분홍색", 19940505, addMaterials(1, 2)));
		toy.add(new ToyClass("캣냅", 8, 27000, "보라색", 19960128, addMaterials(1, 2)));
		toy.add(new ToyClass("파피", 12, 57000, "빨간색", 19931225, addMaterials(1, 2, 4)));
		toy.add(new ToyClass("허기워기", 5, 12000, "파란색", 19940312, addMaterials(1, 2)));

	}

	// 가변인자(인자수가 변할 수 있음): 몇개든 들어갈 수 있음
	// 사용방법 -> 자료형...변수명
	// 가변인자를 통해 들어온 매개변수의ㅣ 데이터 타입은 배열이다

	/**
	 * 매개변수로 전달받은 값들을 재료를 저장한 Map에 있는지 확인하고 Set형태로 반환하는 메서드
	 * 
	 * @param materials
	 * @return
	 */
	// addMaterials( , )의 기능
	public Set<String> addMaterials(Integer... materials) {

		Set<String> str = new HashSet<>();

		for (Integer material : materials) {
			if (material != null) {
				str.add(ma.get(material));
			}
		}
		return str;
	}

	public void display() {

		int Choice = 0;

		do {

			System.out.println("<<플레이타임 공장>>");
			System.out.println("1.전체 장난감 조회하기");
			System.out.println("2.새로운 장남감 만들기");
			System.out.println("3.장난감 삭제");
			System.out.println("4.장난감 제조일 순으로 조회하기");
			System.out.println("5.연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6.재료 추가");
			System.out.println("7.재료 삭제");
			System.out.println("0.종료");
			System.out.print("선택: ");
			Choice = sc.nextInt();

			switch (Choice) {
			case 1:
				inquiry();
				break;
			case 2:
				Additional();
				break;
			case 3:
				toyelimination();
				break;
			case 4:
				toyeUseAge();
				break;
			case 5:
				useAge();
				break;
			case 6:
				break;
			case 7:
				break;

			default:
				break;
			}

		} while (Choice != 0);
		System.out.println("플레이타임 공장을 종료합니다");

	}

	public void inquiry() {
		int sum = 1;
		System.out.println("<<장난감 목록>>");
		for (ToyClass t : toy) {
			System.out.printf("%d.%s\n", sum++, t);
		}

		System.out.println();
	}

	public void Additional() {
		System.out.println("<<새로운 장남감 추가>>");
		System.out.print("장난감 이름: ");
		String toyname = sc.next();

		System.out.print("사용 가능 연령: ");
		int toyage = sc.nextInt();

		System.out.print("가격: ");
		int toyprice = sc.nextInt();

		System.out.print("색상: ");
		String toycolar = sc.next();

		System.out.print("제조일(YYYYMMDD형식으로 입력): ");
		int toymake = sc.nextInt();

		Set<String> materials = new HashSet<>();

		for (int i = 0; i < 3; i++) {
			System.out.print("재료를 입력하세요 (종료하려면'q'를 입력하세요): ");
			String end = sc.next();

			if (end.equals("q")) {
				break;
			}
			materials.add(end);
		}

		toy.add(new ToyClass(toyname, toyage, toyprice, toycolar, toymake, materials));

		System.out.println("새로운 장난감이 추가되었습니다");

	}

	public void toyelimination() {
		System.out.print("삭제할 장난감 이름을 적어주세요: ");
		String toyname = sc.next();

		boolean flag = false;
		ToyClass result = null;

		for (ToyClass t : toy) {
			if (t.getToyName().equals(toyname)) {
				flag = true;
				result = t;
				break;
			}
		}

		if (flag) {
			toy.remove(result);
			System.out.println("장난감이 삭제 되었습니다.");
		} else {
			System.out.println("해당 이름의 장난감을 찾을 수 없습니다");

		}
	}

	public void toyeUseAge() {
		List<ToyClass> list = new ArrayList<ToyClass>(toy);
		list.sort(ToyClass.Make_COMPARATOR);
		
//		Collections.sort(list);
		
		int sum = 1;
		System.out.println("<제조일 순으로 장난감 정렬>");
		for (ToyClass t : list) {
			System.out.printf("%d.%s\n", sum++, t);
		}

		System.out.println();

	}

	public void useAge() {
		System.out.println("<연령별 사용 가능한 장난감>");
		
		List<ToyClass> list = new ArrayList<ToyClass>(toy);
//		list.sort(ToyClass.AGE_COMPARATOR);
		Collections.sort(list, new Comparator<ToyClass>() {
			@Override
			public int compare(ToyClass o1, ToyClass o2) {
				
				return Integer.compare(o1.getAgeOfUse(), o2.getAgeOfUse());
			}
		});
			
		int sum = 1;
		//사용연령 같은값이 있는지
		for(ToyClass age : list) {
			System.out.println("[연령:" + age.getAgeOfUse() + "세]");
			System.out.printf("%d.%s\n", sum++, age);
		}
		

		System.out.println();

	}
}
