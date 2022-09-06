package chapter02.EX11;

public class Char_Type {

	public static void main(String[] args) {
		// char 데이터 타입 : 하나의 문자만 저장.
		// - 문자, 숫자, 유니코드로 저장 할 수 있다.
		// - ''를 사용하여 저장
		// - 2문자 이상 입력할 경우 String을 활용해 여러 문자를 저장할 수 있음.
		
		//유니코드(2byte) : 전 세계 모든 문자를 16진수로 변환한 코드 
		
		
		
		//1. 문자로 저장하는 방법 : ''
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';	//숫자 3이 아닌 문자 3으로 저장됨
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("===============");
				
		//2. 정수로 저장하는 방법 (ASCII CODE)
		char value4 = 65;		//char value 65 => A로 인식
		char value5 = 0xac00 ; 	//0x는 16진수를 의미 , ac00 = 가
		char value6 = 51;		//char value 51 => 3로 인식
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println("===============");
		
		//3. 유니코드 형식으로 저장 (\\u유니코드) -> 주석의 경우 역슬래시 하나만 입력하는 경우 오류 발생
		// 유니코드의 경우 ''를 사용해 입력가능.
		
		char value7 = '\u0041';		//unicode 0041 => A
		char value8 = '\uac00';		//unicode ac00 => 가
		char value9 = '\u0033';		//unicode 0033 => 3
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		char value100 = 35;	// char value 35 => #
		System.out.println(value100);
		
		char value101 = '\uac12';	//unicode ac12 => 값
		System.out.println(value101);
		System.out.println("============");
		
		
		//구글 검색을 이용해 자신의 이름에 해당하는 유니코드를 찾아 char 변수에 저장 후 출력
		char data1 = 0xc774;
		char data2 = 0xc9c0;
		char data3 = 0xd6a8;
		
		System.out.printf("%s",data1);
		System.out.printf("%s",data2);
		System.out.printf("%s\n",data3);
		System.out.println("===============");
		
		//문자 A를 저장하는 다양한 방법
		char a = 'A';		//A <== 10진수 표현시 65
		char b = 65;		// 정수로 저장 (10진수)
		char c = 0b1000001;	// 2진수=0b
		char d = 00101;		// 8진수 =00
		char e = 0x0041;	// 16진수 =0x
		char f = '\u0041';	// unicode 
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println("====================");
		
		
		
		
		
		
		
	}

}
