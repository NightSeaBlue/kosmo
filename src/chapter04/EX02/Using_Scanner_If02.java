package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If02 {

	public static void main(String[] args) {
		
		// 점수와 학년을 인풋 받아 60점 이상이면 합격, 미만이면 불합격
			// 4학년인 경우 70 이상이면 합격, 중첩 if 문 사용. (if 문 내에 if 문)
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("학년을 입력하세요.>>>");
		
		int grad = sc.nextInt();
		
		System.out.println("성적을 입력하세요.>>>");
		
		int score = sc.nextInt();
		
		if (score >= 60) { 
			if (grad != 4) {
			System.out.println("합격");
			} else if (score >= 70) {
			System.out.println("합격");	 		
			} else {
			System.out.println("불합격");
			}
		} else {
			System.out.println("불합격");
		}
			
		sc.close();
		
	}

}
