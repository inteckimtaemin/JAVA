package study03;

public class People {
	
	private String name;
	private String ssn;
	People(String n , String s){
		name = n;
		ssn = s;
	}
	
	void showPeople() {
		System.out.println("�̸� : "+name);
		System.out.println("�ֹι�ȣ : "+ ssn);
	}
	
}
