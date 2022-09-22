package Review04;

class Test {
	private int x,y;
	private double z;
	public void method (int a , int b, double c) {
		x = a ; y = b; z = c;
	}

	public void method (int a, double b , int c) {
		method (a,c,b);
	}

}



public class Test_class {

}
