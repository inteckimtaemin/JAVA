package study02;

public class ComputerTest {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		Computer com = new Computer();
		int r = 5;
		System.out.println("Calculator ��ü�� ���� : " + cal.areacircle(r));
		System.out.println("Computer ��ü�� ���� : " + com.areacircle(r));
		
	}

}
