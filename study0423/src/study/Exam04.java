package study;

public class Exam04 {

	public static void main(String[] args) {

		int num = (int) (Math.random()*17)+8;
		System.out.println("[���� �ð� :"+num+"��]");
		switch (num) {
		case 8:
			System.out.println("����մϴ�.");
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
		case 10:
			System.out.println("������ ���ϴ�.");
		default:
			System.out.println("�ܱ��� �����ϴ�.");
		}
		
	}

}
