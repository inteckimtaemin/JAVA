package Study;

public class CarExam {

	public static void main(String[] args) {

		Car mycar1 = new Car();
		Car mycar2 = new Car();
		
		mycar1.Color = new String("�����");
		mycar1.model = "���";
		
		mycar2.Color = new String("�����");
		mycar2.model = "�ҳ�Ÿ";
		
		System.out.println("mycar1�� mycar2�� ���� ��ü�ΰ���? " +(mycar1==mycar2));
		System.out.println("mycar1�� mycar2�� ���� �����ΰ���? " +(mycar1.Color.equals(mycar2.Color)));
		
		System.out.println("mycar2�� ����? " + mycar2.model);
		System.out.println("mycar2�� ����? " + mycar1.model);
		
	}

}
