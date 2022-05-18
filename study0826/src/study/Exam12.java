package study;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		int num = 0;
		for(int i= 1; a>=i ; i++)
		{
			if(a!=i)
			{
			System.out.print(i+"+");
			}
			else
			{
			System.out.print(i);
			}
			num+=i;
		}
		System.out.print(" = "+num);
		
	}

}
