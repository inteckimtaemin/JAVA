package study01;

public class Point {
	private int x;
	private int y;
	Point(){
		this.x=10;
		this.y=20;
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	void ShowPoint() {
		System.out.printf("(%d, %d)\n",x,y);
	}
}
