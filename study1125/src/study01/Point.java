package study01;

public class Point {//2���� ���� �� ���� ǥ���ϴ� Point Ŭ����
	
	private int x, y;
	public Point(int x, int y)	{
		this.x = x;
		this.y = y;
	}
	public int getX()	{//�ʵ� x��ǥ�� �Ѱ��ִ� �޼ҵ�
		return x;
	}
	public int getY()	{//�ʵ� y��ǥ�� �Ѱ��ִ� �޼ҵ�
		return y;
	}
	protected void move(int x, int y)	{//x��  ��ǥ�� �����̴� �޼ҵ�
		this.x = x;
		this.y = y;
	}
}
