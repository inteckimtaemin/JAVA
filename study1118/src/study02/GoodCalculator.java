package study02;

public class GoodCalculator extends Calculator{
	@Override
	public int add(int x, int y) {
		return x+y;
	}
	@Override
	public int subtract(int x, int y) {
		return x-y;
	}
	@Override
	public double average(int[] a) {
	double avg = 0;
	int num = 0;
	for(int i = 0; i < a.length; i++) {
		num+=a[i];
	}
	avg = (double)num/a.length;
		return avg;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		GoodCalculator gc = new GoodCalculator();
		System.out.println("�� ���� �� = "+gc.add(2, 3));
		System.out.println("�� ���� �� = "+gc.subtract(2, 3));
		System.out.println("�迭 �׸� ���� ��� = "+gc.average(a));
	}

}
