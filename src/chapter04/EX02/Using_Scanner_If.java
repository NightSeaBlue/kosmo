package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If {
	
	public static void main(String[] args) {
	
		// 문제 : Scanner로 정수값을 인풋 받아서
		// 국어점수(aa) , 영어점수(bb), 수학점수(cc), 과학점수(dd), 음악점수(ee)를 인풋 받습니다.
		// 평균은 Double을 활용해 계산합니다.
		// if 문을 사용해서 평균이 90점 이상이면 "A학점", 80점 이상 "B학점"
		// 70점 이상 "C학점", 60점 이상 "D학점", 나머지 "F학점"
		Scanner sc = new Scanner (System.in);
		
		System.out.println("국어, 영어, 수학, 과학, 음악 점수를 공백으로 구분해 입력하세요.");
		
		int aa = sc.nextInt();
		int bb = sc.nextInt();
		int cc = sc.nextInt();
		int dd = sc.nextInt();
		int ee = sc.nextInt();
		
		System.out.print("당신의 국어 점수는 "+aa+" 점, 영어 점수는 "+bb+" 점, 수학 점수는 "+cc+" 점, 과학 점수는 "+dd+" 점, 음악 점수는 "+ee+" 점 입니다.\n");
		
		double avg = (aa+bb+cc+dd+ee) / 5.0;
		
		System.out.print("당신의 평균 점수는 "+avg+" 점 입니다.\n");
		
		if (avg >= 90) {
			System.out.println("A학점");
		} else if (avg >= 80) {
			System.out.println("B학점");
		} else if (avg>= 70) {
			System.out.println("C학점");
		} else if (avg>= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		System.out.println("==================");
		sc.close();		//객체 제거
		
	}
}
