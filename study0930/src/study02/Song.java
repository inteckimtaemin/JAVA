package study02;

public class Song {
	
	private String title;
	
	Song(String plus) {
		this.title = plus;
	}
	
	String get_title()	{
		return title;
	}

	public static void main(String[] args) {
		Song s1 = new Song("아로하");
		Song s2 = new Song("마음");
		System.out.println(s1.get_title());
		System.out.println(s2.get_title());
		
	}
}
