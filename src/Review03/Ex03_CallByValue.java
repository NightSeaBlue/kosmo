package Review03;

public class Ex03_CallByValue {	// 원본에 영향을 미치지 않는 경우 (함수의 인자로 기본자료형을 보낼 때)

	public static void main(String[] args) {
		int a = 10 , b = 20;	// a 와 b 의 값이 stack 영역의 main 값에 할당 (main value 내에서 기본값)
		add(a,b);	// 함수에서 처리된 인자 a,b 가 변수 a,b 에 재할당.
		System.out.println("A = "+a+" B = "+b);		// 뭐가 먼저일지(2) a: 30 b: 20
	}
	static void add (int a , int b) {	// main 에 존재하는 변수 a,b 의 값이 인자로 할당됨
		a+=b;	// 함수에 할당된 인자 a 에 b 를 더한다.
		System.out.println("A = "+a+" B = "+b);		// 뭐가 먼저 일지 (1) a: 10 b: 20
	}
}

