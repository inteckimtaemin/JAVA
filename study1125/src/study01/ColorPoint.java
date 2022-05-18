package study01;

public class ColorPoint extends Point {

	String Color;
	public ColorPoint(int x, int y, String C)	{
		super(x,y);
		this.Color = C;
	}
	public void show() {
		System.out.println(Color+"»öÀ¸·Î "+"( "+getX()+", "+getY()+" )");
	}
	public void setColor(String C) {
		Color = C;
	}
	public void setPoint(int x, int y)	{
		move(x,y);
	}
	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5,3,"YELLOW");
		cp.setPoint(10,20);
		cp.setColor("Green");
		cp.show();
	}

}
