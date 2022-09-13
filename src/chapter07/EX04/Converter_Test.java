package chapter07.EX04;

import java.util.Scanner;

class Converter {		//환율을 계산하는 클래스
	//1. 필드
	double rate;		//환율을 저장하는 변수
	
	//2. 메소드 생성 (달러를 인풋받아서 원화로 반환하는 메소드), 메소드 명 : toKWR
	double toKOR (double dollor) {
		return dollor*rate;
	}
	//3. 메소드 생성 (원화를 인풋받아서 달러로 출력하는 메소드) ,메소드 명 : toUSD
	double toUSD (double won) {
		return won/rate;
	}
	//4. setRate() 메소드 생성 : setter를 사용해서 rate 필드의 값을 할당.
	public void setRate(double rate) {
		this.rate = rate;
	}
}


public class Converter_Test {

	public static void main(String[] args) {
		// 오늘 환율 검색 (1 $ = 1377.10)
		// 객체 생성 후 스캐너로 환율을 인풋 받아 setRate() 메소드에 저장 후
		Scanner sc = new Scanner(System.in);
		System.out.println("1달러에 대한 오늘 환율을 입력하세요 >>> ");
		Converter converter = new Converter ();
		converter.setRate(sc.nextDouble());
		// 원화 100만원 ==> 몇 $ 인출
		System.out.println("원화 100만원은 "+converter.toUSD(1000000)+" $ 입니다.");
		// 100 $ ==> 몇 원 인출
		System.out.println("미화 100$는 " +converter.toKOR(100)+"원 입니다." );
		System.out.println("== 소수점 둘째 자리까지 잘라서 출력 printf() ==");
		
		//1.printf() 를 사용해서 출력
		System.out.printf("원화 100만원은 %.2f $입니다.",converter.toUSD(1000000));
		System.out.println();
		System.out.printf("미화 100$는 %.2f 원입니다.",converter.toKOR(100));
		System.out.println();
		
		
		//2. 변수에 더블 값 할당 후 소숫점 두자리까지 변환해서 출력
		System.out.println("======= 예시 ======");
		double per2 = 3.141592;
			// String으로 변환 후 per2의 변수의 값을 소숫점 2자리 까지 출력후 다시 Double형으로 변환.
		double per1 = Double.parseDouble(String.format("%.2f", per2));
		System.out.println(per1);
		
		System.out.println("=== 실수를 변수에 할당 후 소숫점 2자리 까지 자른 후 다시 더블에 저장 ===");
		double d2 = converter.toUSD(1000000);	//실수를 리턴받아 d2에 할당.
		double d1 = Double.parseDouble(String.format("%.2f", d2));
		System.out.println("원화 100만원은 "+d1+"$ 입니다.");
		
		double d4 = converter.toKOR(100);
		double d3 = Double.parseDouble(String.format("%.2f", d4));
		System.out.println("100$는 " + d3 + "원 입니다.");
		

	}

}
