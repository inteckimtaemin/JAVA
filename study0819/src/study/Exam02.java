package study;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int consol = a.nextInt();
		if(consol>0)
		{
			System.out.printf("���� : %d",consol);
		}
		if(consol==0)
		{
			System.out.printf("�¹��̹ٺ����� : %d",0);
		}
		if(consol<0)
		{
			System.out.printf("���� : %d",consol*-1);
		}
		
		
	}

}
