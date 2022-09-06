package chapter02.EX08;

public class TypeCasting_2 {

	public static void main(String[] args) {
		//1. 자동타입 변환 (upcasting)
		float value1 = 3;		//int 3이 float type으로 자동 업캐스팅
		long value2 = 5;		//int 5가 long type으로 자동 업캐스팅
		double value3 = 7;		//int 7이 double type으로 자동 업캐스팅
		
		byte value4 = 9;		// 예외) int to byte로 자동 다운캐스팅
		short value5 = 11;		// 예외) int to short로 자동 다운캐스팅
		
		
		//2. 수동타입 변환 (downcasting)
		byte value6 = (byte)128;		//byte 범위 초과 (int to byte downcasting)
		int value7 = (int)3.5;		//int 범위 초과 (double to int downcasting), 실수의 정수화
		float value8 = (float)7.5;		//double type downcasting 필요 (double to float downcasting)
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		

	}

}
