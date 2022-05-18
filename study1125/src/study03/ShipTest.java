package study03;

public class ShipTest {

	public static void main(String[] args) {

		PassengerShip ps = new PassengerShip("승리호", 10, 100);
		ps.setP();
		System.out.println("배 이름 : "+ ps.shipName);
		System.out.println(ps.shipName + " 현재 탑승 인원 : "+ps.passengers() + "명");
		System.out.println(ps.shipName + " 최대 화물 적재량 : "+ps.luggage() + "kg");
		
	}

}
