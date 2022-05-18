package study;

public class Car {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model, int maxSpeed){
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	Car(String model){
		this.model = model;
	}
	
	Car(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
}	