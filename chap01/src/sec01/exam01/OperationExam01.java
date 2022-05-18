package sec01.exam01;

public class OperationExam01 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		short c = 30;
		int d = 40;
		long f = 100L;
		
		int sum1 = a + b;
		int sum2 = b + c;
		int sum3 = c + d;
		long sum4 = c + f;
		
		int x = 10;
		double y = 5.5;
		double re = x + (int)y;
		
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
		System.out.println(re);
	}
}
