package chapter04.EX04;

public class Using_For01 {

	public static void main(String[] args) {
		/*
		 for (초기값; 조건; 증가값) {
		 	실행문 1; 		<= 조건이 참일 경우 무한 반복, 거짓이면 for 을 빠져나옴
		 }
		  */
		
		int a;
		for (a = 0 ; a<100 ; a++) {		//초기값 ; 조건 ; 증가값
			System.out.println(a);
		}		//0 1 2 (종결)
		
		System.out.println("===================");
		//초기값과 증가값에는 ,로 구분 해서 여러 개의 변수가 올 수 있다.
		
		int b, c, d;
		for (b = 0, c = 10, d = 20 ; b < 5; b++, c+=2, d+=5) {		
			//b : 1씩 증가, c : 2씩 증가, d : 5씩 증가
			System.out.println("b : "+ b +", c : "+ c + ", d : " + d);
			
		}
		
		System.out.println("==================");
		
		//for 문의 무한루프	(조건이나 증가값을 잘못 처리할 경우)
		int e;
		for (e = 0; e < 10 ; e+=3) {
		System.out.println(e);		// 조건이 True 일 동안 반복
		}	// 0 3 6 9
		
		System.out.println("===for 문 없이 1~10까지 덧셈 ===");
		int sum1 ;
		sum1 = 0;	//0
		sum1 += 1;	// sum1 = sum1 + 1	//1
		sum1 += 2;	// sum1 = sum1 + 2	//3
		sum1 += 3;	// sum1 = sum1 + 3	//6
		sum1 += 4;	// sum1 = sum1 + 4	//10
		sum1 += 5;	// sum1 = sum1 + 5	//15
		sum1 += 6;	// sum1 = sum1 + 6	//21
		sum1 += 7;	// sum1 = sum1 + 7	//28
		sum1 += 8;	// sum1 = sum1 + 8	//36
		sum1 += 9;	// sum1 = sum1 + 9	//45
		sum1 += 10;	// sum1 = sum1 + 10	//55
		
		System.out.println("1~10까지의 합 : " + sum1);
		
		//for 문을 사용해서 1부터 10까지의 합계 구하기
		
		int sum2;
		
		int i;
		for (i = 1, sum2 = 0 ; i <=10 ; i++) {
			sum2 += i ;
			System.out.println("sum2 : " + sum2 +", i : " + i );
		}
		System.out.println("1부터 10까지의 합계 : " + sum2);
		
		//for 문을 사용해서 0 ~ 1000까지 7의 배수의 합계
		// "7의 배수의 합계 : <000>
		
		int sum3=0;
		for (int k = 0 ; k <=1000 ; k += 7 ) {
			sum3 += k;
		}
		System.out.println("0부터 1000까지 7의 배수의 합계 : "+sum3+"" );
		
		System.out.println("===============");
		
		//for 문 내 if 문을 사용해서 1~10까지 더한 값을 출력하되 아래와 같이 출력하세요.
		// 결과 : 1+2+3+4+5+6+7+8+9+10 = 55
		int sum4 = 0;
		System.out.print("결과 : ");
		for (int n = 1 ; n <= 10 ; n++) {
			sum4 += n; //1부터 10까지의 합
			if ( n < 10) {
				System.out.print(n + "+");	//1~9까진 + 표기
			} else {
				System.out.print(n + " = "+sum4);	//10일 때 결과값 표기
			}
			
		}
		
		
		
		
	}

}
