package study;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		System.out.println("����ȸ�� = " + myCar.company);
		System.out.println("����ȸ�� = " + myCar.model);
		myCar.model = "���";
		System.out.println("����ȸ�� = " + myCar.model);
		System.out.println("����ȸ�� = " + myCar.currentSpeed);
		
	}

}
