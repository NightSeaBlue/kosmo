package chapter04;

public class If_01 {

	public static void main(String[] args) {
		/*
		 제어문 : 프로그램의 순서를 바꾸는 구문
		 	- 선택 제어문 : if, switch
		 	- 반복 제어문 : for, while, do while;
		 
		 
		 if : 조건을 만족하는 실행문을 실행한 후 if 문을 빠져 나온다.
		 	  (break를 사용하지 않더라도 if 문을 빠져나온다.
		 	   switch문은 break를 사용해서 구문을 빠져 나온다.)
		 
		 	- if (조건) { 실행문 1 ; };		// 조건이 참일 때 실행문1 실행
		 	- if (조건) {
		 		실행문1 ;		//조건이 참일 경우
		 	    }else {
		 		실행문2 ;		//조건이 거짓일 경우
		 	    }
		 	- if (조건1) {	//조건 1이 참일 때, 실행문 1 실행
		 		실행문 1;
		 	  } else if (조건2) {		//조건 2가 참일 때 실행문 2 실행
		 	  	실행문 2;
		 	  } else if (조건3) {		//조건 3가 참일 때 실행문 3 실행
		 	  	실행문 3;
		 	  } ..... (무한히 연결 가능)
		 	  } else(마지막) { 		//조건들이 모두 false일 때 실행문 10 실행
		 	    실행문 10;
		 	  }
		 */ 

		//1. if (조건) { 실행문1; }
		
		System.out.println("==== 조건이 False ====");
		if (3 > 5) {	//조건이 false 기 때문에 실행문이 실행되지 않음.
			System.out.println("안녕");
			System.out.println("방가");
		}
		System.out.println("==== 조건이 True ====");
		if (3 < 5) {	//조건이 true 기 때문에 실행문이 실행됨.
			System.out.println("안녕");
			System.out.println("방가");
		}
		
		//if 조건에서 실행문이 1개일 때는 중괄호를 생략할 수 있다. (주의 필요)
			//권장 사항 : 중괄호 명시 후 사용.
		System.out.println("=======================");
		if (5 > 3) 
			System.out.println("It's Raining today");	//중괄호 내부 실행문 (생략 됨)
			System.out.println("비가 보슬보슬 옵니다.");		// 중괄호 외부 실행문
		System.out.println("===================================");
		
		/*2. if (조건) {
				실행문 1 ;	//조건이 참일 때 실행문 1 실행
			} else {
				실행문 2;		//조건이 거짓일 때 실행문 2 실행
			}	
		*/	
		
		if (5 > 3) {		// 조건은 반드시 True Or False가 나와야 함.
			System.out.println("실행 1 (참)");	//조건이 참일 때 실행
		} else {
			System.out.println("실행 2 (거짓)");	//조건이 거짓일 때 실행
		}
		System.out.println("===========================");
		
		//변수 선언 : 동일한 변수를 여러 개 선언 시 - , 로 구분 가능.
		//			- 기본 자료형 (8가지) : 초기 값 할당하지 않으면 오류 발생
		//			 boolean, byte, short, int, long, float, double, char
		//			- 참조 자료형 (무한대) : 초기 값을 할당하지 않으면 컴파일러가 자동으로 넣어 줌. 
		//			 String (문자열) <== 참조 자료형
		int a,b ; //변수 선언만 한 경우
		//System.out.println(a);		//변수의 값을 넣지 않고 출력 불가능.
		a=5; b=0; //변수 초기값 할당.
		
		if (a > 5) {
			b=10;
		} else {
			b = 20;
		}
		System.out.println(b);		//20
		
		// if (조건) ~ else 구문을 삼항 연산자로 변환하기 : 삼항 연산자는 한 라인으로 작성 후 처리 가능
		System.out.println("==== 삼항 연산자 출력 ====");
		System.out.println((a>5) ? 10:20);
		
		/* 조건이 여러개인 경우 if (조건) ~ else if (조건) .... ~ else {실행문}
		 	: 해당 조건을 만족하는 실행문을 실행후 if 구문 탈출.
		 */
		
		System.out.println("==== 학점 결과 ====");
		int c ;
		c = 85 ;
		if (c >= 90) {
			System.out.println("A학점 입니다.");
		} else if (c >= 80) {
			System.out.println("B학점 입니다.");
		} else if (c >= 70) {
			System.out.println("C학점 입니다.");
		} else if (c >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("학점 미달입니다.");
		}
		 
		System.out.println("if 문 탈출됨.");
		
		
		
	}

}
