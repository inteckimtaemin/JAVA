package study01;
//���¹�
public class IPTV extends ColorTV{

	String ip;
	
	public IPTV(String ip, int size, int C)
	{
		super(size, C);
		this.ip = ip;
	}
	@Override
	void printProperty() {
		System.out.println("���� IPTV�� "+ip+"�ּ��� "+getSize()+"��ġ "+C+"�÷�");
	}
	
}
