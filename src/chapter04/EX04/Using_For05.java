package chapter04.EX04;

import java.util.Scanner;

public class Using_For05 {
	public static void main(String[] args) {
		
		//이중 for 문을 사용해 1~9단 구구단 만들기
		/*		\n : enter, \t : tab
		 		1*1 = 1 1*2 = 2 ... 1*9 = 9 형태
		 */
		System.out.println("==============================================");
		for (int a = 1 ; a < 10; a += 1) {
			for (int b = 1 ; b <= 9; b++) {
				int c = a * b ;
			System.out.print(a+"*"+b+"="+c+"\t");
		}
		System.out.println();
	 }
		System.out.println("=============================================");
		
		//1단 ~ 19단 까지 3의 배수단만 출력
		
		for (int a = 1 ; a < 19 ; a+=1) {
			for (int b =1; b < 19 ; b++) {
				int c = a*b ;
				if (a % 3==0) {
					System.out.print(a+"*"+b+"="+c+"\t");
				}
			}
			if (a % 3 == 0) {
				System.out.println();
			}
		}
		System.out.println("=========================");
		
		
		// 스캐너에서 입력 받은 단만 출력 (1~9단)
		// 출력할 단을 입력하세요 (1~9단) >>>
		// ===================
		// 1 * 1 = 1
		// 1 * 2 = 2
		// ...
		// 1 * 9 = 9
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("출력할 단을 입력하세요. (1~9단) >>> ");
		int s =sc.nextInt();
		
		for (int a = 1 ; a<=9; a++) {
			if (s<=9 ) {
			System.out.println(s+ "*" + a +"=" + s*a);
		} else {
			System.out.println("단의 입력을 다시 하시기 바랍니다.");
			break;
		}
		}
		sc.close();
		
		
		
		
	}		
	
}
