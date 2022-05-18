package Study;

public class CarExam {

	public static void main(String[] args) {

		Car mycar1 = new Car();
		Car mycar2 = new Car();
		
		mycar1.Color = new String("노란색");
		mycar1.model = "모닝";
		
		mycar2.Color = new String("노란색");
		mycar2.model = "소나타";
		
		System.out.println("mycar1과 mycar2가 같은 객체인가요? " +(mycar1==mycar2));
		System.out.println("mycar1과 mycar2가 같은 색깔인가요? " +(mycar1.Color.equals(mycar2.Color)));
		
		System.out.println("mycar2의 모델은? " + mycar2.model);
		System.out.println("mycar2의 모델은? " + mycar1.model);
		
	}

}
