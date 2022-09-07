package chapter05.EX04;

public class Using_String04 {

	public static void main(String[] args) {
		
		// 1. 문자열 + 문자열
		String str1 = "안녕" + "하세요" + "!";
		System.out.println(str1);
		
		String str2 = "반갑";		
		str2 += "습니다";		// str2 = str2 + "습니다"
		str2 += "!";		// str2 = str2 + "!"
		System.out.println(str2);
		System.out.println("========================");
		
		
		// 2. 문자열 + 기본 자료형
		String str3 = "안녕" + 1;			// 정수 1이 문자열로 자동으로 변환됨.
		String str4 = "안녕" + String.valueOf(1);		//정수 1을 문자열로 변환
		String str5 = "안녕" + "1";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		System.out.println("================================");
		
		// 3. 문자열과 기본 자료형 혼용
		System.out.println(1+"안녕");			//1안녕
		System.out.println(1+2+3+"안녕");		//6안녕
		System.out.println("안녕"+1+2+3);		//안녕123

		
		
		
		
		
		
		
		
		
		
	}

}
