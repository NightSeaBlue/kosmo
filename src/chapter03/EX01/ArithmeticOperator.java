package chapter03.EX01;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// 연산자
		//1. 산술 연산자 (+,-,*,/,%(나머지 값))
		System.out.println(2+3);
		System.out.println(8-5);
		System.out.println(7*2);
		System.out.println(7/2);		 //몫만 출력, int value로 출력
		System.out.println(7.0/2.0);	 // 몫과 나머지 함께 출력 (double value)
		System.out.println(8%5);		//나머지 값만 추출 , int value로 출력
		System.out.println("=====================");
		
		
		//2. 증감 연산자 : case1
			//++ : 리터럴 값을 1씩 증가
			//-- : 리터럴 값을 1씩 감소
		int value1 = 3;
		value1++;		
		System.out.println(value1);
		
		int value2 = 3;
		++value2;		
		System.out.println(value2);
		System.out.println("=================");
		
		
		
		//2. 증감 연산자 : case2
		int value3 = 3;
		int value4 = value3++;
		
		System.out.println(value3);		//출력값 4 (변수의 리터럴값이 먼저 증가된 값이 입력되어 있음)
		System.out.println(value4);		//출력값 3 (변수 리터럴값 인식 이후 증가됨. 따라서 초기 입력값 출력)
		System.out.println("================");
		
		int value5 = 3;
		int value6 = ++value5;
		System.out.println(value5);		//출력값 4 (변수 리터럴값 증가된 값 출력)
		System.out.println(value6);		//출력값 4 (변수 리터럴값 인식 이전 증가, 따라서 초기 입력값에서 1 증가된 상태로 출력)
		System.out.println("================");
		
		int value7 = 3;
		int value8 = value7--;
		System.out.println(value7);
		System.out.println(value8);
		System.out.println("==============");
		
		int value9 = 3;
		int value10 = --value9;
		System.out.println(value9);
		System.out.println(value10);
		System.out.println("===============");
		
		
		//2.증감 연산자 case 3
		int value11 = 3;
		int value12 = 4;
		int value13 = 2+value11-- + ++value12;
		System.out.println(value11);		// value11-- 에 의거 초기 레터럴 값에서 1 감소된 값 출력
		System.out.println(value12);		// ++value12 에 의거 초기 레터럴 값에서 1 증가된 값 출력
		System.out.println(value13);		// value11-- 에 의거 초기 레터럴 값 그대로 ++value 12는 초기 레터럴 값에서 1 증가된 값으로 연산
		
		
		
		
		
		
		
	}

}
