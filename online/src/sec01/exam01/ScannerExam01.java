package sec01.exam01;

import java.util.Scanner;

public class ScannerExam01 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.printf("이름를 입력해주세요>>");
		String v1 = scan.next();
		
		System.out.println("이름은 " + v1 + "입니다.");
		
	}

}
