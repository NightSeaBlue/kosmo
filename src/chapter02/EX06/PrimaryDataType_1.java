package chapter02.EX06;

public class PrimaryDataType_1 {

	public static void main(String[] args) {
		
		// byte < short < int < Long < float < double (정수 크기 순서)
		
		// upcasting : 자동으로 적용, 작은 데이터 파일에서 큰 데이터 타입으로 변환.
		// downcasting : 수동으로 적용해야 함, 큰 데이터 타입에서 작은 데이터 타입으로 변환
		
		// 자바에서 = 왼쪽과 오른쪽은 반드시 데이터 타입이 동일해야 함.
		 // byte, short는 예외로 적용됨.
		
		int a = 10;
		float b = 10.11F;
		
		float c = a + b;		//연산시 작은 데이터 타입이 큰 데이터타입으로 auto upcasting
		System.out.println(c);
		
		//int d = a + b;			//오류 발생 (b 가 float 타입이므로 downcasting 필요)
		int d = a + (int)b;
		System.out.println(d);
		
		//boolean : true or false
		boolean bool1 = true ;
		boolean bool2 = false ;
		System.out.println(bool1);
		System.out.println(bool2);
		
		//정수 : byte, short, int, long
		//기본 값 : int 값으로 정의
		
		
		byte value1 = 10 ;
		short value2 = -10 ;
		int value3 = 100 ;
		long value4 = -100 ;	//int 값이 Long 데이터 타입으로 업캐스팅 되어서 들어감
		
		
		
		
	}

}
