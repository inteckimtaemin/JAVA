package Exam;

public class Exam03 {

	public static void main(String[] args) {

		System.out.println("#### �ΰ��� �ֻ����� ���� ���� ���� ���� 5�� �Ǹ� ���� ####");
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
