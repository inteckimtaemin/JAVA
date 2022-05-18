package study01;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car("sonata", 500);
		myCar.set_cs(10);
		myCar.set_gas(10);
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.max_speed+"km/h");
		System.out.println(myCar.current_speed+"km/h");
		System.out.println(myCar.gas+"L");
		boolean a = myCar.isEmptygas();
		if(a==false)
		{
			System.out.println("=====차가 출발합니다.=====");
			myCar.run();
			System.out.println("=====gas를 주입해야합니다.=====");
		}
		
		
		
	}

}
