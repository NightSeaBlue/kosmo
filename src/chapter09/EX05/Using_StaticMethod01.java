package chapter09.EX05;

	// 메소드 이름 앞에 static 가 없는 메소드 : 인스턴스 메소드
	// 메소드 이름 앞에 static 이 있는 메소드 : 스태틱 메소드 (정적 메소드)

class A {
	
	void abc () {
		System.out.println("인스턴스 메소드");
	}
	
	static void bcd () {
		System.out.println("스태틱 메소드");
	}
}

public class Using_StaticMethod01 {

	public static void main(String[] args) {
		
		//객체 생성 없이 호출 : 스태틱 메소드(클래스명.메소드명())
//		A.abc();		// 인스턴스 메소드 : 객체 생성 후 객체 명으로 호출
		A.bcd();
		
		//객체 생성후 호출
		System.out.println(" == 객체 생성 후 호출 == ");
		A a = new A();
		
		a.abc();	//인스턴스 메소드 
		a.bcd();	//스태틱 메소드

	}

}
