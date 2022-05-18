package study;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.print("x 값 입력 : ");
		int x = a.nextInt();
		System.out.print("y 값 입력 : ");
		int y = a.nextInt();
		
		if(x-y>=10 || x-y<=-10)
		{
			System.out.println("두 값의 차는 10이상입니다.");
		}else
		{
			System.out.println("두 값의 차는 10이상이 아닙니다.");
		}/*int diff = (x>=y)?(x-y):(y-x);
		if(diff<=10)
		{ 10이하}
		...
		*/
		
	}

}
