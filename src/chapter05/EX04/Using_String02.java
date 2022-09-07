package chapter05.EX04;

public class Using_String02 {

	public static void main(String[] args) {
		// String 변수에 값을 할당하는 방법
		// 		1. 객체 생성방법으로 값을 할당 (생성자)	// 별도의 주소 공간에 값을 할당 (동일한 문자열)
		//		2. 리터럴 방식으로 값을 할당.			// 주소공간을 공유 (동일한 문자열일 경우)
		// 		== : Stack 공간의 값을 비교 ( 참조 자료형 : Stack(주소) , Heap (값) )
		//							   ( 기본 자료형 : 스택 (값) )
		//		equals()  :  참조 자료형일 때 힙 영역의 값을 비교
		
		
		String str1 = new String("안녕");		// 객체 생성
		String str2 = "안녕";		// 리터럴
		String str3 = "안녕";		// 리터럴
		String str4 = new String("안녕");		// 객체 생성
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("===========================");
		
		
		// == : 참조 자료형일 경우 Stack의 힙 영역 주소 비교.
		System.out.println(str1 == str4);		// 별개의 주소를 가짐 (false)
		System.out.println(str2 == str3);		// 동일한 주소를 가짐 (true)
		
		
		// equals() : 참조자료형의 값을 비교
		System.out.println(str1.equals(str2));	//true
		System.out.println(str2.equals(str4));	//true
		System.out.println(str3.equals(str4));	//true

	}

}
