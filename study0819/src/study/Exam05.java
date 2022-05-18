package study;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner jung = new Scanner(System.in);
		System.out.print("정수는 : ");
		int a = jung.nextInt();
		
		if(a%10==0)
		{
			System.out.println("10의 배수입니다.");
		}
		else
		{
			System.out.println("10의 배수가 아닙니다.");
		}
		
	}

}
