package study;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		switch (name)
		{
		case "a":
		case "A":
			System.out.print("���ȸ���Դϴ�.");
			break;
		case "b":
		case "B":
			System.out.print("�Ϲ�ȸ���Դϴ�.");
			break;
		default:
			System.out.print("��ȸ���Դϴ�.");
		}
	}

}
