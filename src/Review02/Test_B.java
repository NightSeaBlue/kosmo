package Review02;

import java.util.Scanner;

public class Test_B {
	public static void main(String[] args) {
		// 369 Ver2
		Scanner sc = new Scanner (System.in);
		System.out.println("num을 입력하세요 >>");

		int num = sc.nextInt();	// 입력받은 num 값
		if (num <1 | num >100000) {
			System.out.println("1에서 10만까지 제한된 수를 입력해주세요");
		}
		int count =0;	// 박수치는 횟수

		for (int i = 1; i<=num; i++) {	// i 가 num 과 같거나 작을 경우 i를 num 까지 증가시키며 반복
			int su = i;		// i 값을 할당 받을 임의의 변수 설정 
			boolean su369 = false;	// 임의의 논리 변수 false 값 할당
			while(su!=0) {
				int na = su % 10;	// 입력받은 값의 10의 자리와 1의 자리 분리
				if(na==3|na==6|na==9) {	// 1의 자리 값이 3,6,9일 경우
					su369 = true;	// 논리변수에 true 할당
					count+=1;
					
				}
				su=su/10;	// 입력받은 값의 10의 자리 계산
			}
			//#2
			/*if (i==3) {
				System.out.print(i);
				
			} else if (su369) {
				System.out.print(","+i);
			}*/
			//#1
			if(su369) {	// su369 값이 true 일 때 결과 출력
				System.out.print("짝!"+"("+i+")");
				if(i==num) break;
				System.out.print("-");
			}
			else {
				System.out.print(i);	// su369 값이 false 일 때 결과 출력
				if(i==num) break;
				System.out.print("-");
			}
			
		}
		System.out.println("에 숫자 3,6,9 가 포함되어 총 "+count+"회 손뼉을 칩니다.");
	}
}
