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
				System.out.println("BMW가 "+ max_speed +"km/h로 달립니다.");
			}
			System.out.println("차가 정지했습니다.");
		}
		else {
		for(int i = this.current_speed ; i <= 60 ; i=i+10)
		{
			this.current_speed = i;
			System.out.println("BMW가 " + current_speed +"km/h로 달립니다.");
		}
		System.out.println("최고속도 60km/h에 도달했습니다.");
		this.current_speed = this.max_speed;
		for(int i = this.current_speed ; i>=0 ; i=i-10)
		{
			this.current_speed = i;
			System.out.println("BMW가 " + current_speed +"km/h로 달립니다.");
		}
		System.out.println("차가 정지했습니다.");
		}
	}
}
