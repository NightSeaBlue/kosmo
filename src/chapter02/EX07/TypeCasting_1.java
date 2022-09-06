package chapter02.EX07;

public class TypeCasting_1 {

	public static void main(String[] args) {
		//1. How to Cast
		// - 캐스팅 방법 1 (데이터 타입을 명시)
		int value1 = (int)5.3;	//실수는 기본값이 double 임. 따라서 int형으로 downcasting 필요
		long value2 = 10;		// int 10이 long 형으로 자동 업캐스팅
		float value3 = (float)5.8; // float 형으로 downcasting  
		double value4 = 16;		// int 16이 double 형으로 자동 업캐스팅
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		
		// - 캐스팅 방법 2 (L,F)
		// 정수 리터럴 기본 값 int, 실수 리터럴 기본값 double
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float value8 = 5.8f;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		
		
	}

}
