package chapter07.EX01;

class circle {
	int diameter;
	String name;
	
	circle (int diameter, String name) {
		this.diameter = diameter;
		this.name = name;
	}
	
	void call () {
		double area = 3.14 * diameter/2 * diameter/2;
		System.out.println(name +"의 지름은 "+diameter+"이고 "+name+ "의 넓이는 " + area + " 입니다.");
	}
	
}


public class Using_Method02 {

	public static void main(String[] args) {
		// 원의 지름을 넣었을 때 전체 넓이를 구하는 객체를 생성 후 출력해 보세요.
		//   피자  : 10 , 도넛 : 5
		
		// 출력 : <피자>의 넓이는 <00> 입니다.
		// <도넛>의 넓이는 <00> 입니다.
		circle pizza = new circle (10,"피자");
		pizza.call();
		
		circle doughnut = new circle (5,"도넛");
		doughnut.call();

	}

}
