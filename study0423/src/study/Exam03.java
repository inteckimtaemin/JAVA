package study;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է�");
		int num = sc.nextInt();
		if(num>=90)
		{
			System.out.println("������ 100~90�Դϴ�.\n����� A�Դϴ�.");
		}else if(num>=80)
		{
			System.out.println("������ 89~80�Դϴ�.\n����� B�Դϴ�.");
		}else if(num>=70)
		{
			System.out.println("������ 79~70�Դϴ�.\n����� C�Դϴ�.");
		}else
		{
			System.out.println("������ 70�� �̸��Դϴ�.\n����� D�Դϴ�.");
		}
		
	}

}
