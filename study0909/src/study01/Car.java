package study01;

public class Car {

	String company = "Hyundai";	//ȸ��
	String model;				//��
	int max_speed;				//�ְ�ӵ�
	int current_speed;			//����ӵ�
	int gas;					//�⸧
	
	Car(String m, int ms)
	{
		this.model = m;
		this.max_speed = ms;
	}//�𵨰� �ְ�ӵ� �Է¹޾� ����
	
	void set_cs(int scan) {
		current_speed = scan;
	}//����ӵ� �Է¹޾� ����
	
	void set_gas(int g) {
		gas = g;
	}//�⸧ �Է¹޾� ����
	
	boolean isEmptygas() {
		if(gas==0) {
			System.out.println("There is no gas.");
			return true;
		}else {
			System.out.println("There is gas.");
			return false;
		}
	}//������ �ִ��� ������ ������ Ȯ��
	void run() {
		while(true) {
			System.out.printf("���� %dkm/h�� �����ϰ� ���� ���� gas�� %dL�Դϴ�.\n", current_speed, gas);
			if(gas>1)
			{
				if(current_speed!=60)
				{
					current_speed+=10;
				}
				gas-=1;
			}else {
				System.out.println("***���� ����ϴ�. gas �ܷ� 0L***");
				return;
			}
		}
	}//�ڵ����� �⸧�� �Ҹ��ؼ� �ӵ��� �ø��� �ӵ��� 60km/h�̻��̸� ������ �Ҹ� ������ 0�� �Ǹ� ���� �����.
	
}
	
