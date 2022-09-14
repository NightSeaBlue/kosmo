package chapter09.EX04;

class B {
	int m = 3;			// 인스턴스 필드 : 객체마다 다르게 적용, Heap 영역에 변수와 값이 저장됨
	static int n = 5;	// 스태틱 필드 : 모든 객체에서 공통으로 적용, 클래스 영역에 변수와 값이 저장.
}

public class Test_B {
	public static void main(String[] args) {
		
		// 객체 생성
		B b1 = new B ();
		B b2 = new B ();
		
		// 인스턴스 필드의 값 변경
		b1.m = 5;	// m : 3 => 5로 수정;
		b2.m = 6;	// m : 3 => 6로 수정;
		
		System.out.println(b1.m);
		System.out.println(b2.m);
		
		// 정적 필드의 값 수정 : 모든 객체에서 공유해서 사용하는 필드
		b1.n= 7;
		b2.n= 8;
		
		System.out.println(b1.n);	// 8
		System.out.println(b2.n);	// 8
		
		// 정적 필드 수정 : 객체 없이 클래스 명으로 수정
		B.n = 9;
		
		System.out.println(b1.n);	// 9
		System.out.println(b2.n);	// 9
		

		
	}
	
}
