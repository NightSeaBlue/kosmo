package basic1;

import java.util.Scanner;

public class EX02_control02 {

	public static void main(String[] args) {
		// 학번을 통한 학생 신원 확인
		
		
		// 콘솔을 통해 학번을 인풋 받음.
		Scanner sc = new Scanner (System.in);
		System.out.println("학번을 입력해주세요 >> ");
		String id = sc.nextLine();
		
		// 맨 앞의 네자리는 입학 년도, 다섯번째 문자는 단과대 번호
		String num = id.substring(0,4);
		System.out.println("입학년도 : "+num);
		char cls = id.charAt(4);
		System.out.println("단과대 번호 :"+cls);
		//뒤의 두자리는 각 학과 번호
		String edu = id.substring(5,7);
		int edu1 = Integer.parseInt(edu);	// 학과 번호에 해당하는 배열을 숫자로 변환 , switch 작동
		String edu2 = null;	// 공대 , 사회대 지정
		System.out.println("학과 번호 : "+edu);
		System.out.println("=== 학생 기초 정보 확인 ===");
		String edu3 = null;		// 학과 지정
		// 공대 : 11 - 컴퓨터 / 12 - 소프트웨어 / 13 - 모바일 / 22 - 자바 / 33 - 서버
		if (cls=='1') {
			edu2 = "공대";
			switch (edu1) {
			case 11 : edu3 = "컴퓨터학과";
			break;
			
			case 12 : edu3 = "소프트웨어학과";
			break;
			
			case 13 : edu3 = "모바일학과";
			break;
			
			case 22 : edu3 = "자바학과";
			break;
			
			case 33 : edu3 = "서버학과";
			break;
			
			default : edu3 = "자유공학부";
			break;
			}
			System.out.println(id + " 은 " + num +"년도에 입학한 " + edu2 +" "+ edu3 + " 학생입니다.");
		} else if (cls == '2') {
			edu2 = "사회대";
			switch (edu1) {
			case 11 : edu3 = "사회학과";
			break;
			
			case 12 : edu3 = "경영학과";
			break;
			
			case 13 : edu3 = "경제학과";
			break;
			
			default : edu3 = "자유인문학부";
			break;
			}
			System.out.println(id + " 은 " + num +"년도에 입학한 " + edu2 +" "+ edu3 + " 학생입니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
			return;												// 프로그램 완전 종료
		}
		
		// 사회대 : 11 - 사회학과 / 12 - 경영학과 / 13- 경제학과
		
		// 2017111001 은 2017년도에 입학한 공대 컴퓨터학과 학생입니다.
		// 2019211001 은 2019년도에 입학한 사회대 사회학과 학생입니다.
		// 2018133001 은 2018년도에 입학한 공대 서버학과 학생입니다.

	}

}
