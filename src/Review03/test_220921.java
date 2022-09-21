package Review03;

import java.util.Scanner;

public class test_220921 {
	//1. 소문자 입력시 true , 아닐시 false 반환 하는 checkLower 함수 생성
	static boolean checkLower (char ch) {
		if (ch >= 'a'&& ch<='z') {	
			return true;		// 입력된 문자가 소문자일 경우 true 로 반환
		} else {
			return false;		// 아닐 경우 false
		}
	}
	
	//2. 소문자 입력시 대문자 , 대문자 입력시 그대로 문자로 반환하는 checkUpper 함수 생성
	static char checkUpper (char ch) {
		if (ch >= 'a' && ch <= 'z') {	// 입력된 문자가 소문자일 때
			return (char)(ch-32);	// 아스키 코드 기준 소문자와 대문자의 차이는 32
		} else return ch;
	}
	
	//3. 조건이 다양한 함수 multiple 생성
	static void multiple (int a, int b) {
		System.out.println(a*b);		// 정수 두개를 입력하면  곱으로 반환
	}
	
	static void multiple (int a, char b) {
		for (int i = 0 ; i < a; i++) {
			System.out.print(b);		// 정수 1개 문자 1개를 입력하면 정수만큼 문자 출력
		}
		System.out.println();
	}
	
	static void multiple (int a, int b, char c) {
		char [][] arr = new char [a][b];
		for (int i = 0 ; i <a ; i++) {
			for (int j = 0 ; j < b ; j++) {
				arr[i][j] = c;		// 정수 2개와 문자 1개를 받을 입력하면 , 정수 * 정수 만큼의 2차원 배열을 생성
									// 배열의 각 행의 열에 문자 할당
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// #1.
		Scanner sc = new Scanner (System.in);
		System.out.println("checkLower를 이용할 문자를 입력하세요. >> ");
		char a = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("=== 문제 1번 출력 ===");
		boolean q1 = checkLower(a);
		System.out.println(q1);
		System.out.println();
		
		// #2.
		System.out.println("checkUpper를 이용할 문자를 입력하세요. >>");
		char b = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("=== 문제 2번 출력 ===");
		char a1 = checkUpper (b);
		System.out.println(a1);
		System.out.println();
		sc.close();
		
		
		// #3.
		System.out.println("multiple 을 사용할 문자열을 입력하세요 >> ");
		System.out.println("=== 문제 3번 출력 ===");
		multiple (2,3);
		multiple (4,'ㅋ');
		multiple (2,3,'ㅋ');
		
		

	}

}
