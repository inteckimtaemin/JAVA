package study;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		boolean a=true;
		Scanner love = new Scanner(System.in);
		do
		{
			System.out.print("���� �Է� : ");
			int handsometaemin = love.nextInt();
			
			if(handsometaemin >= 100 && handsometaemin <1000)
			{
				System.out.printf("�Էµ� ������ %d�Դϴ�.", handsometaemin);
				a=false;
			}
			
		}while(a);
		
		love.close();
	}

}
