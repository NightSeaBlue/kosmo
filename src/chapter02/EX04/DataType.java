package chapter02.EX04;

public class DataType {
	public static void main(String[] args) {
		/*
		 자바의 자료형
		 	- 기본 자료형 8가지 : 첫자가 소문자
		 		- boolean 	: true, false
		 		- byte 		: 정수 (1byte = 8bit) ,  -2^7 ~ +2^7 -1
		 									 -128 ~ +127
		 		- short		: 정수 (2byte = 16bit) ,	-2^15 ~ +2^15-1
		 											-32,768 ~ +32,767
		 		- int		: 정수 (4byte = 32bit) , 	-2^31 ~ +2^31-1
		 		- long		: 정수 (8byte = 64bit) , 값을 할당할 때 1234L
		 											-2^63 ~ +2^63-1	
		 		- float		: 실수 (4byte) , 값을 할당할 때 123.45F
		 		- double	: 실수 (8byte)
		 		- char		: 문자 , ''
		 		
		 		
		 	- 참조 자료형 무한대 : 첫자가 대문자  <String은 참조 자료형이다.>
		 		- String : 문자열 , ""
		 		 배열, 클래스 / 인터페이스
		*/
		
		boolean aaa ;	//true, false
		aaa = true; aaa = false;
		System.out.println(aaa);
		
		
		byte bbb ;		//정수 값만 할당 가능 , 1byte = 8bit
		bbb = -128;		// -128 ~ +127 할당가능
		System.out.println(bbb);
		
		byte bb;
		byte cc;
		//bb = 128 ;		byte의 범위를 초과한 값은 입력 불가능
		bb = (byte)128;		// -128
		cc = (byte)129;		// -127
		System.out.println("bb의 출력값 : "+bb);
		System.out.println("cc의 출력값 : "+cc);
		
		
		short ccc ;		//-32768 ~ +32767
		ccc = -32768;
		System.out.println(ccc);
		
		short abc ;
		abc = 32767;	//short에서 입력 가능한 양의 최댓값
		abc = (short)32768;
		System.out.println("abc 변수의 출력값 : "+abc);
			
		int ddd ;
		ddd = 123456789;
		System.out.println(ddd);
		
		long eee ;
		eee = 1234567891234567L ;	//long 값을 넣을 때 L을 붙여야 한다.
		
		
	}
}
