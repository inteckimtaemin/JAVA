package study;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		boolean a =  true;
		Scanner jung = new Scanner(System.in);
		System.out.print("x ���� : ");
		int x = jung.nextInt();
		System.out.print("y ���� : ");
		int y = jung.nextInt();
		
		if(x>y)
		{
			System.out.println("x�� y���� Ů�ϴ�.");
		}
		else
		{
			System.out.println("y�� x���� Ů�ϴ�.");
		}
		
	}

}
