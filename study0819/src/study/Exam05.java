package study;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner jung = new Scanner(System.in);
		System.out.print("������ : ");
		int a = jung.nextInt();
		
		if(a%10==0)
		{
			System.out.println("10�� ����Դϴ�.");
		}
		else
		{
			System.out.println("10�� ����� �ƴմϴ�.");
		}
		
	}

}
