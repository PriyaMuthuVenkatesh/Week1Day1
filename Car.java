package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Apply Brake to slow down or stop the car");
	}
	
	public void applyGear() {
		System.out.println("Apply Gear for speed change");
	}
	public void switchonAc() {
		System.out.println("Switch on the AC for cooling");
	}
	
	public void applyAcclerate() {
		System.out.println("Apply Acclerator to speed up");
	}
	
	public static void main(String[] args) {
		Car myCar= new Car();
		myCar.applyBreak();
		myCar.applyGear();
		myCar.switchonAc();
		myCar.applyAcclerate();
	}
}
