package study;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		boolean a=true;
		Scanner love = new Scanner(System.in);
		do
		{
			System.out.print("정수 입력 : ");
			int handsometaemin = love.nextInt();
			
			if(handsometaemin >= 100 && handsometaemin <1000)
			{
				System.out.printf("입력된 정수는 %d입니다.", handsometaemin);
				a=false;
			}
			
		}while(a);
		
		love.close();
	}

}
