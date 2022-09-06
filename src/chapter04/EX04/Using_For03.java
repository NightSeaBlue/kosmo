package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		 // for 문 내의 if 문 사용
		// 정수 (음수,양수) 를 스캐너로 5개 인풋받아서
		// 양수만 더한 값과 평균값을 출력하세요

		Scanner sc = new Scanner (System.in);
		System.out.println("5개의 정수를 입력하세요 ");
		int sum;		// 양수만 합침
		int sum1 = 0;	// 입력한 모든 정수를 합침
		int count;		// 양수만 카운트 함
		double avg;
		int count1 = 0;	// 입력한 모든 정수를 카운트 함
		double avg2;
		sum = 0;
		count = 0;
		avg = 0;
		for (int i = 1 ; i <=5 ; i++) {
			int s = sc.nextInt();
			sum1 += s;	// 입력한 모든 정수의 합
			count1++ ; 
			if (s > 0) {
				sum += s;
				count++;
			} else {
				
			}
		}
		avg = sum / (double)count;
		avg2 = sum1 / (double)count1;
		sc.close();
		System.out.println("양수만 더한 값 : "+ sum + " , 양수 합의 평균 : "+ avg);
		System.out.println("모든 수의 합 : " + sum1 + ", 모든 수의 평균 : " + avg2);
		
		
	}

}
