package study01;

public class SampleTest {

	public static void main(String[] args) {

		Sample samp = new Sample();
		samp.x = 5;
		Sample.set_y(10);
		System.out.println("x = " +samp.x + ", y = " + Sample.get_y());
		
	}

}
