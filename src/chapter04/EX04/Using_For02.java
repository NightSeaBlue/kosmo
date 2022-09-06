package chapter04.EX04;

import java.util.Scanner;

public class Using_For02 {
	public static void main(String[] args) {
		
		//for 문을 사용해서 scanner로 5개의 값을 인풋 받아 출력
		Scanner sc = new Scanner (System.in);
		
		String s ;
		for ( int i = 0 ; i < 5 ; i++) {	//스캐너로 5번 인풋받아 출력
			s = sc.next();
			System.out.println(s);
			sc.close();
			
		}
		
		//for 문 내에서 변수 선언시 for 문 내에서만 사용
		//		- class 내에서 재사용 가능.
		int a;	//전역 변수 : for 밖,안 <= 모두 사용 가능
		a = 0;
		for (int i = 0 ; i < 3 ; i++) {	
			// i : 지역 변수 , for 문 내에서만 사용
			System.out.println(i);
			System.out.println(a);
		}
		System.out.println(a);
	}
}
