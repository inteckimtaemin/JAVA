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
		
		System.out.print("승선 희망인원 >>");
		Scanner Pa = new Scanner(System.in);
		passenger = Pa.nextInt();
		
	}
	
	public int passengers() {
		System.out.println("승선 희망 인원 : "+passenger);
		System.out.println("최대 승선 인원 : "+maxPassenger);
		System.out.println("\n=================================\n");
		if(passenger>maxPassenger) {
			System.out.println("승선 가능 인원 "+(passenger-maxPassenger)+"명초과 !!! 승선 가능 인원 "+maxPassenger+"명으로 제한합니다.");
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
