package chapter09.EX02;

import chapter09.EX01.A;

// A 클래스와 다른 패키지에 존재하는 클래스 : Import를 사용

public class Using_Modifier02 {

	public static void main(String[] args) {
		// import 됨
		A a = new A ();
		
		// 필드 접근
		System.out.println(a.a);		//public
//		System.out.println(a.b);		//protected : 다른 패키지에서 접근할 경우 상속관계 적용 필요, 접근 불가.
//		System.out.println(a.c);		//default : <접근 불가>
//		System.out.println(a.d);		//private : <접근 불가>
		
		a.print1();						//public
//		a.print2();						//protected : <접근 불가> , 상속 미적용
//		a.print3();						//default : <접근 불가>
//		a.print4();						//private : <접근 불가>
		
		System.out.println("== 상속 관계 객체 출력(D) ==");
		D d = new D ();
		
		d.print();

	}

}
