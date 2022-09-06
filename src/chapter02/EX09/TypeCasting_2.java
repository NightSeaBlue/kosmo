package chapter02.EX09;

public class TypeCasting_2 {

	public static void main(String[] args) {
		
		//#1. 같은 자료형 간 연산
		int value1 = 3 + 5;
		int value2 = 8 / 5;	 /* 주의 : 나눗셈을 할 경우 int타입으로 정의되면
		 							 부정확한 값이 출력될 수 있음.*/
		double value2_1 = 8 / 5;	//부정확한 값 출력 (1.0)
		double value2_2 = 8.0 / 5;	//실수/정수의 경우 실수 type으로 출력 정확한 값 출력 (1.6)
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0 / 5.0;	
		
		//byte, short를 연산을 하는 경우 정수(int)로 처리해야됨.
		byte data1 =3;
		byte data2 =5;
		
		short data3 = 7;
		short data4 = 9;
		
		//byte value5 = data1 + data2;	//오류 발생
		int value5 = data1 + data2;		//byte, short 연산 후 int 타입으로 처리해야 함.
		int value5_2 = data3 + data4;
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value2_1);
		System.out.println(value2_2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value5_2);
		
		System.out.println("=================");
		
		//#2. 다른 자료형 간의 연산	(작은 자료형이 큰 자료형으로 자동 업캐스팅)
		
		//int value6 = 5 +3.5; 	//오류 발생 (자료를 int type으로 downcasting 필요)
		int value6 = (int) (5 +3.5);
		
		double value7 = 5 + 3.5 ;
		int value7_1 = 5 + (int)3.5;
		
		double value8 = 5/2.0;
		byte data33 = 3;
		short data44 = 5;
		int value9 = data33 + data44;	//주의 : byte, short 연산은 int로 처리
		double value10 = data33 + data44;
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value7_1);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		
	}

}
