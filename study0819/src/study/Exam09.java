package study;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {

		boolean a = true;
		Scanner num = new Scanner(System.in);
		int jung;
		
		do {
			System.out.print("���� ������ �Է��ϼ���. ==> ");
			jung = num.nextInt();
			
			if(jung>=0)
			{
			a=false;
			}
		}while(a);
		for(int i = jung; i>=0; i--)
		{
			System.out.println(i);
		}
		System.out.println("ī��Ʈ�ٿ� ����!!!");
		
		
	}

}//���¹�
