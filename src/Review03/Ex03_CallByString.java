package Review03;

public class Ex03_CallByString {
	public static void main(String[] args) {

		String a = new String ("안녕");	// 변수 a 와 b 에 각각 문자열 할당. (String 으로)
		String b = new String ("하이");

		add (a,b);									
														
		System.out.println("A = "+a+" B = "+b);		// A : 안녕 B : 하이	// String 의 경우 a,b 의 값이 다시 재정의 됨 (main 변수에서 설정한 값으로 다시 재정의)
	}

	static void add (String a, String b) {
		a+=b;		// a의 뒤에 b를 결합하겠다. (main 에서 선언되어 내려온 인자 a,b 의 값 변화)
		System.out.println("A = "+a+" B = "+b);	//a가 a와b가 결합된 형태로 변경 , b는 유지
	}// A : 안녕하이 B : 하이

}
