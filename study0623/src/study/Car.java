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
		System.out.println("���� �õ��� �������ϴ�.");
	}
	void run() {
		System.out.println("���� �������Դϴ�.");
	}
	void speedUp(int speed){
		this.currentspeed += speed;
		System.out.println("���� ���� �ӵ��� " + this.currentspeed);
	}
	void speedDown(int speed) {
		this.currentspeed -= speed;
		System.out.println("���� ���� �ӵ��� " + this.currentspeed);
	}
	void keyoff() {
		System.out.println("���� �õ��� �����ϴ�.");
	}
	int addgas(int gas) {
		System.out.println("����=" + gas + "����");
		return gas;
	}
	
}
