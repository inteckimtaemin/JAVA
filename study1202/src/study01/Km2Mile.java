package study01;

import java.util.Scanner;

public class Km2Mile extends Converter{
	
	public String getInString() {
		return "Km";
	}
	public String getOutString() {
		return "Mile";
	}
	public double convert(double s) {
		return s/ratio;
	}
	public void set_ratio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ratio를 입력해주세요.");
		ratio =  sc.nextDouble();
		System.out.println("현재 1Mile은 "+ratio+"km입니다.");
	}
	
}
