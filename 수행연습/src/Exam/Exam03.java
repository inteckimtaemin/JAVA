package Exam;

public class Exam03 {

	public static void main(String[] args) {

		System.out.println("#### 두개의 주사위를 던져 나오 수의 합이 5가 되면 종료 ####");
		while(true)
		{
			int dice1 = (int)(Math.random()*6+1);
			int dice2 = (int)(Math.random()*6+1);
			System.out.println("("+dice1+", "+dice2+")");;
			if(dice1 + dice2 == 5)
			{
				break;
			}
		}
		
	}

}
