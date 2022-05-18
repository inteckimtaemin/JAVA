package study01;

public class Point {//2차원 상의 한 점을 표현하는 Point 클래스
	
	private int x, y;
	public Point(int x, int y)	{
		this.x = x;
		this.y = y;
	}
	public int getX()	{//필드 x좌표를 넘겨주는 메소드
		return x;
	}
	public int getY()	{//필드 y좌표를 넘겨주는 메소드
		return y;
	}
	protected void move(int x, int y)	{//x와  좌표를 움직이는 메소드
		this.x = x;
		this.y = y;
	}
}
