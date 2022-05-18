package Exam;

public class Exam04 {

	public static void main(String[] args) {

		System.out.println("#### 방정식의 해를 구하는 프로그램 ####");
		for(int x = 0 ; x <=10 ; x++)
		{
			for(int y = 0 ; y<=10 ; y++)
			{
				if(4*x+5*y==60)
				{
					System.out.printf("(x = %d, y = %d)\n", x, y);
				}
			}
		}
		
	}

}
