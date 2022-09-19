package basic1;

import java.util.Calendar;

import java.util.Scanner;

/*
 * 	제어문 : 프로그램의 흐름을 변경하기 위해
 * 		1) if
 * 		2) switch
 * 		3) for	
 * 		4) while / do~while
 * 
 * 		5) break / continue
 * 
 * 	JVM : java 실행하는 가상 머신 , main 부터 search 해 실행
 * 
 */

public class Ex02_control {

	public static void main(String[] args) {

		String id = null;
		
		Scanner input = new Scanner (System.in);		// 주민번호를 콘솔을 통해 인풋받음
		System.out.println("주민번호 입력 >> ");			// 인풋을 위한 화면
		id = input.nextLine();								// 엔터를 치기 이전까지 내용 저장
		
		char sung = id.charAt(7);
		System.out.println(sung);
		// lee 변수에 문자가 1이거나 3이거나 9라면 남자를 , 그렇지 않고 문자가 2이거나,4이거나 0이라면 여자를 출력
		if (sung == '1' | sung =='3' | sung == '9') {		// 문자열과 비교 , 최근들어 논리 연산자 갯수를 줄이는 것이 추세
			System.out.println("남자");
		} else if (sung == '2'| sung =='4' | sung == '0') {
			System.out.println("여자");
		} else {
			System.out.println("올바른 값을 입력해 주세요");
		}
		
		// 8 번째열의 문자 하나를 얻어와 tool 라는 변수에 저장.
		
		char chul = id.charAt(8);
		System.out.println(chul);
		// chul 변수가 0 이라면 '서울'
		// chul 변수가 1이라면 '인천/부산'
		// chul 변수가 2라면 '경기'
		// chul 변수가 9라면 '제주'
		String home = null;
		switch (chul) {	// 문자, 정수, 문자열 입력 가능
		case '0' : 
			home = "서울";
			break;
		
		case '1' : 
			home = "인천/부산";
			break;
		
		case '2' :
			home = "경기";
			break;
		
		case '9' :
			home = "제주";
			break;
		
		default : 
			home = "오류";
			break;
		
		}
		System.out.println(home+" 출신 ");	//프로그램 실행시 Ctrl+F11
		
		String nai = id.substring(0,2);		//nai = 주민등록 번호상 생년 2자리 취득;
		// int sunai = (Int)nai;		// 캐스팅 변환 명령어 필요
		int sunai = Integer.parseInt(nai);	// sunai = 앞서 취득한 생년을 문자열이 아닌 숫자로 취급;
		int age = 0;
		Calendar c = Calendar.getInstance(); // 객체가 이미 생성되어 있으므로, 가지고 와야 함. Calender 이용, getinstance 로 년, 월, 일 중 하나 취득
		int year = c.get(Calendar.YEAR);		// year 라는 변수에 get 을 이용해 Calender에서 연도를 취득
		if (sung == '1'| sung =='2' ) {		// 1,2에 해당할 경우
			age = year - (1900+sunai)+1;	// 1900년대 생으로 계산
		} else if (sung =='3'| sung =='4') {	// 3,4에 해당할 경우
			age = year - (2000+sunai)+1;	// 2000년대 생으로 계산
		} else if (sung == '9' | sung == '0') {	// 9,0 에 해당할 경우
			age = year - (1800+sunai)+1;	// 1800년대 생으로 계산
		}
		System.out.println(age);
	}

}
