package study0409;

import java.util.Scanner;

public class ScannerExam03 {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		System.out.print("ù��° ���� �Է�: ");
		int x = scan1.nextInt();
		
		System.out.print("�ι�° ���� �Է�: ");
		int y = scan1.nextInt();
		
		
		int sum = x + y;
		System.out.println("x + y = " + sum);
				
}
}