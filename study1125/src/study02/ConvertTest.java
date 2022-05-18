package study02;

public class ConvertTest {

	public static void main(String[] args) {

		Won2Dollar toDollar = new Won2Dollar(1200);// 단위 1200원
		toDollar.run();
		System.out.println("----------------------------------");
		
		Km2Mile toMile = new Km2Mile(1.6);//단위 1.6km
		toMile.run();
		
	}

}
