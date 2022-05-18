package study02;
//김태민
import java.util.Scanner;

public abstract class Converter {
	protected abstract double convert(double src);
	protected abstract String getSrcString ();
	protected abstract String getDesString();
	
	protected double ratio; // 비율

	public void run() {
		Scanner s = new Scanner(System.in);
		System.out.println(getSrcString() +"을 "+ getDesString()+"로 바꿉니다.");
		System.out.print(getSrcString() +"을 입력하세요>> ");
		double val = s.nextDouble();
		double result = convert(val);
		System.out.println("변환 결과: " + result + getDesString() + "입니다.");
	}
}