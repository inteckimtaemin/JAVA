package study;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요");
		int num = sc.nextInt();
		if(num>=90)
		{
			System.out.println("90보다 크거나 같다");
			System.out.println("등급은 A입니다.");
		}else
		{
			System.out.println("점수가 90보다 작습니다\n등급은 B입니다.");
		}
	}

}
