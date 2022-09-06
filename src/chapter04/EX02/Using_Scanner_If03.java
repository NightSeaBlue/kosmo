package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If03 {

	public static void main(String[] args) {
		// if문에서 String 문자열 비교.
			// -- 기본 자료형에서 변수의 값이 같다 : ==
			// -- 참조 자료형에서 변수의 값이 같다 : 변수명.equals("비교값")
				// String 변수의 값을 비교할 때 : equals() 메소드를 사용해야 한다.
		
		Scanner sc = new Scanner(System.in);		// sc 객체 생성

		System.out.println("주문할 커피를 고르세요 >>>");
		String order = sc.next();
		
		if (order.equals("아메리카노")) {
			System.out.println("당신이 주문한 커피는 : "+order+"입니다.");
		} else if (order.equals("카푸치노")) {
			System.out.println("당신이 주문한 커피는 : "+order+"입니다.");
		} else if (order.equals("카페라떼")||order.equals("카페라테")) {
			System.out.println("당신이 주문한 커피는 : "+order+"입니다.");
		} else if (order.equals("아포카토")) {
			System.out.println("당신이 주문한 커피는 : "+order+"입니다.");
		} else {
			System.out.println("매장에서 서비스를 하지 않습니다.");
		}
		sc.close();		//sc 객체 메모리에서 삭제.
		
	}

}
