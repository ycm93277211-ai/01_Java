package project;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Toy {
	
	private String name;
	private int useAge;
	private int price;
	private String color;
	private int made;
	private Set<String> materials;

	
	public Toy() {
		// TODO Auto-generated constructor stub
	}


	public Toy(String name, int useAge, int price, String color, int made, Set<String> materials) {
		super();
		this.name = name;
		this.useAge = useAge;
		this.price = price;
		this.color = color;
		this.made = made;
		this.materials = materials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUseAge() {
		return useAge;
	}

	public void setUseAge(int useAge) {
		this.useAge = useAge;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMade() {
		return made;
	}

	public void setMade(int made) {
		this.made = made;
	}

	public Set<String> getMaterials() {
		return materials;
	}


	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, made, materials, name, price, useAge);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return Objects.equals(color, other.color) && made == other.made && Objects.equals(materials, other.materials)
				&& Objects.equals(name, other.name) && price == other.price && useAge == other.useAge;
	}


	@Override
	public String toString() {
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + ""
				+ " / 사용가능연령 : " + useAge + " / 제조년월일 : " + made
				+ " / 재료" + materials + "]";
	}




	
	

}