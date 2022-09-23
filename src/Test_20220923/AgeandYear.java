package Test_20220923;

import java.util.Calendar;
import java.util.Scanner;

public class AgeandYear {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("태어난 년도를 입력하세요 >> ");
		int year = sc.nextInt() ;		// 출생년도를 입력받을 수 있는 변수
		int age  ;						// 나이를 저장할 수 있는 변수
		
		Calendar c = Calendar.getInstance();	// Calendar 클래스 활용
		int year2 = c.get(Calendar.YEAR);		// 현재 년도 할당
		
		age = year2-year+1;
		
		System.out.println("출생 년도 : " + year+ " 나이 : "+age);
		
		sc.close();

	}


}
