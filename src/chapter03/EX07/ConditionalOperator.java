package chapter03.EX07;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		// 3항 연산자 <== 자주 사용
		// (조건) ? 참:거짓 ;
		// 		조건이 '참'이면 '참'을 실행, '거짓'이면 '거짓'을 실행
		//			: 깃발 (조건에 따른 경계선)

		
		int value1 = (3 > 5)? 6:9;		//조건이 false 이므로 변수에 9가 할당.
		System.out.println(value1);
		System.out.println("===============");
		
		int value2 = (5 > 3)? 10:20;	//조건이 true 이므로 변수에 10이 할당.
		System.out.println(value2);
		System.out.println("===================");
		
		int value3 = 3;		//변수에 3 할당.
		System.out.println((value3 % 2 == 0) ? "짝수":"홀수");
			// % : 나머지 값만 출력.
		

		//5의 배수 인지 삼항 연산자를 통해서 확인
		int value4 = 3;
		System.out.println((value4 % 5==0) ? "5의 배수":"5의 배수가 아님");
		
		//나이가 20세 이상이면 성인이다. 성인이 아니다. 삼항 연산자 이용
		int old = 20;
		System.out.println((old >= 20) ? "당신은 성인이다.":"당신은 성인이 아니다.");
		System.out.println("====================");
		
		//3항 연산자는 if ~ else 문으로 변환 가능
		/*
		 if (조건) {
		 	실행문1; <= 조건이 참인 경우 실행문 1이 실행.
		 	}else {
		 	실행문2; <= 조건이 거짓인 경우 실행문 2 실행.
		 	}
		 	
		 */
		//변수 선언은 1회만 가능. -> 선언한 값을 변동하는 것은 가능.
		value3 =4;
		
		if (value3 % 2 == 0) {
			System.out.println("짝수");		//조건이 참일 때 실행
		}else {
			System.out.println("홀수");		//조건이 거짓일 때 실행
		}
		
		//5의 배수확인 (if)
		if (value4 % 5 ==0) {
			System.out.println("5의 배수이다.");
		}else {
			System.out.println("5의 배수가 아니다.");
		}
		//성인 확인 (if)
		if (old>= 20) {
			System.out.println("당신은 성인입니다.");
		}else {
			System.out.println("당신은 성인이 아닙니다.");
		}
		System.out.println("=================");
		
	}

}
