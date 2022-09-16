package chapter10.EX09;

//this() : 자신의 객체의 생성자 호출, 생성자 내부의 첫 라인에 위치
//super() : 상속관계, 부모 클래스의 생성자 호출, 생성자 내부에서 첫 라인에 위치
//		자식 클래스는 생성자 내부에 첫 this(), super() 중 반드시 하나는 와야 한다.
//			-- 생략시 super() , 부모의 기본 생성자가 생략되어 있다.

class A {
	A() {
		this(3);
		System.out.println("A 기본 생성자 - A()");
	}
	
	A(int a) {
		System.out.println("A 의 매개변수 1개 - A(10)");
	}
}

class B extends A {
	B() {
		this(3); 
			System.out.println("B의 기본 생성자 - B()");
	}
	B(int a) {	// super() 가 생략되어 있음.
		System.out.println("B의 매개변수 1개인 생성자");
	}
}

public class Using_Super03 {

	public static void main(String[] args) {
		// 1. A 객체 생성
		A aa1 = new A();		// A의 매개변수 1개 - A(10) , A 기본 생성자 - A()
		
		System.out.println("======================");
		
		A aa2 = new A(3);	// A의 매개변수 1개 - A (10)
		
		System.out.println("=====================");
		
		//2. B 객체 생성
		B bb1 = new B ();
		System.out.println();
		
		B bb2 = new B (5);

	}

}
