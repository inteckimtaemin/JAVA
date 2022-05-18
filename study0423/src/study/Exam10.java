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
			System.out.println("ÃÖ¼Ú°ª="+three);
		}else if(one>two&&three>two)
		{
			System.out.println("ÃÖ¼Ú°ª="+two);
		}else if(two>one&&three>one)
		{
			System.out.println("ÃÖ¼Ú°ª="+one);
		}
	}

}
