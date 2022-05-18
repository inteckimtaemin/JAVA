package study;

public class Car {

	String model;
	String color;
	int max_speed;
	int currentspeed;
	
	public Car(String m, int ms)
	{
		this.model = m;
		this.max_speed = ms;
	}
	
	void keyOn(){
		System.out.println("차가 시동이 켜졌습니다.");
	}
	void run() {
		System.out.println("차가 주행중입니다.");
	}
	void speedUp(int speed){
		this.currentspeed += speed;
		System.out.println("현재 차의 속도는 " + this.currentspeed);
	}
	void speedDown(int speed) {
		this.currentspeed -= speed;
		System.out.println("현재 차의 속도는 " + this.currentspeed);
	}
	void keyoff() {
		System.out.println("차가 시동을 껐습니다.");
	}
	int addgas(int gas) {
		System.out.println("주유=" + gas + "리터");
		return gas;
	}
	
}
