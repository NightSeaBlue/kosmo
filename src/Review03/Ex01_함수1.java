package Review03;

public class Ex01_함수1 {

	public static void main(String[] args) {
		int a = 10 , b = 20;	
		
		add(a,b);	//argument (인자)		// main 에서 변수를 직접 받음

	}
	
	
	static void add(int a, int b) {	// (함수를 작동할 수 있게 들어오는 인자 타입 지정)
		// 해당 함수에서 a,b 값을 합해서 출력
		int sum = a+b;		// 변수를 받아 함수 내에서 처리
		System.out.println("합 : "+sum);
	}
}
