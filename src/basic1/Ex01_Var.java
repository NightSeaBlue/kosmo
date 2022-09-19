package basic1;

//import java.lang.*;			// Auto input;

/*
 *	자료형 (Data Type)
 *	1. 기본형
 *		boolean
 *		char
 *		int / long
 *		double
 *
 *	2. 참조형
 *		` 클래스
 *		` 배열
 *		-> new 예약어를 통해 작성	
 *
 *
 *	(*) String
 */

public class Ex01_Var { 	//extends Object { (Auto input)
	
	// * 멤버 변수 : Class 가 공유하는 변수 (Auto clear)
	// 변수를 정의하면 null , 0 할당.

	public static void main(String[] args) {
		//	* 지역 변수 : main 내에서 사용되는 변수
		
		
		// 문자열 변수 a 선언
		String a = null;
		
		// 정수 변수 b 선언
		int b = 0;
		
		// 변수 b 에 200 대입
		b = 200;
		// 변수 a 에 "Hello" 지정
		a = "Hello";
		// ***** = 
		// a = new String ("Hello");
		
		// 변수 a 와 b 콘솔에 출력
		System.out.println(a+" "+b);
		

	}

}
