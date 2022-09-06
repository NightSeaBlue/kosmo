package chapter02.EX02;

public class NamingVirableAndConstant {

	public static void main(String[] args) {
		
		/* 변수의 이름 부여	: 변수 : 값을 변경 가능
		 	- 변수이름은 영문, 한글 사용가능 (한글은 권장사항 아님)
		  	- 첫자는 소문자
		  	- 특수문자 : _, $
		  	- 첫자에 숫자는 올 수 없음.
		  	- JAVA의 Keyword(예약어)는 올 수 없다. (int, double, String....) 
		   */		//ctrl+shift+/ -> 여러 줄 주석
		
		boolean aBcD;	// aBcD 변수에는 True, False 값만 입력 가능
		aBcD = true;
		System.out.println(aBcD);		//true
		aBcD = false;		
		System.out.println(aBcD);		//false
		byte 가나다;		//사용은 가능하나 권장 사항이 아니다.
		short _abcd;	//특수문자는 _,$ 사용 가능
		char $ab_cd;	//특수문자는 _,$ 사용 가능
		double main;	//메소드 이름을 변수 이름으로 사용 가능,
						//사용방법이 달라서 사용가능 (권장사항은 아님)
		//float int;	//예약어를 변수명으로 사용하면 오류 발생
						 //class, int, double, char, byte....
		String myClassName ;	//첫 단어는 소문자, 여러 단어가 있을 때 첫단어 대문자
		
		
		
		/*
		  상수의 이름 부여	: 상수 - 값 변경 불가.
		  	- 대문자로 처리
		  	- 변수 선언문 앞에 Final 키워드를 사용.
		 */
		
		final double PI ;		//final을 붙일 경우 값 고정(상수) , 일반적으로 변수는 소문자, 상수는 대문자 사용
		PI = 3.141592;
		
		System.out.println(PI);
		
		//pi = 1234.00;
		System.out.println(PI);
		
		final int MY_DATA ;	//상수, (규칙) 여러 단어 입력시 _로 구분
		int myData ;		//변수
		
		
		
		
		
		
		
	}

}
