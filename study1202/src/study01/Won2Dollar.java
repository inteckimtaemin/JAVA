package study01;

import java.util.Scanner;

public class Won2Dollar extends Converter{
	

	public String getInString() {
		return "��";
	}
	public String getOutString() {
		return "�޷�";
	}
	public double convert(double s){
		return s/ratio;
	}
	public void set_ratio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ratio�� �Է����ּ���.");
		ratio = sc.nextDouble();
		System.out.println("���� 1�޷��� "+ratio+"���Դϴ�.");
	}

}
