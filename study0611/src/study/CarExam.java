package study;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		System.out.println("제작회사 = " + myCar.company);
		System.out.println("제작회사 = " + myCar.model);
		myCar.model = "모닝";
		System.out.println("제작회사 = " + myCar.model);
		System.out.println("제작회사 = " + myCar.currentSpeed);
		
	}

}
