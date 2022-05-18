package study01;

public class Car {

	String company = "Hyundai";	//회사
	String model;				//모델
	int max_speed;				//최고속도
	int current_speed;			//현재속도
	int gas;					//기름
	
	Car(String m, int ms)
	{
		this.model = m;
		this.max_speed = ms;
	}//모델과 최고속도 입력받아 지정
	
	void set_cs(int scan) {
		current_speed = scan;
	}//현재속도 입력받아 지정
	
	void set_gas(int g) {
		gas = g;
	}//기름 입력받아 지정
	
	boolean isEmptygas() {
		if(gas==0) {
			System.out.println("There is no gas.");
			return true;
		}else {
			System.out.println("There is gas.");
			return false;
		}
	}//가스가 있는지 가스가 없는지 확인
	void run() {
		while(true) {
			System.out.printf("현재 %dkm/h로 주행하고 현재 남은 gas는 %dL입니다.\n", current_speed, gas);
			if(gas>1)
			{
				if(current_speed!=60)
				{
					current_speed+=10;
				}
				gas-=1;
			}else {
				System.out.println("***차가 멈춥니다. gas 잔량 0L***");
				return;
			}
		}
	}//자동차의 기름을 소모해서 속도를 올리고 속도가 60km/h이상이면 가스만 소모 가스가 0이 되면 차가 멈춘다.
	
}
	
