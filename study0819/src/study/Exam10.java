package study;

import java.util.Random;
import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {

		Random rand = new Random();                      // Random Ŭ���� ����
	    Scanner scan = new Scanner(System.in);      // Scanner Ŭ���� ����
	    int num = rand.nextInt(90)+10;
	    boolean a = true;
	    System.out.println("10 ~ 99 ������ ���ڸ� ���߼���.");
		
	    System.out.println("���� ���߱� ������ �����մϴ�.");
	    do
	    {
	    	System.out.print("�߻��� ���ڴ�?");
	    	int sum = scan.nextInt();
	    	if(num>sum)
	    	{
	    		System.out.println("�� ū ���� �Է��ϼ���.");
	    	}
	    	if(num<sum)
	    	{
	    		System.out.println("�� ���� ���� �Է��ϼ���.");
	    	}
	    	if(num==sum)
	    	{
	    		System.out.println("�����Դϴ�.");
	    		a=false;
	    	}
	    }while(a);
	    
	}

}//���¹�
