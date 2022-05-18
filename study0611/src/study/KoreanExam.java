package study;

public class KoreanExam {

	public static void main(String[] args) {

		Korean Kor1 = new Korean("한겨울","1234-5678");
		Korean Kor2 = new Korean("진달래","3456-7890");
		
		System.out.println("국기= "+Kor1.nation);
		System.out.println("이름= "+Kor1.name);
		System.out.println("주민번호= "+Kor1.ssn);
		
		System.out.println("국기= "+Kor2.nation);
		System.out.println("이름= "+Kor2.name);
		System.out.println("주민번호= "+Kor2.ssn);
		
	}

}
