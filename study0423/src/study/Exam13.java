package study;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {

		Scanner dan = new Scanner(System.in);
		int num = dan.nextInt();
		System.out.println("****" + num+"´Ü ****");
		for(int i = 1 ; i <=9 ; i++)
		{
			System.out.println(num +" x "+ i +" = "+ num*i);
		}
	}

}
