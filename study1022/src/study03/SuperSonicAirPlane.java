package study03;

public class SuperSonicAirPlane extends AirPlane{

	static final int NORMAL=1;
	static final int SUPERSONIC=2;
	int flymode = NORMAL;
	
	@Override
	void fly() {
		if(flymode == SUPERSONIC )
		System.out.println("초음속 비행합니다.");
		else
		super.fly();
		
	}
	
}
