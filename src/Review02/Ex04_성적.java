package Review02;

import java.util.Scanner;

public class Ex04_성적 {

	public static void main(String[] args) {
		// 배열을 활용한 성적 입력
		
		Scanner input = new Scanner (System.in);
		
		int kor [] = new int [5];
		
		for (int i = 0 ; i < kor.length; i++) {
			System.out.println(i+"번의 학생의 국어 점수를 입력 >>");
			kor [i] = input.nextInt();
		}
		
		// 출력
		for (int i = 0 ; i <kor.length ; i++) {
			System.out.println(i+"번 학생의 점수 : "+kor[i]);
		}
		
		// 위 학생들 점수의 총점과 평균을 출력
		int sum = 0;	// 총점에 해당하는 변수
		double avg = 0;	// 평균에 해당하는 변수
		
		for (int i = 0 ; i<kor.length ; i++) {
			sum = sum+kor[i];	//각 열의 값을 더함 , i 번 반복
			avg = sum / kor.length ;	// 더해진 값을 열의 갯수만큼 나눠줌
		}
		System.out.println("점수의 총 합 : "+sum +" , "+"점수의 총 평균 : "+ avg);
		input.close();

	}

}
