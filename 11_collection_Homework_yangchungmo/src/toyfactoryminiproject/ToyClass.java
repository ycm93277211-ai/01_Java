package toyfactoryminiproject;

import java.util.Objects;
import java.util.Set;

public  class ToyClass implements Comparable<ToyClass>{

	private String toyName;
	private int ageOfUse;
	private int price;
	private String color;
	private int make;
	private Set<String> materials;
	
	
	
	
	public ToyClass() {
		// TODO Auto-generated constructor stub
	}


	public ToyClass(String toyName, int ageOfUse, int price, String color, int make, Set<String> material) {
		super();
		this.toyName = toyName;
		this.ageOfUse = ageOfUse;
		this.price = price;
		this.color = color;
		this.make = make;
		this.materials = material;
	}
	
	


	@Override
	public String toString() {
		return "이름: " + toyName + "/ 사용연령: " + ageOfUse + "/ 가격: " + price + "/ 색상: " + color
				+ "/ 제조년월일: " + make + "/ 사용재료: " + materials ;
	}


	public String getToyName() {
		return toyName;
	}


	public void setToyName(String toyName) {
		this.toyName = toyName;
	}


	public int getAgeOfUse() {
		return ageOfUse;
	}


	public void setAgeOfUse(int ageOfUse) {
		this.ageOfUse = ageOfUse;
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


	public int getMake() {
		return make;
	}


	public void setMake(int make) {
		this.make = make;
	}


	public Set<String> getMaterial() {
		return materials;
	}  


	public void setMaterial(Set<String> material) {
		this.materials = material;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ageOfUse, color, make, materials, price, toyName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToyClass other = (ToyClass) obj;
		return ageOfUse == other.ageOfUse && Objects.equals(color, other.color) && make == other.make
				&& Objects.equals(materials, other.materials) && price == other.price
				&& Objects.equals(toyName, other.toyName);
	}


	@Override
	public int compareTo(ToyClass o) {
		return Integer.compare(this.make, o.make); 
		
	}
	



	





		
}
