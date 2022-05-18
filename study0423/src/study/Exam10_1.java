package study;

import java.util.Scanner;

public class Exam10_1 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		int A = a.nextInt();
		int B = b.nextInt();
		int C = c.nextInt();
		
		int min = A;
		
		if(min>B)
		{
			min = B;
		}else if(min>C)
		{
			min = C;
		}
		System.out.println("ÃÖ¼Ú°ª="+min);
	}

}
