package study;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int month;
		int again;
		do {
			do {
				System.out.print("1~12������ ���ڸ� �Է��ϼ���.>>  ");
				month = scan.nextInt();
			}while(month <1 || month>12);
			
			if(month >=3 && month<=5) 
			{
				System.out.printf("%d���� \"��\" �Դϴ�",month);
			}
			if(month >=6 && month<=8) 
			{
				System.out.printf("%d���� \"����\" �Դϴ�",month);
			}
			if(month >=9 && month<=10) 
			{
				System.out.printf("%d���� \"����\" �Դϴ�",month);
			}
			else 
			{
				System.out.printf("%d���� \"�ܿ�\" �Դϴ�",month);
			}
			System.out.println("\n==========================================");
			System.out.print("�ٽ� �Ϸ��� \"1\", �����Ϸ��� \"0\"�� �Է��Ͻÿ�. >> ");
			again = scan.nextInt();
		}while(again == 1);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
