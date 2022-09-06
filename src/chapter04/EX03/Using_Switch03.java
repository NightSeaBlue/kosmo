package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		/*
		 문제 1. 스캐너로 "Gold"를 넣으면 "금메달 입니다."를 출력.
		 		스캐너로 "Silver"를 넣으면 "은메달 입니다."를 출력.
		 		스캐너로 "Bronze"를 넣으면 "동메달 입니다."를 출력.
		 		그 외 : "메달을 획득하지 못했습니다."
		 		
		 문제 2. 스캐너로 월을 인풋 받아서 해당 월의 총 날짜를 출력.
		 		" <월>은 <며칠>일 까지 있습니다. "
		 */

		Scanner sc = new Scanner(System.in);
		
		// Question 1.
		System.out.println("메달을 입력해 주세요 : ");
		String medal = sc.next();
		
		switch (medal) {
			case "Gold" : 
				System.out.println("금메달 입니다.");
			break;
			case "Silver" :
				System.out.println("은메달 입니다.");
				break;
			case "Bronze" :
				System.out.println("동메달 입니다.");
				break;
			default :
			System.out.println("메달을 획득하지 못했습니다.");
		sc.close();
		
		}
		
		
		System.out.println("========================");
		
		// Question 2.
		System.out.println("월을 입력하세요 : ");
		Scanner sc2 = new Scanner(System.in);
		String month = sc2.next();
		
		int day = 0;
		
		switch (month) {
		case "1월" : case "3월" : case "5월" : case "7월" : case "8월" : case "10월" : case "12월" :
			day = 31;
			System.out.println(""+month+"은 "+day+"일까지 있습니다.");
			break;
		case "2월" :
			day = 28;
			System.out.println(""+month+"은 "+day+"일까지 있습니다.");
			break;
		case "4월" : case "6월" : case "9월" : case "11월" :
			day = 30;
			System.out.println(""+month+"은 "+day+"일까지 있습니다.");
			break;
		default :
			System.out.println("월을 다시 입력해주세요.");
		}
		sc2.close();
		
	

	}
		
}
