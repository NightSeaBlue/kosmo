package chapter06.EX01;


// 클래스 (붕어빵 기계) 와 객체 (붕어빵) 의 차이점
// 	클래스 : 객체를 만들기 위한 틀, 붕어빵 기계, 설계도
		// 필드  : 클래스 블락에서 선언된 변수 (멤버 변수)
		// 생성자
		// 메소드 : 메소드 내부에서 선언된 변수 (지역 변수)
		// 이너 클래스
//		객체(인스턴스) : 클래스를 틀로해서 만들어진 RAM에 로드된 객체, 붕어빵, 건물

// 클래스를 객체로 만드는 작업을 인스턴스화


//외부 클래스
class A {
	// 필드 : Heap 공간에 값이 저장됨, 값을 넣지 않으면 강제 초기화가 됨.
	int m = 3;
	int n = 4;
	
	//기본 생성자 : 클래스 이름과 동일한 메소드를 생성자, 리턴 타입이 없다.
		// 객체 생성시 초기값 부여하는 역할을 함.
	A () {}		
	
	//메소드 : 호출시 작동이 됩니다.
	void print () {
		int k = 10;			// 지역 변수 : Stack 공간에 값이 저장됨, 값을 넣지 않으면 비어 있음.
		System.out.println(k);
		System.out.println(m+n);
	
	}
	
}

// 외부 클래스
class B {
	
}

public class Using_Class02 {
	public static void main(String[] args) {
		
		int aa ;		//지역변수
		
		//객체 생성은 main 메소드에서 작성
		
		A a = new A();
		 // A : 참조 변수 타입 : A
		 // a : 객체 (참조변수)
		 // new : Heap 메모리에 값을 넣어라, 객체를 생성하라.
		 // A() : 기본 생성자 호출
		
		 // 객체의 필드의 내용 출력 (a.m , a.n)
		System.out.println("=== 객체의 필드 값 출력 ===");
		System.out.println(a.m);	//필드의 m값 출력 3
		System.out.println(a.n);	//필드의 n값 출력 4
		
		
		// 객체의 메소드 호출 (a.print())
		System.out.println ("=== 객체의 메소드 호출 ===");
		a.print();
		System.out.println("==================================");
		// ======================================================
		
			// A class : 틀 ===> 객체화
			
			// A class 를 틀로 해 객체 b 생성
			A b = new A();
			
			// 객체의 필드의 값을 수정
			b.m = 30;	//필드의 값을 30으로 수정
			b.n = 40;	//필드의 값을 40으로 수정
			
			// 필드의 내용 출력
			System.out.println(b.m);	//30
			System.out.println(b.n);	//40
			
			// 메소드 호출 : 기능을 프로그래밍 한 것
			System.out.println("==== print() 메소드 호출 ====");
			b.print();
			
			
			System.out.println("==== A class 를 틀로해서 객체를 무한히 생성 ====");
			A c = new A();
			
			System.out.println(c.m);
			System.out.println(c.n);
			c.print();
			
			A d = new A();
			
			System.out.println(d.m);
			System.out.println(d.n);
			d.print();
		
		
	}
}
