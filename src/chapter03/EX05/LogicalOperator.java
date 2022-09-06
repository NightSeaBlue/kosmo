package chapter03.EX05;

public class LogicalOperator {

	public static void main(String[] args) {
		// 논리연산자 (&& : AND, || : OR, ^ : XOR, ! : NOT)
		// 연산자 좌측과 우측에 True 또는 False 가 와야 함.
		// AND 연산 : &&
		System.out.println(true && true);	//좌,우 모두 True일 경우 True
		System.out.println(true && false);	//좌,우 다를 경우 False
		System.out.println(true && (5<2));	//False
		System.out.println((5<=5) && (7>2)); 	//True
		System.out.println("===========================");
		
		//OR 연산 : || <= 좌,우 중 하나만 True 면 true
		System.out.println(true || true);	//True
		System.out.println(true || false);	//True
		System.out.println(false || (5<2));	//false
		System.out.println((5<=5) || (7>2)); 	//True
		System.out.println("===========================");
		
		//XOR 연산 : ^ <= 좌,우가 동일한 경우 false , 다를 경우 True
		System.out.println(true ^ true);	//false
		System.out.println(true ^ false);	//True
		System.out.println(false ^ (5<2));	//false
		System.out.println((5<=5) ^ (7>2)); 	//false
		System.out.println("===========================");
		
		//NOT 연산 : ! <= 반대로 출력, false <=> true
		System.out.println(!true);	//false
		System.out.println(!false);	//true
		System.out.println(false || !(5<2));	//true
		System.out.println((5<=5) || !(7>2));	//true
		System.out.println("===========================");
		
		
		//비트연산자로 논리 연산을 수행
		System.out.println(true & true);	//true
		System.out.println(true & false);	//false
		System.out.println(true | (5<3));	//true
		System.out.println((5<=5) | (7>2));	//true
		System.out.println("===========================");
		
		//숏 서킷 (Short circuit) : 
		// -- 좌측의 결과 값만으로 유추 가능할 때 오른쪽의 값을 실행하지 않는 것.
		// -- 논리 연산자에서만 작동됨. (&&, ||, ^ , !)
		// -- 비트 연산자에선 작동 불가. (&,|,^,~)
		
		// AND 연산에서 숏 서킷이 발생되는 예제. (좌측에 false가 있는 논리연산에서 발생)
		
		// 논리 연산에선 short circuit이 발생됨.
		int value1 = 3;
		System.out.println(false && (++value1 > 6));	//숏 서킷 작동, 우측 연산 미실시 (false)
		System.out.println(value1);
		
		//논리연산에서는 short circuit이 발생하지 않음.
		int value2 = 3;
		System.out.println(false & (++value2 > 6));		//모두 확인, 숏 서킷 미작동.
		System.out.println(value2);
		System.out.println("==============================");
		
		// OR 연산에서 숏 서킷이 발생되는 예제. (좌측에 true가 있는 논리 연산에서 발생)
		
		int value3 = 3;
		System.out.println(true || ++value3 > 6);
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6);
		System.out.println(value4);
		System.out.println("=========================");

	}

}
