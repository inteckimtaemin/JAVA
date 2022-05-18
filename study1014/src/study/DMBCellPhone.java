package study;

public class DMBCellPhone extends CellPhone {
	
	int channel;
	DMBCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
		System.out.println("모델 : "+model+"\n색상 : "+color+"\nDMB 채널 : "+channel+"번");
	}
	void TurnOn(){
		System.out.printf("채널%d번 방송 수신을 시작합니다.\n", channel);
	}
	void ChangeChannel(int ch) {
		this.channel = ch;
		System.out.printf("채널 %d번으로 바꿉니다.\n",channel);
	}
	void TurnOff() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
	
	
}
