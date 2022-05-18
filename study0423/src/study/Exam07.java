package study;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		switch (name)
		{
		case "a":
		case "A":
			System.out.print("우수회원입니다.");
			break;
		case "b":
		case "B":
			System.out.print("일반회원입니다.");
			break;
		default:
			System.out.print("비회원입니다.");
		}
	}

}
