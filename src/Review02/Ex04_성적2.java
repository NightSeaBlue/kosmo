package Review02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적2 {

	public static void main(String[] args) {
		// 배열을 활용한 성적 입력

		Scanner input = new Scanner (System.in);

		int kor [] = new int [3];
		
		/*
		 *  3명의 국어 점수를 입력하세요 (ex. 10/20/30)
		 */
		
		System.out.println(kor.length+"명의 국어 점수를 입력하세요.(ex. 10/20/30)");
		String inputData = input.nextLine();
		StringTokenizer st = new StringTokenizer(inputData, "/");	// 입력 받은 문자열을 / 기준으로 분리
		for(int i = 0; st.hasMoreTokens();i++) {	// hasMoreTokens : Token 이 존재할 경우 그 수를 측정 / i가 0 이고 , token이 있을 경우 , i를 1씩 증가시켜 반복
			String str = st.nextToken();		// 문자열 str 에 다음에 오는 토큰을 할당한다.
			kor[i] = Integer.parseInt(str);	// 할당한 문자열을 정수 값으로 변환
		}input.close();

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

	}

}
