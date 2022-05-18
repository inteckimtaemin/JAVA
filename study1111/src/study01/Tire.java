package study01;
//김태민
public class Tire {

	int maxRotation;//최대 회전수
	String location;//타이어 위치
	int accumRotation;//누적 회전수
	
	Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	boolean roll() {
		++accumRotation;
		
		if(accumRotation<maxRotation) {
			System.out.println(location+" Tire 남은회전수 : "+(maxRotation-accumRotation)+"회");
			return true;
		}
		else {
			System.out.println("<<<<<<<<"+location+" 타이어펑크 >>>>>>>>");
			return false;
		}
	}
	
}
