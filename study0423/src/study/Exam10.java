package study;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {

		Scanner first = new Scanner(System.in);
		Scanner second = new Scanner(System.in);
		Scanner third = new Scanner(System.in);
		int one = first.nextInt();
		int two = second.nextInt();
		int three = third.nextInt();
		
		if(one>three&&two>three)
		{
			System.out.println("�ּڰ�="+three);
		}else if(one>two&&three>two)
		{
			System.out.println("�ּڰ�="+two);
		}else if(two>one&&three>one)
		{
			System.out.println("�ּڰ�="+one);
		}
	}

}
