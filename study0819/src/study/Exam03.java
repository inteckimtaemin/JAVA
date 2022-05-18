package study;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner jung = new Scanner(System.in);
		System.out.print("x 값 입력 : ");
		int x = jung.nextInt();
		System.out.print("y 값 입력 : ");
		int y = jung.nextInt();
		
		if(x%y==0)
		{
			System.out.printf("%d는 %d의 약수입니다.",y,x);
		}
		else
		{
			System.out.printf("%d는 %d의 약수가 아닙니다.",y,x);
		}
		
		
	}

}
