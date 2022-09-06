package chapter04.EX02;

import java.util.Scanner;		//Scanner typing 후 ctrl + shift + O

public class Using_Scanner02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//콘솔에서 인풋할 때 : 공백으로 한꺼번에 변수값 할당.
				// 		  엔터를 사용해서 하나씩 값 할당.
		//주의 : 자료형과 변수의 갯수에 잘 맞춰서 인풋해야 함.
		
		System.out.println("이름(문자열) , 나이(정수), 몸무게(실수) "
				+ " 공백으로 구분해서 입력하세요.>>> ");
		
		String aa = sc.next();		//콘솔 인풋, 문자열
		int bb = sc.nextInt();		//콘솔 인풋, 정수
		double cc = sc.nextDouble();	//콘솔 인풋, 실수
		
		System.out.printf("당신의 이름은 %s 이고, 나이는 %d 세이고, "
				+ "당신의 몸무게는 %1.1f kg 이다.\n",aa, bb, cc); 
		
		System.out.print("당신의 이름은 "+aa+" 이고, 나이는 "+bb+" 세이고, "
				+ "당신의 몸무게는 "+cc+" kg 이다.\n");

		sc.close();
		
	}

}
