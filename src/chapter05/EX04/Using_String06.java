package chapter05.EX04;

import java.util.Arrays;

public class Using_String06 {

	public static void main(String[] args) {
		// String의 다양한 메소드
		// 5. 문자열 수정 ( toLowerCase(), toUpperCase() )
		//               소문자로 변환    ,   대문자로 변환

		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());	//소문자로 출력
		System.out.println(str1.toUpperCase());	//대문자로 출력
		System.out.println("========================");
		
		//replace(원본,수정)		//원본을 수정내용으로 변환
		String str2 = str1.replace("Study","공부");
		
		System.out.println(str1.replace("Study", "공부"));
		System.out.println(str1);
		System.out.println(str2);
		
		// substring ()  : 글자를 잘라서 출력 (0,5) 일 경우 0은 포함 5는 미포함
		System.out.println(str1.substring(0,5));	//index 0 ~ index 5 앞까지 잘라서 출력
			//Java
		System.out.println(str1.substring(3,8));
			//a Stu
		
		System.out.println(str1.substring(5));		//index 5 방부터 뒤로 모두 자름
			// Study
		
		//split () : 특정 문자를 기준으로 잘라서 배열에 저장 , 배열을 미리 선언해주어야 함.
			// 		/ | - | 공백 을 기준으로 잘라서 strArr1 배열 변수에 저장함
		String [] strArr1 = "abc/def-ghi jkl".split("/|-| ");
		
		for (int i=0 ; i < strArr1.length ; i++) {
			System.out.print(strArr1[i] + " ");
		}
		System.out.println();
		
		for (String k : strArr1) {
			System.out.print(k+ " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(strArr1));
		
		// 공백을 기준으로 모두 잘라서 배열에 저장 후 출력 : for Enhanced for Arrays.toString()
		String a = "오늘은 날씨가 매우 맑습니다. 참 화창한 날씨 입니다.";
		String [] strArr2 = a.split(" ");
		
		System.out.println("=== for ===");
		for (int i=0; i<strArr2.length ; i++) {
			System.out.print(strArr2[i] + " ");
		}
		System.out.println();
		
		System.out.println("=== Enhanced For ===");
		for (String k : strArr2) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		System.out.println("=== Arrays.toString() ===");
		System.out.println(Arrays.toString(strArr2));
		System.out.println("===================================");
		//trim()  : 좌우의 공백을 제거
		System.out.println("            abc            ".trim());
		
		//6. 문자열 비교 ( == )  :  참조 자료형일 때 Stack의 주소값을 비교
		String str3 = new String ("Java");
		String str4 = new String ("Java");
		String str5 = new String ("java");
		
		System.out.println(str3 == str4);		//false		<== 주소 비교
		System.out.println(str4 == str5);		//false
		System.out.println(str5 == str3);		//false
		System.out.println("=======================");
		
		// equals()  :  	(대소문자 구분)
		System.out.println(str3.equals(str4));		//true
		System.out.println(str4.equals(str5));		//false
			//equalsIgnoreCase () : 대소문자 구분하지 말고 값을 비교하라.
		System.out.println(str4.equalsIgnoreCase(str5)); //true
		
	}

}
