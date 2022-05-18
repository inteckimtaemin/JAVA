package study01;

public class MyClass {

	RemoteControl rc = new Television();
	
	MyClass(){}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		System.out.println("memtodA()호출");
		RemoteControl rec = new Audio();
		rec.turnOn();
		rec.setVolume(3);
	}
	
	void methodB(RemoteControl rc) {
		System.out.println("methodB(RemoteControl rc)호출");
		rc.turnOn();
		rc.setVolume(7);
	}
}
