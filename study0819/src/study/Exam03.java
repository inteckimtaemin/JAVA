package study;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner jung = new Scanner(System.in);
		System.out.print("x �� �Է� : ");
		int x = jung.nextInt();
		System.out.print("y �� �Է� : ");
		int y = jung.nextInt();
		
		if(x%y==0)
		{
			System.out.printf("%d�� %d�� ����Դϴ�.",y,x);
		}
		else
		{
			System.out.printf("%d�� %d�� ����� �ƴմϴ�.",y,x);
		}
		
		
	}

}
