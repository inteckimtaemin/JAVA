package study;

public class Exam04 {

	public static void main(String[] args) {

		int num = (int) (Math.random()*17)+8;
		System.out.println("[현재 시각 :"+num+"시]");
		switch (num) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		
	}

}
