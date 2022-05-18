package study03;

public abstract class Animal {//추상클래스

	String kind;
	
	public void breath()	{
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound(); //추상 메소드
	
}
