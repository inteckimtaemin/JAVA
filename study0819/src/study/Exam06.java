package study;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.print("x �� �Է� : ");
		int x = a.nextInt();
		System.out.print("y �� �Է� : ");
		int y = a.nextInt();
		
		if(x-y>=10 || x-y<=-10)
		{
			System.out.println("�� ���� ���� 10�̻��Դϴ�.");
		}else
		{
			System.out.println("�� ���� ���� 10�̻��� �ƴմϴ�.");
		}/*int diff = (x>=y)?(x-y):(y-x);
		if(diff<=10)
		{ 10����}
		...
		*/
		
	}

}
