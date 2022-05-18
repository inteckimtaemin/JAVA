package study03;

public class Student extends People {
	
	private int stuNum;
	
	Student(String name, String ssn, int num){
		super(name, ssn);
		this.stuNum = num;
	}
	void showStudent(){
		System.out.println("=====학생정보======");
		showPeople();
		System.out.println("학번 : "+stuNum);
	}
	
}
