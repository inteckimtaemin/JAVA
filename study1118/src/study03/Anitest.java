package study03;

public class Anitest {

	public static void main(String[] args) {

		Dog D = new Dog();
		Cat C = new Cat();
		
		//Animal a = new Animal(); //추상클래스 객체 생성 안됨.
		
		D.sound();
		C.sound();
		
		Animal an = D; //Upcasting
		an.sound();
		
		an = C;
		an.sound();
		
	}

}
