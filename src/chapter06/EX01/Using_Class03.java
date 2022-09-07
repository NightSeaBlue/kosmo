package chapter06.EX01;


//같은 패키지 내에서 클래스 이름은 중복 되면 오류가 발생됨.
class C {
	
	// 필드 : Heap 영역에 값이 저장 , 강제 초기화
	int a ;		//0
	int b ;		//0
	String name;	//null
	
	C () {}		//기본생성자 : 매개변수 값이 없고, 실행부도 없는 생성자, 생략 가능
	
	void call () {
		int c ;			// 지역 변수 : Stack  , 강제 초기화가 안되므로 반드시 기본값을 넣고 출력.
		System.out.println("출력 내용입니다. ");
		
		// System.out.println(c);		// 초기 값을 할당해야 함.
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
	}
	
	
}

public class Using_Class03 {

	public static void main(String[] args) {
		// 
		C c = new C();
		
		c.call();

	}

}
