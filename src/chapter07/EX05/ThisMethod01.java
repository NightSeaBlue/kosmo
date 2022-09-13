package chapter07.EX05;

class Abc {
	
	//생성자 (기본) : 인풋 매개변수가 없는 생성자
	Abc () {
		System.out.println(" 첫 번째 생성자 - 기본 생성자 ");
	}
	
	Abc (int a) {
		this();			//기본 생성자를 호출	, this() - 인풋이 없는 생성자 호출
		System.out.println(" 두번째 생성자 호출 ");
	}
	
	Abc (int a , String b) {
		this(30);		//매개변수가 정수 1개인 생성자를 호출
		System.out.println(" 세번째 생성자 호출 ");
	}
	
	Abc(int a, String b, String c) {
		this (40,"아오");
		System.out.println(" 네번째 생성자 호출 ");
	}
	
	
}


public class ThisMethod01 {

	public static void main(String[] args) {
		// This Method : 자신 클래스의 다른 생성자를 호출
		// 		-- 반드시 생성자 내부에서 사용됨, 메소드 내부에서는 사용할 수 없음.
		//		-- 반드시 생성자 첫번째 라인에 위치해야 한다.
		System.out.println("=== 기본 생성자 호출 ===");
		Abc abc1 = new Abc ();
		
		System.out.println("=== 매개변수 1개인 생성자 호출 ===");
		Abc abc2 = new Abc (50);
		
		System.out.println("=== 매개변수가 2개인 생성자 호출 ===");
		Abc abc3 = new Abc (30,"이거 왜 함");
		
		System.out.println("=== 매개변수가 3개인 생성자 호출 ===");
		Abc abc4 = new Abc (10,"음","얼추 이해가 갑니다.");

	}

}
