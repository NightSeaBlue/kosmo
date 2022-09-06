package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If05 {

	public static void main(String[] args) {
		// Scanner로 나이를 인풋받아 출력 : 
		/*
		 나이 (age) 가 8세 미만이면 : "취학 전 아동 입니다."
		 						 "입장료는 <1000>원 입니다."
		 나이가 14세 미만이면 : 		"초등학생 입니다."
		 						"입장료는 <2000>원 입니다."
		 나이가 20세 미만이면 : 		"중,고등학생 입니다."
		 						"입장료는 <2500>원 입니다."
		 나이가 20세 이상이면 :		"일반인 입니다."
		 						"입장료는 <3000>원 입니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 >>>");
		int age = sc.nextInt();
		int price = 0;
		
		if (age < 8) {
			price = 1000;
			System.out.println("취학 전 아동입니다.");
		} else if (age<14) {
			price = 2000;
			System.out.println("초등학생 입니다.");
		} else if (age<20) {
			price = 2500;
			System.out.println("중,고등학생 입니다.");
		} else {
			price = 3000;
			System.out.println("일반인 입니다.");
		}
		System.out.println("입장료는"+ price + "입니다.");
		sc.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
