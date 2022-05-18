package study;

import java.util.Random;
import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 요소 수 : ");
		Random rand = new Random();
		int[] a = new int[scan.nextInt()];
		int j;
		for(int i = 0 ; i <a.length ; i++)
		{
			a[i] = 1+rand.nextInt(10);
		}
			for(j = 10 ; j>=1 ; j--)
			{
				for(int i = 0 ; i <a.length ; i++ )
				if(a[i]>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				System.out.print("\n");
			}
	}

}
