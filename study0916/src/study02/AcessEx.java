package study02;

public class AcessEx {

	public static void main(String[] args) {

		Sample samp = new Sample();
		samp.a = 10;
		samp.get_b();
		//private�� ���� Ŭ���������� ����� �� �ֱ� ������ AcessEx��� �ٸ� Ŭ������ ��� �Ұ���
		samp.c = 30;
		System.out.println("a :" + samp.a);
		System.out.println("b :" + samp.get_b());
		System.out.println("c :" + samp.c);
		
	}

}
