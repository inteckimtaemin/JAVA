package study01;

public class Test {

	public static void main(String[] args) {

		RemoteControl rc = new Audio();
		Searchable sr = new SmartTelevision();
		
		rc.turnOn();
		rc.setVolume(10);
		rc.setVolume(1);
		sr.search("https://www.daum.net/");
		rc.turnOff();
		
	}

}
