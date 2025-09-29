package edu.kh.poly.ex1.model.dto;

public class Spark extends Car {// 경차

	private double dicountOffer;// 할인혜택

	public Spark() {
	}

	public Spark(String enjine, String fuel, int wheel, double dicountOffer) {
		super(enjine, fuel, wheel);
		this.dicountOffer = dicountOffer;
	}

	public double getDicountOffer() {
		return dicountOffer;
	}

	public void setDicountOffer(double dicountOffer) {
		this.dicountOffer = dicountOffer;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + dicountOffer;
	}

}
