package sec01.exam01;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "100";
		byte b1 = Byte.parseByte(str);
		byte b2 = 10;
		int	r1 = b1+b2;
		int i1 = Integer.parseInt(str);
		double d1 = Double.parseDouble(str);
		double r2 = i1 + d1;
		
		System.out.println(b1);
		System.out.println(r1);
		System.out.println(r2);
		
		int i2 = 200;
		String str2 = String.valueOf(i2);
		String str3 = i1 + str2;
		
		System.out.println(str3);
		
	}

}
