package study;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�.>> ");
		int num = sc.nextInt();
		if(num>=0)
		{
			System.out.println(num+"�� ���밪 : "+num);
		}else
		{
			System.out.println(num+"�� ���밪 : "+num*-1);
		}
	}

}
