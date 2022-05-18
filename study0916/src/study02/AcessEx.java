package study02;

public class AcessEx {

	public static void main(String[] args) {

		Sample samp = new Sample();
		samp.a = 10;
		samp.get_b();
		//private로 같은 클래스에서만 사용할 수 있기 때문에 AcessEx라는 다른 클래스는 사용 불가능
		samp.c = 30;
		System.out.println("a :" + samp.a);
		System.out.println("b :" + samp.get_b());
		System.out.println("c :" + samp.c);
		
	}

}
