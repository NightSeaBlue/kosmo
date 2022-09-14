package chapter09.EX05;

// static 필드의 값 초기화 : 클래스 내부에서 static { 필드의 값 초기화 } 선언
// 클래스명.필드명, 호출될 때 static { } 이 제일 먼저 작동

class C {
	int a;
	static int b;
	
	static {	//클래스가 클래스 영역에 로드될 때, 제일 먼저 작동. 생성자와 같은 역할
//		a = 10;		// 인스턴스 필드는 객체 생성 이후 초기화 가능.
		b = 5;
		System.out.println("클래스 C가 로딩 되었습니다.");
	}
	
	C () {		// 생성자 : 객체 생성시 필드의 초기값을 할당.
		a = 3;	// 인스턴스 필드 초기화 (생성자 생성으로 필드 호출 가능)
		b = 55;	// 스태틱 필드 초기화
	}
}

public class Using_StaticMethod03 {
	// class 군락에 필드, 메소드 위치 가능 (메인 메소드도 메소드임)
	int a = 100 ; static int b = 200 ;
	void abc () {
		System.out.println("abc() - 인스턴스");
	}
	static void bcd () {
		System.out.println("bcd() - 스태틱");
	}

	public static void main(String[] args) {
		// 객체 생성 없이 static 필드 호출.
		
		System.out.println(C.b);
		
//		System.out.println(a);		//인스턴스 필드
		System.out.println(b);		//스태틱 필드
//		abc();						//인스턴스 메소드
		bcd();						//스태틱 메소드

	}

}
