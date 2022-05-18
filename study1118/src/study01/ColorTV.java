package study01;
//±èÅÂ¹Î
public class ColorTV extends TV{
	int C;
	
	public ColorTV(int size, int C)	{
		super(size);
		this.C = C;
	}
	
	void printProperty() {
		System.out.println(getSize()+"ÀÎÄ¡ "+C+"ÄÃ·¯");
	}
}
