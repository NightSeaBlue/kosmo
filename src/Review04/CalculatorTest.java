package Review04;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		// 1. 객체 생성
		CalculatorExpr c = new CalculatorExpr ();
		// 사칙연산 실행에 앞선 객체 생성 및 변수 생성
		Scanner sc = new Scanner (System.in);
		String answer = null;	// 계산 지속 여부를 물을 변수
		boolean cont = false;	// do - while 실행을 위한 논리 변수
		int count = 0;			// 사칙 연산의 실행 횟수

		//2. 사칙연산 실행 및 결과 출력

		do {
			System.out.println("num1, num2 입력 : ");
			int num1 = sc.nextInt();	// 숫자 1 에 해당하는 변수
			int num2 = sc.nextInt();	// 숫자 2 에 해당하는 변수
			c.setNum1(num1);	// class 에 할당된 num1 에 값 할당
			c.setNum2(num2);	// class 에 할당된 num2 에 값 할당
			sc.nextLine();
			if (count > 0) {	// 1회차 이후 입력한 숫자 추출
				System.out.println("추출된 숫자 입력 : "+c.getNum1()+" "+c.getNum2());
			}
			int add = c.getAddition(num1, num2);
			int sub = c.getSubtraction(num1, num2);
			int mul = c.getMultiplication(num1, num2);
			double div = c.getDivision(num1, num2);	// 사칙 연산 후 , 결과 값 할당
			System.out.println("덧셈 : "+add);
			System.out.println("뺄셈 : "+sub);
			System.out.println("곱셈 : "+mul);
			System.out.println("나눗셈 : "+div);	// 초기 결과값 출력

			//3. 계속 진행할지 여부를 뭍고 진행하는 경우 , 추출된 숫자를 보여주고 계산식 재 진행
			System.out.println("계속 하시겠습니까? (Y/N)");	
			answer = sc.nextLine();

			if (answer.equalsIgnoreCase("Y")) {
				count++;	// 사칙 연산을 추가 진행 하므로 횟수 증가
				cont = true;
				continue;
			} else if (answer.equalsIgnoreCase("N")){
				cont = false;
				System.out.println("Calculator 를 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				cont = true;
				continue;
			}

		} while (cont);
		sc.close ();
	}

}
