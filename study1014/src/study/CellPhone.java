package study;

public class CellPhone {
	
	String model;
	String color;
	
	void powerOn(){
		System.out.println("�ڵ��� ������ �մϴ�.");
	}
	void Bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void powerOff() {
		System.out.println("�ڵ��� ������ ���ϴ�.");
	}
	void sendvoice(String m){
		System.out.println("�� : " + m);
	}
	void receivevoice(String m) {
		System.out.println("���� : " + m);
	}
	void hangup() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
