package study;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		Scanner a= new Scanner(System.in);
		System.out.print("x 값 입력 : ");
		int x = a.nextInt();
		System.out.print("y 값 입력 : ");
		int y = a.nextInt();
		System.out.print("z 값 입력 : ");
		int z = a.nextInt();
		int temp;
		
		if(z>y)
		{
			temp=z;
			z=y;
			y=temp;
		}
		if(z>x)
		{
			temp=z;
			z=x;
			x=temp;
		}
		if(y>x)
		{
			temp=y;
			y=x;
			x=temp;
		}
		System.out.printf("z = %d\n",z);
		System.out.printf("y = %d\n",y);
		System.out.printf("x = %d\n",x);
			
			
		
		
		
	}

}
