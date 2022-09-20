package Review02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test_성적관리_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 학생수를 입력하세요. : ");
		int num = sc.nextInt();
		System.out.println();

		int[][] score = new int [num][3]; //점수 입력받을 배열
		int st_sum = 0; //학생별 총점


		//점수 입력
		for(int i=0;i<num;i++){
		System.out.printf("%d째 학생의 성적을 입력 -> ",i+1);
		String inputData = sc.next(); // 10/20/30
		StringTokenizer st = new StringTokenizer(inputData, "/");
		for(int j=0;st.hasMoreTokens();j++){
		String str = st.nextToken();
		score[i][j] = Integer.parseInt(str);
		}
		}

		//학생별 결과 출력
		System.out.println();
		for(int i=0;i<num;i++){
		for(int j=0;j<3;j++){
		st_sum += score[i][j];
		}
		System.out.printf("%d째 학생의 총점 %d이고 평균은 %.2f 입니다. \n",i+1,st_sum,st_sum/3.0);
		st_sum = 0;
		}

		//과목별 결과 출력
		int kor = 0;
		int eng = 0;
		int math = 0;

		for(int i=0;i<num;i++){
		kor += score[i][0];
		eng += score[i][1];
		math += score[i][2];
		}
		System.out.println("---------");
		System.out.printf("국어과목 총점 %d 이고 평균은 %.2f 입니다.\n",kor,(double)kor/num);
		System.out.printf("영어과목 총점 %d 이고 평균은 %.2f 입니다.\n",eng,(double)eng/num);
		System.out.printf("수학과목 총점 %d 이고 평균은 %.2f 입니다.\n",math,(double)math/num);

		sc.close();

	}

}
