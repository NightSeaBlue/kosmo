package chapter10.EX02;

// 다형성 (Polymorphism) : 하나의 객체가 여러가지 타입을 가질 수 있다.
//		- 메소드 오버라이딩을 사용해서 부모 클래스의 메소드를 재정의 해서 자식 클래스에서 재사용한다.

// 상속을 사용한 다형적 표현
		// - 상속 관계에서 객체 생성시 부모 타입으로 선언 가능.
		// - 부모 타입으로 선언 하면 부모 클래스의 필드와 메소드만 사용 가능함.
		// - 자식 객체를 생성하면서 부모 타입으로 지정하면 업캐스팅이 자동으로 됨.
		// - 다시 자식 클래스의 필드와 메소드를 사용하려면 다운 캐스팅을 해야 사용 가능.

class A {}		// Super Class
class B extends A {}	// Child Class , Super Class A
class C extends B {}	// Child Class , Super Class B
class D extends B {}	// Child Class , Super Class B


public class Using_Polymorphism01 {

	public static void main(String[] args) {
		// 자식에서 객체 생성 후 부모 타입
		
		//1. A 타입의 다형적 표현
			// a1은 A 타입만 내포하고 있고, A타입으로 지정.
		A a1 = new A ();		// A 클래스는 A 타입이다. , A는 A이다. (O)
			// a2는 A,B 타입을 내포하고 있고, A타입으로 지정. (다운스케일시 B타입 사용 가능)
		A a2 = new B ();		// B 클래스는 A 타입이다. , B는 A이다. (O)
			// a3는 A,B,C 타입을 내포하고 있고, A타입으로 지정.
		A a3 = new C ();		// C 클래스는 A 타입이다. , C는 A이다. (O)
			// a4는 A,B,C,D 타입을 내포하고 있고, A 타입으로 지정.
		A a4 = new D ();		// D 클래스는 A 타입이다. , D는 A이다. (O)
		
		// 2. B 타입으로 다형적 표현
//		B b1 = new A ();	// A는 B이다 (X)
		B b2 = new B ();	// B는 B이다 (O)
		B b3 = new C ();	// C는 B이다 (O)
		B b4 = new D ();	// D는 B이다 (O)
		
		// 3. C 타입으로 다형적 표현
//		C c1 = new A() ;	// A는 C이다 (X)
//		C c2 = new B() ;	// B는 C이다 (X)
		C c3 = new C() ;	// C는 C이다 (X)
//		C c4 = new D() ;	// D는 C이다 (X /상속관계 미성립)
		
		// 4. D 타입으로 다형적 표현
//		D d1 = new A();
//		D d2 = new B();
//		D d3 = new C();
		D d4 = new D();
		
		
		
		
	}

}
