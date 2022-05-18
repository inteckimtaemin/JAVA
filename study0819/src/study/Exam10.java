package study;

import java.util.Random;
import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {

		Random rand = new Random();                      // Random 클래스 생성
	    Scanner scan = new Scanner(System.in);      // Scanner 클래스 생성
	    int num = rand.nextInt(90)+10;
	    boolean a = true;
	    System.out.println("10 ~ 99 사이의 숫자를 맞추세요.");
		
	    System.out.println("숫자 맞추기 게임을 시작합니다.");
	    do
	    {
	    	System.out.print("발생된 숫자는?");
	    	int sum = scan.nextInt();
	    	if(num>sum)
	    	{
	    		System.out.println("더 큰 수를 입력하세요.");
	    	}
	    	if(num<sum)
	    	{
	    		System.out.println("더 작은 수를 입력하세요.");
	    	}
	    	if(num==sum)
	    	{
	    		System.out.println("정답입니다.");
	    		a=false;
	    	}
	    }while(a);
	    
	}

}//김태민
