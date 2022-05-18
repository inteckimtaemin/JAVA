package study01;

import java.util.Scanner;

public class Won2Dollar extends Converter{
	

	public String getInString() {
		return "원";
	}
	public String getOutString() {
		return "달러";
	}
	public double convert(double s){
		return s/ratio;
	}
	public void set_ratio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ratio를 입력해주세요.");
		ratio = sc.nextDouble();
		System.out.println("현재 1달러는 "+ratio+"원입니다.");
	}

}
