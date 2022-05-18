package study02;

public class Km2Mile extends Converter {

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	public String getInString() {
		return "Km";
	}
	public String getOutString() {
		return "Mile";
	}
	public double convert(double s) {
		return s/ratio;
	}
	
}
