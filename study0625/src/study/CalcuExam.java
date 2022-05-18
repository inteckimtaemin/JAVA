package study;

public class CalcuExam {

	public static void main(String[] args) {

		Calcu Cal = new Calcu();
		int[] number = new int[] {4,5,6,7};
		System.out.println(Cal.add(number));
		System.out.println("항목의 평균 값 : " + (double)(Cal.add(number))/number.length);
		
		System.out.println(Cal.sum(4,5,6,7));
		System.out.println(Cal.sum(number));
	}

}
