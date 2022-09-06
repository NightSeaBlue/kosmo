package chapter05.EX01;

import java.util.Scanner;

public class Using_Array09 {
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner (System.in);
		
		//라인 전체를 통채로 인풋 받음	>> 국어 영어 수학 과학
		//	sc.next ()		// 국어
		// 	sc.nextLine()	// 국어 영어 수학 과학
		// 문자열을 입력하세요 (라인 전체) >>
		System.out.println("문자열을 입력하세요 (라인 전체) ");
		String s1 = sc.nextLine();
		System.out.println(s1);
		System.out.println("==========================");
		
		System.out.println("문자열을 입력하세요 (한단어 : 문자열) ");
		String s2 = sc.next();
		System.out.println(s2);
		System.out.println("==========================");
		
		
	}
}
