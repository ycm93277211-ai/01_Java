package toyfactoryminiproject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ToyFactory {

	private Map<Integer, String> ma = new HashMap<>();
	private Set<ToyClass> toy = new HashSet<>();
	private Set<ToyClass> toys = new HashSet<>();

	Scanner sc = new Scanner(System.in);

	public ToyFactory() {
		ma.put(1, "면직물");
		ma.put(2, "플라스틱");
		ma.put(3, "유리");
		ma.put(4, "고무");

		toy.add(new ToyClass("마미롱레그", 8, 36000, "분홍색", 19950805, addMaterials(1, 4)));
		toy.add(new ToyClass("키시미시", 5, 15000, "분홍색", 1994050, addMaterials(1, 2)));
		toy.add(new ToyClass("캣냅", 8, 27000, "보라색", 19960128, addMaterials(1, 2)));
		toy.add(new ToyClass("파피", 12, 57000, "빨간색", 19931225, addMaterials(1, 2, 4)));

	}

	public Set<String> addMaterials(Integer... materials) {

		Set<String> str = new HashSet<>();

		for (Integer material : materials) {
			str.add(ma.get(material));
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
				break;
			case 5:
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

		System.out.println("<<장난감 목록>>");
		for (ToyClass t : toy) {
			System.out.println(t);
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

		System.out.print("색깔: ");
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

		for (ToyClass t : toy) {
			if (t.getToyName().equals(toyname)) {
				System.out.println("장난감이 삭제 되었습니다.");
				toys=toy;
				toy.remove(toys);
				
				break;
			} else {
				System.out.println("해당 이름의 장난감을 찾을 수 없습니다");
				break;
			}
//		System.out.println();

		}
	}

}
