package Exam;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner nc = new Scanner(System.in);
		System.out.println("별( * )을 출력할 행의 수를 입력하시오.>>");
		int num = nc.nextInt();
		
		for(int i = 1 ; i<=num ; i++)
		{
			for(int j = 1 ; j<=num-i ; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1 ; j<=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
