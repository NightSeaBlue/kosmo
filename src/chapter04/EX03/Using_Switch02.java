package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		// switch 문으로 처리 ""
		// 에스프레소, 카페라떼, 아포카토 주문할 경우 가격이 3,500원 (Equals)
				// 아메리카노를 주문할 경우 : 2,500원
				// 그외의 메뉴를 주문할 경우 : 우리 매장에 없는 메뉴입니다.
				
				//출력 : "주문하신 <메뉴>는 가격이 <금액>원 입니다."

		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하실 커피를 고르세요 >>>");
		String order = sc.next();
		int price = 0;
		
		switch (order) {
		case "에스프레소" : case "카페라떼" : case "아포카토" :
			price = 3500;
			System.out.println("주문하신 "+order+"의 가격이 "+price+"원 입니다.");
			break;
		case "아메리카노" :
			price = 2500;
			System.out.println("주문하신 "+order+"의 가격이 "+price+"원 입니다.");
			break;
		default :
			System.out.println("우리 매장에 없는 메뉴입니다.");
		}
		sc.close();
	}

}
