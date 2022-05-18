package study;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		boolean a =  true;
		Scanner jung = new Scanner(System.in);
		System.out.print("x 값은 : ");
		int x = jung.nextInt();
		System.out.print("y 값은 : ");
		int y = jung.nextInt();
		
		if(x>y)
		{
			System.out.println("x가 y보다 큽니다.");
		}
		else
		{
			System.out.println("y가 x보다 큽니다.");
		}
		
	}

}
