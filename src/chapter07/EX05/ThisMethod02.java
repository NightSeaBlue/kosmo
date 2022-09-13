package chapter07.EX05;

//Aa 클래스 : 여러개의 생성자 사용시 this() 없이 사용한 경우 : 중복된 값을 매번 입력.

class Aaa {
	int m1,m2,m3,m4;	// 정수 값을 담는 변수 4개를 필드 내 선언
	Aaa () {		// 기본 생성자
		m1=1; m2=2; m3=3; m4=4;		//변수 4개의 기본값 할당.
		System.out.println("기본 생성자");
	}
	
	Aaa (int a) {	// 매개 변수 1개
		m1=a; m2=2; m3=3; m4=4;
		System.out.println("두번째");
	}
	
	Aaa (int a, int b) {
		m1=a; m2=b; m3=3; m4=4;
		System.out.println("세번째");
	}
	
	void print () {		// 각 변수의 값을 출력하는 메소드.
		System.out.print(m1+ " "+m2+" "+m3+" "+m4);
		System.out.println();
	}
}

//Bb 클래스 : 여러개의 생성자 사용시 this() 사용 : 중복된 값을 제거.

class Bbb {
	int m1,m2,m3,m4;
	
	Bbb () {		// 기본생성자
		m1=1; m2=2; m3=3; m4=4;
		System.out.println("기본 생성자");
	}
	
	Bbb (int a) {
		this();
		m1 =a;
		System.out.println("두번째");
	}
	
	Bbb (int a, int b) {
		this(a);
		m2=b;
		System.out.println("세번째");
	}
	
	void print () {
		System.out.print(m1+ " "+m2+" "+m3+" "+m4);
		System.out.println();
	}
	
	
	
}


public class ThisMethod02 {

	public static void main(String[] args) {
		// 1. 3개의 객체 생성 (this 미사용)
		System.out.println("=== Aaa 객체 생성 (this 미사용) ===");
		Aaa aaa1 = new Aaa ();		// 기본 생성자 호출
		aaa1.print();
		
		Aaa aaa2 = new Aaa (10);		// 매개변수 1개
		aaa2.print();
		
		Aaa aaa3 = new Aaa (10,20);		// 매개변수 2개
		aaa3.print();
		
		// 2. 3개 객체생성 (this() 사용)
		System.out.println("=== Bbb 객체 생성 (this() 사용) ===");
		Bbb bbb1 = new Bbb ();
		bbb1.print();
		
		Bbb bbb2 = new Bbb(10);		//매개변수 1개인 생성자 호출
		bbb2.print();
		
		Bbb bbb3 = new Bbb(10,20);	//매개변수 2개인 생성자 호출
		bbb3.print();
		
		
		
		

	}

}
