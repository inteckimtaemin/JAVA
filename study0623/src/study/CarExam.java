package study;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car("�ҳ�Ÿ", 350);
		myCar.color = "������";
		myCar.color = "���";
		System.out.println("������ ����= "+myCar.model);
		System.out.println("������ ����= "+myCar.color);
		System.out.println("������ �ְ� �ӵ�= "+myCar.max_speed);
		
		myCar.keyOn();
		myCar.run();
		myCar.speedUp(60);
		myCar.speedUp(40);
		myCar.speedDown(40);
		myCar.keyoff();
		myCar.addgas(50);
		
		
		
	}

}
