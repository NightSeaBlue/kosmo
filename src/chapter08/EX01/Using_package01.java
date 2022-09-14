package chapter08.EX01;

public class Using_package01 {

	public static void main(String[] args) {
		
		// A 클래스와 같은 패키지에 존재 : Import 없이 바로 접근이 가능.
		System.out.println("=== A 클래스 접근 ===");
		A a = new A ();
		System.out.println(a.m);		//접근 가능
		System.out.println(a.n);		//접근 가능
		
		a.print();
		
		
		System.out.println("=== B 클래스 접근 ===");
		//동일한 패키지에 존재
		B b = new B ();
		System.out.println(b.a);
		System.out.println(b.b);
		
		b.print();
		
		
		

	}

}
