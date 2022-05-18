package study02;

public class PlaneTest {

	public static void main(String[] args) {

		SupersonicAirplane ssa = new SupersonicAirplane();
		ssa.takeoff();
		ssa.fly();
		ssa.flyMode = SupersonicAirplane.SUPERSONIC;
		ssa.fly();
		ssa.flyMode = SupersonicAirplane.NORMAL;
		ssa.fly();
		ssa.land();
		
	}

}
