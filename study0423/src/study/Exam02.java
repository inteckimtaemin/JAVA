package study;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���");
		int num = sc.nextInt();
		if(num>=90)
		{
			System.out.println("90���� ũ�ų� ����");
			System.out.println("����� A�Դϴ�.");
		}else
		{
			System.out.println("������ 90���� �۽��ϴ�\n����� B�Դϴ�.");
		}
	}

}
