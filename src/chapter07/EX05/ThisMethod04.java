package chapter07.EX05;

class Car {
	String companyName;	//현대자동차 - 초기값.
	String color;		//검은색
	double maxSpeed;	//200.0 km/h
	
	Car () {
		companyName = "현대자동차"; color = "검은색"; maxSpeed = 200;
	}
	
	Car (String companyName) {
		this();
		this.companyName = companyName;
	}
	
	Car (String companyName , String color) {
		this(companyName);
		this.color = color;
	}
	
	Car(String companyName , String color, double maxSpeed) {
		this(companyName,color);
		this.maxSpeed = maxSpeed;
	}
	
	void print ( ) {
		System.out.println("회사명 : "+companyName);
		System.out.println("색상 : "+color);
		System.out.printf("최고 속도 : %.2f km/h",maxSpeed);
		System.out.println();
	}
	
}

public class ThisMethod04 {

	public static void main(String[] args) {
		// Use thiskeyword, thisMethod
		
		//1. 기본값
		System.out.println("=== 기본값 ===");
		Car car1 = new Car();
		car1.print();
		
		//2. 회사명 알 때
		System.out.println("=== 회사명 앎 ===");
		Car car2 = new Car ("벤츠");
		car2.print();
		
		//3. 회사명 및 색상 알 때
		System.out.println("=== 정보 두 가지를 알 때 ===");
		Car car3 = new Car ("크라이슬러", "퓨어 화이트");
		car3.print();
		
		//4. 모든 정보를 알 때
		System.out.println("=== 모든 정보를 알 때 ===");
		Car car4 = new Car ("Jeep","버건디 레드",275.05);
		car4.print();

	}

}
