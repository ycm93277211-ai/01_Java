package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ToyFactory {

	public class ToyFactory {

		Scanner sc = new Scanner(System.in);

		private Map<Integer, String> ma = new HashMap<>();
		private Set<Toy> toy = new HashSet<>();

		public ToyFactory() {
			ma.put(1, "면직물");
			ma.put(2, "플라스틱");
			ma.put(3, "유리");
			ma.put(4, "고무");

			toy.add(new Toy("마미롱레그", 8, 36000, "분홍색", 19950805, addMaterials(1, 4)));
			toy.add(new Toy("허기워기", 5, 12000, "파란색", 19940312, addMaterials(1, 2)));
			toy.add(new Toy("키시미시", 5, 15000, "분홍색", 19940505, addMaterials(1, 2)));
			toy.add(new Toy("캣냅", 8, 27000, "보라색", 19960128, addMaterials(1, 2)));
			toy.add(new Toy("파피", 12, 57000, "빨간색", 19931225, addMaterials(1, 2, 4)));

		}

		private Set<String> addMaterials(int... materialNums) {
			// [1, 4]
			// [1, 2, 4]
			Set<String> str = new HashSet<String>();

			for (int num : materialNums) {
				str.add(ma.get(num)); // ["면직물", "고무"]
			}
			return str;
		}

		public void displayMenu() {

			int choice = 0;

			do {
				try {
					System.out.println("<< 플레이타임 공장>>");
					System.out.println("1. 전체 장난감 조회하기");
					System.out.println("2. 새로운 장난감 만들기");
					System.out.println("3. 장난감 삭제하기");
					System.out.println("4. 장난감 제조일 순으로 조회하기");
					System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
					System.out.println("6. 재료 추가");
					System.out.println("7. 재료 제거");
					System.out.println("0. 프로그램 종료");
					System.out.print("선택 : ");
					choice = sc.nextInt();

					System.out.println();

					switch (choice) {
					case 1:
						toyJoin();
						break;
					case 2:
						toyMake();
						break;
					case 3:
						toyRemove();
						break;
					case 4:
						toyMakeJoin();
						break;
					case 5:
						useAgeList();
						break;
					case 6:
						materialsAdd();
						break;
					case 7:
						materialDel();
						break;
					case 0:
						delete();
						break;
					default:
						System.out.println("제대로된 숫자를 입력해주세요.\n");

					}

				} catch (Exception e) {

				}

			} while (choice != 0);
		}

		public void toyJoin() {

			System.out.println("<< 전체 장난감 목록 >>");

			int sum = 1;
			for (Toy temp : toy) {
				System.out.print(sum);
				System.out.print(".");
				System.out.println(temp);
				sum++;
			}
			System.out.println();

		}

		public void toyMake() {
			System.out.println("< 새로운 장난감 추가 >");

			System.out.print("장난감 이름 : ");
			String inputName = sc.next();

			System.out.print("사용 가능 연령 : ");
			int inputUseAge = sc.nextInt();

			System.out.print("가격 : ");
			int inputPrice = sc.nextInt();

			System.out.print("색상 : ");
			String inputColor = sc.next();

			System.out.print("제조일(YYYY/MMMM 형식으로 입력) : ");
			int inputMade = sc.nextInt();

			for (int i = 0; i < 3; i++) {
				System.out.print("재료를 입력하세요(종료하려면 'q'를 입력하세요 : ");
				String inputMaterial = sc.next();
				if (inputMaterial.equals("q")) {
					break;
				}

			}

			toy.add(new Toy(inputName, inputUseAge, inputPrice, inputColor, inputMade, addMaterials(1, 4)));
			System.out.println("새로운 장난감이 추가되었습니다");

		}

		public void toyRemove() {

			System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
			String inputRemoveToy = sc.next();

			boolean flag = false;
			Toy target = null;

			for (Toy temp : toy) {
				if (temp.getName().equals(inputRemoveToy)) {
					flag = true;
					target = temp;
					break;
				}
			}
			if (flag) {
				toy.remove(target);
				System.out.println("장난감이 삭제되었습니다.\n");
			} else {
				System.out.println("해당 이름의 장난감이 없습니다.\n");
			}

		}

		public void toyMakeJoin() {
			System.out.println("<<제조일 순으로 장난감 정렬>>");
//			int sum = 1;
//			for (Toy temp : toy) {
//				
//				System.out.print(sum);
//				System.out.print(".");
//				System.out.println(temp);
//				sum++;
//				Collections.sort(toyList);
			List<Toy> toyList = new ArrayList<>(toy);
			for (int i = 0; i < toy.size(); i++) {
				int maxIndex = i;
				for (int j = i + 1; j < toy.size(); j++) {
					int date1 = toyList.get(j).getMade();
					int date2 = toyList.get(maxIndex).getMade();

					if (date1 > date2) {
						maxIndex = j;
					}
				}
				Toy temp = toyList.get(i);
				toyList.set(i, toyList.get(maxIndex));
				toyList.set(maxIndex, temp);
			}
			int index = 1;
			for (Toy temp : toyList) {
				System.out.println(index++ + "." + temp);
			}
			System.out.println();

		}

		public void useAgeList() {

			System.out.println("<연령별로 사용 가능한 장난감>");
			List<Toy> toyList = new ArrayList<>(toy);
			for (int i = 0; i < toy.size(); i++) {
				int minIndex = i;
				for (int j = i + 1; j < toy.size(); j++) {
					int date1 = toyList.get(j).getUseAge();
					int date2 = toyList.get(minIndex).getUseAge();

					if (date1 < date2) {
						minIndex = j;
					}
				}
				Toy temp = toyList.get(i);
				toyList.set(i, toyList.get(minIndex));
				toyList.set(minIndex, temp);
			}
			Map<Integer, List<Toy>> ageGroupMap = new HashMap<>();
			for (Toy t : toyList) {
				int age = t.getUseAge();

				if (!ageGroupMap.containsKey(age)) {
					ageGroupMap.put(age, new ArrayList<>());
				}

				ageGroupMap.get(age).add(t);
			}
			List<Integer> ages = new ArrayList<>(ageGroupMap.keySet());
			int index = 1;
			for (Integer age : ages) {
				System.out.println("[연령:" + age + "세]");
				for (Toy t : ageGroupMap.get(age)) {
					System.out.println(index++ + ". " + t);
				}
				System.out.println();
			}

		}

		public void materialsAdd() {
			System.out.println("<재료 추가>");
			System.out.println("---현재 등록된 재료---");

			int sum = 1;
			for (int i = 1; i <= ma.size(); i++) {
				System.out.println(sum++ + "." + ma.get(i));
			}
			System.out.println("-------------------------");

			System.out.print("재료 고유번호(key)입력 : ");
			int inputKey = sc.nextInt();

			System.out.print("재료명 입력 : ");
			String inputName = sc.next();

			if (ma.containsKey(inputKey)) {
				System.out.println("이미 해당 키에 재료가 등록되어 있습니다");
				System.out.print("덮어 쓰시겠습니까? (Y/N) :");
				char inputChoice = sc.next().charAt(0);

				if (inputChoice == 'Y') {
					ma.put(inputKey, inputName);
					System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.\n");
				} else {
					System.out.println("재료가 덮어쓰기 되지 않았습니다.\n");
				}
			} else {
				ma.put(inputKey, inputName);
				System.out.println("새로운 재료가 성공적으로 추가되었습니다.\n");
			}
		}

		public void materialDel() {

			System.out.println("<재료 삭제>");
			System.out.println("---현재 등록된 재료---");

			for (Map.Entry<Integer, String> entry : ma.entrySet()) {
				System.out.println(entry.getKey() + ". " + entry.getValue());
			}
			System.out.println("-------------------------");

			System.out.print("삭제할 재료명 입력 : ");
			String inputName = sc.next();

			boolean flag = false;
			Integer targetKey = null;

			for (Map.Entry<Integer, String> entry : ma.entrySet()) {
				if (entry.getValue().equals(inputName)) {
					flag = true;
					targetKey = entry.getKey();
					break;
				}
			}
			if (flag) {
				ma.remove(targetKey);
				System.out.println("재료 " + inputName + "이(가) 성공적으로 제거되었습니다.\n");
			} else {
				System.out.println("해당 이름의 재료가 존재하지 않습니다.\n");
			}

		}

		public void delete() {
			System.out.println("시스템을 종료하였습니다.");
		}

	}
}
