package basic1;

public class Ex02_ShortCircuit_Logic2 {

	public static void main(String[] args) {

		int a = 3;
		
		if (a > 3 & ++a > 3) {	//조건 만족 미출력
			System.out.println("조건 만족");
		}
		System.out.println("a="+a);	//4
		
		if (a > 1 | ++a > 3) {	// 조건 만족2 출력
			System.out.println("조건 만족2");
		}
		System.out.println("a="+a);	//5
		
	}

}
