package study;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오. >> ");
		int num = sc.nextInt();
		boolean a = true;
		int change=0;
		System.out.print(num+"의 약수 : ");
			for(int i = 1; num>=i;i++)
			{
				if(num%i==0)
				{
					change=change + 1;
					System.out.print(i+" ");
				}
			}
		System.out.print(">> 총 약수갯수 : "+change);
		
	}

}
