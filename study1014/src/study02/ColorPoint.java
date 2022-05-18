package study02;

public class ColorPoint extends Point{
	private String color;
	
	void setcolor(String co) {
		this.color = co;
	}
	void showcolorPoint() {
		System.out.print(color);
		showPoint();
	}
	
}
