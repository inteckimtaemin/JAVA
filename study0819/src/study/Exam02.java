package study;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int consol = a.nextInt();
		if(consol>0)
		{
			System.out.printf("절댓값 : %d",consol);
		}
		if(consol==0)
		{
			System.out.printf("태민이바보절댓값 : %d",0);
		}
		if(consol<0)
		{
			System.out.printf("절댓값 : %d",consol*-1);
		}
		
		
	}

}
