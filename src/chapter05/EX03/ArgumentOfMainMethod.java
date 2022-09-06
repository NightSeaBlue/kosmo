package chapter05.EX03;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {
		
		// main Method 와 입력 매개변수 전달하기 , 메소드(객체지향언어) : 함수
		//		-메소드(함수) 의 형식 : 리턴타입 메소드명 (입력매개변수) { 실행부 }
		//							void main (String[] args) { 실행부 }
		
		// 메인 메소드의 입력 매개변수 args[i] 값을 받아서 각 변수에 할당.
		
		// 안녕하세요 3 5.8 <== String [] args
		String a = args[0];		//안녕하세요  args[0]
		String b = args[1];		//3		   args[1]
		String c = args[2];		//5.8 	   args[2]
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("===============================");
		//연산
		System.out.println(b + 1);		//3(string) + 1(int) = 31 (String)
		System.out.println(c + 1);		//5.8(string) + 1 (int) = 5.81 (String)
		
		//숫자 형식으로 되어 있는 String => 정수, 실수로 변환
					//Integer.parseInt(String변수)
					//Integer.parseDouble(String변수)
		
		//연산 (형변환 후 연산)
		System.out.println("=============================");
		int d = Integer.parseInt(b);
		double e = Double.parseDouble(c);
		
		System.out.println(d);
		System.out.println(e);
		System.out.println("======= 형 변환 후 연산 ========");
		
		System.out.println(d+1);		// 정수 + 정수
		System.out.println(e+1);		// 실수 + 정수 -> 실수가 정수로 Upcasting
		System.out.println(e+(double)1);

	}

}
