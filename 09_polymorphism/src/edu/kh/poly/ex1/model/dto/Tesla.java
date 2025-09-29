package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car {// 전기차

	private int batteryCapacity;// 배터리 용량

	public Tesla() {
	}

	public Tesla(String enjine, String fuel, int wheel, int batteryCapacity) {
		super(enjine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
	}

}
