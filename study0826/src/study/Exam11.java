package study;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�. >> ");
		int num = sc.nextInt();
		boolean a = true;
		int change=0;
		System.out.print(num+"�� ��� : ");
			for(int i = 1; num>=i;i++)
			{
				if(num%i==0)
				{
					change=change + 1;
					System.out.print(i+" ");
				}
			}
		System.out.print(">> �� ������� : "+change);
		
	}

}
