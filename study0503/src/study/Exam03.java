package study;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		int num = sc.nextInt();
		System.out.println("**** "+num+"��  ****");
		for(int i = num ; i<=num ; i++)
		{
			for(int j = 1 ; j<=9 ; j++)
			{
				System.out.printf("%d x %d = %d\n",i , j , i*j);
			}
		}
	}

}
