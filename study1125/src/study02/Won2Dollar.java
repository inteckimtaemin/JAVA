package study02;

public class Won2Dollar extends Converter {

	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	public String getInString() {
		return "��";
	}
	public String getOutString() {
		return "�޷�";
	}
	public double convert(double s) {
		return s/ratio;
	}
}
