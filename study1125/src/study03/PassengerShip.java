package study03;

import java.util.Scanner;

public class PassengerShip extends Ship {

	String shipName;
	int maxPassenger;
	int maxLuggage;
	int passenger;
	
	public PassengerShip(String s, int mp, int ml) {
		shipName = s;
		maxPassenger = mp;
		maxLuggage = ml;
	}
	
	public void setP() {
		
		System.out.print("�¼� ����ο� >>");
		Scanner Pa = new Scanner(System.in);
		passenger = Pa.nextInt();
		
	}
	
	public int passengers() {
		System.out.println("�¼� ��� �ο� : "+passenger);
		System.out.println("�ִ� �¼� �ο� : "+maxPassenger);
		System.out.println("\n=================================\n");
		if(passenger>maxPassenger) {
			System.out.println("�¼� ���� �ο� "+(passenger-maxPassenger)+"���ʰ� !!! �¼� ���� �ο� "+maxPassenger+"������ �����մϴ�.");
			return maxPassenger;
		}
		else {
		return passenger;
		}
	}
	public int luggage() {
		return maxLuggage;
	}
	
	
	
}
