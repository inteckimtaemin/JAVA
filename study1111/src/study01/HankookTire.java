package study01;
//김태민
public class HankookTire extends Tire{

	HankookTire(String lo, int max){
		super(lo,max);
	}
	@Override
	boolean roll() {
		++accumRotation;
		
		if(accumRotation<maxRotation) {
			System.out.println(location+" HankookTire 남은회전수 : "+(maxRotation-accumRotation)+"회");
			return true;
		}
		else {
			System.out.println("<<<<<<<<"+location+" 타이어펑크 >>>>>>>>");
			return false;
		}
	
	}
	
}
