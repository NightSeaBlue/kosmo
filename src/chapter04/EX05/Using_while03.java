package chapter04.EX05;

import java.util.Scanner;

public class Using_while03 {

	public static void main(String[] args) {
		// "그만" 할 때까지 정수값을 넣어서 합계와 평균을 출력
		// 힌트 : 문자열을 정수로 변환
		// 1. String s = sc.nextline(); 인풋 받는다.
		// 2. s.split(" ") ; <= 공백을 기준으로 잘라서 배열에 저장.
		// 3. 문자형 String 을 정수형으로 변환 , Integer.ParseInt();
		// 4. 합계와 평균을 구한다.
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		do {
			System.out.println("정수를 입력하세요. ");
			s = sc.nextLine();
			int b = 0;
			String [] arr;
			int sum = 0;
			int count = 0;
			arr = s.split(" ");
			for (int i =0 ; i < arr.length ; i++) {
				if (i != 0) {
					b= Integer.parseInt(arr[i]);
					sum += b;
					count++;
				} 
			}
			if (s.equals("그만")) {
				break;
			}
			System.out.println("입력한 정수의 갯수 : " + count);
			System.out.println("정수의 합 : " + sum);
			System.out.println("정수의 평균 : " + sum/(double)count);
			System.out.println("===================================");
			System.out.println();
			
		} while (true);
		System.out.println("프로그램을 종료합니다.");

	}

}
