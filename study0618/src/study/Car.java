package study;

public class Car {

	String company = "�����ڵ���";
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