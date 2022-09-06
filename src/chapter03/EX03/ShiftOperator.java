package chapter03.EX03;

public class ShiftOperator {

	public static void main(String[] args) {
		//산술 시프트 연산 (<<, >>)
		// - 부호 비트는 고정
		// - 대량의 계산을 빠르게 처리할 수 있다.
		
		//<< : 각 비트를 왼쪽으로 이동
		System.out.println(3 << 1);		//3*2^1 = 6
		System.out.println(3 << 2);		//3*2^2 = 12
		System.out.println(3 << 3);		//3*2^3 = 24
		
		System.out.println(-3 << 1);		//-3*2^1 = -6
				
		System.out.println("==========================");
		
		//>> : 각 비트를 오른쪽으로 이동
		System.out.println(5 >> 1);		//5*2^-1 = 2
		System.out.println(5 >> 2);		//5*2^-2 = 1
		System.out.println(5 >> 3);		//5*2^-3 = 0
		System.out.println("=====================");
				
		
		//논리 시프트 ( >>> )
		System.out.println(3 >>> 1);
		
		
	}

}
