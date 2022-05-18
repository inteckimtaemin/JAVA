package study03;

public class SuperSonicAirPlaneTest {

	public static void main(String[] args) {

		SuperSonicAirPlane ssa = new SuperSonicAirPlane();
		ssa.TakeOff();
		ssa.fly();
		ssa.flymode = SuperSonicAirPlane.SUPERSONIC;
		ssa.fly();
		ssa.flymode = SuperSonicAirPlane.NORMAL;
		ssa.fly();
		ssa.land();
		
	}

}
