package study01;
//김태민
public class IPTV extends ColorTV{

	String ip;
	
	public IPTV(String ip, int size, int C)
	{
		super(size, C);
		this.ip = ip;
	}
	@Override
	void printProperty() {
		System.out.println("나의 IPTV는 "+ip+"주소의 "+getSize()+"인치 "+C+"컬러");
	}
	
}
