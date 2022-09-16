package chapter10.EX08;

/*super Method : 부모 클래스의 생성자를 호출, super(), super(30)
 				-- 생성자 내부에서만 사용
 				-- 생성자의 첫 라인에 위치해야 한다.
 */

// 자식 클래스는 생성자 앞에 this(), super() 반드시 와야 한다.
//	   -- 생략시 super() , 부모 클래스의 기본생성자가 생략되어 있다.

class Aa {
	//기본 생성자 : ()
	Aa() {
		System.out.println(" Aa 기본 생성자 - Aa() ");
	}
}
class Bb extends Aa {
	Bb() {
		super ();		//생략시 컴파일러가 자동으로 등록
		System.out.println(" Bb 기본 생성자 - Bb() ");
	}
}
class Cc {		// 부모 클래스(Super class)
		// 객체 내부의 생성자가 존재할 경우, 컴파일러는 기본 생성자를 자동으로 추가하지 않음.
		//	Cc () {} 를 입력해 자식 클래스의 오류 방지 필요
	Cc (int a) {
		System.out.println(" Cc의 매개변수 1개인 생성자 - Cc(int a) ");
	}
}

class Dd extends Cc {		// 자식 클래스
	
	/* 		Dd 클래스의 생성자가 존재하지 않을 때, 컴파일러는 기본 생성자를 넣어준다.
	 Dd () {
	 	super();	// 기본적으로 생략되어 있음.
	 }
	 
	 */
	Dd () {
		super(3);
		System.out.println(" Dd의 기본 생성자 출력 - Dd() ");
		
	}
	
	Dd (int a) {
		this();			// 자신의 객체에 생성자 호출
		System.out.println(" Dd의 매개변수 1개인 생성자 호출 - Dd(int a) ");
	}
}

public class Using_Super02 {

	public static void main(String[] args) {
		// 1. 자식 객체 생성 Bb() 호출 => 출력 Aa() , Bb()
		// Bb 객체 생성
		Bb bb = new Bb();
		
		System.out.println("===========================");
		
		// 2. 자식 객체 생성 : Dd() 호출 =>
		
		Dd dd = new Dd();
		
		System.out.println("===========================");
		
		Dd dd2 = new Dd(40);

	}

}
