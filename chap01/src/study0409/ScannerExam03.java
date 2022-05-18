package study0409;

import java.util.Scanner;

public class ScannerExam03 {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력: ");
		int x = scan1.nextInt();
		
		System.out.print("두번째 숫자 입력: ");
		int y = scan1.nextInt();
		
		
		int sum = x + y;
		System.out.println("x + y = " + sum);
				
}
}