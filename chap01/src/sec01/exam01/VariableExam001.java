package sec01.exam01;

public class VariableExam001 {

	public static void main(String[] args) {

		int x = 0b1100;
		int y = 014;
		int z = 0xc;
		
		char ch1 = 'A';
		char ch2 = 97;
		
		String str1 = "È«±æµ¿";
		String str2 = "È«±æµ¿ \"¾È³ç\"";
		String str3 = "È«±æµ¿ \t¾È³ç";
		String str4 = "È«±æµ¿ \n¾È³ç";
		String str5 = "È«±æµ¿ \n\"¾È³ç\"";
		String str6 = "±èÅÂ¹ÎÀº Àß»ý°å½À´Ï´Ù.";
		
		double d1 = 1e3;
		float d2 = 1e3f;
		
		long l = 5000000000L;
		float f = l;
		
		double d3 = 3.14;
		int i1 = (int)d3;
				
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println(f);
		
		System.out.println(i1);
		
	}

}
