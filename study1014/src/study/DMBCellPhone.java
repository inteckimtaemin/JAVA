package study;

public class DMBCellPhone extends CellPhone {
	
	int channel;
	DMBCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
		System.out.println("�� : "+model+"\n���� : "+color+"\nDMB ä�� : "+channel+"��");
	}
	void TurnOn(){
		System.out.printf("ä��%d�� ��� ������ �����մϴ�.\n", channel);
	}
	void ChangeChannel(int ch) {
		this.channel = ch;
		System.out.printf("ä�� %d������ �ٲߴϴ�.\n",channel);
	}
	void TurnOff() {
		System.out.println("DMB ��� ������ �����մϴ�.");
	}
	
	
}
