package Review02;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Test_성적관리 {

	public static void main(String[] args) {
		// 학생 수 입력 후 각 학생별 점수 총점 및 평균 , 각 과목별 총점 및 평균 구하기
		// 1 : 88/77/66 2: 50/40/70 3: 44/33/22 4: 55/50/70
		Scanner sc = new Scanner (System.in);
		System.out.println("성적을 입력할 학생 수 >> ");
		int scount = sc.nextInt();
		sc.nextLine();

		// 성적 입력
		int score [][] = new int [scount][scount-1];	// 2차원 배열 설정  , 학생 별 성적 입력
		
		for (int i = 0; i < scount ; i++) {
			System.out.println(i+1+"번째 학생의 성적 입력 >>> ");
			String inputData = sc.nextLine();	// 성적 인풋 받음
			StringTokenizer st = new StringTokenizer (inputData,"/");	// 성적을 / 단위로 쪼개기
			for (int j = 0 ; st.hasMoreTokens();j++) {	// Token 이 있을경우 j 값을 증가
				String str = st.nextToken();	// Token의 값을 str 에 할당
				score [i][j] = Integer.parseInt(str);	// 할당된 str을 정수로 변환 후 각 행렬에 할당
			}
		}
		
		// 학생별 성적 총점 및 평균 구하기
		for (int i = 0; i < scount ;i++) {
			int sum = 0;	// 학생 총점
			double avg = 0.0;	// 학생 평균
			for (int j=0; j < scount-1 ; j++) {
				sum+=score[i][j];
				avg=sum/(double)(scount-1);
			}
			System.out.printf("%d 번째 학생의 총점은 %d 이고 평균은 %.2f 입니다.\n",i+1,sum,avg);
			sum=0;
			}
		System.out.println("============================");
		
	

	// 과목별 총점 및 평균 구하기
	int kscore=0;
	int escore=0;
	int mscore=0;
	double kavg = 0.0;
	double eavg = 0.0;
	double mavg = 0.0;

	for (int i = 0 ; i<score.length; i++) {
		kscore+=score[i][0];
		escore+=score[i][1];
		mscore+=score[i][2];
		kavg=kscore/(double)(scount-1);
		eavg=escore/(double)(scount-1);
		mavg=mscore/(double)(scount-1);
	}
	System.out.printf("국어과목 총점은 %d 이고 평균은 %.2f 입니다.\n",kscore,kavg);
	System.out.printf("영어과목 총점은 %d 이고 평균은 %.2f 입니다.\n",escore,eavg);
	System.out.printf("수학과목 총점은 %d 이고 평균은 %.2f입니다.\n",mscore,mavg);






}




}


