package study01;

import java.util.Scanner;

public class GoodCalulator extends Calculator{

	public int sum = 0;
	
	Scanner scan = new Scanner(System.in);

	public void set() {
	System.out.println("x�� : ");
	x = scan.nextInt();
	System.out.println("y�� : ");
	y = scan.nextInt();
	}
	
	public int add() {
		System.out.println(x+y);
		return x+y;
	}
	public int subtract() {
		System.out.println(x-y);
		return x-y;
	}
	public int mul() {
		System.out.println(x*y);
		return x*y;
	}
	public double average() {
		for(int i = 0; i<z;i++)
		{
			sum+=a[i];
		}
		System.out.println((double)sum/z);
		return (double)sum/z;
	}

	@Override
	public void setZ() {
		
		System.out.print("�迭�� ������ �Է�>> ");
		z = scan.nextInt();
		a = new int[z];
		
	}
	
	@Override
	public void setArray() {
		
		for(int i = 0; i<z; i++) {
			System.out.print("�迭"+i+"�� ���� �Է�>> ");
			a[i] = scan.nextInt();
		}
		
	}
	
}
