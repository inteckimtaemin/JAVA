package study01;

public class Car {

	String color;
	String company;
	String owner;
	String model;
	int max_speed=60;
	int current_speed;
	
	public void car(String company, int current_speed){
		this.company = company;
		this.current_speed = current_speed;	
	}
	

	void run(){
		if(current_speed >60)
		{
			for(int i = this.current_speed ; i>=0 ; i=i-10)
			{
				this.max_speed = i;
				System.out.println("BMW�� "+ max_speed +"km/h�� �޸��ϴ�.");
			}
			System.out.println("���� �����߽��ϴ�.");
		}
		else {
		for(int i = this.current_speed ; i <= 60 ; i=i+10)
		{
			this.current_speed = i;
			System.out.println("BMW�� " + current_speed +"km/h�� �޸��ϴ�.");
		}
		System.out.println("�ְ�ӵ� 60km/h�� �����߽��ϴ�.");
		this.current_speed = this.max_speed;
		for(int i = this.current_speed ; i>=0 ; i=i-10)
		{
			this.current_speed = i;
			System.out.println("BMW�� " + current_speed +"km/h�� �޸��ϴ�.");
		}
		System.out.println("���� �����߽��ϴ�.");
		}
	}
}
