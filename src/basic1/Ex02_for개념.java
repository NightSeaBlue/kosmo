package basic1;

/*
 * 	반복문 : for / while / do~while
 * 
 * 	(1) for (초기치 ; 조건문 ; 증가치) {
 * 		반복구문
 * 	  }
 * 
 */


public class Ex02_for개념 {

	public static void main(String[] args) {
		// 1) 1부터 10까지 숫자 출력
		
		  for (int i=1 ; i<=5 ; i++) {		// breakpoint : 구문 실행 정지
			System.out.println(i);
		}
		System.out.println("=======================");
		// [1] 위의 for 원리 이해하기
		// [2] 1부터 10까지의 합을 출력
		  int j = 0;
		  for (int i=1; i<=10; i++) {
			  j+=i;
		  }
		  System.out.println("1부터 10까지의 합은 : "+j);
		// [3] 1부터 10까지 홀수의 합을 출력
		  int n = 0;
		  for (int i=1; i<=10; i+=2) {
			  n+=i;
		  }
		  System.out.println("1부터 10까지 홀수의 합은 : " +n);
		
		// 2) 'A'부터 'Z'까지 출력
			/*for (char a = 'A'; a<='Z'; a++) {
				System.out.print(a+" ");
			}
			System.out.println();		// 개행 - 행을 한줄 내림
			
			for (char a = 'A'; a<='Z'; a+=2) {
				System.out.print(a+" ");
			}
			System.out.println();
			// 'Z' 부터 'A' 까지 출력
			for (char a = 'Z'; a>='A'; a--) {
				System.out.print(a+" ");
			}
			*/

	}

}
