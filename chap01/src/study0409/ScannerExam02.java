package study0409;

import java.util.Scanner;

public class ScannerExam02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입려해주세요. >> ");
		String name = scan.nextLine();
		
		System.out.print("숫자 하나를 입력해주세요.");
		int num = scan.nextInt();
		
		System.out.println("name = " + name);
		System.out.println("num = " + num);
	}

}
