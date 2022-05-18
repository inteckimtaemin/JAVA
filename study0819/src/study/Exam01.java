package study;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		
		Scanner jung = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int a = jung.nextInt();
		if(a>0)
		{
			System.out.printf("%d는 양수입니다.",a);
		}
		else if(a==0)
		{
			System.out.printf("%d는 0입니다.",a);
		}
		else
		{
			System.out.printf("%d는 음수입니다.",a);
		}
	
		
	}

}
