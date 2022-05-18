package study01;

public class ColorPoint extends Point {

	private String Color;
	
	ColorPoint(int x, int y, String Color) {
		super(x,y);
		this.Color = Color;
	}
	ColorPoint(String Color) {
		super();
		this.Color = Color;
	}
	void ShowColorPoint() {
		System.out.print(Color);
		ShowPoint();
	}
	
}
