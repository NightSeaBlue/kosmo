package review_Polymorphism;

public class Item {
	protected String num;
	protected String name;

	Item () {}

	Item (String num, String name) {
		this.num = num;	this.name = name;
	}

	public void output() {
		System.out.println(num+" "+name);
	}


}
