package chapter10.EX04;

//Upcasting : 자동으로 변환됨
	// 기본 자료형 : 좁은 범위에서 (int) ==> 넓은 범위 자동으로 캐스팅 (double)
	// 상속 자료형 : 자식타입 ==> 부모 타입
//Downcasting : 수동으로 직접 해야 한다.
	// 기본 자료형 : 넓은 범위(double)를 좁은 범위(int)로 변환	, 자료가 소실될 위험이 있음. 
	// 상속 : 부모 타입 ==> 자식타입 (실행 시 오류 발생 위험 있음)

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Using_TypeCasting {

	public static void main(String[] args) {
		//1. Up casting (Auto)	: 생략시 컴파일러 자동으로 추가
		A ac = (A) new C ();	// C => A 업캐스팅
		B bc = (B) new C ();	// C => B 업캐스팅
		
		// bb는 A,B 포함하고 있고, B 타입으로 지정 (A,B 모두 사용 가능)
		B bb = new B();
		A a = bb;				// B => A 업캐스팅
		
		// 2. Down Casting (수동) : 캐스팅이 불가능한 경우 실행시 오류 발생.
		A aa = new A();	//aa는 A 타입만 내포하고 있다.
//		B b = (B)aa;	//aa는 B 타입을 내포하고 있지 않으므로 Downcasting 불가 , 실행 시 오류 발생.
						// 구문 자체는 이상 없음.
//		C c = (C)aa;	//aa는 C 타입을 내포하고 있지 않아 다운 캐스팅 불가능 (실행 시 오류 발생)
						// 구문 자체는 이상 없음.
		
		//3. Down Casting 가능한 경우
		A ab = new B ();	//ab는 A,B 타입을 내포하고 있으며 B type으로 생성됨.
		B b = (B) ab;		//A(부모) => B(자식)
//		C c = (C) ab;		//ab는 C타입을 내포하고 있지 않아 캐스팅 불가 (구문은 이상 없음.)
		
		B bd = new D();		//bd는 A,B,D 타입을 내포하고 있으며 D type으로 생성됨.
							//bd는 A,B 의 필드와 메소드 접근 가능
		D d = (D) bd;		//B(부모) => D (자식)
							//d는 A,B,D 의 모든 필드와 메소드 사용 가능.
//		C c = (C) bd;		//bd는 C를 내포하고 있지 않아 다운 캐스팅 불가능 (구문은 이상 없음)
		
		A ad = new D ();	//ad는 A,B,D 내포하고 있음. A type 으로 생성.
		B b1 = (B)ad;		//A => B 타입으로 다운 캐스팅
							// A,B의 필드와 메소드 접근 가능
		D d1 = (D)ad;		// A => D 타입으로 다운 캐스팅
							// A,B,D 의 모든 필드와 메소드 접근 가능
//		C c5 = (C)ad;		// ad는 C를 내포하고 있지 않아 다운 캐스팅 불가능 (실행 시 오류 발생)
		
		
		
		
	}

}
