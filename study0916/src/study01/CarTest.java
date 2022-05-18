package study01;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car("¼Ò³ªÅ¸", 500);
		
		myCar.sg(10);
		myCar.isEmpty();
		myCar.scs(30);
		myCar.run();
		myCar.downrun();
	}

}
