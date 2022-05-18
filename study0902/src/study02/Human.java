package study02;

public class Human {

	private String name;
	private int height;
	private int weight;
	
	void human(String n, int height, int weight){
		this.name = n;
		this.height = height;
		this.weight = weight;
	}
	String tname() {
		return name;
	}
	int theight() {
		return height;
	}
	int tweight() {
		return weight;
	}
	
}
