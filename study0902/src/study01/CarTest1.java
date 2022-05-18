package study01;

public class CarTest1 {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.color = "검정색";
		myCar.owner = "김태민";
		myCar.max_speed = 300;
		//myCar.current_speed = 150;
		//myCar.model = "BMW";
		
		System.out.println("색깔 : " + myCar.color);
		System.out.println("소유주 : " + myCar.owner);
		System.out.println("최고속도 : " + myCar.max_speed);
		//System.out.println("현재속도 : " + myCar.current_speed);
		//System.out.println("차 종류 : " + myCar.model);
		
		
	}

}
