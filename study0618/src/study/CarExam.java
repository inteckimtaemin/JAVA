package study;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car("�ҳ�Ÿ",300);
		Car yourCar = new Car("���", 200);
		Car ourCar = new Car(200);
		
		//myCar.company = "�����ڵ���";
		myCar.color = "������";
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		
		//yourCar.company = "�����ڵ���";
		yourCar.color = "���";
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.maxSpeed);
	}

}
