package study01;

public class CarTest1 {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.color = "������";
		myCar.owner = "���¹�";
		myCar.max_speed = 300;
		//myCar.current_speed = 150;
		//myCar.model = "BMW";
		
		System.out.println("���� : " + myCar.color);
		System.out.println("������ : " + myCar.owner);
		System.out.println("�ְ�ӵ� : " + myCar.max_speed);
		//System.out.println("����ӵ� : " + myCar.current_speed);
		//System.out.println("�� ���� : " + myCar.model);
		
		
	}

}
