package study;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String name = sc.nextLine();
		switch (name)
		{
		case "부장":
			System.out.println("상여금 700만원 지급");
			break;
		case "과장":
			System.out.println("상여금 500만원 지급");
			break;
		default:
			System.out.println("상여급 300만원 지급");
		}
		
	}

}
