package study02;

public class HumanTest1 {

	public static void main(String[] args) {

		Human Taemin = new Human();
		Taemin.human("���¹�",190,24);
		System.out.println("�̸��� : "+ Taemin.tname());
		System.out.println(Taemin.tname()+"�� Ű�� : "+ Taemin.theight() + "cm");
		System.out.println(Taemin.tname()+"�� �����Դ� : "+ Taemin.tweight() + "kg");
		
	}

}
