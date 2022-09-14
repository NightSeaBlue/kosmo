package chapter09.EX01;

// class E 는 class A를 상속한다. < == A 클래스의 모든 필드와 메소드를 물려받음.
// class A : 부모 클래스 (Super Class)
// class E : 자식 클래스 (Child Class)
// 		(동일한 패키지에서 상속 설정)

public class E extends A{
	
	public void print () {
		System.out.println(a);		//A 클래스 내 선언되어 있는 a , public
		System.out.println(b);		// protected
		System.out.println(c);		// default
//		System.out.println(d);		// private <접근 불가>

		System.out.println("== 부모의 메소드 호출 ==");
		print1();					// 부모의 메소드 호출 public
		print2();					// 부모의 메소드 호출 protected
		print3();					// 부모의 메소드 호출 default
//		print4();					// 부모의 메소드 호출 private <접근 불가>
		
		
	}
	

}
