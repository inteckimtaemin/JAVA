package study01;

public class ConverterTest {

	public static void main(String[] args) {

		Won2Dollar toDollar = new Won2Dollar();
		toDollar.set_ratio();
		toDollar.run();
		
		System.out.println("\n---------------");
		
		Km2Mile toMile = new Km2Mile();
		toMile.set_ratio();
		toMile.run();
		
	}

}
