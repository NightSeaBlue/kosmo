package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If04 {

	public static void main(String[] args) {
		// 에스프레소, 카페라떼, 아포카토 주문할 경우 가격이 3,500원 (Equals)
		// 아메리카노를 주문할 경우 : 2,500원
		// 그외의 메뉴를 주문할 경우 : 우리 매장에 없는 메뉴입니다.

		
		//출력 : "주문하신 <메뉴>는 가격이 <금액>원 입니다."
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("주문하실 커피를 고르세요 >>>");
		String order = sc.next();
				
		if (order.equals("에스프레소")||order.equals("카페라떼")||order.equals("아포카토")) {
			String price = "3,500";
			System.out.printf("주문하신 <%s>의 가격이 <%s>원 입니다.",order,price);
		} else if (order.equals("아메리카노")) {
			String price = "2,500";
			System.out.printf("주문하신 <%s>의 가격이 <%s>원 입니다.",order,price);
		} else {
			System.out.println("우리 매장에 없는 메뉴입니다.");
		}
		sc.close();
	}

}
