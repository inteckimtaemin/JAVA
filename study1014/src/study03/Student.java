package study03;

public class Student extends People {
	
	private int stuNum;
	
	Student(String name, String ssn, int num){
		super(name, ssn);
		this.stuNum = num;
	}
	void showStudent(){
		System.out.println("=====�л�����======");
		showPeople();
		System.out.println("�й� : "+stuNum);
	}
	
}
