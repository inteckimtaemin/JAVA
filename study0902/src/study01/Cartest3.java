package study01;

public class Cartest3 {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.car("BMW", 20);
		System.out.println("���� "+ myCar.company+ ",�ӵ��� " + myCar.current_speed + "km/h");
		myCar.run();
	}

}
