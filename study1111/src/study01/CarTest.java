package study01;
//���¹�
public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		for(int i =0; i<5; i++) {
			int event = myCar.run();
		
			switch(event) {
			case 1:
				System.out.println("���� ���� Ÿ�̾ HankookTire ��ü");
				myCar.frontLeft = new HankookTire("�� ����", 12);
				break;
			case 2:
				System.out.println("���� ������ Ÿ�̾ HankookTire ��ü");
				myCar.frontRight = new HankookTire("�� ������", 12);
				break;
			case 3:
				System.out.println("���� ���� Ÿ�̾kumhooTire ��ü");
				myCar.backLeft = new kumhooTire("�� ����", 12);
				break;
			case 4:
				System.out.println("���� ������ Ÿ�̾ kumhooTire ��ü");
				myCar.backRight = new kumhooTire("�� ������", 12);
				break;
			}
			System.out.println("--------------------------");
		}
	}
}
