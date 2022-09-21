package Review03;

public class Ex03_CallByRef {		// 참조 자료형의 함수 호출 시 변화
	public static void main(String[] args) {

		StringBuffer a = new StringBuffer ("안녕");	// 변수 a 와 b 에 각각 문자열 할당.
		StringBuffer b = new StringBuffer ("하이");

		add (a,b);									// 함수가 main 필드에 값을 변환해 불러들임 이로 인해 main 에 존재하는 a 와 b의 값도 변화 발생.
														// a,b 가 stack 필드 내 main 에 할당되어 있을 때, heap 의 주소를 불러들이는데, heap 주소 내 값 자체가 변화되기 때문.
		System.out.println("A = "+a+" B = "+b);		// A : 안녕하이 B : 하이
	}

	static void add (StringBuffer a, StringBuffer b) {
		a.append(b);		// a의 뒤에 b를 결합하겠다. (main 에서 선언되어 내려온 인자 a,b 의 값 변화)
		System.out.println("A = "+a+" B = "+b);	//a가 a와b가 결합된 형태로 변경 , b는 유지
	}// A : 안녕하이 B : 하이

}



/*

	문자열 처리 클래스

	- String		: 임의의 heap 영역 내에서 값을 찾아 지정 하는 것 (ex. main 영역 내에서 string a = a 라고 할당할 경우, heap 영역 내 a 라는 값을 찾아 저장)

	- StringBuffer / StringBuilder (거의 유사함)

 */