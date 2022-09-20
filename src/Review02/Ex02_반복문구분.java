package Review02;

import java.util.Scanner;

/*
 *  for : 반복횟수가 정해진 경우
 *  while : 횟수를 모르는 경우
 *  do~while : 횟수를 모르는 경우 (조건을 나중에 비교)
 */

// Ctrl + A : 전체 선택 / Ctrl + i 줄 맞춤
public class Ex02_반복문구분 {

	public static void main(String[] args) {

		// 구구단의 단수를 입력받아 해당 단의 구구단을 출력
		Scanner sc = new Scanner (System.in);

		// 1. for 문

		/*System.out.println("몇번 반복을 할까요?");	// n 회 반복 입력
		int su = sc.nextInt();
		for (int i = 0 ; i <su ; i++) {
			System.out.println("구구단의 단 수를 입력해주세요(1부터 9까지) >> ");
			int n = sc.nextInt();
			int x = 0;
			for (int j = 1; j<=9 ; j++) {
				x=n*j;
				System.out.print(x+ " ");
				
			}
			System.out.println();
		}*/
		
		// 2. while 문
		/*while (true) {
			System.out.println("구구단의 단 수를 입력하세요 >> (1부터 9까지)");
			int n = sc.nextInt();	// 입력한 숫자 enter 까지 인식
			for (int i =1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n",n,i,n*i);
			}
			System.out.println("반복을 종료(Y)");		// 구구단의 반복 종료
			sc.nextLine();		// 무의미하게 입력한 enter 정리
			String answer = sc.nextLine();	// Y 를 받을 변수
			if(answer.equalsIgnoreCase("Y")) break;		// 대 소문자 관계없이 인식
		}
		*/
		
		//3. do~while 문
		int n = 0;
		String answer = null;
		do {	// 해당 구문 출력
			System.out.println("== 구구단의 단 수를 입력하세요 ==");
			n = sc.nextInt();
			if (n>9|n<=0) {
				System.out.println("값을 다시 입력해주세요.");
				continue;
			}
			for (int i =1 ; i<=9; i++) {	// 구구단 계산
				System.out.printf("%d*%d=%d"+" ",n,i,n*i);
			}
			System.out.println();
			System.out.println("반복을 종료하시겠습니까? (Y)");		// 구구단의 반복 종료?
			sc.nextLine();
			answer = sc.nextLine();
			if(answer.equalsIgnoreCase("Y")) break;	// y,Y 를 받았을 때 구구단 반복 종료
		} while (true); 	// 내부 입력값이 true 인 동안 구문 반복 진행

	}

}
