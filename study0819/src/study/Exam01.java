package study;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		
		Scanner jung = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int a = jung.nextInt();
		if(a>0)
		{
			System.out.printf("%d�� ����Դϴ�.",a);
		}
		else if(a==0)
		{
			System.out.printf("%d�� 0�Դϴ�.",a);
		}
		else
		{
			System.out.printf("%d�� �����Դϴ�.",a);
		}
	
		
	}

}
