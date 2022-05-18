package study02;

public class HumanTest1 {

	public static void main(String[] args) {

		Human Taemin = new Human();
		Taemin.human("±èÅÂ¹Î",190,24);
		System.out.println("ÀÌ¸§Àº : "+ Taemin.tname());
		System.out.println(Taemin.tname()+"ÀÇ Å°´Â : "+ Taemin.theight() + "cm");
		System.out.println(Taemin.tname()+"ÀÇ ¸ö¹«°Ô´Â : "+ Taemin.tweight() + "kg");
		
	}

}
